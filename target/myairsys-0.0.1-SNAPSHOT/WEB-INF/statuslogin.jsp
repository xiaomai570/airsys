<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="util.*,controller.*,entity.*,service.*,dao.*"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录窗口</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<script type="text/javascript">
	window.onload=function(){
		var inp=document.getElementsByTagName("input");
		for(var i=0;i<inp.length;i++){
			inp[i].onclick=function(){ //ie的BUG
				if (this.value == '4') {
		            $(".select").css({"display":"block"});
		        }else{
		        	$(".select").css({"display":"none"});
		        }
			}
		}
	}
</script>
<body
	style="background-image: url('/airsys/assets/img/xv.jpg'); background-size: 100%, 100%; background-repeat: no-repeat">
	<div style="width: 25%; height: 100%; margin-top: 8%; margin-left: 6%;">
		<img src="/airsys/assets/img/logo.jpg"
			style="width: 35%; margin-left: 33%; margin-bottom: 10%;">
		<form action="/airsys/decide" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1" font="color:#876ED7;">网点账号</label> <input
					name="bname" type="text" class="form-control"
					id="exampleInputEmail1" placeholder="账号输入：">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1" font="color:#876ED7;">密码</label>
				<input name="bpassword" type="password" class="form-control"
					id="exampleInputPassword1" placeholder="密码">
			</div>
			<div class="form-group">
				<label for="pwd">身份选择</label><br> 管理员:<input type='radio'
					class="status" name="status" value="1" checked='checked'>&nbsp;&nbsp;&nbsp;
				老板:<input type='radio' class="status" name="status" value="2">&nbsp;&nbsp;&nbsp;
				营业员:<input type='radio' class="status" name="status" value="3">&nbsp;&nbsp;&nbsp;
				网点经理:<input type='radio' class="status" name="status" value="4">
			</div>
			<select name="branchId"
				style="height: 30px; border-radius: 5%; margin-top: 1%; display: none;"
				class="select">
				<option>营业网店选择</option>
				<c:forEach items="${mv}" var="sale">
					<option value="${sale.branch_id }">${sale.branch_id }</option>
				</c:forEach>
			</select>
			<button type="submit" class="btn btn-default"
				style="margin-left: 40%;">登录</button>
		</form>
	</div>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script type="text/javascript"
		src="/airsys/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
</body>
</html>