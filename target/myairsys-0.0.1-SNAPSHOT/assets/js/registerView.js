$(function(){
	$("form").validate({
	    rules: {
	      c_number: "required",
	      c_password: "required",
	  	  c_name:"required",
	  	  repassword:{
	  		required:true,
	  		equalTo: ".password"
	  	  },
	  	  sex:"required",
	  	  age:"required",
	  	  id_card:"required",
	  	  phone:"required"
	      
	    },
	    messages: {
	      c_number: "请设置您的用户名",
	      c_password: "请输入您的密码",
	      c_name:"请输入真实姓名",
	      repassword:"密码不一致",
	      sex:"请选择性别",
	      age:"请输入年龄",
	      id_card:"请输入身份证号码",
	      phone:"请输入电话号码",
	    }
	});
	
}) 