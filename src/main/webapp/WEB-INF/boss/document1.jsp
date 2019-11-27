<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" type="text/css" href="/airsys/assets/css/bootstrap.css">
    <title>Document</title>
    <style>
        .title{
            height: 60px;
            background: rgba(238,242,255,0.74);
        }
        .title1{
            float: left;
            margin-left: 30px;
            font-size: 30px;
            margin-top: 5px;

        }
        .title2{
            float: left;
            margin-left: 15px;
            margin-top: 15px;
        }
        .progress{
            width: 60%;
            float: left;
            margin-left: 30px;
            margin-top: 20px;
        }
        .title3{
            float:right;
            margin-right: 10px;
            margin-left: 20px;
            margin-top: 15px;
        }
        .bottom{
            width: 100%;
            height: 500px;

            float: left;
        }
        .bottom1{
            float: left;
            width: 100%;
            height: 50px;
            border-bottom: 1px solid black;
        }
        .left1{
            float: left;
            font-size: 25px;
            margin-left: 30px;
            margin-top: 10px;

           width: 180px;


        }
        .content1{
            float: left;
            width: 40%;
            height: 25px;
            margin-left: 150px;
            margin-top: 20px;
            text-align: center;
            font-size: 15px;
        }
       .right1{
        float: right;
           margin-right: 50px;
           margin-top: 20px;
           font-size: 15px;
       }
    </style>
</head>
<body>
    <div class="title">
        <div class="title1">我的信息</div>
        <div class="title2">资料完善度</div>
        <div class="progress">
            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                <span class="sr-only">60% Complete (warning)</span>
            </div>
        </div>
         <div class="title3">预览我的主页</div>
        <div class="title4"></div>
    </div>
    <c:forEach items="${users}" var="user">
    <div class="bottom">
    
        <div class="bottom1">
            <div class="left1">登录账号</div>
            <div class="content1">${user.bossNumber}</div>
            <div class="right1">
                <a href="/airsys/xiupassword1">修改密码</a>
            </div>
        </div>
        <div class="bottom1">
            <div class="left1">姓名</div>
            <div class="content1">${user.bName}</div>
            <div class="right1">

            </div>
        </div>
       
       
     </c:forEach>
    </div>
</body>
</html>