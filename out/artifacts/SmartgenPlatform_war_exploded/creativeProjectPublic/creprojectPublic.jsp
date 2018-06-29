<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>创意发布</title>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.min.js"></script>
<link rel="stylesheet"
	href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript"
	src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/creativeProjectPublic.css"
	type="text/css"></link>
	
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
<script type="text/javascript" src="js/creprojectPublic.js"></script>

<script src="../layui/layui.js"></script>

 <script type="text/javascript">
 //初始化左半部分的头像
$(document).ready(function(){
  var isName="<%=(String) session.getAttribute("userName")%>";
  var isHeadProtrait="<%=(String) session.getAttribute("userHeadProtrait")%>";
  if(isName=="null"&&isHeadProtrait=="null"){
   layui.use('layer', function(){
  var layer = layui.layer; 
  var tips = layer.open({
  type: 1
  ,title: false //不显示标题栏
  , skin: 'layui-layer-molv' //样式类名
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
    
  })
  
  
var url = null;//在请求远程数据的地址
var User_id=null;
var Creproject_content=null;
var Creproject_plan=null;
var Creproject_picture=null;
var Creproject_video=null;
var Creproject_title=null;
var Creproject_classify=null;
var Creproject_label=null;
var Creproject_releaseTime=null;
var data=new Date();
var year=data.getFullYear();//系统给
var month=data.getMonth()+1;
var date=data.getDate();



$("#PublicButton").click(function(){
    User_id="<%=(Integer) session.getAttribute("userId")%>";
	Creproject_content=$("#Creproject_content").val();//获取多行文本框的内容，但在控制台上并没有输出我获取的值，但并不为空。不懂？
	Creproject_plan=$("#Creproject_plan").val();
	Creproject_picture=$("#Creproject_picture").val();
	Creproject_video=$("#Creproject_video").val();
	Creproject_title=$("#Creproject_title").val();
	Creproject_classify=$("input[name='Creproject_classify']:checked").val();//获取单选框的值
	Creproject_label=$("#Creproject_label").val();
	Creproject_releaseTime=year+"-"+month+"-"+date;
	console.log(1);
	//注意什么都没有并不是表示null，而是表示一个空字符串。null是空对象，""是空字符串
	console.log(Creproject_classify);
	if(Creproject_content==""||Creproject_plan==""||Creproject_title==""|| typeof Creproject_classify=="undefined"){
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  title: '提示'
				  ,content: '您的发布信息不完整，需要补充哦！'
				  ,offset: ['20%', '40%']
				});     
				  
		});
		return;
	}
	console.log(2);
	$.ajax({
     	url:"/SmartgenPlatform/creativeProjectAdd",
     	type:"post",
     	dataType:"json",
     	data:{User_id:User_id,Creproject_content:Creproject_content,Creproject_plan:Creproject_plan,
     		Creproject_picture:Creproject_picture,Creproject_video:Creproject_video,
     		Creproject_title:Creproject_title,Creproject_classify:Creproject_classify,
     		Creproject_label:Creproject_label,Creproject_releaseTime:Creproject_releaseTime},
     	success:function(data){
     		layui.use('layer', function(){
     			  var layer = layui.layer;
     			 layer.msg('发布成功，在审核中,3秒后自动跳转到主页', {
                  icon: 6,
                  time: 3000,//2秒关闭（如果不配置，默认是3秒）
                  offset: ['20%', '40%']
                 }, function(){
                         //do something
                      window.location.href="/SmartgenPlatform/homePage/homePage.jsp";
                 });    
     		});
     		
     	},
     	error:function(){
     		console.log("fff");
     	}
     	
         });//ajax
});

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