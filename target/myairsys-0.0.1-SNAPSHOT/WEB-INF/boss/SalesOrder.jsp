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
      
       <th>工号</th>
       <th>姓名</th>
       <th>营业点ID</th>
       <th>该营业员的票数</th>
       <th>操作</th>
       </tr>
      <c:forEach items="${sales}" var="sale">
      <tr>      
         <td class="jobId">${sale.jobId}</td>
         <td>${sale.sName}</td>
         <td>${sale.branchId}</td>
         <td>${sale.salesOrder}</td>
         <td><button class="button">查看售票记录</button></td>
          
         </tr>
      </c:forEach>
     </table>      

<script type="text/javascript">
         var btn=document.querySelector(".button"); 
         btn.onclick=function(){
         var jobId=$(this).parent().parent("tr").children(".jobId").html()
       
         location.href="/airsys/SaleOrder/"+jobId;
        	  
         }  

</script>
</body>










</html>
