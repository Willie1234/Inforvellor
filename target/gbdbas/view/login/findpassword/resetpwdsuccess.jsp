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
<title>Password reset successfully</title>
</head>
<body>
   <!--主DIV-->
   <div class="container">
     <div class="col-md-12 col-md-push-0  panel panel-primary text-center">
	   <!-- head -->
	    <div class="panel-heading text-center">Password Retrieve Processing
	   </div>
	   <!-- body -->
	     <div class="panel-body">
	   
	    <div class="find_div">
	      
	       <div class="mod-step-detail"> 
	       	<div class="result-info"> 
	       		<div class="result-message"> 
	       			<img src="/gbdbas/static/img/login/success_icon.png"> 
	       			<span style="font-size: 18px;">Congratulations! You have successfully reset password for ${sessionScope.user.loginName }</span> 
	       			<div class="login_div_cls">
	       				<a class="btn btn-default" href="/gbdbas/UserPassword/login">Log in directly</a> 
	       			</div>
	       		</div>
		   </div>
	    </div>
	   </div>
	   </div>
   </div>
</body>
</html>