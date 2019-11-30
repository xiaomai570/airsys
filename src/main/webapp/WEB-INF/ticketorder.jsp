<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TicketOrder</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">订票记录查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>航班编号</th>
				<th>乘客姓名</th>
				<th>证件号码</th>
				<th>出票日期</th>
				<th>舱位等级</th>
				<th>营业网点编号</th>
				<th>营业员编号</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${ticketorders}" var="ticketorder">
				<tr>
					<td>${ticketorder.flight_number}</td>
					<td>${ticketorder.passenger_name}</td>
					<td>${ticketorder.certification_number}</td>
					<td>${ticketorder.order_date}</td>
					<td>${ticketorder.grade}</td>
					<td>${ticketorder.branch_id}</td>
					<td>${ticketorder.sales_id}</td>
					<td><a href="#" onclick="deleteticketorder(${ticketorder.id})">删除</a>
						<a href="#" onclick="updateticketorder(${ticketorder})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<form action="/airsys/updateticketorder" method="post" name="form"
			class="updateticketorder">
			<h3 style="margin-bottom: 20px;">Ticket Order信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">航班编号</label> <br><input type="text"
					class="flight_number" name="flight_number">
			</div>
			<div class="form-group">
				<label for="num">乘客姓名</label> <br><input type="text"
					class="passenger_name" name="passenger_name">
			</div>
			<div class="form-group">
				<label for="num">证件号码</label> <br><input type="text"
					class="certification_number" name="certification_number">
			</div>
			<div class="form-group">
				<label for="num">出票日期</label> <br><input type="date" class="order_date"
					name="order_date">
			</div>
			<div class="form-group">
				<label for="num">舱位等级</label> <br><input type="text" class="grade"
					name="grade">
			</div>
			<div class="form-group">
				<label for="num">营业网点编号</label> <br><input type="text" class="branch_id"
					name="branch_id">
			</div>
			<div class="form-group">
				<label for="num">营业员编号</label> <br><input type="text" class="sales_id"
					name="sales_id">
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
