<% String panelIndex=request.getParameter("panelIndex");%>
<div id="menu" class="easyui-accordion" style="width:100%;">
  <div id="a" title="用户管理" data-options="">
    <a id="1" href="/SmartgenPlatform/admin/jsp/user.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">个人用户管理</a>
    <a id="2" href="/SmartgenPlatform/admin/jsp/company.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">企业用户管理</a>
    <a id="3" href="/SmartgenPlatform/admin/jsp/expert.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">评估专家用户管理</a>
  </div>
  <div id="b" title="项目管理">
    <a id="4" href="/SmartgenPlatform/admin/jsp/creativeProject.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">创意项目管理</a>
    <a id="5" href="/SmartgenPlatform/admin/jsp/interestingProject.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">兴趣项目管理</a>
  </div>
  <div id="c" title="评论管理">
    <a id="6" href="/SmartgenPlatform/admin/jsp/creativeRemark.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">创意项目评论管理</a>
    <a id="7" href="/SmartgenPlatform/admin/jsp/interestingRemark.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">兴趣项目评论管理</a>
  </div>
  <div id="d" title="产品管理">
    <a id="8" href="/SmartgenPlatform/admin/jsp/product.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">产品管理</a>
  </div>
  <div id="e" title="购买管理">
    <a id="9" href="/SmartgenPlatform/admin/jsp/purchase.jsp" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-edit'" style="width:100%;text-align:left;">购买管理</a>
  </div>
</div>