package sp.ExpertAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import sp.pojo.EvaluationExpert;
import sp.serviceDAO.EvaluationExpertServiceDAOimpl;

public class expertUpdate extends HttpServlet {

	private static final long serialVersionUID = 1L;
	EvaluationExpertServiceDAOimpl expertSD = new EvaluationExpertServiceDAOimpl();
	EvaluationExpert expert = new EvaluationExpert();  
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String Expert_jobNumber = request.getParameter("expert_jobNumber");
		String Expert_name = request.getParameter("expert_name");
		String Expert_phone = request.getParameter("expert_phone");
		String Expert_password = request.getParameter("expert_password");
		String Expert_headPortrait = request.getParameter("expert_headPortrait");
		System.out.println(Expert_jobNumber);
		System.out.println(Expert_name);
		System.out.println(Expert_phone);
		System.out.println(Expert_password);
		System.out.println(Expert_headPortrait);
		
		expert.setExpert_jobNumber(Integer.parseInt(Expert_jobNumber));
		expert.setExpert_name(Expert_name);
		expert.setExpert_phone(Expert_phone);
		expert.setExpert_password(Expert_password);
		expert.setExpert_headPortrait(Expert_headPortrait);
		expertSD.evaexpertSave(expert);
		
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		ArrayList<EvaluationExpert> ExpertList = expertSD.evaexpertFind(expert);
		JSONArray expertMsg = JSONArray.fromObject(ExpertList);
		out.print(expertMsg); 
	}

}
