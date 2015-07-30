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
<title>Password Retrieve</title>
<script type="text/javascript">
//初始化页面
$(document).ready(function(){
	myRandReload(); 
	$('#loginName').focus(function(){ 
		$(this).removeClass('red_cls'); 
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		$("#loginName_msg").css("display","none");
	});
	$('#loginName').blur(function(){ 
		var loginValue = $("#loginName").val();
		if(""==loginValue)
		{
			$(this).removeClass('blue_cls'); 
			$("#loginName").addClass('red_cls'); 
			$("#loginName_msg").empty();
			$("#loginName_msg").append("请您输入用户名");
			$("#loginName_msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#loginName_msg").css("display","none");
		}
	});
	$('#veritycode').focus(function(){
		$(this).removeClass('red_cls');  
		//添加文本框样式
		$(this).addClass('blue_cls'); 
		$("#veritycode_msg").css("display","none");
	});
	$('#veritycode').blur(function(){ 
		var veritycode = $("#veritycode").val();
		if(""==veritycode)
		{
			$(this).removeClass('blue_cls'); 
			$("#veritycode").addClass('red_cls'); 
			$("#veritycode_msg").empty();
			$("#veritycode_msg").append("请您输入验证码");
			$("#veritycode_msg").css("display","block");
		}
		else
		{
			$(this).removeClass('red_cls'); 
			$(this).removeClass('blue_cls'); 
			$("#veritycode_msg").css("display","none");
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
			  <li role="presentation" class="active"><a href="#">Check Account</a></li>
			  <li role="presentation"><a >Security Verification</a></li>
			  <li role="presentation"><a >Reset password</a></li>
			</ul>
	       <form id='findPwdForm' method='post'>
	       	<div> 
		       	<p class="account-info">Please type in your account:</p>    
		       	<div class="pass-input-container clearfix" id="pass-auth-select"> 
			       	<input type="text" class="form-control" placeholder="Your Account" name="loginName" value="" id="loginName"> 
			       	<span class="pass-input-msg" id="loginName_msg" style="display: none;">*Please type in your Account!</span> 
		       	</div> 
		       	<div class="pass-input-container vcode-container clearfix"> 
		       		<input type="text" class="form-control col-md-6" placeholder="Check Code" name="veritycode" value="" id="veritycode"> 
		       		<a href="#" onClick="javascript:myRandReload()" alt="验证码图片" title="CheckCode" class="vcode-img "> 
						<img align="bottom" id="createcheckcode" style="width:90px;height:31px;border: 0px;">
					</a>
		       		<a href="javascript:myRandReload()" class="vcode-img-change">Refresh</a> 
		       		<span class="pass-input-msg" id="veritycode_msg" style="display: none;">*Please type in check code</span> 
		       	</div> 
		       	<div> 
		       		<a class="result-title-btn" href="#" onclick="netSetp();">Next</a> 
		       	</div> 
	       	</div>
	       </form>
	    </div>
	   </div>
   </div>
   </div>
   
</body>
</html>