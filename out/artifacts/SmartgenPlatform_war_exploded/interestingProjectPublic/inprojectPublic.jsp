<%@page contentType="text/html;charset=utf-8" %>
<html>
  <head>
     <title>兴趣发布</title>
     <script type="text/javascript" src="../easyui/jquery.min.js"></script>
  <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <script type="text/javascript" src="../bootstrap/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="css/inprojectPublic.css" type="text/css"></link>
  
  <link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
  
 </head>  
 
 <body>
    <div class="inproject-top" style="font-size:20px;">
      <%@include file="inc/header.inc" %>
    </div>
  <div class="inproject-main container" style="background-color:white;height:1060px;">
    <%@include file="inc/main.inc" %>
  </div>
    <br>
    <div class="inproject-bottom">
     <p style="text-align:center;">众智协作平台</p>
    </div>
 <script type="text/javascript" src="js/inprojectPublic.js"></script>
  <script src="../layui/layui.js"></script>
 <script type="text/javascript">
 
 
  

$(document).ready(function(){
  var isName="<%=(String) session.getAttribute("userName")%>";
  var isHeadProtrait="<%=(String) session.getAttribute("userHeadProtrait")%>";
  if(isName=="null"&&isHeadProtrait=="null"){
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
    
  })
  
  
  var url = null;//在请求远程数据的地址
var User_id=null;
var Inproject_abstract=null;
var Inproject_needPerson=null;
var Inproject_picture=null;
var Inproject_video=null;
var Inproject_title=null;
var Inproject_classify=null;
var Inproject_label=null;
var Inproject_releaseTime=null;
var data=new Date();
var year=data.getFullYear();//系统给
var month=data.getMonth()+1;
var date=data.getDate();



$("#PublicButton").click(function(){
	User_id="<%=(Integer) session.getAttribute("userId")%>";
	Inproject_abstract=$("#Inproject_abstract").val();//获取多行文本框的内容，但在控制台上并没有输出我获取的值，但并不为空。
	Inproject_needPerson=$("#Inproject_needPerson").val();
	Inproject_picture=$("#Inproject_picture").val();
	Inproject_video=$("#Inproject_video").val();
	Inproject_title=$("#Inproject_title").val();
	Inproject_classify=$("input[name='Inproject_classify']:checked").val();//获取单选框的值
	Inproject_label=$("#Inproject_label").val();
	Inproject_releaseTime=year+"-"+month+"-"+date;
	console.log(Inproject_needPerson+"ll"+Inproject_needPerson);
	//注意从文本框例获取的值是什么都没有的时候，并不是表示null，而是表示一个空字符串。null是空对象，""是空字符串
	if(Inproject_abstract==""||Inproject_title==""||typeof Inproject_classify=="undefined" || Inproject_needPerson==""){
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
     	url:"/SmartgenPlatform/interestingProjectAdd",
     	type:"post",
     	dataType:"json",
     	data:{User_id:User_id,Inproject_abstract:Inproject_abstract,Inproject_needPerson:Inproject_needPerson,
     		Inproject_picture:Inproject_picture,Inproject_video:Inproject_video,
     		Inproject_title:Inproject_title,Inproject_classify:Inproject_classify,
     		Inproject_label:Inproject_label,Inproject_releaseTime:Inproject_releaseTime},
     	success:function(data){
     		layui.use('layer', function(){
     			  var layer = layui.layer;
     			 layer.msg('发布成功,3秒后自动跳转到主页', {
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
     	
         })
});


//对需求人数进行判断
$("#Inproject_needPerson").blur(function(){

	console.log(25);
	var needPerson=parseInt($("#Inproject_needPerson").val());
	//强制类型转换，将文本框获取到的string类型的值转换为Int，若输入的不是数字，则转换后的类型为NaN，即不是个数
	console.log(typeof needPerson+"ff"+needPerson);
	if(isNaN(needPerson) ){
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  title: '提示'
				  ,content: '需求人数输入有误！'
				  ,offset: ['20%', '40%']
				});     
				  
		});
	}
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