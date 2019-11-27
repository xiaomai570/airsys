<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息页面</title>
<link href="/airsystem/asset/css/_css/Icomoon/style.css" rel="stylesheet" type="text/css" />
<link href="/airsystem/asset/css/_css/main.css" rel="stylesheet" type="text/css" />

<script type="text/javascript" src="/airsystem/asset/js/_scripts/jquery-2.0.2.min.js"></script>
<script type="text/javascript" src="/airsystem/asset/js/_scripts/main.js"></script>

<style>
#loading{
	background-color: rgba(255,255,255,1);
	height: 100%;
	width: 100%;
	position: fixed;
	z-index: 1;
	margin-top: 0px;
	top: 0px;
}
#loading-center{
	width: 100%;
	height: 100%;
	position: relative;
	}
#loading-center-absolute {
	position: absolute;
	left: 50%;
	top: 50%;
	height: 100px;
	width: 100px;
	margin-top: -50px;
	margin-left: -50px;	
}
.object{
	width: 25px;
	height: 25px;
	background-color: rgba(255,255,255,0);
	margin-right: auto;
	margin-left: auto;
	border: 4px solid #33CCCC;
	left: 37px;
	top: 37px;
	position: absolute;
}

#first_object{
	-webkit-animation: first_object 1s infinite;
	animation: first_object 1s infinite;
	-webkit-animation-delay: 0.5s; 
    animation-delay: 0.5s; 
}
#second_object{
	-webkit-animation: second_object 1s infinite;
	animation: second_object 1s infinite;
}	
#third_object{
	-webkit-animation: third_object 1s infinite;
	animation: third_object 1s infinite;
	-webkit-animation-delay: 0.5s; 
    animation-delay: 0.5s; 
}	
#forth_object{
	-webkit-animation: forth_object 1s infinite;
	animation: forth_object 1s infinite;
}	
	
	
	


	
@-webkit-keyframes first_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
    -ms-transform: translate(150%,150%) scale(2,2); 
   	-webkit-transform: translate(150%,150%) scale(2,2); 
    transform: translate(150%,150%) scale(2,2);
	 }
	 
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }	 
}		
@keyframes first_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
    -ms-transform: translate(150%,150%) scale(2,2); 
   	-webkit-transform: translate(150%,150%) scale(2,2); 
    transform: translate(150%,150%) scale(2,2);
	 }
	 
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
}
	


	
@-webkit-keyframes second_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
	-ms-transform: translate(-150%,150%) scale(2,2); 
   	-webkit-transform: translate(-150%,150%) scale(2,2);
    transform: translate(-150%,150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
}		
@keyframes second_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
	-ms-transform: translate(-150%,150%) scale(2,2); 
   	-webkit-transform: translate(-150%,150%) scale(2,2);
    transform: translate(-150%,150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
}




@-webkit-keyframes third_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }	
 50% {
	-ms-transform: translate(-150%,-150%) scale(2,2); 
   	-webkit-transform: translate(-150%,-150%) scale(2,2);
    transform: translate(-150%,-150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }	
}		
@keyframes third_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }	
 50% {
	-ms-transform: translate(-150%,-150%) scale(2,2); 
   	-webkit-transform: translate(-150%,-150%) scale(2,2);
    transform: translate(-150%,-150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
}






@-webkit-keyframes forth_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
	-ms-transform: translate(150%,-150%) scale(2,2); 
   	-webkit-transform: translate(150%,-150%) scale(2,2);
    transform: translate(150%,-150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }	
}		
@keyframes forth_object {
 0% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
 50% {
	-ms-transform: translate(150%,-150%) scale(2,2); 
   	-webkit-transform: translate(150%,-150%) scale(2,2);
    transform: translate(150%,-150%) scale(2,2);
	}
 100% {
    -ms-transform: translate(1,1) scale(1,1); 
   	-webkit-transform: translate(1,1) scale(1,1); 
    transform: translate(1,1) scale(1,1); 
	 }
}

</style>
</head>
<body>
	<div id="loading">
	<div id="loading-center">
	<div id="loading-center-absolute">
	<div class="object" id="first_object"></div>
	<div class="object" id="second_object"></div>
	<div class="object" id="third_object"></div>
	<div class="object" id="forth_object"></div>
	</div>
	</div>
</div>
<script>
	var t = 0.5;
	function countDown(){
	t--;
	if (t<=0) {
	//window.location.href=window.location.href; 
	history.go(-1);
	clearInterval(inter);
	};
	}
	var inter = setInterval("countDown()",1000);
</script>
</body>
</html>