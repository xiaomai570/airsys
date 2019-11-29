package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import entity.Airport;
import entity.Boss;
import entity.Branch;
import entity.Customer;
import entity.Customerli;
import entity.Flight;
import entity.FlightAll;
import entity.FlightScheduler;
import entity.FlightScheduler1;
import entity.Flightli;
import entity.Gaiqian1;
import entity.Sales;
import entity.SearchParameter;
import entity.TicketOrder;
import service.propotype.IAirportService;
import service.propotype.IBossService;
import service.propotype.IBranchService;
import service.propotype.ICustomerService;
import service.propotype.ICustomerliService;
import service.propotype.IFlightSchedulerService;
import service.propotype.IFlightService;
import service.propotype.IRootService;
import service.propotype.ISalesService;
import service.propotype.ITicketOrderService;
import service.propotype.LoginService;

/**
 * 核心管理:controller类
 */
@Controller // <==> @Component
public class SysController {
	@Autowired
	private IBossService bossservice;
	@Autowired
	private IAirportService airportservice;
	@Autowired
	private IBranchService branchservice;
	@Autowired
	private ICustomerService customerservice;
	@Autowired
	private IFlightService flightservice;
	@Autowired
	private IFlightSchedulerService flightschedulerservice;
	@Autowired
	private ISalesService salesservice;
	@Autowired
	private ITicketOrderService ticketorderservice;
	@Autowired
	private IRootService rootservice;
	@Autowired
	private LoginService loginservice;

	@Autowired
	private Customerli cusli;
	@Autowired
	private ICustomerliService cusliService;

	private HttpSession session = null;

	// -- 返回页面：从后台拿到数据传到页面
	@RequestMapping("/boss") // -- 接口
	public ModelAndView getbosses() {
		ModelAndView mv = new ModelAndView("boss");
		// -- 一系列的操作
		List<Boss> lis = bossservice.listBoss(1, 10);
		mv.addObject("bosses", lis);
		return mv;
	}

	@RequestMapping("/boss/{id}")
	@ResponseBody
	public String getboss(@PathVariable("id") int id) {
		Boss boss = bossservice.searchBoss(id);
		return JSON.toJSONString(boss);
	}

	@RequestMapping("/deleteboss/{id}")
	public ModelAndView deleteboss(@PathVariable("id") int id) {
		bossservice.deleteBoss(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updateboss")
	@ResponseBody
	public ModelAndView updateboss(HttpServletRequest request) {
		Boss boss = new Boss(Integer.parseInt(request.getParameter("id")), request.getParameter("uname"),
				request.getParameter("num"), request.getParameter("pwd"));
		bossservice.updateBoss(boss);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/insertboss")
	@ResponseBody
	public ModelAndView insertboss(HttpServletRequest request) {
		Boss boss = new Boss(0, request.getParameter("uname"), request.getParameter("num"),
				request.getParameter("pwd"));
		bossservice.insertBoss(boss);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/airport")
	public ModelAndView getairports() {
		ModelAndView mv = new ModelAndView("airport");
		// -- 一系列的操作
		List<Airport> lis = airportservice.listAirport(1, 10);
		mv.addObject("airports", lis);
		return mv;
	}

	@RequestMapping("/airport/{id}")
	@ResponseBody
	public String getAirport(@PathVariable("id") int id) {
		Airport airport = airportservice.searchAirport(id);
		return JSON.toJSONString(airport);
	}

	@RequestMapping("/deleteairport/{id}")
	public ModelAndView deleteAirport(@PathVariable("id") int id) {
		airportservice.deleteAirport(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updateairport")
	@ResponseBody
	public ModelAndView updateairport(HttpServletRequest request) {
		Airport airport = new Airport(Integer.parseInt(request.getParameter("id")), request.getParameter("uname"),
				request.getParameter("num"), request.getParameter("pwd"));
		airportservice.updateAirport(airport);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/insertairport")
	@ResponseBody
	public ModelAndView insertairport(HttpServletRequest request) {
		Airport airport = new Airport(0, request.getParameter("uname"), request.getParameter("num"),
				request.getParameter("pwd"));
		airportservice.insertAirport(airport);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/branch")
	public ModelAndView getbranchs() {
		ModelAndView mv = new ModelAndView("branch");
		// -- 一系列的操作
		List<Branch> lis = branchservice.listBranch(1, 10);
		mv.addObject("branches", lis);
		return mv;
	}

	@RequestMapping("/branch/{id}")
	@ResponseBody
	public String getbranch(@PathVariable("id") int id) {
		Branch branch = branchservice.searchBranch(id);
		return JSON.toJSONString(branch);
	}

	@RequestMapping("/deletebranch/{id}")
	public ModelAndView deletebranch(@PathVariable("id") int id) {
		branchservice.deleteBranch(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updatebranch")
	@ResponseBody
	public ModelAndView updatebranch(HttpServletRequest request) {
		Branch branch = new Branch(Integer.parseInt(request.getParameter("id")), request.getParameter("b_name"),
				request.getParameter("address"), request.getParameter("telephone"), request.getParameter("province"),
				request.getParameter("city"), request.getParameter("b_password"), request.getParameter("branch_id"));
		branchservice.updateBranch(branch);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/insertbranch")
	@ResponseBody
	public ModelAndView insertbranch(HttpServletRequest request) {
		Branch branch = new Branch(0, request.getParameter("b_name"), request.getParameter("address"),
				request.getParameter("telephone"), request.getParameter("province"), request.getParameter("city"),
				request.getParameter("b_password"), request.getParameter("branch_id"));
		branchservice.insertBranch(branch);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/customer")
	public ModelAndView getcustomers() {
		ModelAndView mv = new ModelAndView("customer");
		// -- 一系列的操作
		List<Customer> lis = customerservice.listCustomer(1, 10);
		mv.addObject("customers", lis);
		return mv;
	}

	@RequestMapping("/customer/{id}")
	@ResponseBody
	public String getcustomer(@PathVariable("id") int id) {
		Customer customer = customerservice.searchCustomer(id);
		return JSON.toJSONString(customer);
	}

	@RequestMapping("/deletecustomer/{id}")
	public ModelAndView deletecustomer(@PathVariable("id") int id) {
		customerservice.deleteCustomer(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updatecustomer")
	@ResponseBody
	public ModelAndView updatecustomer(HttpServletRequest request) {
		Customer customer = new Customer(Integer.parseInt(request.getParameter("id")), request.getParameter("c_name"),
				request.getParameter("c_number"), request.getParameter("c_password"),
				Integer.parseInt(request.getParameter("sex")), request.getParameter("age"),
				request.getParameter("id_card"), request.getParameter("phone"));
		System.out.println(customer);
		customerservice.updateCustomer(customer);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/flight")
	public ModelAndView getflights() {
		ModelAndView mv = new ModelAndView("flight");
		// -- 一系列的操作
		List<Flight> lis = flightservice.listFlight(1, 10);
		mv.addObject("flights", lis);
		return mv;
	}

	@RequestMapping("/flight/{flight_number}")
	@ResponseBody
	public ModelAndView getflight(@PathVariable("flight_number") String flight_number) {
		ModelAndView mv = new ModelAndView("flightall");
		FlightAll flightall = flightservice.searchFlight(flight_number);
		mv.addObject("flightall", flightall);
		// System.out.println(flightall);
		// return flightall.toString();
		return mv;
	}

	@RequestMapping("/deleteflight/{flight_number}")
	public ModelAndView deleteflight(@PathVariable("flight_number") String flight_number) {
		flightservice.deleteFlight(flight_number);
		flightschedulerservice.deleteFlightScheduler(flight_number);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updateflight")
	@ResponseBody
	public ModelAndView updateflight(HttpServletRequest request) {
		Flight flight = new Flight(Integer.parseInt(request.getParameter("id")), request.getParameter("flight_number"),
				Integer.parseInt(request.getParameter("first_class_remain_seats")),
				Integer.parseInt(request.getParameter("business_class_remain_seats")),
				Integer.parseInt(request.getParameter("economy_class_remain_seats")),
				Integer.parseInt(request.getParameter("first_price")),
				Integer.parseInt(request.getParameter("business_price")),
				Integer.parseInt(request.getParameter("economy_price")));
		FlightScheduler flightscheduler = new FlightScheduler(Integer.parseInt(request.getParameter("id")),
				request.getParameter("flight_number"), request.getParameter("start_date"),
				request.getParameter("end_date"), request.getParameter("from_city"), request.getParameter("to_city"),
				request.getParameter("departure_time"), request.getParameter("arrival_time"),
				request.getParameter("start_airplane"), request.getParameter("end_airplane"));
		System.out.println(flight);
		System.out.println(flightscheduler);
		flightservice.updateFlight(flight);
		flightschedulerservice.updateFlightScheduler(flightscheduler);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/insertflight")
	@ResponseBody
	public ModelAndView insertflight(HttpServletRequest request) {
		Flight flight = new Flight(0, request.getParameter("flight_number"),
				Integer.parseInt(request.getParameter("first_class_remain_seats")),
				Integer.parseInt(request.getParameter("business_class_remain_seats")),
				Integer.parseInt(request.getParameter("economy_class_remain_seats")),
				Integer.parseInt(request.getParameter("first_price")),
				Integer.parseInt(request.getParameter("business_price")),
				Integer.parseInt(request.getParameter("economy_price")));
		FlightScheduler flightscheduler = new FlightScheduler(0, request.getParameter("flight_number"),
				request.getParameter("start_date"), request.getParameter("end_date"), request.getParameter("from_city"),
				request.getParameter("to_city"), request.getParameter("departure_time"),
				request.getParameter("arrival_time"), request.getParameter("start_airplane"),
				request.getParameter("end_airplane"));
		System.out.println(flight);
		System.out.println(flightscheduler);
		flightservice.insertFlight(flight);
		flightschedulerservice.insertFlightScheduler(flightscheduler);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/sales")
	public ModelAndView getsales() {
		ModelAndView mv = new ModelAndView("sales");
		// -- 一系列的操作
		List<Sales> lis = salesservice.listSales(1, 10);
		mv.addObject("sales", lis);
		return mv;
	}

	@RequestMapping("/sales/{branch_id}")
	@ResponseBody
	public ModelAndView getsale(@PathVariable("branch_id") String branch_id) {
		ModelAndView mv = new ModelAndView("sales");
		List<Sales> lis = salesservice.listSale(branch_id);
		mv.addObject("sales", lis);
		return mv;
	}

	@RequestMapping("/deletesale/{id}")
	public ModelAndView deletesale(@PathVariable("id") int id) {
		salesservice.deleteSales(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updatesale")
	@ResponseBody
	public ModelAndView updatesale(HttpServletRequest request) {
		Sales sale = new Sales(Integer.parseInt(request.getParameter("id")), request.getParameter("job_id"),
				request.getParameter("s_name"), request.getParameter("s_number"), request.getParameter("s_password"),
				request.getParameter("branch_id"));
		salesservice.updateSales(sale);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/ticketorder")
	public ModelAndView getticketorder() {
		ModelAndView mv = new ModelAndView("ticketorder");
		// -- 一系列的操作
		List<TicketOrder> lis = ticketorderservice.listTicketOrder(1, 10);
		mv.addObject("ticketorders", lis);
		return mv;
	}

	@RequestMapping("/ticketorder/{id}")
	@ResponseBody
	public String getticketorder(@PathVariable("id") int id) {
		TicketOrder sale = ticketorderservice.searchTicketOrder(id);
		return JSON.toJSONString(sale);
	}

	@RequestMapping("/deleteticketorder/{id}")
	public ModelAndView deleteticketorder(@PathVariable("id") int id) {
		ticketorderservice.deleteTicketOrder(id);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	@RequestMapping("/updateticketorder")
	@ResponseBody
	public ModelAndView updateticketorder(HttpServletRequest request) {
		TicketOrder ticketorder = new TicketOrder(Integer.parseInt(request.getParameter("id")),
				request.getParameter("fight_number"), request.getParameter("passenger_name"),
				request.getParameter("certification_number"), request.getParameter("order_date"),
				request.getParameter("grade"),
				request.getParameter("branch_id"), request.getParameter("sales_id"));
		ticketorderservice.updateTicketOrder(ticketorder);
		ModelAndView mv = new ModelAndView("scuess");
		return mv;
	}

	/* 李静 */
	@RequestMapping("/registerView")
	public ModelAndView registerView() {
		ModelAndView mv = new ModelAndView("registerView");
		return mv;
	}

	@RequestMapping("/loginView")
	public ModelAndView loginView() {
		ModelAndView mv = new ModelAndView("loginView");
		return mv;
	}

	@RequestMapping("/cexit")
	public void exit(HttpServletRequest re, HttpServletResponse res) {
		session.invalidate();
		try {
			// --System.out.println(session.getAttribute("c_name"));
			res.sendRedirect("index.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView register(String c_name, String c_number, String c_password, String sex, Date age,
			String id_card, String phone) {
		try {
			c_name = new String(c_name.getBytes("iso8859-1"), "utf-8");
			c_number = new String(c_number.getBytes("iso8859-1"), "utf-8");
			phone = new String(phone.getBytes("iso8859-1"), "utf-8");
			sex = new String(sex.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		cusli.setC_name(c_name);
		cusli.setC_number(c_number);
		cusli.setC_password(c_password);
		cusli.setSex(sex);
		cusli.setAge(age);
		cusli.setId_card(id_card);
		cusli.setPhone(phone);
		int result = cusliService.register(cusli);
		ModelAndView mv = new ModelAndView("registerSuccess");
		return mv;
	}

	@RequestMapping(value = "/clogin", method = RequestMethod.POST)
	public ModelAndView login(String c_number, String c_password) {
		System.out.println(c_number);
		System.out.println(c_password);
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		session = request.getSession();

		/*try {
			c_number = new String(c_number.getBytes("iso8859-1"), "utf-8");
			c_password = new String(c_password.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}*/
		cusli = cusliService.login(c_number, c_password);
		if (cusli != null) {
			ModelAndView mv = new ModelAndView("loginSuccess");
			session.setAttribute("id", cusli.getId());
			session.setAttribute("c_name", cusli.getC_name());
			session.setAttribute("c_number", cusli.getC_number());
			session.setAttribute("c_password", cusli.getC_password());
			session.setAttribute("sex", cusli.getSex());
			session.setAttribute("age", cusli.getAge());
			session.setAttribute("id_card", cusli.getId_card());
			session.setAttribute("phone", cusli.getPhone());
			// System.out.println(cus.getC_name());
			return mv;
		} else {
			ModelAndView mv = new ModelAndView("loginFail");
			return mv;
		}
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modify(String c_number, String c_password, String phone) {
		try {
			c_number = new String(c_number.getBytes("iso8859-1"), "utf-8");
			c_password = new String(c_password.getBytes("iso8859-1"), "utf-8");
			phone = new String(phone.getBytes("iso8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (c_number != null) {
			cusli.setC_number(c_number);
		}
		if (c_password != null) {
			cusli.setC_password(c_password);
		}
		if (phone != null) {
			cusli.setPhone(phone);
		}
		int result = cusliService.modify(cusli);
		System.out.println(result);
		if (result > 0) {
			ModelAndView mv = new ModelAndView("modifySuccess");
			return mv;
		}
		return null;
	}

	@RequestMapping(value = "/searchFlight", method = RequestMethod.POST, produces = {
			"application/json;charset=UTF-8" })
	@ResponseBody
	public String searchFlight(@RequestBody SearchParameter sp) {
		List<Flightli> ls = new ArrayList<Flightli>();
		String from_city = sp.getFrom_city();
		String to_city = sp.getTo_city();
		Date start_date = sp.getStart_date();

		System.out.println(from_city);
		System.out.println(to_city);
		System.out.println(start_date);

		List<Flightli> flights = cusliService.searchFlight(from_city, to_city, start_date);
		System.out.println(flights.size());
		String s = JSON.toJSONString(flights);
		System.out.println(s);
		return s;
	}

	// @RequestMapping(value="/order",method=RequestMethod.POST,produces=
	// {"application/json;charset=UTF-8"})
	// @ResponseBody
	// public String order(@RequestBody Map<String, Object> map) {
	// String cang = (String)map.get("cang");
	// String flightId = (String)map.get("flightId");
	// String card = (String)map.get("card");
	// String a = "成功";
	//
	// return JSON.toJSONString(a);
	// }

	@RequestMapping(value = "/seeOrder", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String seeOrder(@RequestBody Map<String, Object> map) {
		String card = (String) map.get("card");
		List<TicketOrder> order = cusliService.seeOrder(card);
		return JSON.toJSONString(order);
	}

	@RequestMapping(value = "/gaiqian", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String gaiqian(@RequestBody Gaiqian1 gq) {
		String flight_number = gq.getFlight_number();
		String date = cusliService.queryDate(flight_number);
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date1 = null;
		try {
			date1 = dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Flightli> list = cusliService.gaiqian1(flight_number, date1);
		/*
		 * for (Flight flight : list) { System.out.println(flight); }
		 */
		return JSON.toJSONString(list);
	}

	/* 陈文胜 */
	@RequestMapping("main")
	public ModelAndView getmain(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView mv1 = new ModelAndView("branchmain");
		ModelAndView mv2 = new ModelAndView("statuslogin");
		String bname = request.getParameter("bname");
		String bpassword = request.getParameter("bpassword");
		String branchId = request.getParameter("branchId");
		if (branchservice.branchlogin(bname, bpassword, branchId)) {
			session.setAttribute("user", branchId);
			return mv1;
		} else {
			mv2.setViewName("redirect:login");
			return mv2;
		}
	}

	@RequestMapping("saleInformation")
	public ModelAndView getsaleinformation(HttpServletRequest req, HttpSession session) {
		ModelAndView mv1 = new ModelAndView("saleInformation");
		String user = (String) session.getAttribute("user");
		System.out.println(user);
		List<Sales> s = branchservice.salesInformation(user);
		mv1.addObject("sales", s);
		return mv1;
	}

	@RequestMapping("salesView/{id}")
	public ModelAndView getsaleView(@PathVariable("id") int id, HttpSession session) {
		ModelAndView mv = new ModelAndView("salesView");

		session.setAttribute("saleid", id);
		Sales s1 = branchservice.sale(id); // 少参数
		mv.addObject("sale", s1);
		return mv;
	}

	@RequestMapping(value = "saleupdate", method = RequestMethod.POST)
	public ModelAndView updatesaletwo(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("deletesale");
		Sales sale = new Sales(Integer.parseInt(req.getParameter("id")), req.getParameter("jobId"),
				req.getParameter("sName"), req.getParameter("sPassword"), req.getParameter("sNumber"),
				req.getParameter("branchId"));
		branchservice.saleupdate(sale);
		return mv;
	}

	@RequestMapping("saledelete/{id}")
	public ModelAndView getsaleDelete(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("deletesale");
		branchservice.saledelete(id);
		return mv;
	}

	@RequestMapping("saleinsert2")
	public ModelAndView getsaleInsert(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("deletesale");
		Sales sale = new Sales(0, req.getParameter("jobId"), req.getParameter("sName"), req.getParameter("sPassword"),
				req.getParameter("sNumber"), req.getParameter("branchId"));
		branchservice.saleinsert(sale);
		return mv;
	}

	@RequestMapping("saleinsert1")
	public ModelAndView getsaleInsert1() {
		ModelAndView mv = new ModelAndView("saleInsert");
		return mv;
	}

	// 航班基本信息查询
	@RequestMapping("flghtscheduler")
	public ModelAndView getflightScheDuler() {
		ModelAndView mv = new ModelAndView("flightInformation");
		List<FlightScheduler> fs = branchservice.flightSchedulerQuery();
		mv.addObject("flightScheduler", fs);
		return mv;
	}

	// Echarts

	@RequestMapping(value = "/Flight", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String getFlight(HttpSession session, HttpServletRequest request) {

		int saleid = (int) session.getAttribute("saleid");
		System.out.println(saleid);
		Sales ss = branchservice.sale(saleid);
		System.out.println(ss);
		String sale = ss.getJob_id();

		String salejob = String.valueOf(sale);

		List<FlightScheduler1> ll = branchservice.saleFight(salejob);

		List<String> infos1 = new ArrayList<>();
		List<String> infos2 = new ArrayList<>();

		for (FlightScheduler1 model : ll) {
			infos1.add(model.getFlight_number());
			infos2.add(model.getTotal());
		}

		Map<String, Object> map = new HashMap<>();

		map.put("x", infos1);
		map.put("y", infos2);
		System.out.println(infos1);
		System.out.println(infos2);

		return JSON.toJSONString(map);
	}

	// 航班具体信息查询
	@RequestMapping("fight/{id}")
	public ModelAndView getflight(@PathVariable("id") int id, HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("flighttwo");
		Flight f = branchservice.fightQuery(id);
		mv.addObject("Flight", f);
		return mv;
	}

	// 营业点销售情况
	@RequestMapping("branchsale")
	public ModelAndView getbranchsale(HttpSession session) {
		ModelAndView mv = new ModelAndView("branchsale");
		String user = (String) session.getAttribute("user");
		List<TicketOrder> to = branchservice.ticketQuery(user);
		mv.addObject("to", to);
		return mv;
	}

	@RequestMapping("ticketmonth")
	public ModelAndView getticketmonth() {
		ModelAndView mv = new ModelAndView("ticketmonth");
		return mv;
	}

	@RequestMapping("ticketmonth1")
	public ModelAndView getticketmonth1(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("ticketmonth2");
		String date = req.getParameter("date");
		int year = (Integer.parseInt(date.substring(0, 4)));
		int month = (Integer.parseInt(date.substring(5, 7)));
		List<TicketOrder> ll = branchservice.ticketMonth(year, month);
		mv.addObject("ll", ll);
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		List<Branch> lb = branchservice.listBranch(1, 10);
		ModelAndView mv = new ModelAndView("statuslogin");
		mv.addObject("mv", lb);
		return mv;
	}

	@RequestMapping("/decide")
	public ModelAndView dacide(HttpServletRequest request, HttpSession session) {
		int status = Integer.parseInt(request.getParameter("status"));
		String name = request.getParameter("bname");
		String password = request.getParameter("bpassword");
		if (status == 1) {
			if (rootservice.searchRoot(name, password) != null) {
				ModelAndView mv = new ModelAndView("root");
				mv.addObject("root", rootservice.searchRoot(name, password));
				return mv;
			}
		} else if (status == 2) {
			boolean flag = loginservice.valid1(name, password);
			System.out.println(flag);

			if (flag == true) {
				ModelAndView mv = new ModelAndView("/boss/main1");
				mv.addObject("root", "HAN");
				String name1 = loginservice.getName1(name);
				System.out.println(name);
				session = request.getSession(false);
				session.setAttribute("sumber", name);
				session.setAttribute("password", password);
				session.setAttribute("name", name1);
				return mv;
			}

			ModelAndView mv = new ModelAndView("statuslogin");
			mv.addObject("root", "dd");
			return mv;

		} else if (status == 3) {

			boolean flag = loginservice.valid(name, password);
			System.out.println(flag);

			if (flag == true) {
				ModelAndView mv = new ModelAndView("/sales/main");
				mv.addObject("root", "HAN");

				String name1 = loginservice.getName(name);
				session = request.getSession(false);
				session.setAttribute("sumber", name);
				session.setAttribute("password", password);
				session.setAttribute("name", name1);
				return mv;
			}
			ModelAndView mv = new ModelAndView("statuslogin");
			mv.addObject("root", "dd");
			return mv;

		} else {
			String branch_id = request.getParameter("branchId");
			session.setAttribute("user", branch_id);
			if (branchservice.searchBranch(name, password) != null) {
				ModelAndView mv = new ModelAndView("branchmain");
				mv.addObject("branches", branchservice.searchBranch(name, password));
				return mv;
			}
		}
		return null;
	}

}