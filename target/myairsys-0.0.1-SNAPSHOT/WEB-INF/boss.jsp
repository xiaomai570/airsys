<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Boss</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">老总查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>姓名</th>
				<th>账号</th>
				<th>密码</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${bosses}" var="boss">
				<tr>
					<td>${boss.b_name}</td>
					<td>${boss.boss_number}</td>
					<td>${boss.boss_password}</td>
					<td><a href="#" onclick="deleteboss(${boss.id})">删除</a> <a
						href="#" onclick="updateboss(${boss})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="#" onclick="insertboss()">新增老板</a>
		<form action="/airsys/updateboss" method="post" name="form"
			class="updateboss">
			<h3 style="margin-bottom: 20px;">Boss信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">姓名</label><br>
				<input type="text" class="uname" placeholder="请输入姓名" name="uname">
			</div>
			<div class="form-group">
				<label for="num">用户名</label><br>
				<input type="text" class="num" placeholder="请输入用户名" name="num">
			</div>
			<div class="form-group">
				<label for="pwd">密码</label><br>
				<input type="text" class="pwd" placeholder="请输入密码" name="pwd">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;"
				onclick="goback()">返回</button>
		</form>
		<form action="/airsys/insertboss" method="post" name="form"
			class="insertboss">
			<h3 style="margin-bottom: 20px;">Boss添加</h3>
			<div class="form-group">
				<label for="uname">姓名</label><br>
				<input type="text" class="uname" placeholder="请输入姓名" name="uname">
			</div>
			<div class="form-group">
				<label for="num">用户名</label><br>
				<input type="text" class="num" placeholder="请输入用户名" name="num">
			</div>
			<div class="form-group">
				<label for="pwd">密码</label><br>
				<input type="text" class="pwd" placeholder="请输入密码" name="pwd">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;"
				onclick="goback()">返回</button>
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
