<!-- 添加|修改对话框 -->
<div id="dlg_user" class="easyui-dialog"
	data-options="title:'个人用户信息维护',buttons:'#bt_dlg_user',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_user" method="post">
		<input name="user_id" type="hidden">
		<div>
			<label>*用户名：</label> <input name="user_name" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br />
		<div>
			<label>*手机号码</label> <input name="user_phone" class="easyui-textbox"
				style="width:180px" required>
		</div>
		<br />
		<div>
			<label>*密码：</label> <input name="user_password"
				class="easyui-passwordbox"
				data-options="prompt:'Password',iconWidth:'20'" style="width:180px"
				required>
		</div>
		<br />
		<div>
			<label>性别：</label> <input type="radio" id="Sex_male" name="user_sex"
				value="0" />男 <input type="radio" id="Sex_female" name="user_sex"
				value="1" />女
		</div>
		<br />
		<div>
			<label>头像：</label> <input name="user_headPortrait"
				class="easyui-filebox"
				data-options="buttonText:'选择头像',prompt:'选择一个文件...'"
				style="width:180px" />
		</div>
		<br />
		<div>
			<label>身份证号：</label> <input name="user_IDNumber"
				class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label>身份是否认证：</label> <input type="radio" id="Identity_yes"
				name="user_identity" value=0>未认证 <input type="radio"
				id="Identity_no" name="user_identity" value=1 />已认证
		</div>
		<br />
		<div>
			<label>真实姓名：</label> <input name="user_realName"
				class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label>所在地：</label> <input name="user_location"
				class="easyui-textbox" style="width:180px">
		</div>
		<br />
		<div>
			<label style="color: red">带*号为必填项</label>
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