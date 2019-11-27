<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FlightAll</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
	<h3 align="center">航班详细信息查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>航班号</th>
				<th>出发日期</th>
				<th>结束日期</th>
				<th>出发地城市</th>
				<th>目的地城市</th>
				<th>离港时间</th>
				<th>到港时间</th>
				<th>出发地机场</th>
				<th>目的地机场</th>
				<th>操作</th>
			</tr>
			<c:set scope="session" value="${flightall}" var="flight"></c:set>
			<tr>
				<td>${flight.flight_number}</td>
				<td>${flight.start_date}</td>
				<td>${flight.end_date}</td>
				<td>${flight.from_city}</td>
				<td>${flight.to_city}</td>
				<td>${flight.departure_time}</td>
				<td>${flight.arrival_time}</td>
				<td>${flight.start_airplane}</td>
				<td>${flight.end_airplane}</td>
				<td><a href="#" onclick="updateflight(${flight})">修改</a> <a
					href="/airsys/flight">返回</a></td>
			</tr>
		</table>
		<div class="updateflight">
		<form action="/airsys/updateflight" method="post" name="form"
			class="updateflight-inner">
			<h3 style="margin-bottom: 20px;">Flight信息修改</h3>
			<input type="hidden" class="id" name="id">
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
				<label for="num">离港时间</label> <br><input type="datetime"
					class="departure_time" name="departure_time">
			</div>
			<div class="form-group">
				<label for="num">到港时间</label> <br><input type="datetime"
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
