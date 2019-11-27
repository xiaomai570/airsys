<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sales</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">公司员工查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>工号</th>
				<th>名字</th>
				<th>账户</th>
				<th>密码</th>
				<th>网点编号</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${sales}" var="sale">
				<tr>
					<td>${sale.job_id}</td>
					<td>${sale.s_name}</td>
					<td>${sale.s_number}</td>
					<td>${sale.s_password}</td>
					<td>${sale.branch_id}</td>
					<td><a href="#" onclick="deletesale(${sale.id})">删除</a> <a
						href="#" onclick="updatesale(${sale})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<form action="/airsys/updatesale" method="post" name="form"
			class="updatesale">
			<h3 style="margin-bottom: 20px;">Sale信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">工号</label><br>
				<input type="text" class="job_id" name="job_id">
			</div>
			<div class="form-group">
				<label for="num">姓名</label><br>
				<input type="text" class="s_name" name="s_name">
			</div>
			<div class="form-group">
				<label for="num">账号</label><br>
				<input type="text" class="s_number" name="s_number">
			</div>
			<div class="form-group">
				<label for="num">密码</label><br>
				<input type="text" class="s_password" name="s_password">
			</div>
			<div class="form-group">
				<label for="num">网点编号</label><br>
				<input type="text" class="branch_id" name="branch_id">
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
