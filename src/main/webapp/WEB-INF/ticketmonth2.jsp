<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<title>营业点某月售票量</title>
</head>
<body>
	<table class="table table-bordered">
			<tbody>
			<tr>
				<th>航班</th>
				<th>乘客姓名</th>
				<th>认证号码</th>
				<th>订票日期</th>
				<th>机票种类</th>
				<th>售票员工号</th>
			</tr>
			<c:forEach items="${ll}" var="l">
				<tr>
					<td>${l.flight_number}</td>
					<td>${l.passenger_name}</td>
					<td>${l.certification_number}</td>
					<td>${l.order_date}</td>
					<td>${l.grade}</td>
					<td>${l.sales_id}</td>
				</tr>			
			</c:forEach>
			</tbody>
	 </table>
</body>
</html>