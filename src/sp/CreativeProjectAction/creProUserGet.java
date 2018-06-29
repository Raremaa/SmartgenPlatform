package sp.CreativeProjectAction;


import java.io 

.IOException;
import java.io 

.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import sp.pojo.CreativeProject;
import sp.serviceDAO.selectCreProUserServiceDAOimpl;


public class creProUserGet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	selectCreProUserServiceDAOimpl creativeProjectSD = new selectCreProUserServiceDAOimpl();
	CreativeProject creativeProject = new CreativeProject();  
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		 	String condition="" ;
		 	String Creproject_list=null;
		 	String Creproject_id=null ;//根据id查询创意项目，将项目id重定向到展示页面，返回前台
		 	String id=null;//根据id查询创意项目，将项目集合返回前台
		 	//这两种的查询条件一样，但是得到数据后的处理不一样
		 	Creproject_list = request.getParameter("condition");
		 	Creproject_id = request.getParameter("Creproject_id");
		 	id = request.getParameter("id");
		    System.out.println(Creproject_list);
		    System.out.println(Creproject_id);
		    System.out.println(id);
		    
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		 	if(Creproject_list!=null){
		    	condition+=Creproject_list;
		    	creativeProject.setCondition(condition);
		    	ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.CreProUserFind(creativeProject);
		    	//执行查询，返回结果
		    	JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
		    	System.out.println(1);
			    out.print(creativeProjectMsg);
			    return;
		    }else{
		    	if(id!=null){
		    		condition += "Creproject_id = "+id+" and CreativeProject.User_id = user.User_id";
		    		System.out.println(condition);
		    		creativeProject.setCondition(condition);
		    		ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.CreProUserFind(creativeProject);
		    		JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
		    		System.out.println(3);
		    		out.print(creativeProjectMsg);
				    return;
		    		
		    	}else{
		    		if(Creproject_id!=null){
		    			condition += "Creproject_id = "+Creproject_id+" and CreativeProject.User_id = user.User_id";
			    		System.out.println(condition);
			    		creativeProject.setCondition(condition);
			    		ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.CreProUserFind(creativeProject);
			    		System.out.println(CreativeProjectList);
			    		response.sendRedirect("creprojectIntroduction/creprojectIntroduction.jsp?Creproject_id="+CreativeProjectList.get(0).getCreproject_id());
			    		JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
			    		System.out.println(2);
					    out.print(creativeProjectMsg);
			    	}
		    	}
		    }
		 
	}

}
