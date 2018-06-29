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

public class creativeProjectUpdate extends HttpServlet {

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
		String Expert_jobNumber = request.getParameter("expert_jobNumber");
		String Company_id = request.getParameter("company_id");
		String User_id = request.getParameter("user_id");
		String Creproject_title = request.getParameter("creproject_title");
		String Creproject_content = request.getParameter("creproject_content");
		String Creproject_label = request.getParameter("creproject_label");
		String Creproject_picture =request.getParameter("creproject_picture");
		String Creproject_video = request.getParameter("creproject_video");
		String Creproject_plan = request.getParameter("creproject_plan");
		String Creproject_classify = request.getParameter("creproject_classify");
		String Creproject_releaseTime = request.getParameter("creproject_releaseTime");
		String Creproject_state = request.getParameter("creproject_state");
		String Creproject_praise = request.getParameter("creproject_praise");
		String Creproject_modifyTime = request.getParameter("creproject_modifyTime");
		String Creproject_evaluateTime = request.getParameter("creproject_evaluateTime");
		String Creproject_evaluateResult = request.getParameter("creproject_evaluateResult");
		String Creproject_evaluateOpinion = request.getParameter("creproject_evaluateOpinion");
		
		System.out.println(Creproject_id);
		System.out.println("absj");
		System.out.println(Expert_jobNumber);
		System.out.println(Company_id);
		System.out.println(User_id);
		System.out.println(Creproject_title);
		System.out.println("内容：");
		System.out.println(Creproject_content);
		System.out.println(Creproject_label);
		System.out.println(Creproject_picture);
		System.out.println(Creproject_video);
		System.out.println(Creproject_plan);
		System.out.println(Creproject_classify);
		System.out.println(Creproject_releaseTime);
		System.out.println(Creproject_state);
		System.out.println(Creproject_praise);
		System.out.println(Creproject_modifyTime);
		System.out.println(Creproject_evaluateTime);
		System.out.println(Creproject_evaluateResult);
		System.out.println(Creproject_evaluateOpinion);
		
		
		
		
		
		if(Expert_jobNumber == ""){
			Expert_jobNumber = "0";
		}
		if(Company_id == ""){
			Company_id = "0";
		}
		
		
		
		
		creativeProject.setCreproject_id(Integer.parseInt(Creproject_id));
		creativeProject.setExpert_jobNumber(Integer.parseInt(Expert_jobNumber));
		creativeProject.setCompany_id(Integer.parseInt(Company_id));
		creativeProject.setUser_id(Integer.parseInt(User_id));
		creativeProject.setCreproject_title(Creproject_title);
		creativeProject.setCreproject_content(Creproject_content);
		creativeProject.setCreproject_label(Creproject_label);
		creativeProject.setCreproject_picture(Creproject_picture);
		creativeProject.setCreproject_video(Creproject_video);
		creativeProject.setCreproject_plan(Creproject_plan);
		creativeProject.setCreproject_classify(Integer.parseInt(Creproject_classify));
		creativeProject.setCreproject_releaseTime(Creproject_releaseTime);
		creativeProject.setCreproject_state(Integer.parseInt(Creproject_state));
		creativeProject.setCreproject_praise(Integer.parseInt(Creproject_praise));
		creativeProject.setCreproject_modifyTime(Creproject_modifyTime);
		creativeProject.setCreproject_evaluateTime(Creproject_evaluateTime);
		creativeProject.setCreproject_evaluateResult(Integer.parseInt(Creproject_evaluateResult));
		creativeProject.setCreproject_evaluateOpinion(Creproject_evaluateOpinion);
		creativeProjectSD.creprojectSave(creativeProject);
		System.out.println("abwjwjkw");
		
		
		//修改成功，返回数据
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.creprojectFind(creativeProject);
		System.out.println(5);
		JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
		out.print(creativeProjectMsg); 
	}

}
