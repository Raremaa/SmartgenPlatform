<!-- 添加|修改对话框 -->
<div id="dlg_expert" class="easyui-dialog"
	data-options="title:'专家用户信息修改',buttons:'#bt_dlg_expert',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_expert" method="post">
		<input name="expert_jobNumber" type="hidden">
		<div>
			<label>姓名：</label> <br/><input name="expert_name" class="easyui-textbox"
				style="width:180px;" required>
		</div>
		<br/>
		<div>
			<label>手机号码：</label> <input name="expert_phone" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br/>
		<div>
			<label>密码：</label><br/><input name="expert_password"
				class="easyui-passwordbox"
				data-options="prompt:'Password',iconWidth:'20'" style="width:180px" required>
		</div>
		<br />
		<div>
			<label>头像：</label><br/><input name="expert_headPortrait"
				class="easyui-filebox"
				data-options="buttonText:'选择头像',prompt:'选择一个文件...'"
				style="width:180px" required/>
		</div>
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_expert">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_expert').dialog('close')">退出</a>
</div>