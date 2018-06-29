<!-- 工具栏 -->
<div id="tb">
  <p style="font-weight: bold;">企业用户管理</p>
  <select id="key_NameLabel" class="easyui-combobox" panelHeight="auto" style="width:100px;">
		<option value="Expert_jobNumber">专家工号</option>
		<option value="Expert_name">姓名</option>
		<option value="Expert_phone">手机号</option>
  </select>
  <input id="key_Name" class="easyui-textbox" data-options="prompt:'请输入查询关键词'"/>
  <a id="btn_Query" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
  <a id="btn_Add" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添加</a>
  <a id="btn_Edit" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
  <a id="btn_Del" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除</a>
</div>