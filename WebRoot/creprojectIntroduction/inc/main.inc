<%@page contentType="text/html;charset=utf-8"%>

<%String Creproject_id = request.getParameter("Creproject_id");
int id=Integer.parseInt(Creproject_id);


%>

<div class="first">
	<div class="first-left"style="margin-left:20px;">
		<p style="padding-top:15px;" >
			<span id="Creproject_title"><%=id %></span> &nbsp;&nbsp; <span id="Creproject_state"
				style="color:008000;font-size:20px;"></span>&nbsp;&nbsp; 
			<a class="btn btn-info btn-default btn-l" id="goBuy"style="margin-left:20px;"></a>
		</p>
		<br>
		<p style="font-size:16px;">
			众智版权所有,<span style="color:red;">禁止转载和商业使用</span>
		</p>
	</div>

	<div class="first-main">
		<img id="Creremark_praiseImg" src="img/praise.png" />&nbsp;&nbsp;<span
			id="Creproject_praise"></span>
	</div>
	<div class="first-right"
		style="float:right;margin-top:-100px;margin-right:20px">
		<img src="" id="User_headPortrait"
			style="width:50px;height:50px;" /> <span id="User_name"
			style="font-size:19px;"></span>
	</div>
	<div class="publicTime">
		<p class="glyphicon glyphicon-time">
			发布于<span id="Creproject_releaseTime"></span>
		</p>
		<p class="editTime">
			最后修改时间<span id="Creproject_modifyTime"></span>
		</p>
	</div>

	<hr class="xd">

	<div class="project-picture"
		style="width:600px;height:500px;margin-left:20px;">
		<img src="" style="width:100%;height:100%;" />
	</div>
	<div class="introduce" style="margin-left:650px;margin-top:-450px;">
		<p style="font-size:30px;margin-left:20px;font-family:微软雅黑;">
			设计说明 <span id="Creproject_video"
				style="margin-left:150px;font-size:16px;color:#99CC66;">暂无视频</span>
		</p>

		<hr class="xd1">
		<div style="width:80%;">
			<p id="Creproject_content" style="font-size:20px;height:220px;"></p>
		</div>
	</div>
	<div class="mete">
		<b>专家评定</b>
	</div>
	<p class="boult">>></p>
	<div class="pdtime">
		评定时间：<span id="Creproject_evaluateTime" style="font-size:20px;"></span>
	</div>
	<div class="result">
		评定结果：<span id="Creproject_evaluateResult" style="font-size:20px;"></span>
	</div>
	<div class="suggestion">
		评估意见：<span id="Creproject_evaluateOpinion" style="font-size:20px;"></span>
	</div>

	

	<div class="self-picture"style="margin-top:50px;">
	<p>发表评论</p>
		<img src="<%=protrait%>" id="User_headPortrait1"
			style="width:50px;height:50px;" />
		
	</div>

	<textarea id="Creremark_content" class="form-control" rows="8"
		style="font-size:16px;width:70%;margin-top:-80px;margin-left:130px;"
		placeholder="发表您的评论..."></textarea>

	<button type="button" data-complete-text="finished!"
		class="btn btn-primary" autocomplete="off"
		style="margin-left:300px;margin-top:30px;">提交评论</button>

	<hr class="xd" style="margin-top:40px;">

	<div class="content">
		<p id="Creremark_content" class="show-content">没有评论....</p>
	</div>
</div>