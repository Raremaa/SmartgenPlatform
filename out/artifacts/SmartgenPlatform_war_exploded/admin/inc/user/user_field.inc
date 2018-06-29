<!-- 数据表格 -->
<table id="dg_user" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fit:true,pagination:true,pageSize:10,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'user_id',align:'center',width:'70px'">用户编号</th>
      <th data-options="field:'user_name',align:'center',width:'100px'">用户名</th>
      <th data-options="field:'user_phone',align:'center',width:'100px'">手机号码</th>
      <th data-options="field:'user_password',align:'center',width:'100px'">密码</th>
      <th data-options="field:'user_sex',align:'center',width:'50px'" formatter="formatterUserSex">性别</th>
      <th data-options="field:'user_headPortrait',align:'center',width:'100px'">头像</th>
      <th data-options="field:'user_realName',align:'center',width:'100px'">姓名</th>
      <th data-options="field:'user_IDNumber',align:'center',width:'150px'">身份证号</th>
      <th data-options="field:'user_location',align:'center',width:'100px'">所在地</th>
      <th data-options="field:'user_identity',align:'center',width:'100px'" formatter="formatterUserIdentity">身份是否认证</th>
    </tr>
  </thead>
</table>