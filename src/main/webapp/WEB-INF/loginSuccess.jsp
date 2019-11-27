<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String name = (String)session.getAttribute("c_name");
String c_number = (String)session.getAttribute("c_number");
String c_password = (String)session.getAttribute("c_password");
String phone = (String)session.getAttribute("phone");
String id_card = (String)session.getAttribute("id_card");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="assets/layui/css/layui.css">
<link rel="stylesheet" href="assets/css/loginSuccess.css">
<script src="assets/jquery-validation-1.14.0/lib/jquery.js"></script>
<script type="text/javascript" src="assets/layui/layui.js "></script>
<script type="text/javascript" src="assets/js/searchFlight.js "></script>
<title>客户端首页</title>
</head>
<body>
<div class="hidden" card="${id_card}"></div>
<div class="top"></div>
<div class="info">
	<div class="name">
		<i class="layui-icon layui-icon-face-smile"></i><%=name %>
	</div>
	<form action="/airsys/cexit" class="cexit" method="post">
		<input type="submit" value="安全退出" >
	</form>
</div>
<div class="layui-tab a">
  <ul class="layui-tab-title">
    <li class="layui-this">搜索航班</li>
    <li class="seeOrder see"  onClick="seeOrder()">查看订单</li>
    <li>修改个人信息</li>
  </ul>
  <div class="layui-tab-content">
    <div class="layui-tab-item layui-show b">
    	<div class="searchFlight">
			
				<label class="l1">出发地</label>
				<input type="text" class="from_city" name="from_city">
				
				<label class="l2">目的地</label>
				<input type="text" class="to_city" name="to_city"><br>
				
				<label class="l3">出发日期</label>
				<input type="date" class="start_date" name="start_date">
				
				<button class="searchbtn">搜索</button>
			<div class="flight">
				<div class="box">
					<div class="d1">地点</div>
					<div class="d2">时间</div>
					<div class="d3">机场</div>
					<div class="d4">剩余票数</div>
					<div class="d5">价格</div>
					<div class="d6">操作</div>
					<table class="table1">
						<tr>
							<td class="td">出发地</td>					
							<td class="td">目的地</td>					
							<td class="td">出发时间</td>					
							<td class="td">到达时间</td>					
							<td class="td">出发地机场</td>					
							<td class="td">到达地机场</td>					
							<td class="td">头等舱</td>					
							<td class="td">商务舱</td>					
							<td class="td">经济舱</td>					
							<td class="td">头等舱</td>					
							<td class="td">商务舱</td>					
							<td class="td">经济舱</td>
							<td class="td1"></td>
						</tr>
					</table>
				</div>
				
			</div>
    	</div>
    </div>
    <div class="layui-tab-item orderContent">
    	<div class="box1">
			<div class="d7">航班号</div>
			<div class="d8">乘客</div>
			<div class="d9">订单时间</div>
			<div class="d10">舱位</div>
			<div class="d11">乘客类型</div>
			<div class="d12">营业点id</div>
			<div class="d13">营业员id</div>
			<div class="d14">操作</div>
			<table class="table2">
				
			</table>
		</div>
		<div class="box3">
					<div class="d15">地点</div>
					<div class="d16">时间</div>
					<div class="d17">机场</div>
					<div class="d18">剩余票数</div>
					<div class="d19">价格</div>
					<div class="d20">操作</div>
					<table class="table3">
						<tr>
							<td class="t">出发地</td>					
							<td class="t">目的地</td>					
							<td class="t">出发时间</td>					
							<td class="t">到达时间</td>					
							<td class="t">出发地机场</td>					
							<td class="t">到达地机场</td>					
							<td class="t">头等舱</td>					
							<td class="t">商务舱</td>					
							<td class="t">经济舱</td>					
							<td class="t">头等舱</td>					
							<td class="t">商务舱</td>					
							<td class="t">经济舱</td>
							<td class="t1"></td>
						</tr>
					</table>
				</div>
    </div>
    <div class="layui-tab-item">
    	<form action="modify" method="post">
    		<label class="l5">用户名</label>
    		<input class="c_number" type="text" value=<%=c_number %> name="c_number">
    		
    		<label class="l6">密码</label>
    		<input class="c_password" type="text" value=<%=c_password %> name="c_password">
    		
    		<label class="l7">电话</label>
    		<input class="phone" type="text" value=<%=phone %> name="phone">
    		
    		<input type="submit" class="modify" value="修改">
    	</form>
    </div>
  </div>
</div>
 
<script>
//注意：选项卡 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
  var element = layui.element;
  
  //…
});
</script> 
</body>
</html>
