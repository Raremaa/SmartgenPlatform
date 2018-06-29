
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title>产品项目总览页</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript" src="../easyui/jquery.min.js"></script>
<script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/product.css" type="text/css"></link>

<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">

<link rel="stylesheet" href="../css/bottom.css" type="text/css"></link></head>
<body style="font-size:20px;background-color:#f8f8ff;">
	<!-- 顶部导航栏 -->
	<div class="top">
		<%@include file="inc/header.inc"%>
	</div>
	<!-- 中间内容 --> 
	<div class="product-middle">
		<%@include file="inc/middle.inc"%>
	</div>
	<!-- 底部版权栏 -->
	<div class="foot">
	  <%@include file="../inc/bottom.inc"%>
	</div>
	
	<script type="text/javascript" src="js/product.js"></script>
	<script>
 	
 	
 	//退出登录
function isOut(){
	console.log("sjsj");
	
	var str="退出登录";
	$.ajax({
     	url:"/SmartgenPlatform/userLoginGet",
     	type:"post",
     	dataType:"json",
     	data:{isOut:str},
     	success:function(data){
     		console.log("fffffffff");
     	},error:function(){
     		console.log("ddddd");
     	}
     	});
}
 	
   </script>
</body>
</html>
