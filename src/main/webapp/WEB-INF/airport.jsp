<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Airport</title>
<link rel="stylesheet" href="/airsys/assets/css/airsys.css">
</head>
<body>
    <!-- <div class="upd">
    	修改成功
    </div>
    <div class="del">
    	删除成功
    </div> -->
	<h3 align="center">机场查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>机场编号</th>
				<th>所在城市</th>
				<th>机场名称</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${airports}" var="airport">
				<tr>
					<td>${airport.airport_code}</td>
					<td>${airport.city}</td>
					<td>${airport.airport_name}</td>
					<td><a href="#" onclick="deleteairport(${airport.id})">删除</a>
						<a href="#" onclick="updateairport(${airport})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="#" onclick="insertairport()">新建机场</a>
		<form action="/airsys/updateairport" method="post" name="form"
			class="updateairport">
			<h3 style="margin-bottom: 20px;">Airport信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">机场编号</label><br><input type="text" class="uname"
					placeholder="请输入机场编号" name="uname">
			</div>
			<div class="form-group">
				<label for="num">所在城市</label><br><input type="text" class="num"
					placeholder="请输入所在城市" name="num">
			</div>
			<div class="form-group">
				<label for="pwd">机场名称</label><br><input type="text" class="pwd"
					placeholder="请输入机场名称" name="pwd">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;" onclick="goback()">返回</button>
		</form>
		<form action="/airsys/insertairport" method="post" name="form"
			class="insertairport">
			<h3 style="margin-bottom: 20px;">新建Airport</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">机场编号</label> <input type="text" class="uname"
					placeholder="请输入机场编号" name="uname">
			</div>
			<div class="form-group">
				<label for="num">所在城市</label> <input type="text" class="num"
					placeholder="请输入所在城市" name="num">
			</div>
			<div class="form-group">
				<label for="pwd">机场名称</label> <input type="text" class="pwd"
					placeholder="请输入机场名称" name="pwd">
			</div>
			<button type="submit" class="btn" style="margin-left: 35px;">提交</button>
			<button type="button" class="btn1" style="margin-left: 65px;" onclick="goback()">返回</button>
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
