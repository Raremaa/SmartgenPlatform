<!-- 添加|修改对话框 -->
<div id="dlg_creativeProject" class="easyui-dialog"
	data-options="title:'创意项目信息修改',buttons:'#bt_dlg_creativeProject',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_creativeProject" method="post">
			<input name="creproject_id" type="hidden">
			<input name="expert_jobNumber" type="hidden">
			<input name="user_id" type="hidden">
			<input name="creproject_modifyTime" type="hidden">
			<input name="creproject_releaseTime" type="hidden">
			<input name="creproject_evaluateTime" type="hidden">
			<input name="company_id" type="hidden">
			
		<div>
			<label>标题：</label> <input name="creproject_title" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>设计说明：</label> <input name="creproject_content" class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label>标签：</label> <input name="creproject_label" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<input name="creproject_picture" type="hidden"/>
		<input name="creproject_video" type="hidden"/>
		<input name="creproject_plan" type="hidden"/>
		<div>
			<label>分类：</label>
			<input type="radio" name="creproject_classify" value=0 />生活手工
			<input type="radio" name="creproject_classify" value=1 />家具家居
			<input type="radio" name="creproject_classify" value=2 />科技数码
			<input type="radio" name="creproject_classify" value=3 />艺术娱乐
			<input type="radio" name="creproject_classify" value=4 />医疗健康
			<input type="radio" name="creproject_classify" value=5 />户外运动
			<input type="radio" name="creproject_classify" value=6 />其他
		</div>
		<br />
		<div>
			<label>状态：</label> 
			<input type="radio" name="creproject_state" value=0 />未孵化 
			<input type="radio" name="creproject_state" value=1 />孵化中
			<input type="radio" name="creproject_state" value=2 />已孵化
		</div>
		<br />
		<div>
			<label>点赞数：</label> <input name="creproject_praise"
				class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label>评估结果：</label> 
			<input type="radio" name="creproject_evaluateResult" value=0 />未通过 
			<input type="radio" name="creproject_evaluateResult" value=1 />已通过
		</div>
			<input name="creproject_evaluateOpinion" type="hidden">
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_creativeProject">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_creativeProject').dialog('close')">退出</a>
</div>