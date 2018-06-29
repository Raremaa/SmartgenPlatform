package sp.InterestingProjectAction;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sp.pojo.InterestingProject;
import sp.serviceDAO.InterestingProjectServiceDAOimpl;


import net.sf.json.JSONArray;

public class interestingProjectAdd extends HttpServlet {
  private static final long serialVersionUID = 1L;
private static final String Inproject_abstrac = null;
  InterestingProjectServiceDAOimpl inProSD = new InterestingProjectServiceDAOimpl();
  InterestingProject inPro = new InterestingProject();

  public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    doPost(request, response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	  
		int User_id;
		String Inproject_abstract=null;
		String Inproject_title=null;
		String Inproject_label=null;
		String Inproject_picture=null;
		String Inproject_video=null;
		int Inproject_needPerson=0;//默认值为空
		int Inproject_classify;
		int Inproject_state=0;//默认值0为未孵化
		int Inproject_praise=0;//默认为0点赞
		String Inproject_releaseTime=null;
		
		boolean success;
	    String msg = null;
 
        request.setCharacterEncoding("utf-8");                     
        User_id = Integer.parseInt(request.getParameter("User_id"));
        Inproject_abstract = request.getParameter("Inproject_abstract");
        Inproject_title = request.getParameter("Inproject_title");
        Inproject_label = request.getParameter("Inproject_label");
        Inproject_picture =request.getParameter("Inproject_picture");
        Inproject_video = request.getParameter("Inproject_video");
        Inproject_needPerson = Integer.parseInt(request.getParameter("Inproject_needPerson"));
        Inproject_classify = Integer.parseInt(request.getParameter("Inproject_classify"));
        Inproject_releaseTime = request.getParameter("Inproject_releaseTime");
    
        inPro.setUser_id(User_id);
        inPro.setInproject_abstract(Inproject_abstract);
        inPro.setInproject_title(Inproject_title);
        inPro.setInproject_label(Inproject_label);
        inPro.setInproject_picture(Inproject_picture);
        inPro.setInproject_video(Inproject_video);
        inPro.setInproject_needPerson(Inproject_needPerson);
        inPro.setInproject_classify(Inproject_classify);
        inPro.setInproject_releaseTime(Inproject_releaseTime);
        
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    
   if(inProSD.inprojectAdd(inPro)){
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