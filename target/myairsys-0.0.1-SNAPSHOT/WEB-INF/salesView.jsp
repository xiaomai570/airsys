<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>售票员信息修改</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
 <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script src="/airsys/assets/js/echarts.min.js"></script>
</head>
<body>
    <div style="width: 25%;height:100%;margin-top:4%;margin-left: 6%;float:left;">
        <img src="/airsys/assets/img/logo.jpg" style="width:30%;margin-left: 25%;">
        <form action="/airsys/saleupdate" method="post">
        	<input name="id" value="${sale.id }" type="hidden">
            <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">工号</label>
                <input name="jobId" class="form-control" id="exampleInputEmail1" value="${sale.job_id }" >
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">名字</label>
                <input name="sName" class="form-control" id="exampleInputEmail1" value="${sale.s_name}">
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">账号</label>
                <input name="sNumber" class="form-control" id="exampleInputEmail1" value="${sale.s_number }">
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">密码</label>
                <input name="sPassword" class="form-control" id="exampleInputEmail1" value="${sale.s_password}">
            </div>
             <div class="form-group" >
                <label for="exampleInputEmail1" font="color:#876ED7;">归属营业点</label>
                <input name="branchId" class="form-control" id="exampleInputEmail1" value="${sale.branch_id }">
            </div>
        <button type="submit" class="btn btn-default" style="margin-left: 40%;margin-top:3%;">修改</button>
        </form>
    </div>
      <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
	<div style="width: 600px; height: 400px; float: left; margin-top: 7%; margin-left: 10%;">
		<div >当月售票量</div>
		<div id="main" style="width: 600px; height: 400px;"></div>
	</div>
	<script>
		// 基于准备好的dom，初始化echarts实例
		window.onload= function(){
		var myChart = echarts.init(document.getElementById('main'));
		window.test = null;
		window.b = null;
		
		$.ajax({
			url : "/airsys/Flight",			
			dataType : "json",
			success : function(e) {
				console.log(e.x);
				var data1 = e.x;
				var data2 = e.y;
				// 指定图表的配置项和数据
				var option = {
					color : [ '#97FFFF' ],
					tooltip : {
						trigger : 'axis',
						axisPointer : { // 坐标轴指示器，坐标轴触发有效
							type : 'shadow' // 默认为直线，可选为：'line' | 'shadow'
						}
					},
					grid : {
						left : '3%',
						right : '4%',
						bottom : '3%',
						containLabel : true
					},
					xAxis : [
					{
						type : 'category',
					    data : data1,
						axisTick : {
							alignWithLabel : true
						} 
					} ],
					yAxis : [ {
						type : 'value'
					} ],
					series : [ {
						name : '直接访问',
						type : 'bar',
						barWidth : '60%',
						data : data2,
					} ]
				};
				myChart.setOption(option);
				// 使用刚指定的配置项和数据显示图表。   
				}
		})
		}
		
	</script>
</body>
</html>
