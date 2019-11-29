package controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import entity.sales.Customer;
import entity.sales.Customer1;
import entity.sales.SearchFlight;
import entity.sales.SearchFlightAndId;
import entity.sales.TicketOrder;
import service.propotype.ClientService;
import util.DataUtil;

@Controller
public class ClientController {
     
	 @Autowired 
	 private ClientService clientService;
	  @RequestMapping("/clientMessage")
	  public ModelAndView clientMessage() {
		  ModelAndView mv=new ModelAndView("/sales/clientMessage");
		  List<Customer1> customers=clientService.getCustomer1();
		  System.out.println(customers);
		  mv.addObject("customers",customers);		
		  return mv;	  
	  }
	  @RequestMapping("/buyTicket")
	  public String buyTicket() {
		  
		  return "/sales/buyTicket";		  
	  }
	  @RequestMapping("/TuiTicket")
	  public String TuiTicket() {
		  
		  return "/sales/TuiTicket";		  
	  }
	  @RequestMapping("/gaiQian")
	  public String gaiQian() {
		  
		  return "/sales/gaiQian";		  
	  }
	 
	  @RequestMapping("/TuiOrder")
	  @ResponseBody
	  public String TuiOrder(HttpServletRequest request) {
		String flightNumber=request.getParameter("flightNumber");
		String IdCard=request.getParameter("IdCard");
		System.out.println(flightNumber);
		System.out.println(IdCard);
		 boolean flag=clientService.TuiOrder(flightNumber,IdCard); 
		  System.out.println(flag);
		  if(flag==true) {
			  return "ok";
		  }else {
			  return "error";
		  }
		  
		 	  
	  }
	  
	  @RequestMapping("searchFlight")
	  public ModelAndView searchFlight(HttpServletRequest request) {
		  ModelAndView mv=new ModelAndView("/sales/SearchFlight");
		  String fromCity=request.getParameter("startPlace");
		  String toCity=request.getParameter("endPlace");
		  String date=request.getParameter("date");
		  
		  try {
			  fromCity = new String(fromCity.getBytes("iso8859-1"), "utf-8");
			  toCity = new String(toCity.getBytes("iso8859-1"), "utf-8");
			  date = new String(date.getBytes("iso8859-1"), "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		  
		  System.out.println(fromCity);
		  System.out.println(toCity);
		  System.out.println(date);
		  Date date1=DataUtil.ToDate("yyyy-MM-dd", date);
		   List<SearchFlight> searchFlights=clientService.getSearchFlight(fromCity, toCity, date1);
		     System.out.println(searchFlights);
            mv.addObject("searchFlights", searchFlights);		  
		return mv;
	  }
	  @RequestMapping("SearchOrder")
	  public ModelAndView SearchOrder(HttpServletRequest request) {
		  ModelAndView mv=new ModelAndView("/sales/SearchOrder");
		  String IdCard= request.getParameter("IdCard");
		  List<TicketOrder>ticketOrders=clientService.SearchOrderId(IdCard);
		  System.out.println(ticketOrders);
		  mv.addObject("ticketOrders",ticketOrders);
		return mv;
		   
	  }
	  @RequestMapping("UpdateOrder")
	  public ModelAndView UpdateOrder(HttpServletRequest request) {
		  ModelAndView mv=new ModelAndView("/sales/UpdateOrder");
		  String IdCard= request.getParameter("IdCard");
		  List<TicketOrder>ticketOrders=clientService.SearchOrderId(IdCard);
		  System.out.println(ticketOrders);
		  mv.addObject("ticketOrders",ticketOrders);
		return mv;
		   
	  }
	  @RequestMapping("UpdateOrder1")
	  public ModelAndView UpdateOrder1(HttpServletRequest request) {
		  ModelAndView mv=new ModelAndView("/sales/UpdateOrder1");
		  String IdCard= request.getParameter("IdCard");
		  String flightNumber=request.getParameter("flightNumber");
		  String grade =request.getParameter("grade");
		 System.out.println(IdCard);
		 System.out.println(flightNumber);
		 System.out.println(grade);
		     SearchFlight   searchFlight = clientService.getSearchFlight1(flightNumber);
		     System.out.println(searchFlight);
		     SearchFlightAndId searchs=new SearchFlightAndId(flightNumber, searchFlight.getFromCity(), searchFlight.getToCity(),IdCard,grade);
		      System.out.println(searchs);
		      mv.addObject("searchs", searchs);
		     return mv;
		   
	  }
	  @RequestMapping("/Select/{a}")
	  public ModelAndView select(@PathVariable("a")String flightNumber) {
		     ModelAndView mv=new ModelAndView("/sales/Select");
		   //  String flightNumber=request.getParameter("a");
		     System.out.println(flightNumber);
		     SearchFlight searchFlight=clientService.getSearchFlight1(flightNumber);
		     System.out.println(searchFlight);
		     mv.addObject("searchFlight",searchFlight);
		              
		  return mv;
		  
	  }
	 
	  @RequestMapping("/insert")
	  public String insert(HttpServletRequest request) {
		         String flightNumber=request.getParameter("flightNumber");
		         String idCard=request.getParameter("idCard");
		         String grade=request.getParameter("grade");
		         HttpSession session=request.getSession(false);
		         String sumber=session.getAttribute("sumber").toString();
                 String jobId=clientService.getJobId(sumber);   
		           System.out.println(flightNumber);
		           System.out.println(idCard);
		           System.out.println(grade);
		           System.out.println(jobId);
		            boolean flag=clientService.insertOrder(flightNumber, grade, idCard, jobId); 
		            if(flag==true) {
		            	  return "/sales/successful1";
		            }else {
		            	  return "/sales/fails1";
		            }
	  }
	  
	  @RequestMapping("/insert1")
	  @ResponseBody
	  public String insert1(HttpServletRequest request) {
	         String flightNumber=request.getParameter("flightNumber");
	         String idCard=request.getParameter("idCard");
	         String grade=request.getParameter("grade");
	         System.out.println("航班号："+flightNumber);
	         System.out.println("身份证："+idCard);
	         System.out.println("舱位："+grade);
	         System.out.println(idCard);
	         System.out.println(grade);
	         boolean flag=clientService.insertOrder(flightNumber, grade, idCard, "1000"); 
	         if(flag==true) {
	            return "ok";
	         }else {
	            return "error";
	         }
	  }

	
	  @RequestMapping("/selectNewFlight")
	  @ResponseBody
	  public String selectNewFlight(HttpServletRequest request) {
		  String fromCity=request.getParameter("startPlace");
		  String toCity=request.getParameter("endPlace");
		  String date=request.getParameter("date");
		  System.out.println(fromCity);
		  System.out.println(toCity);
		  System.out.println(date);
		  Date date1=DataUtil.ToDate("yyyy-MM-dd", date);
		   List<SearchFlight> searchFlight=clientService.getSearchFlight(fromCity, toCity, date1);
		     System.out.println(searchFlight);	  
		    System.out.println(JSON.toJSONString(searchFlight));
		    return JSON.toJSONString(searchFlight);
		     
	  }
	  @RequestMapping("/updateTicket1")
	  @ResponseBody
	  public String updateFlightFinal(HttpServletRequest request) {
		   String flightNumber=request.getParameter("flightNumber");
		   String grade=request.getParameter("grade");
		   String idCard=request.getParameter("idCard");
		   String flightNumber1=request.getParameter("flightNumber1");
		   String grade1=request.getParameter("grade1");
		 System.out.println(flightNumber);
		 System.out.println(grade);
		 System.out.println(idCard);
		 System.out.println(flightNumber1);
		 System.out.println(grade1);
		 boolean flag=clientService.updateTicket(flightNumber,grade,idCard,flightNumber1,grade1);	
		    if(flag==true) {
          	  return "ok";
          }else {
          	  return "fails";
          } 
	  }
	  
	  
	  
	  
	  
}
