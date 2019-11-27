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
    <title>Document</title>
  <style>
      .content{
          width: 50%;
          height: 80%;
          margin-left: 300px;
      }
      .title{
          background: #1E9FFF;
          width: 100%;
          height:150px;
      }
      .title1{

          text-align: center;
          width: 100%;
          height: 30px;
          font-size: 25px;
      }
     .title2{
         width: 500px;
         height: 110px;

     }
      .title2-left{
          float: left;
          width: 80px;
           height: 80px;

          margin-left: 20px;
          margin-top: 20px;
      }
      .tou{
          width: 80px;
          height: 80px;

      }
      .title2-left-right{
          float: left;
          width: 300px;
          height: 90px;

          margin-left: 5px;
          margin-top: 30px;
      }
      .title2-left-right-1{
          float: left;
          width: 40%;
          height: 20px;

          margin-top: 10px;
          text-align: center;

      }
      .title2-left-right-2{
          float: left;
          width: 100%;
          height: 20px;

          margin-top: 15px;
          margin-left: 30px;
      }
      .user{
          margin-left: 30px;
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

          width: 140px;


      }
      .content1{
          float: left;
          width: 40%;
          height: 25px;
          margin-left: 20px;
          margin-top: 20px;
          text-align: center;
          font-size: 15px;

      }
      .right1{
          float: right;
          margin-right: 40px;
          margin-top: 20px;
          font-size: 15px;

      }
  </style>
</head>
<body>
    <div class="content">
        <div class="title">
          
            <div class="title1">安全设置</div>
            <c:forEach items="${users}" var="user">
            <div class="title2">
                <div class="title2-left">
                    <div class="title2-left-1">
                      <img class="tou" src="/airsys/assets/img/touxiang.jpg">
                    </div>
                </div>
                
                    <div class="title2-left-right">
                        <div class="title2-left-right-1">${user.sname}</div>
                        <div class="title2-left-right-2"><span>账号</span><span class="user">${user.sumber }</span> </div>
                    </div>
                </div>
              </c:forEach>
            </div>
           
        <div class="bottom">
          
            <div class="bottom1">
                <div class="left1">账户认证</div>
                <div class="content1"></div>
                <div class="right1">已认证</div>
            </div>
            <div class="bottom1">
                <div class="left1">实名认证</div>
                <div class="content1"></div>
                <div class="right1">
                        已认证
                </div>
            </div>
            <div class="bottom1">
                <div class="left1">设置密码</div>
                <div class="content1"></div>
                <div class="right1">
                   <a href="/airsys/xiupassword">设置密码</a>
                </div>
            </div>
            <div class="bottom1">
                <div class="left1">找回密码</div>
                <div class="content1"></div>
                <div class="right1">
                    <a href="/airsys/xiupassword">找回密码</a>
                </div>
            </div>
            <div class="bottom1">
                <div class="left1">修改密码</div>
                <div class="content1"></div>
                <div class="right1">
                    <a href="/airsys/xiupassword">修改密码</a>
                </div>
            </div>
            
        </div>
        
        </div>

   
</body>
</html>