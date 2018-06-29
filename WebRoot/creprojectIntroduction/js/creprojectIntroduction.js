var url = null;//在请求远程数据的地址


$(document).ready(function() {
	//初始化热门项目，可以将条件改变按照时间顺序来取相应的数据
	var Creproject_id=$("#Creproject_title").text();
	console.log(Creproject_id);
	$.ajax({
		url:"/SmartgenPlatform/creProUserGet",
     	type:"post",
     	dataType:"json",
     	data:{id:Creproject_id},
     	success:function(data){//需要将返回来的数据进行处理
     		console.log("修改时间"+data[0].creproject_modifyTime);
     		initCreProIntroduction(data);
     	},
     	error:function(){
     		console.log(155);
     	}
	});
	
});


function initCreProIntroduction(data){
	var creproject_releaseTime="";
	var creproject_modifyTime="";
	var creproject_evaluateTime="";
	var creproject_state="";
	var evaluateResult="";
	//对发布时间和修改时间的显示进行处理，对于评定通过的项目发布和评估时间一定不为空，修改时间若为空，则其值为发布时间
	
	for(var i=0;i<10;i++){
		creproject_releaseTime+=data[0].creproject_releaseTime[i];
		creproject_modifyTime+=data[0].creproject_modifyTime[i];
		creproject_evaluateTime+=data[0].creproject_evaluateTime[i];
	}
	if(data[0].creproject_modifyTime==""){
		creproject_modifyTime=creproject_releaseTime;
	}
	//对项目状态显示进行处理
	switch (data[0].creproject_state){
		case 0:
			creproject_state="未孵化";
			break;
		case 1:
			creproject_state="孵化中";
			break;
		case 2:
			creproject_state="已孵化";
			break;
	}
	//对评估结果示进行处理，
	switch (data[0].creproject_evaluateResult){
	case 0:
		evaluateResult="未通过";
		break;
	case 1:
		evaluateResult="已通过";
		break;
}
	$("#goBuy").hide();
	if(data[0].creproject_state==2){
		$("#goBuy").show();
		$("#goBuy").text("看成品");
		$("#goBuy").attr("href","#");
	}
	
   $("#Creproject_title").text(data[0].creproject_title);
   $("#Creproject_state").text(creproject_state);
   $("#Creproject_praise").text(data[0].creproject_praise);
   $(".first-right #User_headPortrait").attr("src",data[0].user_headPortrait);
   $(".first-right span").text(data[0].user_name);
   $(".project-picture img").attr("src",data[0].creproject_picture);
   $(".publicTime .glyphicon-time #Creproject_releaseTime").text(creproject_releaseTime);
   $(".publicTime .editTime #Creproject_modifyTime").text(creproject_modifyTime);
   $("#Creproject_content").text(data[0].creproject_content);
   $("#Creproject_evaluateTime").text(creproject_evaluateTime);
   $("#Creproject_evaluateResult").text(evaluateResult);
   $("#Creproject_evaluateOpinion").text(data[0].creproject_evaluateOpinion);
   
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
