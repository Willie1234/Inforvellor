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
<!-- 不要删除 -->
<script type="text/javascript" src="<%=basePath%>/static/js/common/common-path.js"></script>
<title>Password Retrieve</title>
<script type="text/javascript">
$(document).ready(function(){
	$("#timer_id").one("click", function(){
		//发送邮件
		sendEmail();
	    //触发定时器，定时器回调函数里再使用one绑定div的点击事件
		sendValidate(60);
	})
})
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
			  <li role="presentation" class="active"><a >Security Verification</a></li>
			  <li role="presentation"><a >Reset password</a></li>
			</ul>
	       <form id='findPwdForm' action="/gbdbas/UserPassword/checkEmailCheckUrl" method='post' onsubmit="return validateEmailCode()">
	       	<div> 
		       	<p class="account-info">For your account security, please complete identity verification.</p>   
		       	<div class="emailValidate">Email Verification：</div> 
		       	<div class="clearfix pass-input-container"> 
			       	<label class="form-2-label">Email：</label> 
			       	<div class="form-2-content line-32" id="userEmail"> ${sessionScope.user.email} </div> 
		       	</div>
		       	<div class="form-2-item clearfix"> 
			       	<label class="form-2-label">Verification Code：</label> 
			       	<div class="form-2-content pass-input-container vcode-container">
			       		<!-- 验证码 -->
				       	<input type="text" class="form-control" placeholder="Email Verification Code" name="sId" value="" id="pass-input-emailVcode"> 
				       	<div class="pass-button-timer" id="timer_id">Send Verification Code</div> 
				       	<span class="pass-input-stip" id="forgot-emailVcode-success"></span> 
				       	<span class="pass-input-msg" id="forgot-emailVcode-tip" style="display: none;">*Please Enter Verification Code</span> 
			       	</div>
		       	</div>
		       	<div class="p-l80"> 
		       		<input type="submit" name="" value="Next" class="pass-button-submit" id="submit"> 
		       	</div>
	       	</div>
	       </form>
	    </div>
	   </div>
	   </div>
   </div>
</body>
</html>