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
     <link rel="stylesheet" href="/airsys/assets/layui/css/layui.css"  media="all">
    <style>
        .content{

            margin-left: 30%;

        }
        img{
           width: 50px;

        }
        .right{
            margin-top: 5px;
            margin-left: 70px;
            text-align: center;
            font-size: 30px;
            color: rgba(254,255,249,0.92);
        }
        .title1{
            width: 50%;
            height: 50px;
            border: 1px solid blue;
            background: blue;
        }
        .bottom{
            width: 50%;
            height: 300px;
            border: 1px solid blue;
        }
        form{
            width: 90%;
            margin-top: 30px;

        }
      .button {
          margin-top: 20px;
          margin-left: 200px;
      }
        .button1{
            height: 30px;
            background: #1E9FFF;
        }


    </style>
</head>
<body>
<div class="content">
    <div class="title1">
        <div class="title1-left">
            <img src="/airsys/assets/img/222.png">
            <span class="right">机票查询</span>
        </div>
    </div>
    <div class="bottom">
        <form class="layui-form" action="/airsys/searchFlight">
            <div class="layui-form-item">
                <label class="layui-form-label">出发城市</label>
                <div class="layui-input-block">
                    <input type="text" name="startPlace" lay-verify="title" autocomplete="off" placeholder="请输入城市" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达城市</label>
                <div class="layui-input-block">
                    <input type="text" name="endPlace" lay-verify="title" autocomplete="off" placeholder="请输入城市" class="layui-input">
                </div>
            </div>
           <div class="layui-inline">
                <label class="layui-form-label">验证日期</label>
                <div class="layui-input-inline">
                <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
               </div>
             </div>
            <div class="button">
                <input  class="button1" type="submit" name="search" value="搜索航班">
            </div>
        </form>
    </div>
</div>
<script src="/airsys/assets/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use(['form', 'layedit', 'laydate'], function(){
        var form = layui.form
            ,layer = layui.layer
            ,layedit = layui.layedit
            ,laydate = layui.laydate;

        //日期
        laydate.render({
            elem: '#date'
        });
        laydate.render({
            elem: '#date1'
        });

        //创建一个编辑器
        var editIndex = layedit.build('LAY_demo_editor');

        //自定义验证规则
        form.verify({
            title: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,pass: [
                /^[\S]{6,12}$/
                ,'密码必须6到12位，且不能出现空格'
            ]
            ,content: function(value){
                layedit.sync(editIndex);
            }
        });

        //监听指定开关
        form.on('switch(switchTest)', function(data){
            layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
                offset: '6px'
            });
            layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
        });

        //监听提交
        form.on('submit(demo1)', function(data){
            layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })
            return false;
        });

        //表单赋值
        layui.$('#LAY-component-form-setval').on('click', function(){
            form.val('example', {
                "username": "贤心" // "name": "value"
                ,"password": "123456"
                ,"interest": 1
                ,"like[write]": true //复选框选中状态
                ,"close": true //开关状态
                ,"sex": "女"
                ,"desc": "我爱 layui"
            });
        });

        //表单取值
        layui.$('#LAY-component-form-getval').on('click', function(){
            var data = form.val('example');
            alert(JSON.stringify(data));
        });

    });
</script>
</body>
</html>
