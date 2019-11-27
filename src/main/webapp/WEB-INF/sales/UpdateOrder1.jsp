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
      <link rel="stylesheet" href="/airsys/assets/css/bootstrap.css"  media="all">
    <style>
        .body{
        width:100%;
        height:100%;
        }
        .content{
            margin-left: 21%;   
          
            width:550px; 
            float:left;
           
        }
        .check{
               background: rgba(179,255,250,0.92);
             margin-left:50px;
             margin-top:150px;
            float:left;
            width:360px;
            height:270px;     
           visibility:hidden          
        }
       select{
            margin-left:50px;
            margin-top:70px;
            width:300px;
            height:50px;
       
       }
       .submit{
         margin-left:150px;
            margin-top:30px;
        height:40px;
        width:100px;
       }
      
        img{
            width: 50px;
        }
        .right{
            margin-top: 5px;
            margin-left: 140px;
            text-align: center;
            font-size: 30px;
            color: rgba(254,255,249,0.92);
        }
        .title1{
            width: 100%;
            height: 50px;
            border: 1px solid blue;
            background: blue;
            
        }
        .bottom{
            width: 100%;
            height: 405px;
            border: 1px solid blue;
        }
        form{
            width: 100%;
            margin-top: 15px;

        }
        .button {
         
            margin-left:270px;
        }
        .button1{
            height: 30px;
            background: #1E9FFF;
        }
         .layui-inline{
             margin-bottom: 20px;
         }
         .layui-form-item{
                margin-right: 10px;
         }
        .layui-input-inline{
            margin-left: 40px;
        }
        table{
               margin-top:5px;
        
        }
    </style>
</head>
<body>
<div class="content">
    <div class="title1">
        <div class="title1-left">
            <img src="/airsys/assets/img/222.png">
            <span class="right">机票改签</span>
        </div>
    </div>
    <div class="bottom">
        <form class="layui-form" action="">
            <div class="layui-form-item">
                <label class="layui-form-label">航班号</label>
                <div class="layui-input-block">
                    <input type="text" name="flightNumber" lay-verify="title" autocomplete="off" placeholder="航班号" class="layui-input" value="${searchs.flightNumber}" onfocus="this.blur()">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">舱位号</label>
                <div class="layui-input-block">
                    <input type="text" name="grade" lay-verify="title" autocomplete="off" placeholder="舱位号" class="layui-input" value="${searchs.grade}" onfocus="this.blur()">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">身份证</label>
                <div class="layui-input-block">
                    <input type="text" name="idCard" lay-verify="title" autocomplete="off" placeholder="身份证" class="layui-input" value="${searchs.idCard }" >
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">出发地</label>
                <div class="layui-input-block">
                    <input type="text" name="startPlace" lay-verify="title" autocomplete="off" placeholder="请输入城市" class="layui-input" value="${searchs.fromCity }" onfocus="this.blur()">
                </div>
            </div>
            <div class="layui-form-item">
                <label class="layui-form-label">到达地</label>
                <div class="layui-input-block">
                    <input type="text" name="endPlace" lay-verify="title" autocomplete="off" placeholder="请输入城市" class="layui-input" value="${searchs.toCity }" onfocus="this.blur()">
                </div>
            </div>
           <div class="layui-inline">
                <label class="layui-form-label">改日期</label>
                <div class="layui-input-inline">
                <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
               </div>
             </div>

            <div class="button">
                <input  class="button1" type="button" name="search" value="查询">
            </div>
            </form>
       </div>
 </div>
 <div class="check">
 </div>
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
     </table> 
 <script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"> </script>
<script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"> </script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>     
<script src="/airsys/assets/layui/layui.js" charset="utf-8"></script>
<!-- 用ajax获取数据 -->
<script>
       var table= document.querySelector("table")
       var tbody = document.querySelector("tbody")
        $('.bottom').on('click','.button1',function(){ 
        var flightNumber=$("[name='flightNumber']").val();
        var grade=$("[name='grade']").val();
        var idCard=$("[name='idCard]").val();
        var startPlace=$("[name='startPlace']").val();
        var endPlace=$("[name='endPlace']").val();
        var date=$("[name='date']").val();
          
          $.ajax({ 
        	  url:"/airsys/selectNewFlight",
        	  dataType:"json",
        	  data:{
					startPlace:startPlace,
					endPlace:endPlace,
					date:date
				},
				success:function(e){       	     
        		 
        		  for( var i=0;i<e.length;i++){
                	  var tr=document.createElement("tr")                	 
        //          	 $(tr).attr("id",e[i].id)              	
                	  var td=""
                	  td+="<td class='flightNumber'>"+e[i].flightNumber+"</td>"
                	  td+="<td attr='departureTime'>"+e[i].departureTime+"</td>"                    	  
                	  td+="<td attr='arrivalTime'>"+e[i].arrivalTime+"</td>"
                	  td+="<td attr='startAirplane'>"+e[i].startAirplane+"</td>"
                	  td+="<td attr='endAirplane'>"+e[i].endAirplane+"</td>"
                	  td+="<td attr='fromCity'>"+e[i].fromCity+"</td>"
                	  td+="<td attr='toCity'>"+e[i].toCity+"</td>"
                	  td+="<td attr='firstClassRemainSeats'>"+e[i].firstClassRemainSeats+"</td>"
                	  td+="<td attr='firstPrice'>"+e[i]. firstPrice+"</td>"
                	  td+="<td attr='businessClassRemainSeats'>"+e[i].businessClassRemainSeats+"</td>"
                	  td+="<td attr='businessPrice'>"+e[i].businessPrice+"</td>"
                	  td+="<td attr='economyClassRemainSeats'>"+e[i].economyClassRemainSeats+"</td>"
                	  td+="<td attr=' economyPrice'>"+e[i]. economyPrice+"</td>"
                	  td+="<td attr='cao'>"       		     
               		   +"<input type=\"button\" value=\"选择\" class=\"select\"  ></td> ";	            	
        	         tr.innerHTML=td;
        	         tbody.appendChild(tr);      	  
        	  }
        	  }       	  
          })         
         })
         var btn1= document.querySelector(".select");
         var check= document.querySelector(".check");
         var flightNumber1;
         var opts;
         var div;
         $('table').on('click','.select',function(){        	 
        	 check.style.visibility="visible"
        flightNumber1=$(this).parent().parent("tr").children(".flightNumber").html();       	      	
        opts="<select name='grade1'><option>请选择舱位</option>"
       	opts+="<option value='1' >头等舱</option>" 
    	opts+="<option value='2' >商务舱</option>" 			 
    	opts+="<option value='3'>经济舱</option>" 	        				
       	  opts+="</select>"     	
       	  $(".check").append(opts)
        div="<div><input  class='submit' type='button'  value='提交'></div>"
       	   $(".check").append(div)       	   
        })
        
          $('.check').on('click','.submit',function(){  
        	    var flightNumber=$("[name='flightNumber']").val();
                var grade=$("[name='grade']").val();
                var idCard=$("[name='idCard']").val();
               
                var grade1=$("[name='grade1']").val();
              
                 
		 $.ajax({ 
			 url:"/airsys/updateTicket1",
			 data:{
         		 flightNumber:flightNumber,
         		 grade:grade,
         		idCard:idCard,
         		flightNumber1:flightNumber1,
         		grade1:grade1
 				},

 				success:function(e){  
					  
 					var result=e.replace(/\s/g, "");
					
 					
					if(result=="ok"){
						alert("改签成功")
					}else{
						alert("改签失败")
					}
				  }			  
			
		  })
        	  
         }) 
        
         
</script>
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
