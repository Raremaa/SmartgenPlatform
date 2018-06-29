<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Integer Expert_jobNumber =(Integer) session.getAttribute("Expert_jobNumber");
    String Expert_name = (String) session.getAttribute("Expert_name");
	String Expert_headPortrait = (String) session.getAttribute("Expert_headPortrait");	
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>众智协作平台- 专家评估</title>
<link rel="stylesheet" href="../../layui/css/layui.css">
<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin ">
		<div class="layui-header">
			<div class="layui-logo"><img src="../img/expert.png"></div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a>与有趣的人做有趣的事，与众智一起携手未来</a></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="<%=Expert_headPortrait%>" class="layui-nav-img"> <%=Expert_name%>
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="/SmartgenPlatform/expert/jsp/signup.jsp">退出</a>
						</dd>
					</dl></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-this"><a href="/SmartgenPlatform/expert/jsp/index.jsp">评估标准</a></li>
					<li class="layui-nav-item"><a href="/SmartgenPlatform/expert/jsp/projectList.jsp">项目列表</a></li>
			<!-- 		<li class="layui-nav-item"><a href="/SmartgenPlatform/expert/jsp/accomplishList.jsp">已评估项目</a></li> -->
					<li class="layui-nav-item"><a href="/SmartgenPlatform/expert/jsp/waitList.jsp">待评估项目</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
				<%@include file="/expert/inc/content_top.inc"%>
				<%@include file="/expert/inc/standard.inc"%>
			</div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			© 众智 - 2017版权所有
		</div>
	</div> 
	<script src="../../layui/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;
	
		});
	</script>
</body>
</html>