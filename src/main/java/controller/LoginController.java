package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.propotype.LoginService;



@Controller
public class LoginController {
	
	 @Autowired
	 private LoginService loginService;
//           @RequestMapping("/login")
//           public String login() {
//        	   return "/sales/login";
//           }
//           @RequestMapping("/login1")
//           public String login1() {
//        	   return "/boss/login1";
//           }
//           @RequestMapping("/valid")
//           public String valid(HttpServletRequest request,HttpServletResponse response) {
//        	   String user=request.getParameter("user");
//        	   System.out.println(user);
//        	   String password=request.getParameter("password");
//        	   System.out.println(password);
//        	   boolean flag=loginService.valid(user, password);
//        	   System.out.println(flag);
//        	   HttpSession session;
//        	   if(flag==true) {	
//        		   String name=loginService.getName(user);
//        		   session=request.getSession(false);
//        		   session.setAttribute("sumber", user);
//        		   session.setAttribute("password",password);
//        		   session.setAttribute("name", name);
//        		   return "/sales/main";
//        	   }
//        	   
//			return "/sales/login";      	   
//           }
           @RequestMapping("/tuichu")
           public String tuichu(HttpServletRequest request) {
        	  HttpSession session=request.getSession(false);
        	   session.removeAttribute("sumber");
        	   session.removeAttribute("password");
        	   session.removeAttribute("name");
			return "statuslogin";
        	   
           }
           @RequestMapping("/tuichu1")
           public String tuichu1(HttpServletRequest request) {
        	  HttpSession session=request.getSession(false);
        	   session.removeAttribute("sumber");
        	   session.removeAttribute("password");
        	   session.removeAttribute("name");
			return "statuslogin";
        	   
           }
//           @RequestMapping("/valid1")
//           public String valid1(HttpServletRequest request,HttpServletResponse response) {
//        	   String user=request.getParameter("user");
//        	   System.out.println(user);
//        	   String password=request.getParameter("password");
//        	   System.out.println(password);
//        	   boolean flag=loginService.valid1(user, password);
//        	   System.out.println(flag);
//        	   HttpSession session;
//        	   if(flag==true) {	
//        		   String name=loginService.getName1(user);
//        		   System.out.println(name);
//        		   session=request.getSession(false);
//        		   session.setAttribute("sumber", user);
//        		   session.setAttribute("password",password);
//        		   session.setAttribute("name", name);
//        		   return "/boss/main1";
//        	   }
//        	   
//			return "/boss/login1";      	   
//           }
}
