var url = null;//在请求远程数据的地址
var condition = null;//文本框的值，作为查询条件使用
var param = null;//拼接的查询条件，字符串型
var jsonParam = null;//转换后的查询条件，JSON型

//对搜索进行ajax请求
$("#headerSearch").click(function(){
	//在这里封装好要查询的sql语句，通过创意项目标题来查找
	condition ="creproject_title like '%"+ $("#headerSeacherContent").val()+"%'";
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
     	success:function(data){//需要将返回来的数据进行html
     		alert("haha");
     		$("#creProResult").html("<p>hahahaah</p>");
     		
     	}
	 
//对于返回来的数据，可以先去浏览器中的nextwork中请求的response看看传回来的数据是什么样的，在进行处理 
//       	  var msg = JSON.parse(data);
//          var str ="";
//          $(".crePro")[0].innerHTML=" "; 
//       	  //var msg = data.replace(/\r\n/g,"<br/>");
//       	  //看我传回来的数据是什么？
//       	  if(msg.length==0){
//       		$("#creProResult")[0].innerHTML = "暂无类似创意项目记录哦！";
//       		return；
//       	  }
//          $("#creProResult")[0].innerHTML = "搜索结果";
//       	  for(var i=0;i<msg.length;i++){
//           	  str += "<a>"+msg.Creproject_title+"</a><br/><p>"+msg.Creproject_content+"</p>";
//       	  }
//       	 $("crePro")[0].innerHTML = str;
//     	}
       });
    });

$(document).ready(function() {
	//初始化热门项目，可以将条件改变按照时间顺序来取相应的数据
	var condition1="Creproject_evaluateResult=1 limit 0,4";
	$.ajax({
		url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition1},
     	success:function(data){//需要将返回来的数据进行处理
     		initHotPro(data);
     	},
     	error:function(){
     		console.log(1);
     	}
	});
	
	//初始化还想看项目,采用排序（逆排序）的方式将最新发布的项目展示出来
	var condition2="Creproject_evaluateResult=1 and CreativeProject.User_id=User.User_id order by Creproject_id desc limit 0,4";
	$.ajax({
		url:"/SmartgenPlatform/creProUserGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition2},
     	success:function(data){//需要将返回来的数据进行处理
     		initOtherPro(data);
     	},
     	error:function(){
     		console.log(2);
     	}
	});
	
	//初始化页码
	var condition3="Creproject_evaluateResult=1";//选择评估通过的
	$.ajax({
		url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition3},
     	success:function(data){//需要将返回来的数据进行处理     		
     		proCount(data);
     	},
     	error:function(){
     		console.log(3);
     	}
	});
});
//对热门项目进行初始化
function initHotPro(data){
	//p1
	$(".m1-1 .m-pic img").attr("src",data[0].creproject_picture);
	$(".m1-1 .m-title h4").text(data[0].creproject_title);
	$(".m1-1 .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[0].creproject_id);
	$(".m1-1 .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[0].creproject_id);
	//p2
	$(".m1-2 .m-pic img").attr("src",data[1].creproject_picture);
	$(".m1-2 .m-title h4").text(data[1].creproject_title);
	$(".m1-2 .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[1].creproject_id);
	$(".m1-2 .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[1].creproject_id);
	//p3
	$(".m1-3 .m-pic img").attr("src",data[2].creproject_picture);
	$(".m1-3 .m-title h4").text(data[2].creproject_title);
	$(".m1-3 .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[2].creproject_id);
	$(".m1-3 .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[2].creproject_id);
	//p4
	$(".m1-4 .m-pic img").attr("src",data[3].creproject_picture);
	$(".m1-4 .m-title h4").text(data[3].creproject_title);
	$(".m1-4 .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[3].creproject_id);
	$(".m1-4 .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[3].creproject_id);
}

//对其他项目进行初始化
function initOtherPro(data){
	var content="";
	console.log("hghg"+data.length);
	for(var j=0;j<4;j++){
		if(data[j].creproject_content.length>80){
			for(var i=0;i<80;i++){
				content+=data[j].creproject_content[i];
			}
			content+="......";
		}else{
			content=data[j].creproject_content;
		}
		
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-pic img").attr("src",data[j].creproject_picture);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-title h4").text(data[j].creproject_title);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic img").attr("src",data[j].user_headPortrait);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic span").text(data[j].user_name);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-content").text(content);
		//初始化链接
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].user_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .btn").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);	
		content="";
		
	}
	
}



//对页码进行初始化
function proCount(data){
	console.log(5);
	var pageSize=4;//每一页的数量为4个
	//var pageNo=2;初始为2,查询从第五个开始；
	var proLength=data.length-4;//记录总数减去热门项目
	console.log(proLength);
	var rest=proLength%pageSize;//多出来的项目数
	var pages=Math.ceil(proLength/pageSize);//总的页数
	console.log(pages);
	for(var i=1;i<=pages;i++){
		//将分页按钮加入到页面中
		$("#pages").append("<button type='button' class='btn btn-default btn-m btn-info' style='margin-left:20px;margin-top:20px;' id='page"+i+"' onclick='clickOtherProAjax("+i+","+pages+","+rest+");'>"+i+"</button>");		
	}
	
}

function clickOtherProAjax(k,pages,rest){
	var pageSize=4; 
	var pageNo=k;
	console.log(pageNo);
	var condition="";
	if(k==pages){
		condition="Creproject_evaluateResult=1 and CreativeProject.User_id=User.User_id  order by Creproject_id desc limit "+(pageNo-1)*pageSize+","+rest;
	}else{
		condition="Creproject_evaluateResult=1 and CreativeProject.User_id=User.User_id order by Creproject_id desc limit "+(pageNo-1)*pageSize+","+pageSize;
	}
 
	console.log(condition);
	$.ajax({
		url:"/SmartgenPlatform/creProUserGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition},
     	success:function(data){//需要将返回来的数据进行处理     		
     		clickOtherPro(data);
     	},
     	error:function(){
     		console.log(4);
     	}
	});
}


function clickOtherPro(data){
	//p1
	var content="";
	console.log("jjj"+data.length);
	for(var j=0;j<data.length;j++){
		//对项目简介进行处理
		if(data[j].creproject_content.length>80){
			for(var i=0;i<80;i++){
				content+=data[j].creproject_content[i];
			}
			content+="......";
		}else{
			content=data[j].creproject_content;
		}
		
		$(".m2-"+(j+1)).show();//将4个项目展示模块显示出来
		
		//对项目
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-pic img").attr("src",data[j].creproject_picture);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-title h4").text(data[j].creproject_title);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic img").attr("src",data[j].user_headPortrait);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic span").text(data[j].user_name);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-content").text(content);
		//初始化链接
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"l .m-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .m-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].user_id);
		$(".m2-"+(j+1)+" .m2-"+(j+1)+"r .btn").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[j].creproject_id);	
		content="";
		
	}
	if(data.length!=4){
		console.log("rr");
		for(var i=4;i>data.length;i--){
			$(".m2-"+(i)).hide();//将没有内容的项目隐藏起来,从后面开始hide()起来
		}
	}

}

//对分类按钮进行内容输出

function showClassifyPro(classify){
	var classifyContent="";
	switch(classify){
	case 0:
		classifyContent="生活手工";
		break;
	case 1:
		classifyContent="家具家居";
		break;
	case 2:
		classifyContent="科技数码";
		break;
	case 3:
		classifyContent="艺术娱乐";
		break;
	case 4:
		classifyContent="医疗健康";
		break;
	case 5:
		classifyContent="户外运动";
		break;
	case 6:
		classifyContent="其他";
		break;
		
	}
	//对小标题进行初始化
	$("#classify h3").text(classifyContent);
	
	var condition="Creproject_evaluateResult=1 and Creproject_classify="+classify;
	$.ajax({
		url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition},
     	success:function(data){//需要将返回来的数据进行处理
     		classifyProCount(data,classify);
     	},
     	error:function(){
     		console.log(5);
     	}
	});
}
//对某个类别的总数进行处理
function classifyProCount(data,classify){
	var pageSize=8;//每一页的数量为4个
	//var pageNo=2;初始为2,查询从第五个开始；
	var proLength=data.length;//记录总数减去热门项目
	var rest=proLength%pageSize;//多出来的项目数
	var pages=Math.ceil(proLength/pageSize);//总的页数
	var condition="";
	$("#classifyResult").hide();
	$("#classifyPages").html(" ");//清除含页码的p元素之前的样式
	$("#classifyResult").html("");//留一个0记录的接口
	//对具体类别项目初始化
	if(data.length==0){
		$("#classifyResult").show();
		$("#classifyResult").text("暂无记录哦!");
		for(var i=8;i>data.length;i--){
			console.log("fffff");
			$(".c1-"+(i)).hide();//将没有内容的项目隐藏起来
		}
		return;
	}
	if(data.length<=pageSize){
		condition="Creproject_evaluateResult=1 and Creproject_classify="+classify+" limit 0,"+data.length;
	}else{
		condition="Creproject_evaluateResult=1 and Creproject_classify="+classify+" limit 0,"+pageSize;
	}
	
	$.ajax({
		url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition},
     	success:function(data){//需要将返回来的数据进行处理     		
     		clickClassifyPro(data);
     	},
     	error:function(){
     		console.log(4);
     	}
	});
	
	for(var i=1;i<=pages;i++){
		//将分页按钮加入到页面中
		$("#classifyPages").append("<button type='button' class='btn btn-default btn-m btn-info' style='margin-left:20px;margin-top:20px;' id='page"+i+"' onclick='clickClassifyProAjax("+i+","+pages+","+rest+","+classify+");'>"+i+"</button>");		
	}
}

function clickClassifyProAjax(k,pages,rest,classify){
	var pageSize=8; 
	var pageNo=k;
	var condition="";
	if(k==pages){
		condition="Creproject_evaluateResult=1 and Creproject_classify="+classify+" limit "+(pageNo-1)*pageSize+","+rest;
	}else{
		condition="Creproject_evaluateResult=1 and Creproject_classify="+classify+" limit "+(pageNo-1)*pageSize+","+pageSize;
	}
	console.log("aaa");
	$.ajax({
		url:"/SmartgenPlatform/creativeProjectGet",
     	type:"post",
     	dataType:"json",
     	data:{condition:condition},
     	success:function(data){//需要将返回来的数据进行处理     		
     		clickClassifyPro(data);
     	},
     	error:function(){
     		console.log(4);
     	}
	});
}


function clickClassifyPro(data){
	var pageSize=8;
	console.log(data.length);
	if(data.length!=8){
		console.log("rr");
		for(var i=8;i>data.length;i--){
			console.log("fffff");
			$(".c1-"+(i)).hide();//将没有内容的项目隐藏起来
		}
	}
	for(var i=0;i<data.length;i++){
		console.log("dfd");
		$(".c1-"+(i+1)).show();
		
		$(".c1-"+(i+1)+" .c-pic img").attr("src",data[i].creproject_picture);
		$(".c1-"+(i+1)+" .c-title h4").text(data[i].creproject_title);
		$(".c1-"+(i+1)+" .c-pic").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[i].creproject_id);
		$(".c1-"+(i+1)+" .c-title").attr("href","/SmartgenPlatform/creProUserGet?Creproject_id="+data[i].creproject_id);
		
	}
	
	
}


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
