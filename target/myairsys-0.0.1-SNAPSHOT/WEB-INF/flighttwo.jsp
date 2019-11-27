<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<title>航班具体信息</title>
</head>
<body>
	<table class="table table-bordered">
		<tbody>
			<tr>
				<th>航班号</th>
				<th>头等舱座位数</th>
				<th>商务舱座位数</th>
				<th>经济舱座位数</th>
				<th>头等舱价格</th>
				<th>商务舱价格</th>
				<th>经济舱价格</th>
			</tr>
			<c:set value="${Flight}" var="flight" scope="session"></c:set>
			<tr>
				<td>${flight.flight_number}</td>
				<td>${flight.first_class_remain_seats}</td>
				<td>${flight.business_class_remain_seats}</td>
				<td>${flight.economy_class_remain_seats}</td>
				<td>${flight.first_price}</td>
				<td>${flight.business_price}</td>
				<td>${flight.economy_price}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>