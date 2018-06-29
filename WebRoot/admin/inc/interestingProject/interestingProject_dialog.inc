<!-- 添加|修改对话框 -->
<div id="dlg_interestingProject" class="easyui-dialog"
	data-options="title:'创意项目信息修改',buttons:'#bt_dlg_interestingProject',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_interestingProject" method="post">
		<input name="inproject_id" type="hidden">
		<input name="user_id" type="hidden">
		<input name="inproject_picture" type="hidden"/>	
		<input name="inproject_video" type="hidden"/>
		<input name="inproject_modifyTime" type="hidden"/>
		<input name="inproject_releaseTime" type="hidden"/>
		<div>
			<label>兴趣简介：</label> <input name="inproject_abstract" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>标题：</label> <input name="inproject_title" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>分类：</label>
			<input type="radio" name="inproject_classify" value=0 />生活手工
			<input type="radio" name="inproject_classify" value=1 />家具家居
			<input type="radio" name="inproject_classify" value=2 />科技数码
			<input type="radio" name="inproject_classify" value=3 />艺术娱乐
			<input type="radio" name="inproject_classify" value=4 />医疗健康
			<input type="radio" name="inproject_classify" value=5 />户外运动
			<input type="radio" name="inproject_classify" value=6 />其他
		</div>
		<br />
		<div>
			<label>标签：</label> <input name="inproject_label" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>状态：</label> 
			<input type="radio" name="inproject_state" value=0 />人员招募中
			<input type="radio" name="inproject_state" value=1 />已招满
		</div>
		<br />
		<div>
			<label>点赞数：</label> <input name="inproject_praise"
				class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label>需求人数：</label> <input name="inproject_needPerson"
				class="easyui-textbox" style="width:180px">
		</div>
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_interestingProject">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_interestingProject').dialog('close')">退出</a>
</div>