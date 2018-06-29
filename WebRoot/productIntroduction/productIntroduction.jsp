<%@page contentType="text/html;charset=utf-8" %>
<html>
  <head>
     <title>产品简介</title>   
     <script type="text/javascript" src="/SmartgenPlatform/easyui/jquery.min.js"></script>
  <link rel="stylesheet" href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <script type="text/javascript" src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>
 
  
  <link rel="stylesheet" href="css/productIntroduction.css" type="text/css"></link>
  
  <link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
  
  <style type="text/css">
 body{
    background-color:#f8f8ff;
 }
 .main{
    border:1px solid white;
    width:100%;
    height:600px;
    margin-top:80px;
    background-color:white;
 }
 .show-picture{
    border:1px solid #faf5f8;
    width:500px;
    height:400px;
 }
.product-name{
    font-family:微软雅黑;
    font-size:25px;
    margin-left:510px;
    margin-top:-400px;
}
.product-price{
   font-family:微软雅黑;
    font-size:25px;
    margin-left:510px;
    margin-top:15px;
    background-color:#e8f2fd;
     color:#2f91f4;
}
 .right-show{
   font-family:微软雅黑;
    font-size:16px;
    margin-left:510px;
    margin-top:15px;
 }
 .show-fee{
    font-size:14px;
    margin-top:15px;
    color:#888888;
 }
#Product_price{
    font-size:40px;
   
}
#botton1 {
   width:100px;
   margin-left:510px;
   margin-top:50px;
}
#botton2{
   width:100px;
   margin-left:670px;
   margin-top:-33px;
}
  .footer2 {
	background-color: #434343;
	width: 100%;
	height: 65px;
	margin-top:10px;
}

.footer2Left {
	height: 100%;
	width: 10%;
	float: left;
	text-align: left;
	margin-top: 10xp;
}

.footer2Right {
	height: 100%;
	width: 80%;
	float: left;
	text-align: left;
	margin-top: 15px;
}

.footer2right p {
	color: #cccccc;
	font-size: 12px;
	margin-top: 2px;
	margin-bottom: 3px;
}
  
  </style>
  
  
  </head>
 <body>
 <!-- 导航栏 -->
 <div class="top" style="font-size:20px;">
  <%@include file="inc/header.inc" %>
 </div>
 <!-- 中间内容 -->
 <div class="container" >
  <%@include file="inc/main.inc" %>
 </div>
 <!-- 底部栏 -->
 <div class="footer2">
   <div class="container">
     <%@include file="inc/bottom.inc" %>
   </div>
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