<!-- 数据表格 -->
<table id="dg_interestingProject" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fitCoulms:'true',fit:true,pagination:true,pageSize:20,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'inproject_id',align:'center',width:'100px'">兴趣项目编号</th>
      <th data-options="field:'user_id',align:'center',width:'80px'">用户编号</th>
      <th data-options="field:'inproject_abstract',align:'center',width:'150px'">兴趣简介</th>
      <th data-options="field:'inproject_title',align:'center',width:'100px'">标题</th>
      <th data-options="field:'inproject_classify',align:'center',width:'70px'">分类</th>
      <th data-options="field:'inproject_label',align:'center',width:'100px'">标签</th>
      <th data-options="field:'inproject_picture',align:'center',width:'100px'">图片</th>
      <th data-options="field:'inproject_video',align:'center',width:'100px'">视频</th>
      <th data-options="field:'inproject_state',align:'center',width:'70px'" formatter="formatterInproject_state">状态</th>
      <th data-options="field:'inproject_praise',align:'center',width:'70px'">点赞数</th>
      <th data-options="field:'inproject_needPerson',align:'center',width:'70px'">需求人数</th>
      <th data-options="field:'inproject_modifyTime',align:'center',width:'150px'">修改时间</th>
      <th data-options="field:'inproject_releaseTime',align:'center',width:'150px'">发布时间</th>
    </tr>
  </thead>
</table>