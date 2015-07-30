<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/login/findpwd.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/easyui/icon.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/easyui/easyui.css">
<link rel="stylesheet" type='text/css' href="<%=basePath%>/static/css/newhomepage/bootstrap.css">
<script type="text/javascript" src="<%=basePath%>/static/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/login/findpwd.js"></script>
<title>英蓓-重置密码</title>
<script type="text/javascript">
//初始化页面
$(document).ready(function(){
	$('#password').focus(function(){ 
		$(this).removeClass('red_cls'); 
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		//提示
		$("#pwd-msg").empty();
		$("#pwd-msg").append("Can just include letters, numbers and marks with 6-12 digits");
		$("#pwd-msg").css("display","block");
	});
	$('#password').blur(function(){ 
		var password = $("#password").val();
		if(""==password)
		{
			$(this).removeClass('blue_cls'); 
			$("#password").addClass('red_cls'); 
			$("#pwd-msg").empty();
			$("#pwd-msg").append("*Please enter new password!");
			$("#pwd-msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#pwd-msg").css("display","none");
		}
	});
	$('#verifypwd').focus(function(){
		$(this).removeClass('red_cls');  
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		$("#verifypwd-msg").css("display","none");
	});
	$('#verifypwd').blur(function(){ 
		var verifypwd = $("#verifypwd").val();
		if(""==verifypwd)
		{
			$(this).removeClass('blue_cls'); 
			$("#verifypwd").addClass('red_cls'); 
			$("#verifypwd-msg").empty();
			$("#verifypwd-msg").append("*Please re-enter your password!");
			$("#verifypwd-msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#verifypwd-msg").css("display","none");
		}
	});
});
</script>
</head>
<body>
   <!--主DIV-->
   <div class="container">
    <div class="col-md-12 col-md-push-0  panel panel-primary">
	   <!-- head -->
	   <div class="panel-heading text-center">Password Retrieve Processing
	   </div>
	   <!-- body -->
	  
	     <div class="panel-body">
	    <div class="find_div">
	       <ul class="nav nav-tabs nav-justified">
			  <li role="presentation" ><a >Check Account</a></li>
			  <li role="presentation" ><a >Security Verification</a></li>
			  <li role="presentation" class="active"><a >Reset password</a></li>
			</ul>
	       <div class="mod-step-detail"> 
		       <p class="step-form-tip m_l80">The Account you are trying to reset the password：${sessionScope.user.loginName }</p> 
		       <form action="/gbdbas/UserPassword/updatePwd" method="post" id="resetpwd-form" onsubmit="return validateUserPwd()"> 
		       	<div class="pass-input-container clearfix">
	       	        <label class="pass-input-title" for="password">New password</label> 
	       	        <input type="password" class="form-control" name="password" id="password" value="" autocomplete="off"> 
	       	        <span class="pass-input-msg" id="pwd-msg" style="display: none;">Please enter your new password</span> 
		       	</div> 
		       	<div class="pass-input-container clearfix"> 
		       		<label class="pass-input-title" for="repassword">re-type password</label> 
		       		<input type="password" class="form-control" name="verifypwd" id="verifypwd" value="" autocomplete="off"> 
		       		<span class="pass-input-msg" id="verifypwd-msg" style="display: none;">Please enter your password again</span> 
		       	</div> 
		       	<div class="m_l80"> 
		       		<input type="submit" name="" value="Next" class="pass-button-submit" id="submit">  
		       	</div> 
		      </form> 
		   </div>
	    </div>
	   </div>
   </div>
   </div>
</body>
</html>