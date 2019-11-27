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
	<h3 align="center">营业点查询</h3>
	<hr color="#ccc" size="5px">
	<center>
		<table>
			<tr>
				<th>网点名称</th>
				<th>地址</th>
				<th>电话</th>
				<th>所在省份</th>
				<th>所在城市</th>
				<th>密码</th>
				<th>网点编号</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${branches}" var="branch">
				<tr>
					<td>${branch.b_name}</td>
					<td>${branch.address}</td>
					<td>${branch.telephone}</td>
					<td>${branch.province}</td>
					<td>${branch.city}</td>
					<td>${branch.b_password}</td>
					<td>${branch.branch_id}</td>
					<td><a href="#" onclick="findSales('${branch.branch_id}')">营业员查看</a>
						<a href="#" onclick="deletebranch(${branch.id})">删除</a> <a
						href="#" onclick="updatebranch(${branch})">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<a href="#" onclick="insertbranch()">新建网点</a>
		<form action="/airsys/updatebranch" method="post" name="form"
			class="updatebranch">
			<h3 style="margin-bottom: 20px;">Branch信息修改</h3>
			<input type="hidden" class="id" name="id">
			<div class="form-group">
				<label for="uname">网点名称</label><br><input type="text" class="b_name"
					name="b_name">
			</div>
			<div class="form-group">
				<label for="num">地址</label><br><input type="text" class="address"
					name="address">
			</div>
			<div class="form-group">
				<label for="num">电话</label><br><input type="text" class="telephone"
					name="telephone">
			</div>
			<div class="form-group">
				<label for="pwd">所在省份</label><br><input type="text" class="province"
					name="province">
			</div>
			<div class="form-group">
				<label for="num">所在城市</label><br><input type="text" class="city"
					name="city">
			</div>
			<div class="form-group">
				<label for="pwd">密码</label><br><input type="text" class="b_password"
					name="b_password">
			</div>
			<div class="form-group">
				<label for="pwd">网点编号</label><br><input type="text" class="branch_id"
					name="branch_id">
			</div>
			<button type="submit" class="btn" style="margin-left: 30px;">提交</button>
			<button type="button" class="btn1" style="margin-right: 30px;" onclick="goback()">返回</button>
		</form>
		<form action="/airsys/insertbranch" method="post" name="form"
			class="insertbranch">
			<h3 style="margin-bottom: 20px;">新建网点</h3>
			<div class="form-group">
				<label for="uname">网点名称</label><br><input type="text" class="b_name"
					placeholder="请输入网点名称" name="b_name">
			</div>
			<div class="form-group">
				<label for="num">地址</label><br><input type="text" class="address"
					placeholder="请输入地址" name="address">
			</div>
			<div class="form-group">
				<label for="num">电话</label><br><input type="text" class="telephone"
					placeholder="请输入网点电话" name="telephone">
			</div>
			<div class="form-group">
				<label for="pwd">所在省份</label><br><input type="text" class="province"
					placeholder="请输入所在省份" name="province">
			</div>
			<div class="form-group">
				<label for="num">所在城市</label><br><input type="text" class="city"
					placeholder="请输入所在城市" name="city">
			</div>
			<div class="form-group">
				<label for="pwd">密码</label><br><input type="text" class="b_password"
					placeholder="请输入密码" name="b_password">
			</div>
			<div class="form-group">
				<label for="pwd">网点编号</label><br><input type="text" class="branch_id"
					placeholder="请输入网点编号" name="branch_id">
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
