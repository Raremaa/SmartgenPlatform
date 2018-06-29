<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

 
<div class="container">
	<ul id="myTab" class="nav nav-tabs">
		<li style="text-align:center;height:45px;"><a href="#home"
			style="background:none;outline:none;"> <span
				style="font-size:32px;">兴趣</span><br />
			 </a></li>
		<li class="active"><a href="#ios" data-toggle="tab"
			class="classify"style="font-size:20px;padding-top:20px;">美食</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">运动</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">旅游</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">游戏</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">动漫</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">影视</a>
		</li>
		<li><a href="#home" data-toggle="tab" class="classify"style="font-size:20px;padding-top:20px;">其他</a>
		</li>
	</ul>
	<div id="myTabContent" class="tab-content">
		<p style="padding-left:250px;padding-top:20px;">
			项目状态：<a href="#" style="text-decoration:none;" class="state">人员招募中</a>&nbsp;&nbsp;<a
				href="#" style="text-decoration:none;" class="state">招募已满</a>&nbsp;&nbsp;
		<hr>
		
			<p id="interestProResult"></p>
			<!-- 存放搜索结果的题头 -->
			<div class="tab-pane fade in active" id="home">
				<div class="interestProHeader">
					<h3>兴趣推荐</h3>
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
							<a href="#"class="m-pic"><img class="project2" src="img/interestPro4.jpg">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4>翻译英语电影</h4>
							</a>
						</div>
						<div class="middle2Right m2-1r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="img/1.jpg" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span>哈哈美女</span>
							</a>
							<p class="projectContent m-content"style="height:130px;margin-top:10px;">&nbsp;&nbsp;&nbsp;&nbsp;现在我暮色了一个有意义的电影，想翻译

，但工程量太大，所以想募集更多对此方面感兴趣的人，同我一起协作完成这件事，以此来提高自己的英语能力。</p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>
					<div class="middle2 m2-2">
						<div class="middle2Left m2-2l">
							<a href="/SmartgenPlatform/inprojectIntroduction/inprojectIntroduction.jsp" class="m-pic"><img class="project2" src="img/interestPro1.jpg">
							</a> <a href="/SmartgenPlatform/inprojectIntroduction/inprojectIntroduction.jsp" class="m-title" style="text-decoration:none;"><h4>我们一起去旅行</h4>
							</a>
						</div>
						<div class="middle2Right m2-2r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="img/2.jpg" class="img-circle"
								style="width:50px;height:50px;"><!-- 发布人的用户名 -->
								<span>呼啦呼啦</span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;">我们向往的美好梦想
我和春天商量去旅行
把夏天的热情一起带去
我和秋天骑单车旅行
把冬天的假期一起带去
大声唱歌 大口呼吸
我想和你们一起去旅行</p>
							<a class="btn btn-default" href="/SmartgenPlatform/inprojectIntroduction/inprojectIntroduction.jsp" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>

					<div class="middle2 m2-3">
						<div class="middle2Left m2-3l">
							<a href="#"class="m-pic"><img class="project2" src="img/interestPro2.jpg">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4>户外垂钓</h4>
							</a>
						</div>
						<div class="middle2Right m2-3r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="img/3.jpg" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span>c哩c哩</span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;">直钩钓鱼，莫计得失；小鱼放生，放眼未来；风钓雨钓，磨练心性

；专心致志，杂念皆空；这才是真正钓到了鱼。</p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div>

					<div class="middle2 m2-4">
						<div class="middle2Left m2-4l">
							<a href="#"class="m-pic"><img class="project2" src="img/interestPro3.jpg">
							</a> <a href="#" class="m-title" style="text-decoration:none;"><h4>庐山看雪</h4>
							</a>
						</div>
						<div class="middle2Right m2-4r">
							<a href="#" class="m-pic" style="text-decoration:none;"><img
								src="img/4.jpg" class="img-circle"
								style="width:50px;height:50px;"> <!-- 发布人的用户名 -->
								<span>飞不起的猪</span>
							</a>
							
							<p class="projectContent m-content" style="height:130px;margin-top:10px;">我们一起去庐山看雪，等不到九院的雪，就得自己创造机会去庐山

看雪</p>
							<a class="btn btn-default" href="#" role="button"
								style="margin-left:120px;background:#337ab5;color:white;">了解详情</a>
						</div>
					</div><!-- middle2 -->
				</div><!-- creProM2 -->


				<div class="interestProHeader">
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

				<div id="interestProM">
				       <div class="middle1">
					  <div style="margin-top:10px;">
					   <a href="#"><img class="img-circle" style="width:50px;height:50px;"src="img/4.jpg"></a>
						<span style="font-size:16px;">哈哈</span>
						<span style="font-size:14px;padding-top:20px;padding-left:10px;">2017-12-13</span>
					   </div>
					    <a href="#" style="text-decoration:none;"><h4>我们一起去旅行</h4>
						</a>
						<div class="interestProContent">
						    <p>我们向往的美好梦想<br/>我和春天商量去旅行<br/>把夏天的热情一起带去<br/>我和秋天骑单车旅行<br/>把冬天的假期一起带去<br/>大声唱歌 大口呼吸<br/>我想和你们一起去旅行
						    </p>
						</div>
						<a class="btn btn-default" href="#" role="button"
								style="margin-left:10px;margin-top:20px;background:#337ab5;color:white;">了解详情</a>
						
					</div>
					
					<div class="middle1">
					  <div style="margin-top:10px;">
					   <a href="#"><img class="img-circle" style="width:50px;height:50px;"src="img/3.jpg"></a>
						<span style="font-size:16px;">哈哈</span>
						<span style="font-size:14px;padding-top:20px;padding-left:10px;">2017-12-13</span>
					   </div>
					    <a href="#" style="text-decoration:none;"><h4>翻译英语电影</h4>
						</a>
						<div class="interestProContent">
						    <p>现在我暮色了一个有意义的电影，想翻译，但工程量太大，所以想募集更多对此方面感兴趣的人，同我一起协作完成这件事，以此来提高自己的英语能力。
						    </p>
						</div>
						<a class="btn btn-default" href="#" role="button"
								style="margin-left:10px;margin-top:20px;background:#337ab5;color:white;">了解详情</a>
						
					</div>
					
					<div class="middle1">
					  <div style="margin-top:10px;">
					   <a href="#"><img class="img-circle" style="width:50px;height:50px;"src="img/2.jpg"></a>
						<span style="font-size:16px;">哈哈</span>
						<span style="font-size:14px;padding-top:20px;padding-left:10px;">2017-12-13</span>
					   </div>
					    <a href="#" style="text-decoration:none;"><h4>我们开跑吧</h4>
						</a>
						<div class="interestProContent">
						    <p> 我想锻炼身体，可是又坚持不了，所以我想找和我一样想锻炼身体却又坚持不下来的小伙伴们，我们一起组团开跑吧！
						    </p>
						</div>
						<a class="btn btn-default" href="#" role="button"
								style="margin-left:10px;margin-top:20px;background:#337ab5;color:white;">了解详情</a>
						
					</div>
					
					<div class="middle1">
					  <div style="margin-top:10px;">
					   <a href="#"><img class="img-circle" style="width:50px;height:50px;"src="img/1.jpg"></a>
						<span style="font-size:16px;">哈哈</span>
						<span style="font-size:14px;padding-top:20px;padding-left:10px;">2017-12-13</span>
					   </div>
					    <a href="#" style="text-decoration:none;"><h4>户外垂钓</h4>
						</a>
						<div class="interestProContent">
						    <p>直钩钓鱼，莫计得失；小鱼放生，放眼未来；风钓雨钓，磨练心性；专心致志，杂念皆空；这才是真正钓到了鱼。
						    </p>
						</div>
						<a class="btn btn-default" href="#" role="button"
								style="margin-left:10px;margin-top:20px;background:#337ab5;color:white;">了解详情</a>
						
					</div>

			</div>
			<!-- <div class="tab-pane fade" id="ios">
				<p>iOS 是一个由苹果公司开发和发布的手机操作系统。最初是于 2007 年首次发布 iPhone、iPod Touch 和
					Apple TV。iOS 派生自 OS X，它们共享 Darwin 基础。OS X 操作系统是用在苹果电脑上，iOS
					是苹果的移动版本。</p>
			</div> -->

	</div>
</div>