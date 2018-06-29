<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="container">
	<ul id="myTab" class="nav nav-tabs">
		<li style="text-align:center;height:30px;"class="active">
		<a href="#home"data-toggle="tab"style="outline:none;height:57px;"> 
			<span style="font-size:30px;">创意</span><br />
			 </a></li>
		<li><a href="#classify" data-toggle="tab"
			class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(0);">生活手工</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(1);">家具家居</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(2);">科技数码</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(3);">艺术娱乐</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(4);">户外运动</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(5);">医疗健康</a>
		</li>
		<li><a href="#classify" data-toggle="tab" class="classify" style="font-size:18px;padding-top:20px;"onclick="showClassifyPro(6);">其他</a>
		</li>
	</ul>
	<div id="myTabContent" class="tab-content">
		<p style="padding-left:250px;padding-top:20px;">
			项目状态：<a href="#" style="text-decoration:none;" class="state">未孵化</a>&nbsp;&nbsp;<a
				href="#" style="text-decoration:none;" class="state">孵化中</a>&nbsp;&nbsp;<a
				href="#" style="text-decoration:none;" class="state">孵化成功</a>
		</p>
		<hr>
		
			<p id="creProResult"></p>
			<!-- 存放搜索结果的题头 -->
			<div class="tab-pane fade in active" id="home">
				<div class="creProHeader">
					<h3>热门项目</h3>
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:15%;height:0px;border:none;border-top:3px solid #337ab7;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
				</div>

				<div id="creProM1">
					<div class="middle1 m1-1">
						<a href="#" class="m-pic"><img class="project1" src=""></a>
						<a href="#" style="text-decoration:none;" class="m-title"><h4></h4></a>
					</div>
					<div class="middle1 m1-2">
						<a href="#" class="m-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="m-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 m1-3">
						<a href="#" class="m-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="m-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 m1-4">
						<a href="#" class="m-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="m-title"><h4></h4>
						</a>
					</div>
				
				</div><!-- creProM1 -->


				<div class="creProHeader">
					<h3>还想看</h3>
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:15%;height:0px;border:none;border-top:3px solid #337ab7;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
				</div>

				<div id="creProM2">
					<div class="middle2 m2-1">
						<div class="middle2Left m2-1l">
							<a href="#"class="m-pic"><img class="project2" src="">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4></h4>
							</a>
						</div>
						<div class="middle2Right m2-1r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span></span>
							</a>
							<p class="projectContent m-content"style="height:130px;margin-top:10px;">&nbsp;&nbsp;&nbsp;&nbsp;</p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>
					<div class="middle2 m2-2">
						<div class="middle2Left m2-2l">
							<a href="#" class="m-pic"><img class="project2" src="">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4></h4>
							</a>
						</div>
						<div class="middle2Right m2-2r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span></span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;"></p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>

					<div class="middle2 m2-3">
						<div class="middle2Left m2-3l">
							<a href="#"class="m-pic"><img class="project2" src="">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4></h4>
							</a>
						</div>
						<div class="middle2Right m2-3r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span></span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;"></p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>

					<div class="middle2 m2-4">
						<div class="middle2Left m2-4l">
							<a href="#"class="m-pic"><img class="project2" src="">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4></h4>
							</a>
						</div>
						<div class="middle2Right m2-4r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span></span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;"></p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div><!-- middle2 -->
				</div><!-- creProM2 -->
				
					   <p id="pages"style="text-align:center;display:inline-block;width:100%;height:100px;"></p>
			    
			</div><!-- home -->
			
			
			
			<div class="tab-pane fade" id="classify">
				<div class="creProHeader classify">
					<h3></h3>
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:15%;height:0px;border:none;border-top:3px solid #337ab7;align:center;display:inline-block;">
					&nbsp;&nbsp;
					<hr
						style="width:35%;height:0px;border:none;border-top:1.5px solid #a1a1a1;align:center;display:inline-block;">
				</div>
				
				<p id="classifyResult"style="text-align:center;display:block;margin-top:20px;height:20px;margin-bottom:0px;"></p>

				<div id="classCreProM1">
					<div class="middle1 c1-1">
						<a href="#" class="c-pic"><img class="project1" src=""></a>
						<a href="#" style="text-decoration:none;" class="c-title"><h4></h4></a>
					</div>
					<div class="middle1 c1-2">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 c1-3">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 c1-4">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>

					<div class="middle1 c1-5">
						<a href="#" class="c-pic"><img class="project1" src=""></a>
						<a href="#" style="text-decoration:none;" class="c-title"><h4></h4></a>
					</div>
					<div class="middle1 c1-6">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 c1-7">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>
					<div class="middle1 c1-8">
						<a href="#" class="c-pic"><img class="project1 " src="">
						</a> <a href="#" style="text-decoration:none;" class="c-title"><h4></h4>
						</a>
					</div>
				
				</div><!-- classCreProM1 -->
                
					   <p id="classifyPages"style="text-align:center;display:inline-block;width:100%;height:100px;"></p>
			    
                
			</div><!-- ios -->

	</div><!-- myTabContent -->
</div><!-- container -->