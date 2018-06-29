<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>修改兴趣</title>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.min.js"></script>
<link rel="stylesheet"
	href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript"
	src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/interestingProjectModify.css" type="text/css"></link>

<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">

</head>

<body>
	<div class="creproject-top" style="font-size:20px;">
		<%@include file="inc/header.inc"%>
	</div>
	<div class="creproject-main container" style="background-color:white;">
		<%@include file="inc/main.inc"%>
	</div>
	<br>
	<div class="creproject-bottom">
		<p style="text-align:center;">众智协作平台</p>
	</div>
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