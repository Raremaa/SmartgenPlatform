<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title>兴趣项目总览页</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript" src="../easyui/jquery.min.js"></script>
<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/interestingProject.css" type="text/css"></link>

<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">

<link rel="stylesheet" href="../css/bottom.css" type="text/css"></link></head>
<body style="font-size:20px;">
	<!-- 顶部导航栏 -->
	<div class="top">
		<%@include file="inc/header.inc"%>
	</div>
	<!-- 中间内容 -->
	<div class="creProject-middle">
		<%@include file="inc/middle.inc"%>
	</div>
	<!-- 底部版权栏 -->
	<div class="foot">
	  <%@include file="../inc/bottom.inc"%>
	</div>
	
	<script type="text/javascript" src="js/interestingProject.js"></script>
	<script>
	  $(".creProject-middle a").attr("target","_blank");
	</script>
</body>
</html>
