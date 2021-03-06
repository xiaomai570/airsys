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
</head>
<body>
     <table class="table table-striped">
       <tr>
      
       <th>航班号</th>
       <th>乘客姓名</th>
       <th>身份证号</th>
       <th>订单日期</th>
       <th>舱位等级</th>
       </tr>
      <c:forEach items="${tickets}" var="ticket">
      <tr>      
         <td> ${ticket.flightNumber}</td>
          <td> ${ticket.passengerName}</td>
          <td> ${ticket.certificationNumber}</td>
          <td> ${ticket.orderDate}</td>
          <td> ${ticket.grade}</td>
         </tr>
      </c:forEach>
     </table>      



</body>
</html>