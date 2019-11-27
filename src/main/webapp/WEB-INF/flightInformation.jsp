<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<title>航班信息查询</title>
</head>
<body>
	<table class="table table-bordered">
			<tbody>
			<tr>
				<th>航班号</th>
				<th>开始时间</th>
				<th>到达时间</th>
				<th>出发地</th>
				<th>目的地</th>
				<th>出发时间</th>
				<th>到达时间</th>
				<th>出发机场</th>
				<th>到达机场</th>
				<th>具体信息</th>
			</tr>
			<c:forEach items="${flightScheduler}" var="flightSchedulers">
				<tr>
					<td>${flightSchedulers.flight_number}</td>
					<td>${flightSchedulers.start_date}</td>
					<td>${flightSchedulers.end_date}</td>
					<td>${flightSchedulers.from_city}</td>
					<td>${flightSchedulers.to_city}</td>
					<td>${flightSchedulers.departure_time}</td>
					<td>${flightSchedulers.arrival_time}</td>
					<td>${flightSchedulers.start_airplane}</td>
					<td>${flightSchedulers.end_airplane}</td>
					<td>
						<a href="fight/${flightSchedulers.id}" >查看</a>
					</td>
				</tr>			
			</c:forEach>
			</tbody>
		</table>
</body>
</html>