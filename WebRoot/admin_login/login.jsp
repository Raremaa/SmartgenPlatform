<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta author="zrong.me 曾荣">
<title>登录 - 众智管理平台</title>
<link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
	<div id="box"></div>
	<div class="cent-box">
		<div class="cent-box-header">
			<h1 class="main-title hide">众智管理平台</h1>
			<h2 class="sub-title">与众智一起携手未来！</h2>
		</div>

		<div class="cont-main clearfix">

			
			<form  action="/SmartgenPlatform/admin/jsp/dologin.jsp" method="post">
				<div class="login form">
					<div class="group">
						<div class="group-ipt username">
							<input type="text" name="username" id="username" class="ipt"
								placeholder="请输入您的用户名" required>
						</div>
						<div class="group-ipt password">
							<input type="password" name="password" id="password" class="ipt"
								placeholder="输入您的登录密码" required>
						</div>
					</div>
				</div>

				<div class="button">
					<button type="submit" class="login-btn" id="btn_submit">登录</button>
				</div>
			</form>
		</div>
	</div>

	<div class="footer">
		<p>众智管理平台</p>
		<p>2017 All Rights Reserved</p>
	</div>

	<script src='js/particles.js' type="text/javascript"></script>
	<script src='js/background.js' type="text/javascript"></script>
	<script src='js/jquery.min.js' type="text/javascript"></script>
</body>
</html>