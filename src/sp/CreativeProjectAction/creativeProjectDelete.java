package sp.CreativeProjectAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import sp.pojo.CreativeProject;
import sp.serviceDAO.CreativeProjectServiceDAOimpl;


public class creativeProjectDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CreativeProjectServiceDAOimpl creativeProjectSD = new CreativeProjectServiceDAOimpl();
	CreativeProject creativeProject = new CreativeProject();  
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	     doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      
		    request.setCharacterEncoding("utf-8");
		    String Creproject_id = request.getParameter("creproject_id");
		    creativeProject.setCreproject_id(Integer.parseInt(Creproject_id));
		    creativeProjectSD.creprojectDel(creativeProject);

		    //删除成功，返回数据
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.creprojectFind(creativeProject);
		    System.out.println(5);
		    JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
		    out.print(creativeProjectMsg); 
	}

}
