package sp.CreativeProjectAction;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sp.pojo.CreativeProject;
import sp.serviceDAO.CreativeProjectServiceDAOimpl;


import net.sf.json.JSONArray;

public class creativeProjectAdd extends HttpServlet {
  private static final long serialVersionUID = 1L;
  CreativeProjectServiceDAOimpl creProSD = new CreativeProjectServiceDAOimpl();
  CreativeProject crePro = new CreativeProject();

  public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	  
		int User_id;
		String Creproject_title=null;
		String Creproject_content=null;
		String Creproject_label=null;
		String Creproject_picture=null;
		String Creproject_video=null;
		String Creproject_plan=null;
		int Creproject_classify;
		int Creproject_state=0;//默认值0为未孵化
		int Creproject_praise=0;//默认为0点赞
		String Creproject_releaseTime=null;
		
		boolean success;
	    String msg = null;
 
        request.setCharacterEncoding("utf-8");                     
        User_id = Integer.parseInt(request.getParameter("User_id"));
        Creproject_title = request.getParameter("Creproject_title");
        Creproject_content = request.getParameter("Creproject_content");
        Creproject_label = request.getParameter("Creproject_label");
        Creproject_picture =request.getParameter("Creproject_picture");
        Creproject_video = request.getParameter("Creproject_video");
        Creproject_plan = request.getParameter("Creproject_plan");
        Creproject_classify = Integer.parseInt(request.getParameter("Creproject_classify"));
        Creproject_releaseTime = request.getParameter("Creproject_releaseTime");
    
        crePro.setUser_id(User_id);
        crePro.setCreproject_title(Creproject_title);
        crePro.setCreproject_content(Creproject_content);
        crePro.setCreproject_label(Creproject_label);
        crePro.setCreproject_picture(Creproject_picture);
        crePro.setCreproject_video(Creproject_video);
        crePro.setCreproject_plan(Creproject_plan);
        crePro.setCreproject_classify(Creproject_classify);
        crePro.setCreproject_releaseTime(Creproject_releaseTime);
        
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    
   if(creProSD.creprojectAdd(crePro)){
        success = true;
        msg = "添加成功";
      }else{
        success = false;
        msg = "添加失败";
      }
    String datas = "{\"success\":\""+success+"\",\"msg\":\""+msg+"\"}";
    //拼接为一个json字符串为{"success":"true","msg":"添加成功"}，也是传过去的数据
    out.print(datas);
   
    /*
     * boolean mssg=creProSD.creprojectAdd(crePro);
      JSONArray creProMsg = JSONArray.fromObject(msg);
      out.print(creProMsg);
      不用拼接，为json格式过去的数据为[true]
      */
  }
}