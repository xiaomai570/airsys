<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">用户查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>用户名称</th>
				<th>账号</th>
				<th>密码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>证件号</th>
				<th>手机号</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${customers}" var="customer">
				<tr>
					<td>${customer.c_name}</td>
					<td>${customer.c_number}</td>
					<td>${customer.c_password}</td>
					<c:set var="sex" scope="session" value="${customer.sex}"></c:set>
					<td><c:if test="${sex==0}" var="flag" scope="session">女</c:if>
						<c:if test="${not flag}">男</c:if></td>
					<td>${customer.age}</td>
					<td>${customer.id_card}</td>
					<td>${customer.phone}</td>
					<td><a href="#" onclick="deletecustomer(${customer.id})">删除</a>
						<a href="#" onclick="updatecustomer(${customer})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<form action="/airsys/updatecustomer" method="post" name="form"
			class="updatecustomer">
			<h3 style="margin-bottom: 20px;">Customer信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">用户名称</label><br><input type="text" class="c_name"
					name="c_name">
			</div>
			<div class="form-group">
				<label for="num">账户</label><br><input type="text" class="c_number"
					name="c_number">
			</div>
			<div class="form-group">
				<label for="num">密码</label><br><input type="text" class="c_password"
					name="c_password">
			</div>
			<div class="form-group">
				<label for="pwd">性别</label><br>男:<input type='radio' class="sex"
					name="sex" value="1" checked='checked'> 女:<input
					type='radio' class="sex" name="sex" value="0">
			</div>
			<div class="form-group">
				<label for="num">年龄</label><br><input type="date" class="age"
					name="age">
			</div>
			<div class="form-group">
				<label for="pwd">证件号</label><br><input type="text" class="id_card"
					name="id_card">
			</div>
			<div class="form-group">
				<label for="pwd">手机号</label><br><input type="text" class="phone"
					name="phone">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;" onclick="goback()">返回</button>
		</form>
	</center>
	<script type="text/javascript" src="/airsys/assets/js/airsys.js/"></script>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
</body>
</html>
