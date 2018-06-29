<!-- 添加|修改对话框 -->

<div id="dlg_company" class="easyui-dialog"
	data-options="title:'企业用户信息修改',buttons:'#bt_dlg_company',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_company" method="post">
		<input name="company_id" type="hidden">
		<div>
			<label>企业名：</label> <input name="company_name" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br />
		<div>
			<label>用户名：</label> <input name="company_userName" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br />
		<div>
			<label>手机号码：</label> <input name="company_phone" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br />
		<div>
			<label>营业执照编号：</label> <input name="company_charterNumber"
				class="easyui-textbox" style="width:180px" required>
		</div>
		<br />
		<div>
			<label>密码：</label> <input name="company_password"
				class="easyui-passwordbox"
				data-options="prompt:'Password',iconWidth:'20'" style="width:180px" required>
		</div>
		<br />
		<div>
			<label>logo：</label> <input name="company_logo"
				class="easyui-filebox"
				data-options="buttonText:'选择logo',prompt:'选择一个文件...'"
				style="width:180px" required/>
		</div>
		<br />
		<div>
			<label>所在地：</label> 
			<input name="company_location" class="easyui-textbox"
				style="width:180px"required>
		</div>
		<br />
		<div>
			<label>企业是否认证：</label> 
			<input type="radio" id="Identity_no" name="company_identity" value=0 />未认证 
			<input type="radio" id="Identity_yes" name="company_identity" value=1 />已认证
		</div>
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_company">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_company').dialog('close')">退出</a>
</div>