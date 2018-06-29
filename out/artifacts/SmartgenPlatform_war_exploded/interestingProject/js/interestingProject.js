//项目分页没实现

var url = null;//在请求远程数据的地址
var condition = null;//文本框的值，作为查询条件使用
var param = null;//拼接的查询条件，字符串型
var jsonParam = null;//转换后的查询条件，JSON型

//对导航栏的搜索和退出登录进行操作

//对于搜索进行ajax请求，还需要进行改善
$("#headerSearch").click(function(){
	condition = $("#headerSeacherContent").val();
	  if(condition != null){
	    param = "{\"condition\":\""+condition+"\"}";
	  }else{
	    param = null;
	  }
	  jsonParam = JSON.parse(param);
	 $.ajax({
     	url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:jsonParam,
     	success:function(data){
     		if(data[0]==null){
     			console.log(1);
     			$.ajax({
     		     	url:"/SmartgenPlatform/creativeProjectGet",
     		     	type:"post",
     		     	dataType:"json",
     		     	data:jsonParam,
     		     	success:function(data){
     		     	     	if(data[0]==null){
     		     	     		console.log(2);
     		     	     		$.ajax({
     		        		     	url:"/SmartgenPlatform/creativeProjectGet",
     		        		     	type:"post",
     		        		     	dataType:"json",
     		        		     	data:jsonParam,
     		        		     	success:function(){
     		        		     		if(data[0]==null){
     		        		     			$("#homePageMiddle").html("<p style='width:100%;text-align:center;padding-top:100px;font-size:20px;'>暂无结果！</p>");
     		        		     		}
     		        		     	}
     		        		     	});
     		     	     	}
     		     	}
     		     	});
     		}
     		
     	}
	  });
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

