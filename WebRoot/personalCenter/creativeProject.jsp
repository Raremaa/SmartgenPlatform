<%@page contentType="text/html;charset=utf-8"%>
<html>
<head>
<title>个人中心</title>
<script type="text/javascript"
	src="/SmartgenPlatform/easyui/jquery.min.js"></script>
<link rel="stylesheet"
	href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css"
	type="text/css"></link>
<script type="text/javascript"
	src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="css/personalCenter.css" type="text/css"></link>

<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
<link rel="stylesheet" href="../css/bottom.css" type="text/css"></link>

<script type="text/javascript">
  $(document).ready(function(){
      $("#botton").click(function(){
           window.location.href=("/SmartgenPlatform/creativeProjectPublic/creprojectPublic.jsp");
      });
  });

</script>

</head>

<body>
	<!-- 导航栏 -->
	<div class="top" style="font-size:20px;">
		<%@include file="inc/header.inc"%>
	</div>
	<!-- 主体 -->
	<div class="container">
		<div class="main">

			<%@include file="inc/left.inc"%>
			<div class="right">
				<%@include file="inc/creativeProject.inc" %>
			
			</div>

		</div>
	</div>
	<!-- 底部栏 -->
	<div class="buttom">
		<%@include file="../inc/bottom.inc"%>
	</div>
	
	<script src="../layui/layui.js"></script>
	<script type="text/javascript">
	//初始化左半部分的头像
  $(document).ready(function(){
   var id=<%=(Integer) session.getAttribute("userId")%>;
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
     var condition="User_id="+id;
     $.ajax({
     	url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition},
     	success:function(data){//需要将返回来的数据进行html
     	$("#creproright1").show();
     	var content="";
     	for(var k=0;k<5;k++){
     	   $("#cre2-"+(k+1)).hide();
     	} 
     		 if(data.length>0){
     		 $("#creproright1").hide();
     		 $("#creCount").text("您一共发布"+data.length+"条项目");
     		 //对发布的项目进行处理
     		 for(var j=0;j<data.length;j++){
     		 $("#cre2-"+(j+1)).show();
     		     //对项目简介进行处理
     		     content="";
     		    if(data[j].creproject_content.length>70){
     		      for(var i=0;i<70;i++){
     		         content+=data[j].creproject_content[i];
     		        }
     		      content+="...";
     		    }else{
     		        content+=data[j].creproject_content;
     		    }
     		 
     		  $("#cre2-"+(j+1)+"img a img").attr("src",data[j].creproject_picture);
     		  $("#cre2-"+(j+1)+"img a").attr("href","/SmartgenPlatform/creprojectIntroduction/creprojectIntroduction.jsp?Creproject_id="+data[j].creproject_id);
     		  $("#cre2-"+(j+1)+"title a p").text(data[j].creproject_title);
     		  $("#cre2-"+(j+1)+"title a ").attr("href","/SmartgenPlatform/creprojectIntroduction/creprojectIntroduction.jsp?Creproject_id="+data[j].creproject_id);
     		  $("#cre2-"+(j+1)+"content p").text(content);
     		  if(data[j].creproject_evaluateResult==0){
     		  $("#cre2-"+(j+1)+"result p span").text("未通过");
     		  $("#cre2-"+(j+1)+"result p span").css("color","red");
     		  }else{
     		  $("#cre2-"+(j+1)+"result p span").text("已通过");
     		  $("#cre2-"+(j+1)+"result p span").css("color","green");
     		  }
     		 }
     		 
     		}
     		
     		
     	}
   	})
     
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