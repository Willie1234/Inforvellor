<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<%=basePath%>/static/js/menu/css/default.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>/static/js/menu/css/easyui.css" rel="stylesheet" type="text/css" />
    <link href="<%=basePath%>/static/css/admincenter/sysuser.css" rel="stylesheet" type="text/css" />
    
    <script type="text/javascript" src="<%=basePath%>/static/js/menu/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/js/menu/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>/view/admincenter/usermanager/js/sysuser.js"></script>
    <script type="text/javascript" src="<%=basePath%>/static/js/common/date.js"></script>
<title>用户管理</title>
<script type="text/javascript">
	</script>
</head>
<body class="easyui-layout" fit="true" >
	     <!--此处放置用户树  -->
		<div region="west" split="true" title="用户组" style="width:150px;">
			<ul id="usersTree"  class="easyui-tree">
	        </ul>
		</div>
		<!-- 单个用户的详细信息 -->
		<div region="center" title="用户详细信息">
		    <div id="userMain">
		    <!-- 用户基本信息 -->
		    <div id="userInfo" align="center"  style="width:auto;height:120px;">
		      <table width="900px" align="center" >
		        <tr height="27px">
		          <td width="100px"><span>登陆名:</span></td><td width="100px"><span id="loginNameS"></span></td>
		          <td width="100px"><span>E-mail:</span></td><td width="100px"><span id="emailS"></span></td>
		          <td width="100px"><span>Phone:</span></td><td width="100px"> <span id="phoneS"></span></td>
		        <tr height="27px">  
		          <td><span>QQ:</span></td><td><span id="qqS"></span></td> 
		          <td><span>真实姓名:</span></td> <td><span id="userNameS"></span></td>
		          <td><span>拥有子帐号的数量:</span></td><td><span id="sonAccountNumS"></span></td>
		        </tr>
		        <tr height="27px">
		          <td><span>当前身份:</span></td><td> <span id="userDescS"></span></td>
		          <td><span>开通子帐号总数:</span></td><td><span onclick="changeSpan()" id="sonAccountTotalS"></span><span hidden id="var1"><input type="text" id="var2" onblur="upSonNum()" size=5/></span></td>
		      	  <td><span>允许开通子帐号:</span></td><td><span id="openServiceS"onclick="changeStatus('openService','openServiceS')"></span></td>
		        </tr>
		        <tr height="27px">
		          <td><span>是否激活:</span></td><td><span id="isActivatedS" onclick="changeStatus('isActivated','isActivatedS')"></span></td>
		          <td><span>账号是否锁定:</span></td><td><span id="isLockedS" onclick="changeStatus('isLocked','isLockedS')"></span></td>
		          <td><span>账号是否冻结:</span></td> <td><span id="isDisableS" onclick="changeStatus('isDisable','isDisableS')"></span></td>
		        </tr>
		      </table>
		    </div>
		    <!-- 用登陆信息 -->
		    <div id="loginInfo">
		      <table id="loginTable" title="用户登陆信息"  class="easyui-datagrid" 
		         style="height:400px;width:auto;" idfield="itemid" pagination="true" iconcls="save" remoteSort="false"   striped="true"          
		          data-options="rownumbers:true,pagination:true, pageSize:10,pageList:[10,20,30,40]" >
		       <thead>
		       </thead>
		      </table>
		    </div>
		    <!-- 用户查询信息 -->
		      <div id="searchInfo">
		      <table id="searchTable" title="用户查询信息"  class="easyui-datagrid" 
		         style="height:400px;width:auto;" idfield="itemid" pagination="true" iconcls="save" remoteSort="false"   striped="true"          
		          data-options="rownumbers:true,pagination:true, pageSize:10,pageList:[10,20,30,40]" >
		       <thead>
		       </thead>
		      </table>
		    </div>
		    <!-- 用户权限 -->
		    </div>
		</div>	
     	<!--此处修改或者删除用户 -->
        <div region="east" split="true" title="操作" style="width:150px;">
          <div>
	          <form id="userOperForm" method="post" enctype="multipart/form-data">
	            <table>
	                <tr><td><input type="hidden" id='userId'/></td></tr>
				    <tr><td>登陆名：<input  class="easyui-validatebox"  type="text" id="loginName"/></td> </tr>
	                <tr><td> 邮箱 ：<input type="text" id="email"/> </td> </tr>
				    <tr><td>手机：<input type="text" id="phone"/></td> </tr>
				    <tr><td>QQ:<input type="text" id='qq'/></td> </tr>
				    <tr><td>用户真名:<input type="text" id="userName"></td> </tr>
				    <tr><td>用户地址：<input type="text" id="address"/></td> </tr>
				    <tr><td>开始时间：<input id="beginTime" class="easyui-datebox" ></input></td></tr>
				    <tr><td>结束时间：<input id="endTime" class="easyui-datebox" ></input></td></tr>
			        <tr><td>用户身份：<input id="userDesc"type="text" ></input></td></tr>
			      </table> 
	          </form>
          </div>
          <div  id="addUser"><input type="button"  value="新增用户" class="easyui-linkbutton" onclick="addUser()" ></input></div>
          <div  id="upUser"><input type="button"  value="修改用户" class="easyui-linkbutton" onclick="upUser()" ></input></div>
	   	</div>
			
</body>
</html>