<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
<head>
<title>营业点某月售票查询</title>
</head>
<body>
	<div style="width:200px;height:200px;margin:auto;">
		<form action="ticketmonth1">
			<div style="float:left">
			<input name="date" type="date" style="margin-top:6%;height:30px;">
			</div>
			<div style="float:left">
			<button type="submit" class="btn btn-default" style="margin-top:10%;">查询</button>
			</div>
		</form>
	</div>
</body>
</html>