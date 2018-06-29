<!-- 数据表格 -->
<table id="dg_user" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fit:true,pagination:true,pageSize:20,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'User_id',align:'center'">用户编号</th>
      <th data-options="field:'Product_id',align:'center'">产品编号</th>
      <th data-options="field:'Buy_paymentTime',align:'center'">支付时间</th>
      <th data-options="field:'Buy_pattern',align:'center'">支付方式</th>
      <th data-options="field:'Buy_state',align:'center'">状态</th>
      <th data-options="field:'Buy_count',align:'center'">购买数量</th>
    </tr>
  </thead>
</table>