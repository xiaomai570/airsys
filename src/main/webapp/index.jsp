<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/css/index.css">
<link rel="stylesheet" href="assets/css/cityselect.css">
<script src="assets/js/index.js"></script>
<script src="assets/js/cityselect.js"></script>
<title>花季少女</title>
</head>
<body>
<div class="nav">
	<div class="toppic">
		<img src="assets/img/plane.jpg" width="100%" height="100%">
	</div>
	<div class="name">寰宇国际</div>
	<a href="registerView" class="registera">注册</a>
	<a href="loginView" class="logina">登录</a>
</div>
<div class="bg">
	<form action="" method="post">
		<div class="fromCity">
			<input type="text" name="from_city"  autocomplete="off" class="cityinput" id="start" placeholder="请输入出发地">
		</div>
		<div class="toCity">
			<input type="text" name="to_city"  autocomplete="off" class="cityinput" id="end" placeholder="请输入目的地">
		</div>
		<div class="startDate">
			<input type="date" name="start_date"  autocomplete="off" class="cityinput" placeholder="出发日期">
		</div>
		<input type="submit" value="搜索" class="submit">
	</form>
</div>
<script>
	var test = new Vcity.CitySelector({
		input : 'start'
	});
	var test = new Vcity.CitySelector({
		input : 'end'
	});
</script>
</body>
</html>