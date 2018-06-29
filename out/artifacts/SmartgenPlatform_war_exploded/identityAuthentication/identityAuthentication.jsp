<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
  <head>
     <title>身份认证</title>   
     <script type="text/javascript" src="/SmartgenPlatform/easyui/jquery.min.js"></script>
  <link rel="stylesheet" href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <script type="text/javascript" src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>

 <link rel="stylesheet" href="css/identityAuthentication.css" type="text/css" ></link>
 
 <link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
 
 <style type="text/css">
 body{
   background-color:#f8f8ff;
 }
 .main{
 border:1px solid #999999;
 margin-top:220px;
 height:500px;
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
 .xd{
width:940px;
border-top:4px solid #4596B4;
align:center;
display:inline-block;
margin-top:20spx;
margin-left:200px;
}
.ziti{
font-size:32px;
font-family:微软雅黑;
color:gray;
margin-top:-170px;
margin-left:210px;
}
 .name{
 font-size:24px;
 margin-top:150px;
 margin-left:30px;
 }
 .label1{
 font-size:24px;
 margin-top:40px;
 margin-left:30px;
 }
 .foot-ziti{
  color:red;
  display:block;
  margin-top:30px;
  margin-left:30px;
 }
#User_realName{
 width:200px;
 margin-top:-36px;
 margin-left:120px;
}
 #User_identity{
 width:300px;
 margin-top:-36px;
 margin-left:120px;
 font-size:16px;
 }
 </style>
 
 
 </head>
 
 <body >
 <!-- 导航栏 -->
 <div class="top" style="font-size:20px;">
   <%@include file="inc/header.inc"%>
 </div>
 
 <div class="container">
     <div class="main" >
          <div class="main-top" >
            <div class="main-in" >
                <div class="main-into" >
                     <div class="picture" >
						<img src="" class="img-circle" id="User_headPortrait1"
							style="width:100%;height:100%;" />
					</div>
                </div>
            </div>
          </div>
     <div class="ziti" >身份认证</div>  
        <hr class="xd"> 
         
         <div class="name" ><label>*真实姓名:</label>
            <input type="text" id="User_realName" class="form-control">
         </div> 
          
     <div class="label1"><label>*性别:</label>
            <input type="radio"checked="ture"name="User_sex"value="0"/>男&nbsp;&nbsp;
	       <input type="radio"name="User_sex"value="1"/>女
         </div> 
      
       <div class="label1"><label>*身份证号:</label>
            <input type="text" id="User_identity" class="form-control" placeholder="录入你的身份证号便于认证">
         </div> 
       <span class="foot-ziti" >众智平台承诺保护您的隐私！</span>
       
       <button type="button" id="submit" class="btn btn-info" style="margin-top:30px;margin-left:270px;">提交</button>
       </div>
   </div>
   <script src="../layui/layui.js"></script>
	<script type="text/javascript">
	//初始化左半部分的头像
  $(document).ready(function(){
     var headPortrait="<%=(String) session.getAttribute("userHeadProtrait")%>";
     console.log(headPortrait);
     if(headPortrait==null){
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
     }
     $("#User_headPortrait1").attr("src",headPortrait);
  })
  
  
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