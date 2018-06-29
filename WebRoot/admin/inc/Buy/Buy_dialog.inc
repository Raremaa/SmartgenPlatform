<!-- 添加|修改对话框 -->
<div id="dlg_user" class="easyui-dialog"
	data-options="title:'产品信息修改',buttons:'#bt_dlg_user',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_Buy" method="post">
		<div>
			<label>用户编号：</label> <input name="User_id" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>产品编号：</label> <input name="Product_id" class="easyui-textbox"
				style="width:180px;">
		</div>
		<br />
		<div>
			<label>支付方式：</label> <input name="Buy_pattern" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>状态：</label> 
			<input type="radio" name="Buy_state" value=0 />待付款
			<input type="radio" name="Buy_state" value=1 />待发货
			<input type="radio" name="Buy_state" value=2 />待收货
			<input type="radio" name="Buy_state" value=3 />待评价
			<input type="radio" name="Buy_state" value=4 />取消订单
		</div>
		<br />
		<div>
			<label>购买数量：</label> <input name="Buy_count" class="easyui-textbox"
				style="width:180px">
		</div>
	</form>
</div>
<!-- 对话框按钮 -->
<div id="bt_dlg_user">
	<a class="easyui-linkbutton" data-options="iconCls:'icon-ok'"
		onclick="saveRecord()">保存</a> <a class="easyui-linkbutton"
		data-options="iconCls:'icon-no'"
		onclick="javascript:$('#dlg_user').dialog('close')">退出</a>
</div>