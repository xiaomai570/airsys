<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
<link rel="stylesheet" href="assets/css/registerView.css">
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="assets/js/registerView.js"></script>
</head>
<body>
	<form action="register" method="post" class="form">
		<label class="l1">用户名</label>	
		<input type="text" class="number-a" name="c_number" placeholder="请设置用户名"><br>
		
		<label class="l2">真实姓名</label>	
		<input type="text" class="name" name="c_name" placeholder="请输入真实姓名"><br>
		
		<label class="l3">密码</label>	
		<input type="password" class="password" name="c_password" placeholder="请输入密码"><br>
		
		<label class="l4">确认密码</label>	
		<input type="password" class="repassword" name="repassword" placeholder="请确认密码"><br>
		
		<label class="l5">男</label>	
		<input type="radio" class="sex1" name="sex" value="男">
		<label class="l6">女</label>	
		<input type="radio" class="sex2" name="sex" value="女"><br>
		
		<label class="l7">年龄</label>	
		<input type="date" class="age" name="age" placeholder="请输入年龄"><br>
		
		<label class="l8">身份证号码</label>	
		<input type="text" class="card" name="id_card" placeholder="请输入身份证号码"><br>
		
		<label class="l9">电话</label>	
		<input type="text" class="phone" name="phone" placeholder="请输入电话号码"><br>
		
		<input type="submit" class="yes" value="注册">
		<input type="button" class="no" value="取消" onclick="window.location.href='index.jsp'">
	
		
	</form>
</body>
</html>