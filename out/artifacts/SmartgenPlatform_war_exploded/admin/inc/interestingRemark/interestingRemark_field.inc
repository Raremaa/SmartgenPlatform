<!-- 数据表格 -->
<table id="dg_user" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fit:true,pagination:true,pageSize:20,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'User_id',align:'center'">用户编号</th>
      <th data-options="field:'Inproject_id',align:'center'">兴趣项目编号</th>
      <th data-options="field:'Inremark_content',align:'center'">评论内容</th>
      <th data-options="field:'Inremark_praise',align:'center'">是否点赞</th>
      <th data-options="field:'Inremark_commentTime',align:'center'">评论时间</th>
    </tr>
  </thead>
</table>