package sp.InterestingProjectAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import sp.pojo.InterestingProject;
import sp.serviceDAO.InterestingProjectServiceDAOimpl;


public class interestingProjectDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;
	InterestingProjectServiceDAOimpl interestingProjectSD = new InterestingProjectServiceDAOimpl();
	InterestingProject interestingProject = new InterestingProject();
	
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	     doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      
		    request.setCharacterEncoding("utf-8");
		    String Inproject_id= request.getParameter("inproject_id");
		    interestingProject.setInproject_id(Integer.parseInt(Inproject_id));
		    interestingProjectSD.inprojectDel(interestingProject);

		    response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			ArrayList<InterestingProject> InterestingProjectList = interestingProjectSD.inprojectFind(interestingProject);
			JSONArray interestingProjectMsg = JSONArray.fromObject(InterestingProjectList);
			out.print(interestingProjectMsg);
	}

}
