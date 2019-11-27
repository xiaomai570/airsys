<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<style>
    .content{
        width: 180px;
        height: 100px;
        border: 1px solid red;
        margin-left: 450px;
        margin-top: 310px;
    }

</style>
<script>
       window.onload=function () {
           var span=document.querySelector(".math");
            var i=5;
           var t= setInterval(function () {
                i--;
                span.innerHTML=i;
                if(i==0){
                    clearInterval(t);
                    location.href="/airsys/buyTicket"
                }
            },1000)
       }

</script>
<body>
       <div class="content">
           <div><span>你已购买成功</span></div>
           <div><span>请稍等<span class="math">5</span>秒</span></div>
           <div><span>如果未响应，请点击</span><a href="/airsys/buyTicket">超链接1</a></div>
       </div>
</body>
</html>