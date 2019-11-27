<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>管理员管理</title>
<link rel="stylesheet" href="/airsys/assets/css/demo.css">
</head>
<body>
	<div class="outer">
      <div class="left-outer">
        <div class="left">
        	<div class="left-top">
        		欢迎管理员<br>
        		上线-^-^-
        	</div>
          <ul class="left-bottom">
             <li><a href="/airsys/airport" target="aa">机场管理</a></li>
             <li><a href="/airsys/boss" target="aa">老板管理</a></li>
             <li><a href="/airsys/branch" target="aa">网点管理</a></li>
             <li><a href="/airsys/customer" target="aa">用户管理</a></li>
             <li><a href="/airsys/flight" target="aa">航班管理</a></li>
             <li><a href="/airsys/sales" target="aa">员工管理</a></li>
             <li><a href="/airsys/ticketorder" target="aa">购票记录</a></li>
             <li><a href="javascript:;" target="aa">其他</a></li>
          </ul>
        </div>
      </div>
      <div class="right">
        <div class="right-top">
        	<div class="welcome">
				<h4 class="wuser">&nbsp;&nbsp;当前登录：&nbsp;&nbsp;&nbsp;&nbsp;${root.r_name}</h4><div class="wun"></div>
				<a href="/airsys/login" class="exitbtn">退出登录</a>
			</div>
        </div>
        <div class="con">
        	<iframe class="con-inner" src="/airsys/welcome.jsp" name="aa" frameborder="0" scrolling="no">
        		
        	</iframe>
        </div>
      </div>
      <div class="bottom">
      	<div class="bottom-top"></div>
      	<div class="bottom-left">
      		<div class="bottom-left-1">版权所有：localhost://80/air_System/index.html</div>
      	</div>
      	<div class="bottom-right">联系我们：<br><span>178xxxx7313</span></div>
      </div>
    </div>
</body>
</html>