<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="main">
	<div class="main-top">
		<div class="main-in">
			<div class="main-into">
				<div class="picture">
					<img src="" id="User_headPortrait1"
						style="width:100%;height:100%;" />
				</div>
			</div>
		</div>
	</div>
	<div class="ziti">修改个人信息</div>
	<hr class="xd">
	<div class="ziti-top">
		头像:
		<div class="head">
			<img id="User_headPortrait2" style="width:100px;height:100px;"src="" /> <input
				type="button" id="button1" value="选择图片" />
		</div>
	</div>

	<div class="ziti-buttom1">
		用户名: <input type="text" id="User_name" class="form-control " style="width:200px">
	</div>
	<div class="ziti-buttom">
		密码: <input type="text" id="User_password" class="form-control " style="width:200px">
	</div>

	<div class="ziti-buttom">
		电话号码: <input type="text" id="User_phone" class="form-control " style="width:200px">
	</div>
	<div class="ziti-buttom">
		真实姓名: <input type="text" id="User_realName" class="form-control " style="width:200px">
	</div>

	<div class="ziti-buttom">
		所在地: <input type="text" id="User_location" class="form-control " style="width:200px">
	</div>
	<div class="ziti-buttom">
		性别: <input type="radio" id="man"name="User_sex" value="0" />男&nbsp;&nbsp; <input
			type="radio" name="User_sex" id="woman"value="1" />女
	</div>

	<div class="ziti-buttom">
		身份证号: <input type="text" id="User_IDNumber" class="form-control"
			style="width:300px;">
	</div>


	<button type="button" id="submit" class="btn btn-info"
		style="margin-top:30px;margin-left:270px;">提交</button>
</div>