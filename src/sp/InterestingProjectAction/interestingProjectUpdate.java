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

public class interestingProjectUpdate extends HttpServlet {

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
		String Inproject_id = request.getParameter("inproject_id");
		String User_id = request.getParameter("user_id");
		String Inproject_abstract = request.getParameter("inproject_abstract");
		String Inproject_title = request.getParameter("inproject_title");
		String Inproject_classify = request.getParameter("inproject_classify");
		String Inproject_label = request.getParameter("inproject_label");
		String Inproject_picture = request.getParameter("inproject_picture");
		String Inproject_video = request.getParameter("inproject_video");
		String Inproject_state = request.getParameter("inproject_state");
		String Inproject_praise = request.getParameter("inproject_praise");
		String Inproject_needPerson = request.getParameter("inproject_needPerson");
		String Inproject_modifyTime = request.getParameter("inproject_modifyTime");
		String Inproject_releaseTime = request.getParameter("inproject_releaseTime");
		
		System.out.println(Inproject_id);
		System.out.println(User_id);
		System.out.println(Inproject_abstract);
		System.out.println(Inproject_title);
		System.out.println(Inproject_classify);
		System.out.println(Inproject_label);
		System.out.println(Inproject_picture);
		System.out.println(Inproject_video);
		System.out.println(Inproject_state);
		System.out.println(Inproject_praise);
		System.out.println(Inproject_needPerson);
		System.out.println(Inproject_modifyTime);
		System.out.println(Inproject_releaseTime);
			
		interestingProject.setInproject_id(Integer.parseInt(Inproject_id));
		interestingProject.setUser_id(Integer.parseInt(User_id));
		interestingProject.setInproject_abstract(Inproject_abstract);
		interestingProject.setInproject_title(Inproject_title);
		interestingProject.setInproject_classify(Integer.parseInt(Inproject_classify));
		interestingProject.setInproject_label(Inproject_label);
		interestingProject.setInproject_picture(Inproject_picture);
		interestingProject.setInproject_video(Inproject_video);
		interestingProject.setInproject_state(Integer.parseInt(Inproject_state));
		interestingProject.setInproject_praise(Integer.parseInt(Inproject_praise));
		interestingProject.setInproject_needPerson(Integer.parseInt(Inproject_needPerson));
		interestingProject.setInproject_modifyTime(Inproject_modifyTime);
		interestingProject.setInproject_releaseTime(Inproject_releaseTime);
		interestingProjectSD.inprojectSave(interestingProject);
		   
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			ArrayList<InterestingProject> InterestingProjectList = interestingProjectSD.inprojectFind(interestingProject);
			JSONArray interestingProjectMsg = JSONArray.fromObject(InterestingProjectList);
			out.print(interestingProjectMsg);
	}

}
