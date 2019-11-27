$(function(){
	$("form").validate({
	    rules: {
	      c_number: "required",
	      c_password: "required"
	    },
	    messages: {
	      c_number: "请输入您的用户名",
	      c_password: "请输入您的密码"
	    }
	});
	
}) 

