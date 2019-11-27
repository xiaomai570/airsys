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
      
       <th>姓名</th>
       <th>账号</th>
       <th>性别</th>
       <th>年龄</th>
       <th>身份证号</th>
       <th>电话</th>
       </tr>
      <c:forEach items="${customers}" var="customer">
      <tr>      
         <td> ${customer.cName}</td>
          <td> ${customer.cNumber}</td>
          <td> ${customer.sex}</td>
          <td> ${customer.age}</td>
          <td> ${customer.idCard}</td>
          <td> ${customer.telephone}</td>
         </tr>
      </c:forEach>
     </table>      



</body>
</html>