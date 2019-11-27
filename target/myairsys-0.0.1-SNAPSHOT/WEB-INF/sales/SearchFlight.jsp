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
     <table class="table table-bordered">
       <tr>      
       <th>航班号</th>
       <th>出发时间</th>
       <th>到达时间</th>
       <th>出发机场</th>
       <th>到达机场</th>
       <th>出发城市</th>
       <th>到达城市</th>
       <th>头等舱剩余票数</th>
        <th>头等舱价格</th>
       <th>商务舱剩余票数</th>
       <th>商务舱价格</th>
       <th>经济舱剩余票数</th>
        <th>经济舱价格</th> 
        <th>操作</th>      
       </tr>
      <c:forEach items="${searchFlights}" var="searchFlight">
         <tr>      
             <td >${searchFlight.flightNumber}</td>
             <td>${searchFlight.departureTime}</td>
             <td>${searchFlight.arrivalTime}</td>
             <td>${searchFlight.startAirplane}</td>
             <td>${searchFlight.endAirplane}</td>
             <td>${searchFlight.fromCity}</td>
             <td>${searchFlight.toCity}</td>
             <td>${searchFlight.firstClassRemainSeats}</td>
             <td>${searchFlight.firstPrice}</td>
             <td>${searchFlight.businessClassRemainSeats}</td>
             <td>${searchFlight.businessPrice}</td>
             <td>${searchFlight.economyClassRemainSeats}</td>
             <td>${searchFlight.economyPrice}</td>
             <td><input type="button" name="confirmAlter" value="购买" onclick="MyFunction('${searchFlight.flightNumber}')"/></td>         
         </tr>
      </c:forEach>
     </table>       
</body>
 <script>
       function MyFunction(a) {
    	   location.href="/airsys/Select/"+a;
	      }
</script>
</html>
