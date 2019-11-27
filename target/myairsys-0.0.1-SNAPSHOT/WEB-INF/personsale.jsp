<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>售票员机票销售情况</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
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
				<th>乘客身份</th>
				<th>归属营业点</th>
				<th>售票员工号</th>
			</tr>
			<c:forEach items="${sales}" var="sale">
				<tr>
					<td>${sale.jobId}</td>
					<td>${sale.sName}</td>
					<td>${sale.sNumber}</td>
					<td>${sale.branchId}</td>
					<td>
						<a href="salesView/${sale.id }">查看</a>
						<a href="#" onclick="saledelete(${sale.id})">删除</a>
					</td>
				</tr>			
			</c:forEach>
			</tbody>
	 </table>
</body>
</html>