package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import entity.FlightScheduler1;
import entity.sales.Boss;
import entity.sales.Branch;
import entity.sales.Branch1;
import entity.sales.FlightScheduler;
import entity.sales.Sales1;
import entity.sales.SearchFlight;
import entity.sales.TicketOrder;
import entity.sales.User;

import service.propotype.IBranchService;
import service.propotype.PersonService;


@Controller
public class PersronController {
      @Autowired
      private PersonService personService;
      @Autowired
      private IBranchService branchservice ;
	  @RequestMapping("/document")
	  public ModelAndView Test(HttpServletRequest request) {
		  ModelAndView mv =new ModelAndView("/sales/document");
		  HttpSession session=request.getSession(false);
		 Object sNumber=session.getAttribute("sumber");
		 String[] count=personService.personInform(sNumber.toString());
		  List<User>users=new ArrayList<User>();
		  users.add(new User(count[5],count[0],count[2],count[3],count[1],count[4]));		  
		  System.out.println(users);
		  mv.addObject("users", users);
		    
		 return mv;
	  }
	  @RequestMapping("/document1")
	  public ModelAndView Test1(HttpServletRequest request) {
		  ModelAndView mv =new ModelAndView("/boss/document1");
		  HttpSession session=request.getSession(false);
		 Object sNumber=session.getAttribute("sumber");
		 String[] count=personService.personInform1(sNumber.toString());
		  List<Boss>users=new ArrayList<Boss>();
		  int i=Integer.parseInt(count[3]);
		  users.add(new Boss(i,count[2],count[0],count[1]));		  
		  System.out.println(users);
		  mv.addObject("users", users);
		    
		 return mv;
	  }
	  @RequestMapping("/xiupassword")
	  public String password() {
		  return "/sales/xiupassword";
	  }
	  @RequestMapping("/xiupassword1")
	  public String password1() {
		  return "/boss/xiupassword1";
	  }
	  @RequestMapping("/password")
	  public String password(HttpServletRequest request) {
		  String password1=request.getParameter("password1");
		  System.out.println(password1);
		  HttpSession session=request.getSession(false);
		  String  user=session.getAttribute("sumber").toString();
		  System.out.println(user);
		      boolean flag=personService.updatePassword(user, password1);
		      System.out.println(flag);
		      if(flag=true) {
		    	  return "/sales/successful";
		      }else {
		    	  return "/sales/fails";
		      }
	  }
	  @RequestMapping("/password1")
	  public String password1(HttpServletRequest request) {
		  String password1=request.getParameter("password1");
		  System.out.println(password1);
		  HttpSession session=request.getSession(false);
		  String  user=session.getAttribute("sumber").toString();
		  System.out.println(user);
		      boolean flag=personService.updatePassword1(user, password1);
		      System.out.println(flag);
		      if(flag=true) {
		    	  return "/boss/successful";
		      }else {
		    	  return "/boss/fails";
		      }
	  }
	 @RequestMapping("/safeUpdate")
	  public ModelAndView safeUpdate(HttpServletRequest request) {
		  ModelAndView mv =new ModelAndView("/sales/safeUpdate");
		  HttpSession session=request.getSession(false);
		 Object sNumber=session.getAttribute("sumber");
		 String[] count=personService.personInform(sNumber.toString());
		  List<User>users=new ArrayList<User>();
		  users.add(new User(count[5],count[0],count[2],count[3],count[1],count[4]));
		  System.out.println(users);
		  mv.addObject("users", users);		    
		 return mv;
	  }
	 @RequestMapping("/safeUpdate1")
	  public ModelAndView safeUpdate1(HttpServletRequest request) {
		  ModelAndView mv =new ModelAndView("/boss/safeUpdate1");
		  HttpSession session=request.getSession(false);
		 Object sNumber=session.getAttribute("sumber");
		 String[] count=personService.personInform1(sNumber.toString());
		  List<Boss>users=new ArrayList<Boss>();
		  int i=Integer.parseInt(count[3]);
		  users.add(new Boss(i,count[2],count[0],count[1]));		  
		  System.out.println(users);
		  mv.addObject("users", users);		    
		 return mv;
	  }
	 @RequestMapping("/flightII")
	 public ModelAndView flight() {
		 ModelAndView mv = new ModelAndView("/sales/flightII");		 
		List<FlightScheduler> flight1=personService.getFlight1();
		System.out.println(flight1);
		mv.addObject("flights",flight1);
		return mv;
	 }
	 @RequestMapping("/flight1")
	 public ModelAndView flight1() {
		 ModelAndView mv = new ModelAndView("/boss/flight1");		 
		List<SearchFlight> flight1=personService.getFlight2();
		System.out.println(flight1);
		mv.addObject("flights",flight1);
		return mv;
	 }
	 @RequestMapping("/saleRecord")
	 public ModelAndView saleRecord(HttpServletRequest request) {
		 ModelAndView mv=new ModelAndView("/sales/saleRecord");
		 HttpSession session=request.getSession(false);
		 Object sNumber=session.getAttribute("sumber");
		 String jobId=personService.getJobId((String) sNumber);
		 System.out.println(jobId);
		 List<TicketOrder> tickets=personService.getTicketOrder(jobId);
		 System.out.println(tickets);
		 mv.addObject("tickets",tickets);
		return mv;
		 
	 }
	 @RequestMapping("/branchII")
	  public ModelAndView branch(HttpServletRequest request) {
		  ModelAndView mv =new ModelAndView("/boss/branchII");
		  List<Branch1>branchs=personService.getBranch();
		  String branchId=null;
		  String count=null;
		  System.out.println(branchs);
		    for(Branch1 branch:branchs) {
		    	 branchId=branch.getBranchId();
		    	 count =personService.getCount(branchId);
		    	branch.setBranchSales(count);
		    }
		    List<String> infos1 = new ArrayList<>();
			List<String> infos2 = new ArrayList<>();			
			for (Branch1 branch : branchs) {
				infos1.add(branch.getBranchId());
				infos2.add(personService.getCount(branchId));
			}			
			Map<String,Object> map = new HashMap<>();			
			map.put("x", infos1);
			map.put("y", infos2);
			System.out.println(infos1);
			System.out.println(infos2);
            mv.addObject("map",map);	
		    System.out.println(branchs);
		  mv.addObject("branchs", branchs);
		 return mv;
	  }
	  @RequestMapping(value="/branchIII",produces= {"application/json;charset=UTF-8"})
	  @ResponseBody
	  public String branchIII(HttpServletRequest request) {
		  List<Branch1>branchs=personService.getBranch();
		  String branchId=null;
		  String count=null;
		  System.out.println(branchs);
		    List<String> infos1 = new ArrayList<>();
			List<String> infos2 = new ArrayList<>();			
			for (Branch1 branch : branchs) {
				branchId=branch.getBranchId();
				infos1.add(branch.getBranchId());
				infos2.add(personService.getCount(branchId));
			}			
			Map<String,Object> map = new HashMap<>();			
			map.put("x", infos1);
			map.put("y", infos2);
			System.out.println(infos1);
			System.out.println(infos2);
			return JSON.toJSONString(map);
           		  
	  }
	 @RequestMapping("/SalesOrder/{branchId}")
	  public ModelAndView salesOrder(@PathVariable("branchId")String branchId) {
		  ModelAndView mv =new ModelAndView("/boss/SalesOrder");
		  List<Sales1>sales=personService.getSales1(branchId);		 
		    for(Sales1 sale:sales) {
		    	String jobId=sale.getJobId();
		    	String count =personService.getCount1(jobId);
		    	sale.setSalesOrder(count);
		    }
		    System.out.println(sales);
		  mv.addObject("sales", sales);
		 return mv;
	  }
	 @RequestMapping(value="/SalesOrderI",produces= {"application/json;charset=UTF-8"})
	  @ResponseBody
	  public String SalesOrderI(HttpServletRequest request) {
		 String branchId=request.getParameter("branchId");		
		  List<Sales1>sales=personService.getSales1(branchId);
		  System.out.println(sales);
		  List<String> infos1 = new ArrayList<>();
			List<String> infos2 = new ArrayList<>();	
		  for(Sales1 sale:sales) {
		    	String jobId=sale.getJobId();
		    	String count =personService.getCount1(jobId);
		    	infos1.add(jobId);
		    	infos2.add(count);
		    }			
			Map<String,Object> map = new HashMap<>();			
			map.put("x", infos1);
			map.put("y", infos2);
			System.out.println(infos1);
			System.out.println(infos2);
			return JSON.toJSONString(map);          		  
	  }
	 @RequestMapping("/SaleOrder/{jobId}")
	  public ModelAndView SaleOrder(@PathVariable("jobId")String jobId) {
		  ModelAndView mv =new ModelAndView("/boss/SaleOrder");
		  List<TicketOrder>sales=personService.getTicketOrder(jobId);
		  System.out.println(sales);
		  mv.addObject("sales", sales);
		 return mv;
	  }
	 @RequestMapping(value="/SaleOrderII",produces= {"application/json;charset=UTF-8"})
	  @ResponseBody
	  public String SaleOrderII(HttpServletRequest request) {
		 String jobId=request.getParameter("jobId");
		 System.out.println("dd"+jobId);
		 List<TicketOrder>sales=personService.getTicketOrder(jobId);
		  List<FlightScheduler1> ll = branchservice.saleFight(jobId);
		  System.out.println(ll);
		  List<String> infos1 = new ArrayList<>();
			List<String> infos2 = new ArrayList<>();	
			for (FlightScheduler1 model : ll) {
				infos1.add(model.getFlight_number());
				infos2.add(model.getTotal());
			}			
			Map<String,Object> map = new HashMap<>();			
			map.put("x", infos1);
			map.put("y", infos2);
			System.out.println(infos1);
			System.out.println(infos2);
			return JSON.toJSONString(map);          		  
	  }
	
}
