<%@page contentType="text/html;charset=utf-8" %>

<html>
  <head>
     <title>首页选择</title>   
     <script type="text/javascript" src="/SmartgenPlatform/easyui/jquery.min.js"></script>
  <link rel="stylesheet" href="/SmartgenPlatform/bootstrap/css/bootstrap.min.css" type="text/css"></link>
  <script type="text/javascript" src="/SmartgenPlatform/bootstrap/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="/SmartgenPlatform/homePage/css/homePage.css" type="text/css"></link>
 <script type="text/javascript" src="/SmartgenPlatform/homePage/js/jquery-1.4.2.min.js"></script>
 
 <link rel="Bookmark" href="/SmartgenPlatform/img/logoSmall.png" />
<link rel="Shortcut Icon" href="/SmartgenPlatform/img/logoSmall.png">
 
 <link rel="stylesheet" href="../css/bottom.css" type="text/css"></link></head>  
  
  
 <script type="text/javascript">
   $(document).ready(function() {
      $("#botton1").click(function(){
        window.location.href="/SmartgenPlatform/creativeProjectPublic/creprojectPublic.jsp";
      });
    });
  $(document).ready(function() {
      $("#botton2").click(function(){
        window.location. href="/SmartgenPlatform/interestingProjectPublic/inprojectPublic.jsp";
      });
    });
 </script>
 
 
  <body>
  
  <!-- 轮播图 -->
   <div id="carousel-example-generic" class="carousel slide" data-ride="carousel" >
   <!-- 导航栏 -->
  <div class="top" style="font-size:20px;" >
      <%@include file="inc/header.inc" %>
  </div>
      <%@include file="inc/lunbo.inc" %>
    </div>
  <div id="homePageMiddle">
    <div id="resultContent"></div>
    <!-- 产品栏 -->
    <div class="container">
      <%@include file="inc/product.inc" %>
  </div> 
    <!-- 项目栏 -->
    <div class="container">
       <%@include file="inc/project.inc" %>
   </div>
   <!-- 兴趣栏 -->
   <div class="container">
       <%@include file="inc/interesting.inc" %>
   </div>
   <!--发布标题栏 -->
   <div class="container" style="margin-top:60px;">
   <%@include file="inc/public.inc" %>
   </div>
   
   <div class="container" style="margin-top:40px;"><hr class="xd1" style="width:100%;"></div>
   
   <!-- 评选 -->
   <div class="container" style="margin-top:60px;">
     <%@include file="inc/choose.inc" %>
   </div>
  </div>
  <!-- 版权 -->
    <div class="buttom" style="margin-top:150px;">
      <%@include file="../inc/bottom.inc" %> 
    </div>
    
    <script type="text/javascript" src="js/homePage.js"></script>  
   <script>
      $("#homePageMiddle a").attr("target","_blank");
   </script>
  </body>
  
</html>
