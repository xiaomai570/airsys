<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%
   Object usename=session.getAttribute("name");

%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>老板后台管理</title>
    <link rel="stylesheet" href="/airsys/assets/layui/css/layui.css">
    <style>
      .iframe{
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">老板后台管理</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="/airsys/assets/layui/images/face/touxiang.jpg" class="layui-nav-img">
                    <span class="user"><%=usename %></span>
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="/airsys/document1" target="frame">基本资料</a></dd>
                    <dd><a href="/airsys/safeUpdate1" target="frame">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="/airsys/tuichu1">退了</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item"><a href="/airsys/document1" target="frame">基本资料</a></li>
                <li class="layui-nav-item"><a href="/airsys/safeUpdate1" target="frame">安全设置</a></li>
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="/airsys/flight1" target="frame">航班信息</a>                  
                </li>
                <li class="layui-nav-item"><a href="/airsys/branchII" target="frame">营业点信息</a></li>
                
                
                
            </ul>
        </div>
    </div>

    <div class="layui-body">
       <iframe class="iframe" name="frame" frameborder=0></iframe>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script type="text/javascript" src="/airsys/assets/js/jquery-2.2.4.min.js"></script>
<script src="/airsys/assets/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>

</body>
</html>
