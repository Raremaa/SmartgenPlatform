var url = null;//在请求远程数据的地址
var User_id=null;
/*var Creproject_content=null;
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
	User_id="2";
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
	console.log(Creproject_picture);
	if(Creproject_content==""||Creproject_plan==""||Creproject_title==""||Creproject_classify==""){
		layui.use('layer', function(){
			  var layer = layui.layer;
			  layer.open({
				  title: '提示'
				  ,content: '您的发布信息不完整，需要补充哦！'
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
     			 layer.msg('发布成功，在审核中,3秒后自动跳转到主页', {icon: 6,time: 3000},offset: ['50%', '50%'],function(){
     				  //do something
     				 window.location.href="/SmartgenPlatform/homePage/homePage.jsp";
     			});  
     		});
     		
     	},
     	error:function(){
     		console.log("fff");
     	}
     	
         })
});*/

//退出登录
/*function isOut(){
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
}*/