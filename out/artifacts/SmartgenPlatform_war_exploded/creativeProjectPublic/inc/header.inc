 <%@page contentType="text/html;charset=utf-8" %>
 <%//初始化用户头像和用户名，若是游客就显示注册登录，否则就像是用户名和用户头像
    String headProtrait="<a href=\"/SmartgenPlatform/login.html\"style=\"padding-top:5px;padding-left:0px;width:60px;\"><img src=\"/SmartgenPlatform/homePage/imgage/login.png\" id=\"User_headPortrait\"class=\"img-circle\" style=\"width:50px;height:50px;\"/></a>";
    headProtrait +="<a href=\"/SmartgenPlatform/regist.html\"style=\"margin-top:-80px;margin-left:50px;text-decoration:none;font-size:16px;width:60px;\"><img  style=\"width:50px;height:50px;\"src=\"/SmartgenPlatform/homePage/imgage/signup.png\"/></a>";
    String about="";
    /*System.out.print(request.getParameter("headPortraitMsg"));
    String protrait=request.getParameter("headPortraitMsg");
    String name = request.getParameter("userName");
    
     if(name!=null&protrait!=null){
         headProtrait="<a href=\"#\"style=\"padding-top:5px;\"><img src=\""+protrait+"\" id=\"User_headPortrait\"class=\"img-circle\" style=\"width:50px;height:50px;\"/></a>";
         userName="<a href=\"#\"style=\"padding-top:5px;padding-left:0px;text-decoration:none;font-size:16px;\">"+name+"</a>";
         about="<li class=\"dropdown\" style=\"margin-top:10px;\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">关于 <span class=\"caret\"></span></a> <ul class=\"dropdown-menu\"><li><a href=\"#\">退出登录</a></li><li><a href=\"#\">个人中心</a></li> </ul></li>";
    } */
    String name=(String) session.getAttribute("userName");
    String protrait=(String) session.getAttribute("userHeadProtrait");
    System.out.print(name);
    System.out.print(protrait);
     if(name!=null&protrait!=null){
         headProtrait="<a href=\"/SmartgenPlatform/personalCenter/message.jsp\"style=\"padding-left:80px;padding-top:5px;\"><img src=\""+protrait+"\" id=\"User_headPortrait\"class=\"img-circle\" style=\"width:50px;height:50px;\"/></a>";

         about="<li class=\"dropdown\" style=\"background-color:white;\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\" style='font-size:14px;background-color:white;padding-top:20px;'>"+name+"<span class=\"caret\"></span></a> <ul class=\"dropdown-menu\"><li><a href=\"/SmartgenPlatform/homePage/homePage.jsp\"id=\"outLogi\"onclick=\"isOut();\">退出登录</a></li><li><a href=\"/SmartgenPlatform/personalCenter/message.jsp\">个人中心</a></li> </ul></li>";
    } 
    %>
 <nav class="navbar navbar-default" style="height:60px;width:100%;float:left;background-color:white;">
  <img src="/SmartgenPlatform/homePage/imgage/logo4.png" style="width:200px;height:55px;float:left;margin-left:20px;"/>
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" style="margin-top:6px;margin-left:50px;">
        <li ><a href="/SmartgenPlatform/homePage/homePage.jsp">首页 <span class="sr-only"></span></a></li>
        <li><a href="/SmartgenPlatform/interestingProject/interestingProject.jsp">兴趣协作市场</a></li>
         <li class="active"><a href="/SmartgenPlatform/creativeProject/creativeProject.jsp">创意孵化市场</a></li>
          <li><a href="/SmartgenPlatform/product/product.jsp">产品系列</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">发布 <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="/SmartgenPlatform/creativeProjectPublic/creprojectPublic.jsp"id="creativeProPublic">创意发布</a></li>
            <li><a href="/SmartgenPlatform/interestingProjectPublic/inprojectPublic.jsp"id="interestingProPublic">兴趣发布</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" style="margin-top:15px;margin-left:40px;">
        <div class="form-group">
          <input type="text" name="stext" class="form-control" style="width:230px;" placeholder="请输入关键字">
        </div>
        <button type="button" class="btn btn-default"id="headerSearch" >搜索</button>
      </form>
      
      <ul class="nav navbar-nav navbar-right" >
         <li style="width:130px"><%=headProtrait%></li>
       
        <%=about %>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>       