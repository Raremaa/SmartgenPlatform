<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>个人信息修改</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">	
	 
	 <script type="text/javascript" src="/SmartgenPlatform/easyui/jquery.min.js"></script>
  <link rel="stylesheet" href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <script type="text/javascript" src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	
	<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
	
<style type="text/css">
body{  
background-color:#f8f8ff;
}
.main{
border:1px solid #999999;
margin-top:220px;
background-color:white;
}
.main-top{
    border:1px solid #cccccc;
    width:200px;
    height:200px;
    border-radius:100px;
    margin-top:-100px;
    background-color:white;
}
.main-in{
    border:1px solid #cccccc;
    width:160px;
    height:160px;
    border-radius:100px;
    margin-top:20px;
    margin-left:20px;
    background-color:white;
}
.main-into{
  border:1px solid #cccccc;
  width:120px;
  height:120px;
  border-radius:100px;
  margin-top:20px;
  margin-left:20px;
}
.picture{
width:80px;
height:80px;
margin-top:20px;
margin-left:20px;
}
.ziti{
font-size:32px;
font-family:微软雅黑;
color:gray;
margin-top:-170px;
margin-left:210px;
}
.xd{
width:940px;
border-top:4px solid #4596B4;
align:center;
display:inline-block;
margin-top:20spx;
margin-left:200px;
}
.ziti-top{
  font-size:24px;
  margin-top:150px;
  margin-left:30px;
}
.head{
width:100px;
height:100px;
border-radius:50px;
border:1px solid gray;
margin-left:70px;
margin-top:-80px;
}

#button1{
font-size:14px;
margin-top:10px;
margin-left:20px;
}
.ziti-buttom{
font-size:24px;
margin-top:30px;
margin-left:30px;
}
.ziti-buttom1{
font-size:24px;
margin-top:50px;
margin-left:30px;
}
.form-control content{
   width:100px;
   margin-top:-36px;
   margin-left:120px;
}
</style>

  </head>
  
  <body >
     <!-- 导航栏 -->
 <div class="top" style="font-size:20px;">
   <%@include file="inc/header.inc"%>
 </div>
  <div class="container">
     <%@include file="inc/main.inc" %>
   </div>
   <script>
   var id;
   var identity;
   $(document).ready(function(){
        
         id=<%=(Integer) session.getAttribute("userId")%>;
    var headPortrait="<%=(String) session.getAttribute("userHeadProtrait")%>";
     console.log(headPortrait);
     if(headPortrait=="null"){
       layui.use('layer', function(){
  var layer = layui.layer; 
  var tips = layer.open({
  type: 1
  ,title: false //不显示标题栏
  ,closeBtn: false
  ,area: '300px;'
  ,offset: ['35%', '40%']
  ,shade: 0.8
  ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
  ,resize: false
  ,btn: ['火速登录']
  ,btnAlign: 'c'
  ,moveType: 1 //拖拽模式，0或者1
  ,content: '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">您还沒有登录哦，去登录吧！</div>'
  ,success: function(layero){
    var btn = layero.find('.layui-layer-btn');
    btn.find('.layui-layer-btn0').attr({
      href: '/SmartgenPlatform/login.html'
      ,target: '_self'
    });
  }
});}); 
     }else{
     $("#User_headPortrait1").attr("src",headPortrait);
     $("#User_headPortrait2").attr("src",headPortrait);
     }
     var id=<%=(Integer) session.getAttribute("userId")%>;
        var condition="User_id="+id;
      $.ajax({
		     	url:"/SmartgenPlatform/userLoginGet",
		     	type:"post",
		     	dataType:"json",
		     	data:{condition:condition},
		     	success:function(data){
		     		$("#User_name").attr("value",data[0].user_name);
		     		$("#User_password").attr("value",data[0].user_password);
		     		$("#User_phone").attr("value",data[0].user_phone);
		     		$("#User_location").attr("value",data[0].user_location);
		     		identity=data[0].user_identity;
		     		if(data[0].user_sex==1){
		     		   $("#woman").attr("checked","checked");
		     		}else{
		     		  $("#man").attr("checked","checked");
		     		}
		     	},
		     	error:function(){
		     		console.log("fff");
		     	}
		     	
		   });
		   
		/*点击提交进行修改  
		$("#submit").click(function(){
		            var user_name=$("#User_name").val();
		     		var user_password=$("#User_password").val();
		     		var user_phone=$("#User_phone").val();
		     		var user_location=$("#User_location").val();
		     		var user_realName=$("#User_realName").val();
		     		var user_sex=$("input[name='User_sex']:checked").val();
		     		var user_IDNumber=$("#User_IDNumber").val();
		      $.ajax({
		     	url:"/SmartgenPlatform/userUpdate",
		     	type:"post",
		     	dataType:"json",
		     	data:{user_id:id,user_password:user_password,user_phone:user_phone,user_location:user_location,user_realName:user_realName,user_sex:user_sex,user_IDNumber:user_IDNumber,user_identity:identity,},
		     	success:function(data){
		     		alert("gg");
		     	},
		     	error:function(){
		     		console.log("fff");
		     	}
		     	
		   });
		 })  */
        
   });//document
   
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
