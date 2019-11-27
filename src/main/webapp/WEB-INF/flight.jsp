<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flight</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">航班查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>航班号</th>
				<th>头等舱剩余座位数</th>
				<th>商务舱剩余座位数</th>
				<th>经济舱剩余座位数</th>
				<th>头等舱价格</th>
				<th>商务舱价格</th>
				<th>经济舱价格</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${flights}" var="flight">
				<tr>
					<td>${flight.flight_number}</td>
					<td>${flight.first_class_remain_seats}</td>
					<td>${flight.business_class_remain_seats}</td>
					<td>${flight.economy_class_remain_seats}</td>
					<td>${flight.first_price}</td>
					<td>${flight.business_price}</td>
					<td>${flight.economy_price}</td>
					<td><a href="#" onclick="findflight('${flight.flight_number}')">详细信息</a>
						<a href="#" onclick="deleteflight('${flight.flight_number}')">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<a href="#" onclick="insertflight()">添加航班</a>
		<div class="insertflight">
		<form action="/airsys/insertflight" method="post" name="form"
			class="insertflight-inner">
			<h3 style="margin-bottom: 20px;">Flight信息</h3>
			<div class="form-group">
				<label for="uname">航班号</label> <br><input type="text"
					class="flight_number" name="flight_number">
			</div>
			<div class="form-group">
				<label for="uname">头等舱剩余座位数</label> <br><input type="text"
					class="first_class_remain_seats" name="first_class_remain_seats">
			</div>
			<div class="form-group">
				<label for="uname">商务舱剩余座位数</label> <br><input type="text"
					class="business_class_remain_seats"
					name="business_class_remain_seats">
			</div>
			<div class="form-group">
				<label for="uname">经济舱剩余座位数</label> <br><input type="text"
					class="economy_class_remain_seats"
					name="economy_class_remain_seats">
			</div>
			<div class="form-group">
				<label for="uname">头等舱价格</label> <br><input type="text"
					class="first_price" name="first_price">
			</div>
			<div class="form-group">
				<label for="uname">商务舱价格</label> <br><input type="text"
					class="business_price" name="business_price">
			</div>
			<div class="form-group">
				<label for="uname">经济舱价格</label> <br><input type="text"
					class="economy_price" name="economy_price">
			</div>
			<div class="form-group">
				<label for="num">出发日期</label> <br><input type="date" class="start_date"
					name="start_date">
			</div>
			<div class="form-group">
				<label for="num">结束日期</label> <br><input type="date" class="end_date"
					name="end_date">
			</div>
			<div class="form-group">
				<label for="num">出发地城市</label> <br><input type="text" class="from_city"
					name="from_city">
			</div>
			<div class="form-group">
				<label for="pwd">目的地城市</label> <br><input type="text" class="to_city"
					name="to_city">
			</div>
			<div class="form-group">
				<label for="num">离港时间</label> <br><input type="text"
					class="departure_time" name="departure_time">
			</div>
			<div class="form-group">
				<label for="num">到港时间</label> <br><input type="text"
					class="arrival_time" name="arrival_time">
			</div>
			<div class="form-group">
				<label for="num">出发地机场</label> <br><input type="text"
					class="start_airplane" name="start_airplane">
			</div>
			<div class="form-group">
				<label for="num">目的地机场</label> <br><input type="text"
					class="end_airplane" name="end_airplane">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;" onclick="goback()">返回</button>
		</form>
		</div>
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
