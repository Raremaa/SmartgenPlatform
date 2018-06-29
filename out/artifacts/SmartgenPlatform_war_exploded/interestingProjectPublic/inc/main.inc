<%@page contentType="text/html;charset=utf-8"%>
<div class="main-yuan">
	<img src="img/yuan.png" style="width:150px;height:150px;" />
</div>
<div class="main-light">
	<img class="light" src="img/light.png" style="width:70px;height:100px;" />
</div>
<div class="ziti">
	<label>发布兴趣</label>
</div>

<div class="main-text">
	<textarea id="Inproject_abstract" class="form-control" rows="12"
		style="font-size:16px;" placeholder="阐述您的兴趣需求等等"></textarea>
</div>
<div class="content"></div>
<div class="text-top"style="height:90px;">
	<label>已添加的图片</label> <p style="font-size:12px">暂未上传图片</p>
</div>
<div class="tj-video"style="height:90px;">
	<label>已添加的视频</label>
	<p style="font-size:12px">暂未上传视频</p>
</div>

<p style="font-size:20px;margin-left:50px;margin-top:70px;">
	<label>需求人数：</label>
</p>
<input type="text" id="Inproject_needPerson" class="form-control"
	style="width:200px;margin-left:70px;font-size:16px;"
	placeholder="输入你的需求总人数">
<br>

<p style="font-size:20px;margin-left:50px;margin-bottom:0px;">
	<label>你还需要：</label>
</p>


<lable style="padding-left:70px;font-size:15px;color:#0066FF;margin-bottom:50px;">添加图片:</lable>
<input type="file" id="Inproject_picture" style="margin-left:80px;margin-right:20px;" />

<br/>
<lable style="padding-left:70px;font-size:15px;color:#0066FF;">添加视频:</lable>
<input type="file" id="Inproject_video" style="margin-left:80px;" />

<p style="font-size:20px;margin-left:50px;margin-top:10px;">
	<label>标题：</label>
</p>
<input type="text" id="Inproject_title" class="form-control"
	style="width:500px;margin-left:70px;font-size:16px;"
	placeholder="给自己的设计添加一个吸引人眼球的标题吧">
<br>

<p style="font-size:20px;margin-left:50px;">
	<label>分类：</label>
</p>
<div class="select"
	style="margin-left:50px;margin-top:-5px;font-size:16px;">
	<input type="radio" name="Inproject_classify" value=0 />生活手工 <input
		type="radio" name="Inproject_classify" value=1 />家具家居 <input
		type="radio" name="Inproject_classify" value=2 />科技数码 <input
		type="radio" name="Inproject_classify" value=3 />艺术娱乐 <input
		type="radio" name="Inproject_classify" value=4 />医疗健康 <input
		type="radio" name="Inproject_classify" value=5 />户外运动 <input
		type="radio" name="Inproject_classify" value=6 />其他
</div>

<div>
	<p style="font-size:20px;margin-left:50px;margin-top:10px;">
		<label>标签：</label>
	</p>
	<input type="text" class="form-control" id="Inproject_label"
		placeholder="若无分类选项，自行添加"
		style="width:250px;margin-left:70px;font-size:16px;" />
</div>
<br>

<input style="color: #FFFFFF !important ;margin-left:50px;" id="check"
	type="checkbox" checked="true" />
<span class="textServe" style="font-size:12px;">我已阅读并同意遵守<span
	style="color:#169BD5"><a href="#">《众智协作平台方案版权协议》</a>
</span>
</span>
<br>
<br>
<br>

<button type="button" id="PublicButton" data-complete-text="finished!"
	class="btn btn-primary" autocomplete="off" style="margin-left:300px;">
	确认发布</button>