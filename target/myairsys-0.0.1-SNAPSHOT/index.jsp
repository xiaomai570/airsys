<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/layui/css/layui.css">
<link rel="stylesheet" href="assets/css/index.css">
<script type="text/javascript" src="assets/layui/layui.js "></script>

<script src="assets/js/index.js"></script>
<title>花季少女</title>
</head>
<body>
	<div class="layui-carousel" id="test1">
		<div carousel-item>
			<div>
				<img src="assets/img/lunbo1.jpg">
			</div>
			<div>
				<img src="assets/img/lunbo2.jpg">
			</div>
			<div>
				<img src="assets/img/lunbo3.jpg">
			</div>
		</div>
	</div>
	<div class="loginAndRegister layui-bg-orange">
		<a href="registerView" class="register">注册</a> <a href="loginView"
			class="login">登录</a>
	</div>

	<div class="searchFlight">
		<form action="">
			<input type="text" name="from_city" class="from_city"
				placeholder="出发地"> <input type="text" name="to_city"
				class="to_city" placeholder="目的地"><br> <input
				type="date" name="start_date" class="start_date"> <select
				class="cang">
				<option value="">头等舱</option>
				<option selected="selected">商务舱</option>
				<option>经济舱</option>
			</select><br> <input type="submit" class="submit" value="搜索">
		</form>
	</div>

	<div class="bottom">版权所有：第五组</div>

</body>
</html>