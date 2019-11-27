<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录失败</title>
</head>
<style>
.box{
	width:300px;
	height:200px;
	position:absolute;
	left:0;top:0;right:0;bottom:0;
	margin:auto;
	border:1px solid gray;
}
.top{
	width:100%;
	height:30px;
	line-height:50px;
	background:blue;
}
.bottom{
	width:100%;
	height:170px;

}
.bottom-con{
	width:100%;
	height:100px;
	margin-top:50px;
}
span{
	color:red;
}
</style>
<script>
	window.onload=function(){
		var span=document.querySelector("span")
		var num=3
		function reduce(){
			num--
			span.innerHTML=num
			span.style.color="red"
			if(num<=0){
				window.location.href="loginSuccess"
				clearInterval(t)
			}
		}
		
		var t=setInterval(reduce,1000)
	}
</script>
</head>
<body>
<div class="box">
	<div class="top"></div>
	<div class="bottom">
		<div class="bottom-con">
			<h3>修改成功，请重新登陆</h3></br>
			<span>3</span>秒后回到主页面</br>
			如果没有跳转，请点击<a href="loginSuccess">这里</a>
		</div>
	</div>
</div>
</body>
</html>
</body>
</html>