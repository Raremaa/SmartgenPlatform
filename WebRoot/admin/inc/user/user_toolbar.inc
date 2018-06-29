<!-- 工具栏 -->
<div id="tb">
  <p style="font-weight: bold;">个人用户管理</p>
  <select id="key_NameLabel" class="easyui-combobox" panelHeight="auto" style="width:100px;">
	<option value="user_name">用户名</option>
	<option value="user_phone">手机号</option>	
	<option value="user_realName">姓名</option>
	<option value="user_location">所在地</option>		
  </select>
  <input id="key_Name" class="easyui-textbox" data-options="prompt:'请输入查询关键词'"/>
  <span>身份是否认证:</span>
  <input type="radio" name="key_IdIdentity" value="1"><span>已认证</span>
  <input type="radio" name="key_IdIdentity" value="0"><span>未认证</span>
  <a id="btn_Query" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
  <a id="btn_Add" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
  <a id="btn_Edit" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
  <a id="btn_Del" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除</a>
</div>