<!-- 添加|修改对话框 -->
<div id="dlg_user" class="easyui-dialog"
	data-options="title:'创意项目评论信息修改',buttons:'#bt_dlg_user',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_creativeRemark" method="post">
		<div>
			<label>用户编号：</label> <input name="User_id" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>创意项目编号：</label> <input name="Creproject_id" class="easyui-textbox"
				style="width:180px;">
		</div>
		<br />
		<div>
			<label>评论内容：</label> <input name="Creremark_content" class="easyui-textbox"
				style="width:180px;height: 100px;">
		</div>
		<br />
		<div>
			<label>是否点赞：</label> 
			<input type="radio" name="Creremark_praise" value=0 />未点赞
			<input type="radio" name="Creremark_praise" value=1 />已点赞
		</div>
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_user">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_user').dialog('close')">退出</a>
</div>