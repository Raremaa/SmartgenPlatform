<!-- 数据表格 -->
<table id="dg_creativeProject" class="easyui-datagrid" style="width:100%;height:100%" data-options="toolbar:'#tb',singleSelect:true,fit:true,pagination:true,pageSize:20,pageList:[10,20,50],loadMsg:'数据正在努力加载，请稍后...'">
  <thead>
    <tr>
      <th data-options="field:'selector',checkbox:true"></th>
      <th data-options="field:'creproject_id',align:'center',width:'100px'">创意项目编号</th>
      <th data-options="field:'expert_jobNumber',align:'center',width:'70px'">专家工号</th>
      <th data-options="field:'user_id',align:'center',width:'70px'">用户编号</th>
      <th data-options="field:'company_id',align:'center',width:'70px'">企业编号</th>
      <th data-options="field:'creproject_title',align:'center',width:'150px'">标题</th>
      <th data-options="field:'creproject_content',align:'center',width:'100px'">设计说明</th>
      <th data-options="field:'creproject_label',align:'center',width:'100px'">标签</th>
      <th data-options="field:'creproject_picture',align:'center',width:'100px'">图片</th>
      <th data-options="field:'creproject_video',align:'center',width:'100px'">视频</th>
      <th data-options="field:'creproject_ plan',align:'center',width:'100px'">计划书</th>
      <th data-options="field:'creproject_classify',align:'center',width:'80px'" formatter="formatterCreproject_classify">分类</th>
      <th data-options="field:'creproject_state',align:'center',width:'80px'" formatter="formatterCreproject_state">状态</th>
      <th data-options="field:'creproject_praise',align:'center',width:'70px'" >点赞数</th>
      <th data-options="field:'creproject_modifyTime',align:'center',width:'150px'">修改时间</th>
      <th data-options="field:'creproject_releaseTime',align:'center',width:'150px'">发布时间</th>
      <th data-options="field:'creproject_evaluateTime',align:'center',width:'150px'">评估时间</th>
      <th data-options="field:'creproject_evaluateResult',align:'center',width:'70px'" formatter="formatterCreproject_evaluateResult">评估结果</th>
      <th data-options="field:'creproject_evaluateOpinion',align:'center',width:'150px'">评估意见</th>
    </tr>
  </thead>
</table>