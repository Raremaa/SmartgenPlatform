<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>众智管理平台</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<%-- 浏览器中的图标 --%>
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
<%-- 收藏夹中的图标 --%>
<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<%-- 核心样式文件 --%>
<link rel="stylesheet" type="text/css"
	href="/SmartgenPlatform/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="/SmartgenPlatform/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="/SmartgenPlatform/easyui/demo/demo.css">
<%-- 核心脚本文件 --%>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.easyui.min.js"></script>
<%-- 国际化脚本文件 --%>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/locale/easyui-lang-zh_CN.js"></script>
<%-- 自定义样式 --%>
<link rel="stylesheet" type="text/css" href="css/adminStyle.css">
<%--页面加载动画样式--%>
<link rel="stylesheet" type="text/css"
	href="/SmartgenPlatform/css/load.css">

</head>

<body>
	<!--加载等待-->
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
		<div class="load_title">
			正在加载众智管理平台<br>
			<span>V1.0</span>
		</div>
	</div>

	<div class="easyui-layout" data-options="fit:true">
		<!-- 顶部logo -->
		<div data-options="region:'north'" style="height:60px;">
			<%@include file="../inc/header.inc"%>
		</div>
		<!-- 底部信息 -->
		<div data-options="region:'south'"
			style="height:30px;line-height:30px">
			<%@include file="../inc/footer.inc"%>
		</div>
		<!-- 左侧导航 -->
		<div data-options="region:'west'" style="width:200px;">
			<%@include file="../inc/navicate.inc"%>
		</div>
		<!-- 右侧帮助 -->
		<div data-options="region:'east'" title='公告' style="width:200px;">
			<%@include file="../inc/admin_help.inc"%>
		</div>

		<!--公有模版外内容/-->
		<!-- 主体部分 -->
		<div data-options="region:'center'">
			<script type="text/javascript">
				$("#6").attr("data-options", "plain:true,iconCls:'icon-edit',selected:true");
				$("#c").attr("data-options","selected:true");
			</script>
			<%@include file="../inc/creativeRemark/creativeRemark_field.inc"%>
			<%@include file="../inc/creativeRemark/creativeRemark_toolbar.inc"%>
			<%@include file="../inc/creativeRemark/creativeRemark_dialog.inc"%>
		</div>
		<!--/公有模版外内容-->

	</div>
	<%-- 自定义脚本 --%>
	<script type="text/javascript"
		src="/SmartgenPlatform/admin/js/option.js"></script>
</body>
</html>
