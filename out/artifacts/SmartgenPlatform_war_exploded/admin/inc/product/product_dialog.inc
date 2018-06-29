<!-- 添加|修改对话框 -->
<div id="dlg_user" class="easyui-dialog"
	data-options="title:'产品信息修改',buttons:'#bt_dlg_user',closed:true"
	style="width:270px;height:350px;padding:10px">
	<form id="fm_Product" method="post">
		<div>
			<label>产品编号：</label> <input name="Product_id" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>创意项目编号：</label> <input name="Creproject_id" class="easyui-textbox"
				style="width:180px;">
		</div>
		<br />
		<div>
			<label>企业编号：</label> <input name="Company_id" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>产品名：</label> <input name="Product_name" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>价格：</label> <input name="Product_price" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>分类：</label> 
			<input type="radio" name="Product_classify" value=0 />生活手工
			<input type="radio" name="Product_classify" value=1 />家具家居
			<input type="radio" name="Product_classify" value=2 />科技数码
			<input type="radio" name="Product_classify" value=3 />艺术娱乐
			<input type="radio" name="Product_classify" value=4 />医疗健康
			<input type="radio" name="Product_classify" value=5 />户外运动
			<input type="radio" name="Product_classify" value=6 />其他
		</div>
		<br />
		<div>
			<label>标签：</label> <input name="Product_label" class="easyui-textbox"
				style="width:180px">
		</div>
		<br />
		<div>
			<label>产品图片：</label> <input name="Product_picture"
				class="easyui-filebox"
				data-options="buttonText:'选择图片',prompt:'选择一个文件...'"
				style="width:180px" />
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