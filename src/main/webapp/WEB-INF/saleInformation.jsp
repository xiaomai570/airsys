<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>售票员信息管理</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<script src="/airsys/assets/js/saledelete.js"></script>
</head>
<body>
	<table class="table table-bordered">
			<tbody>
			<tr>
				<th>工号</th>
				<th>名字</th>
				<th>账号</th>
				<th>归属营业点</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${sales}" var="sale">
				<tr>
					<td>${sale.job_id}</td>
					<td>${sale.s_name}</td>
					<td>${sale.s_number}</td>
					<td>${sale.branch_id}</td>
					<td>
						<a href="salesView/${sale.id }">查看</a>
						<a href="#" onclick="saledelete(${sale.id})">删除</a>
					</td>
				</tr>			
			</c:forEach>
			</tbody>
		</table>
		<a href="saleinsert1">售票员信息添加</a>
</body>

</html>