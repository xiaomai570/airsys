<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/airsys/assets/css/bootstrap.css"  media="all">
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
  <script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"> </script>
<script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"> </script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
</head>
<body>
     <table class="table table-striped">
       <tr>
      
       <th>航班号</th>
       <th>乘客姓名</th>
       <th>身份证号</th>
       <th>订单日期</th>
       <th>舱位等级</th>
       <th>营业员工号</th>
       <th>操作</th>
       </tr>
      <c:forEach items="${ticketOrders}" var="ticketOrder">
      <tr>      
         <td class="flightNumber">${ticketOrder.flightNumber}</td>
          <td> ${ticketOrder.passengerName}</td>
          <td class="IdCard">${ticketOrder.certificationNumber}</td>
          <td> ${ticketOrder.orderDate}</td>
          <td> ${ticketOrder.grade}</td>
          <td> ${ticketOrder.salesId}</td>
          <td><button class="button">退票</button></td>
         </tr>
      </c:forEach>
     </table>      
<script type="text/javascript">
       
        	 $('table').on('click','.button',function(){ 
       var flightNumber=$(this).parent().parent("tr").children(".flightNumber").html()
       var IdCard=$(this).parent().parent("tr").children(".IdCard").html()
        
		  $.ajax({
			  url:"/airsys/TuiOrder",
			  data:{
					flightNumber:flightNumber,
					IdCard:IdCard
				},
			success:function(e){
					  
			 var result=e.replace(/\s/g, "");
					
						if(result=="ok"){
							alert("退票成功")
						}else{
							alert("退票失败")
						}
				  }
			  
			
		  })
        	  
         } ) 

</script>
</body>
</html>
