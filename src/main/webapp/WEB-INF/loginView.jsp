<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
<script src="assets/js/loginView.js"></script>
<link rel="stylesheet" href="assets/css/loginView.css">

<title>登录界面</title>
</head>
<body style="background-image: url('/airsys/assets/img/xv.jpg'); background-size: 100%, 100%; background-repeat: no-repeat">
	<div>
		<div class="a">
			<form action="clogin" class="form" method="post">
				<label class="l1">用户名</label>
				<input type="text" name="c_number" blaceholder="请设置用户名" class="c_number" autocomplete="off"><br>
				<label class="l2">密码</label>
				<input type="password" name="c_password" blaceholder="请输入密码" class="c_password"><br>
				<input type="submit" class="yes" value="登录">
				<input type="button" class="no" value="取消" onclick="window.location.href='index.jsp'">
			</form>
		</div>
	</div>

</body>
</html>