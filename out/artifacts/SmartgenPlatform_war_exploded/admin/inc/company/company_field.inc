<!-- 数据表格 -->
<table id="dg_company" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fit:true,pagination:true,pageSize:20,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'company_id',align:'center',width:'70px'">企业编号</th>
      <th data-options="field:'company_name',align:'center',width:'120px'">企业名</th>
      <th data-options="field:'company_userName',align:'center',width:'120px'">用户名</th>
      <th data-options="field:'company_phone',align:'center',width:'150px'">手机号码</th>
      <th data-options="field:'company_charterNumber',align:'center',width:'150px'">营业执照编号</th>
      <th data-options="field:'company_password',align:'center',width:'100px'">密码</th>
      <th data-options="field:'company_logo',align:'center',width:'100px'">logo</th>
      <th data-options="field:'company_location',align:'center',width:'100px'">所在地</th>
      <th data-options="field:'company_identity',align:'center',width:'100px'" formatter="formatterCompanyidentity">企业是否认证</th>
    </tr>
  </thead>
</table>