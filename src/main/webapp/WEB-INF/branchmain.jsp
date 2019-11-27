<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>营业点信息管理</title>
<link rel="stylesheet"
	href="/airsys/assets/layui-v2.5.5/layui/css/layui.css">
<script src="/airsys/assets/layui-v2.5.5/layui/layui.js"></script>
</head>
<body>
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">营业网点信息</div>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="login">退出登录</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item "><a href="/airsys/flghtscheduler"
						target="context">航班查询</a></li>
					<li class="layui-nav-item"><a href="/airsys/saleInformation"
						target="context">售票员信息管理</a></li>
					<li class="layui-nav-item"><a href="/airsys/branchsale"
						target="context">售票统计</a></li>
					<li class="layui-nav-item"><a href="/airsys/ticketmonth"
						target="context">上月售票统计</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body" style="border: 1px solid red;">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
				<iframe src="/airsys/welcome.jsp" name="context"
					style="width: 100%; height: 600px; border: 1px solid black;"></iframe>
			</div>
		</div>
	</div>
</body>
</html>