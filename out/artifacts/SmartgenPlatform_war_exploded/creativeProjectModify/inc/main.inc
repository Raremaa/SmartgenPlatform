<%@page contentType="text/html;charset=utf-8"%>
<div class="main-yuan">
	<img src="img/yuan.png" style="width:150px;height:150px;" />
</div>
<div class="main-light">
	<img class="light" src="img/light.png" style="width:70px;height:100px;" />
</div>
<div class="ziti">
	<label>修改创意设计</label>
</div>

<div class="main-text">
	<p>
		<label>设计说明:</label>
	</p>
	<textarea id="Creproject_content" class="form-control" rows="12"
		style="font-size:16px;" placeholder=""></textarea>
</div>
<div class="content"></div>
<p style="font-size:20px;margin-left:50px;">
	<label>项目计划书:</label>
</p>
<input type="file" id="Creproject_plan" class="projectfile"
	style="margin-top:10px;margin-left:60px;" />
<br>
<p style="font-size:20px;margin-left:50px;">
	<label>图片:</label>
</p>
<input type="file" id="Creproject_picture" class="projectfile"
	style="margin-top:10px;margin-left:60px;" />
<br>
<p style="font-size:20px;margin-left:50px;">
	<label>视频:</label>
</p>
<input type="file" id="Creproject_video" class="projectfile"
	style="margin-top:10px;margin-left:60px;" />

<p style="font-size:20px;margin-left:50px;margin-top:10px;">
	<label>标题：</label>
</p>
<input type="text" id="Creproject_title"
	style="width:400px;margin-left:70px;font-size:16px;" value="" />
<br>

<p style="font-size:20px;margin-left:50px;">
	<label>分类：</label>
</p>
<div class="select"
	style="margin-left:50px;margin-top:-5px;font-size:16px;">
	<input type="radio" name="Creproject_classify" value=0 />生活手工 <input
		type="radio" name="Creproject_classify" value=1 />家具家居 <input
		type="radio" name="Creproject_classify" value=2 />科技数码 <input
		type="radio" name="Creproject_classify" value=3 />艺术娱乐 <input
		type="radio" name="Creproject_classify" value=4 />医疗健康 <input
		type="radio" name="Creproject_classify" value=5 />户外运动 <input
		type="radio" name="Creproject_classify" value=6 />其他
</div>
<div>

	<p style="font-size:20px;margin-left:50px;margin-top:10px;">
		<label>标签：</label>
	</p>
	<input type="text" id="Creproject_label"
		style="width:250px;margin-left:70px;font-size:16px;" value="" />
</div>
<br>

<input style="color: #FFFFFF !important ;margin-left:50px;" id="check"
	type="checkbox" checked="true" />
<span class="textServe" style="font-size:12px;">我已阅读并同意遵守<span
	style="color:#169BD5"><a href="#">《众智协作平台方案版权协议》</a> </span> </span>
<br>
<br>
<br>

<button type="button" id="PublicButton" data-complete-text="finished!"
	class="btn btn-primary" autocomplete="off" style="margin-left:300px;">
	确定修改</button>