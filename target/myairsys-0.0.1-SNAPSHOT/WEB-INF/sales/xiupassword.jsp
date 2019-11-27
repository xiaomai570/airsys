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
       body{
          
           background-size:100% auto
       }
        .login{
            width: 360px;
            height: 400px;
            margin-left: 380px;
            margin-top: 170px;
           box-shadow: -15px 15px 15px rgba(6,17,47,0.7);
          background: rgba(15,2,11,0.74);
          
        }
         .login_title{
             color: rgba(248,255,249,0.74);
             height: 60px;
             font-size: 23px;
             text-align: center;
             float:left;
             margin-top: 55px;
             margin-left: 110px;
         }
         .bottom{
             width:350px;
             height: 300px;
             float: left;
         }
         .login_user{
             width: 350px;
             height: 70px;
             margin-left: 20px;
            
         }
        .one_icon{
            height: 50px;
            margin-top: 5px;
            margin-left: 30px;
            color:red;
        }
        img{
            float: left;
            margin-top: 10px;
            width: 30px;
            height: 30px;
        }
        .text{
            margin-top: 10px;
            float: left;
            height: 30px;
            width: 250px;
        }
        .t{
            width: 200px;
            height: 25px;
        }
       .login_password{
           width: 350px;
           height: 50px;
           margin-left: 50px;
           margin-bottom:15px;
           color:red;
       }
      .submit{
          width: 70px;
          height: 30px;
          margin-left: 70px;
          margin-top: 10px;
      }

    </style>
  <script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"> </script>
<script src ="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"> </script>
<script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
<script type="text/javascript">
    $(function(){
    	$("form").validate({
    	      rules:{
    	    	  user:{
    	    		  required:true
    	    	  },
    	    	  password:{
    	    		  required:true
    	    	  }
    	          password1:{
    	        	  required:true
    	          }
    	      },
    		messages:{
    			 user:{
    				 required:"不能为空"
    			 },
    			 password:{
    				 required:"不能为空"
    			 } 
    			 password1:{
    				 required:"不能为空"
    			 }
    		}  	      
    	})
    })
    
</script>
</head>
<body>
        <div class="login">
             <div class="login_title">
                 <span>
                     密码修改
                 </span>
             </div>
             <div class="bottom">
                 <form action="password" method="post">
                     <div class="login_user">
                         <div class="one_icon"><img  src="/airsys/assets/img/user.png">
                      <div class="text" ><input class="t" type="text" name="user" value="账号"></div>
                         </div>
                     </div>
                     <div class="login_password">
                         <div class="icon"><img  src="/airsys/assets/img/password.png"></div>
                         <div class="text"><input class="t" type="password" name="password" value="密码"></div>
                     </div>
                     <div class="login_password">
                         <div class="icon"><img  src="/airsys/assets/img/password.png"></div>
                         <div class="text"><input class="t" type="password" name="password1" value="密码"></div>
                     </div>
                     <div class="submit">
                           <input class="submit" type="submit" value="确认修改">
                     </div>

                 </form>

             </div>
        </div>

</body>
</html>