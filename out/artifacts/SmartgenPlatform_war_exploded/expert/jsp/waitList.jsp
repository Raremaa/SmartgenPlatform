<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	Integer Expert_jobNumber = (Integer) session.getAttribute("Expert_jobNumber");
	String Expert_name = (String) session.getAttribute("Expert_name");
	String Expert_headPortrait = (String) session.getAttribute("Expert_headPortrait");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>众智协作平台- 专家评估</title>
<link rel="stylesheet" href="../../layui/css/layui.css">
<link rel="stylesheet" href="../css/expertStyle.css">
<link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin ">
		<div class="layui-header">
			<div class="layui-logo">
				<img src="../img/expert.png">
			</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a>与有趣的人做有趣的事，与众智一起携手未来</a></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="<%=Expert_headPortrait%>" class="layui-nav-img"> <%=Expert_name%>
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="/SmartgenPlatform/expert/jsp/signup.jsp">退出</a>
						</dd>
					</dl></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item"><a
						href="/SmartgenPlatform/expert/jsp/index.jsp">评估标准</a></li>
					<li class="layui-nav-item"><a
						href="/SmartgenPlatform/expert/jsp/projectList.jsp">项目列表</a></li>
					<!-- <li class="layui-nav-item"><a
						href="/SmartgenPlatform/expert/jsp/accomplishList.jsp">已评估项目</a></li> -->
					<li class="layui-nav-item layui-this"><a
						href="/SmartgenPlatform/expert/jsp/waitList.jsp">待评估项目</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body">
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
				<%@include file="/expert/inc/waitListTable.inc"%>
				<div id="popupFormDiv" style="display:none;"></div>
			</div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			© 众智 - 2017版权所有
		</div>
	</div>
	<script src="../../layui/layui.js"></script>
	<script src="../../easyui/jquery.min.js"></script>
	<script>
	
		var Expert_jobNumber = <%=Expert_jobNumber%>;
		//JavaScript代码区域
		var flag = 1;
		
		layui.use('element', function() {
			var element = layui.element;
	
		});
	
	
	
	
		layui.use('table', function() {
			var table = layui.table;
			if(flag != 1){
				layer.alert("assda");
			}
			table.render({
				elem : '#waitList',
				/* height : 315, */
				height : 'full-150',
				/* width : 1000, */
				url : '/SmartgenPlatform/creativeProjectGet', //数据接口
				request : {
					pageName : 'pageL', //页码的参数名称，默认：page
					limitName : 'limit' //每页数据量的参数名，默认：limit
				},
				where : {
					Format : 1,
					condition : 'Creproject_evaluateOpinion =\"\"'+' and '+'Expert_jobNumber='+Expert_jobNumber
				},
				page : true, //开启分页
				cols : [ [ //表头
					{
						field : 'creproject_id',
						title : '项目编号',
						sort : true,
					}
					, {
						field : 'creproject_title',
						title : '标题',
					}
					, {
						field : 'creproject_label',
						title : '标签',
					}
					, {
						field : 'creproject_classify',
						title : '分类',
						hidden : true
					}
					, {
						field : 'creproject_releaseTime',
						title : '发布时间',
						sort : true
					}
					, {
						field : 'button',
						title : '操作',
						toolbar : '#barChoose',
						align : 'center'
					}
				] ]
			});
	
			table.on('tool(test)', function(obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
				var data = obj.data; //获得当前行数据
				var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
				var tr = obj.tr; //获得当前行 tr 的DOM对象
				if (layEvent === 'start') { //开始评估
					var tips = layer.open({
						type : 1,
						title : false, //不显示标题栏
						closeBtn : false,
						area : '450px;',
						shade : 0.8,
						id : 'LAY_layuipro', //设定一个id，防止重复弹出
						resize : false,
						btn : [ '确认', '拒绝' ],
						btnAlign : 'c',
						moveType : 1, //拖拽模式，0或者1
						content : '<div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">在您开始评估这个项目前，我们希望再次确认：<br><br><br>1. 本人已阅读同意<a style="color:#01AAED" href="#">《众智平台评估协议》</a>，并将按照协议要求对内容保密。<br><br>2. 本人已阅读同意<a style="color:#01AAED" href="#">《众智平台创意设计评估标准》</a>，并将按照其要求进行项目评估。</div>',
						btn1 : function(index, layero) {
							layer.close(tips);
							/* layer.open({
								type : 2,
								title : [ '导入信息', 'background-color: #00bb9d;text-align:center;font-size:18px;' ],
								shadeClose : true,
								shade : false,
								maxmin : true,
								area : [ '893px', '600px' ],
								content : [ 'http://localhost:8080/SmartgenPlatform/expert/jsp/expertForm.jsp?Creproject_id='+data.creproject_id+'&Expert_jobNumber='+data.expert_jobNumber+'&User_id='+data.user_id+"&Company_id="+data.company_id+'&Creproject_title='+data.creproject_title+'&Creproject_content='+data.creproject_content+'&Creproject_label='+data.creproject_label+'&Creproject_picture='+data.creproject_picture+'&Creproject_video='+data.creproject_video+'&Creproject_plan='+data.creproject_plan+'&Creproject_classify='+data.creproject_classify+'&Creproject_state='+data.creproject_state+'&Creproject_praise='+data.creproject_praise+'&Creproject_modifyTime='+data.creproject_modifyTime+'&Creproject_releaseTime='+data.creproject_releaseTime+'&Creproject_evaluateTime='+data.creproject_evaluateTime+'&Creproject_evaluateResult='+data.creproject_evaluateResult+'&Creproject_evaluateOpinion='+data.creproject_evaluateOpinion, 'no' ],
								end : function() {
									// 如果是通过单击关闭按钮关闭弹出层，父画面没有此表单  
									if ($("#popupForm").length === 1) {
										$("#popupForm").submit();
									}
								}
							}); */
							layer.open({
								type : 2,
								title : '正在评估',
								area : [ '530px', '600px' ],
								skin : 'layui-layer-rim', //加上边框
								content : [ 'http://localhost:8080/SmartgenPlatform/expert/jsp/expertForm.jsp?Creproject_id=' + data.creproject_id + '&Expert_jobNumber=' + data.expert_jobNumber + '&User_id=' + data.user_id + "&Company_id=" + data.company_id + '&Creproject_title=' + data.creproject_title + '&Creproject_content=' + data.creproject_content + '&Creproject_label=' + data.creproject_label + '&Creproject_picture=' + data.creproject_picture + '&Creproject_video=' + data.creproject_video + '&Creproject_plan=' + data.creproject_plan + '&Creproject_classify=' + data.creproject_classify + '&Creproject_state=' + data.creproject_state + '&Creproject_praise=' + data.creproject_praise + '&Creproject_modifyTime=' + data.creproject_modifyTime + '&Creproject_releaseTime=' + data.creproject_releaseTime + '&Creproject_evaluateTime=' + data.creproject_evaluateTime + '&Creproject_evaluateResult=' + data.creproject_evaluateResult + '&Creproject_evaluateOpinion=' + data.creproject_evaluateOpinion, 'no' ],
								end : function() {
									// 如果是通过单击关闭按钮关闭弹出层，父画面没有此表单  
									if ($("#popupForm").length === 1) {
										$("#popupForm").submit();
									} 
									$(".layui-laypage-btn")[0].click();
									table.reload('waitList');
									flag = 0;
								}
							});
	
						}
					});
	
				}
				if (layEvent === 'cancel') { //取消评估
					var param = '{' + '\"creproject_id\":' + '\"' + data.creproject_id + '\",' + '\"expert_jobNumber\":' + '\"' +0+ '\",' + '\"user_id\":' + '\"' + data.user_id + '\",' + "\"company_id\":" + '\"' + data.company_id + '\",' + '\"creproject_title\":' + '\"' + data.creproject_title + '\",' + '\"creproject_content\":' + '\"' + data.creproject_content + '\",' + '\"creproject_label\":' + '\"' + data.creproject_label + '\",' + '\"creproject_picture\":' + '\"' + data.creproject_picture + '\",' + '\"creproject_video\":' + '\"' + data.creproject_video + '\",' + '\"creproject_plan\":' + '\"' + data.creproject_plan + '\",' + '\"creproject_classify\":' + '\"' + data.creproject_classify + '\",' + '\"creproject_state\":' + '\"' + data.creproject_state + '\",' + '\"creproject_praise\":' + '\"' + data.creproject_praise + '\",' + '\"creproject_modifyTime\":' + '\"' + data.creproject_modifyTime + '\",' + '\"creproject_releaseTime\":' + '\"' + data.creproject_releaseTime + '\",' + '\"creproject_evaluateTime\":' + '\"' + data.creproject_evaluateTime + '\",' + '\"creproject_evaluateResult\":' + '\"' + data.creproject_evaluateResult + '\",' + '\"creproject_evaluateOpinion\":' + '\"' + data.creproject_evaluateOpinion + '\"}';
					jsonParam = JSON.parse(param);
					$.ajax({
   						type: 'post',
    					url: '/SmartgenPlatform/creativeProjectUpdate',
    					dataType: 'json',
    					data: jsonParam,
    					success: function (data) { //返回json结果
        					layer.msg('取消成功，您可以在项目列表重新选择！', {
								icon : 6,
								time : 700 //2秒关闭（如果不配置，默认是3秒）
							}, function() {
								$(".layui-laypage-btn")[0].click();
								table.reload('waitList');
							});
    					}
					});		
				}
			});
	
	
	
		});
	</script>
</body>

</html>