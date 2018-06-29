<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<head>
<meta charset="utf-8">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="../../layui/css/layui.css" media="all">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body>
	<%
		/* java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date currentTime = new java.util.Date();//得到当前系统时间
		String str_date1 = formatter.format(currentTime); //将日期时间格式化 
		String str_date2 = currentTime.toString(); //将Date型日期时间转换成字符串形式  */

		java.text.SimpleDateFormat dft = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date beginDate = new Date();

		Calendar date = Calendar.getInstance();

		date.setTime(beginDate);

		date.set(Calendar.DATE, date.get(Calendar.DATE));

		String today = dft.format(date.getTime()); // today即为当前时间

		String Creproject_id = request.getParameter("Creproject_id");
		System.out.println("老子喜欢你别闹了");
		String Expert_jobNumber = request.getParameter("Expert_jobNumber");
			System.out.println("老子喜欢你别闹了");
		String Company_id = request.getParameter("Company_id");
			System.out.println("老子喜欢你别闹了");
		String User_id = request.getParameter("User_id");
			System.out.println("老子喜欢你别闹了");
		String Creproject_title = request.getParameter("Creproject_title");
		String Creproject_content = request.getParameter("Creproject_content");
		String Creproject_label = request.getParameter("Creproject_label");
		String Creproject_picture = request.getParameter("Creproject_picture");
		String Creproject_video = request.getParameter("Creproject_video");
		String Creproject_plan = request.getParameter("Creproject_plan");
		System.out.println("老子喜欢你别闹了" + Creproject_plan);
		String Creproject_classify = request.getParameter("Creproject_classify");
		String Creproject_releaseTime = request.getParameter("Creproject_releaseTime");
		String Creproject_state = request.getParameter("Creproject_state");
		String Creproject_praise = request.getParameter("Creproject_praise");
		String Creproject_modifyTime = request.getParameter("Creproject_modifyTime");
		String Creproject_evaluateTime = today;
		String Creproject_evaluateResult = request.getParameter("Creproject_evaluateResult");
		String Creproject_evaluateOpinion = request.getParameter("Creproject_evaluateOpinion");
	%>

	<div class="layui-fluid">
		<fieldset class="layui-elem-field layui-field-title"
			style="margin-top: 20px;">
			<legend>专家评论</legend>
		</fieldset>
		<form class="layui-form"
			action="/SmartgenPlatform/creativeProjectUpdate" id="popupForm">
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">创意项目编号</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_id"
						readonly class="layui-input" value="<%=Creproject_id%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">专家工号</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="expert_jobNumber"
						readonly class="layui-input" value="<%=Expert_jobNumber%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">用户编号</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="user_id" readonly
						class="layui-input" value="<%=User_id%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">企业编号</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="company_id" readonly
						class="layui-input" value="<%=Company_id%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">标签</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_label"
						readonly class="layui-input" value="<%=Creproject_label%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">图片</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_picture"
						readonly class="layui-input" value="<%=Creproject_picture%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">视频</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_video"
						readonly class="layui-input" value="<%=Creproject_video%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">计划书</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_plan"
						readonly class="layui-input" value="<%=Creproject_plan%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">分类</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_classify"
						readonly class="layui-input" value="<%=Creproject_classify%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">状态</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_state"
						readonly class="layui-input" value="<%=Creproject_state%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">点赞数</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_praise"
						readonly class="layui-input" value="<%=Creproject_praise%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">修改时间</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text"
						name="creproject_modifyTime" readonly class="layui-input"
						value="<%=Creproject_modifyTime%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">发布时间</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text"
						name="creproject_releaseTime" readonly class="layui-input"
						value="<%=Creproject_releaseTime%>">
				</div>
			</div>
			<div class="layui-form-item layui-hide">
				<label class="layui-form-label">评估时间</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text"
						name="creproject_evaluateTime" readonly class="layui-input"
						value="<%=Creproject_evaluateTime%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">标题</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_title"
						readonly class="layui-input" value="<%=Creproject_title%>">
				</div>
			</div>
			<div class="layui-form-item ">
				<label class="layui-form-label">简介</label>
				<div class="layui-input-block">
					<textarea readonly style="border: none;" name="Acreproject_content"
						required placeholder="<%=Creproject_content%>"
						class="layui-textarea "></textarea>
				</div>
			</div>
			<div class="layui-form-item layui-hide" pane="">
				<label class="layui-form-label">简介输入</label>
				<div class="layui-input-block">
					<input style="border: none;" type="text" name="creproject_content"
						readonly class="layui-input" value="<%=Creproject_content%>">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">评估意见</label>
				<div class="layui-input-block">
					<textarea name="creproject_evaluateOpinion" 
						placeholder="请输入" class="layui-textarea "></textarea>
				</div>
			</div>
			<div class="layui-form-item" pane="">
				<label class="layui-form-label">评论结果</label>
				<div class="layui-input-block">
					<input type="radio" name="creproject_evaluateResult" value="1"
						title="准予通过"> <input type="radio"
						name="creproject_evaluateResult" value="0" title="不予通过" checked>
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="formDemo"
						id="saveBtn">立即提交</button>
					<button type="reset" class="layui-btn layui-btn-primary">重置</button>
				</div>
			</div>
		</form>
	</div>
	<script src="../../layui/layui.js"></script>
	<script src="../../easyui/jquery.min.js"></script>
	<script>
	
	
	
	
	
	
	
	
	
		//Demo
		layui.use('form', function() {
			var form = layui.form;
			//自定义验证规则
			/* form.verify({
				content : function(value) {
					if (!(value.length >= 0)) {
						return '标题至少得5个字符啊';
					} else {
						$(function() {
							$("#saveBtn").click(function() {
								// 将表单复制到父画面，在父页面的回调函数里提交表单  
								var popupForm = $(parent.document.body).children("div[id='popupFormDiv']").append($("#popupForm"));
								var index = parent.layer.getFrameIndex(window.name); //获取窗口索引  
								parent.layer.close(index);
							});
						});
					}
		
				}
			}); */
			$(function() {
				$("#saveBtn").click(function() {
					// 将表单复制到父画面，在父页面的回调函数里提交表单  
					var popupForm = $(parent.document.body).children("div[id='popupFormDiv']").append($("#popupForm"));
					var index = parent.layer.getFrameIndex(window.name); //获取窗口索引 
					parent.layer.close(index);
				});
			});
	
	
	
	
	
		//监听提交
		/* form.on('submit(formDemo)', function(data) {
			layer.msg(JSON.stringify(data.field));
		
			return true;
		}); */
		});
	</script>
</body>
</html>