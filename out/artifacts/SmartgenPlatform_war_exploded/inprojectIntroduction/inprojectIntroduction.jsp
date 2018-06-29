<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>兴趣简介</title>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.min.js"></script>
<link rel="stylesheet"
	href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript"
	src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/inprojectIntroduce.css" type="text/css"></link>

<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">

</head>
<!-- 导航栏 -->
<body>
	<div class="top" style="font-size:20px;">
		<%@include file="inc/header.inc"%>
	</div>
	<!-- 主体 -->
	<div class="container">
		<div class="main">
			<%@include file="inc/main.inc"%>
		</div>
	</div>
	<!-- 底部栏 -->
	<div class="footer2">
		<%@include file="inc/bottom.inc"%>
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
