<!-- 工具栏 -->
<div id="tb">
  <p style="font-weight: bold;">创意项目管理</p>
  <select id="key_NameLabel" class="easyui-combobox" panelHeight="auto"
		style="width:100px;">
		<option value="Expert_jobNumber">专家工号</option>
		<option value="Creproject_title">标题</option>
		<option value="Creproject_label">标签</option>
  </select>
  <input id="key_Name" class="easyui-textbox" data-options="prompt:'请输入查询关键词'"/>
  <input id="key_date" class="easyui-datetimebox" />
  <a id="btn_Query" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查询</a>
  <a id="btn_Edit" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改</a>
  <a id="btn_Del" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">删除</a>
</div>