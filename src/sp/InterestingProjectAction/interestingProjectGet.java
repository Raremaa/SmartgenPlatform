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

public class interestingProjectGet extends HttpServlet {

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
		//查询条件
		 	String condition = "";
		 	//后台管理员页面条件查询
		 	String condition1 = request.getParameter("condition1");
		 	String condition2 = request.getParameter("condition2");
		 	String condition3 = request.getParameter("condition3");
		    //前台页面查询
		 	String Inproject_id = request.getParameter("Inproject_id");//前台主要页面需求，根据项目id条件查询
		 	String Inproject_list = request.getParameter("condition");//前台项目列表页面需求，在判断状态是否可发布后遍历id查询，前台做判断封装为condition
		    //调试语句
		    System.out.println(condition1);
		    System.out.println(condition2);
		    System.out.println(condition3);
		    System.out.println(Inproject_id);
		    System.out.println(Inproject_list);
		    
		    if(Inproject_list != null){
		    	System.out.println(1);
		    	condition += Inproject_list;
		    }else if(Inproject_id != null){
		    	System.out.println(2);
		    	condition += "Inproject_id = "+Inproject_id;
		    }else if(condition2 != "" && condition2.length() > 0){
		    	System.out.println(3);
		    	condition += condition1+" like '%"+condition2+"%'";
		    	if(condition3 != "" && condition3.length() > 0){
		    		condition += "and Inproject_modifyTime = "+"\'"+condition3+"\'"+" or Inproject_releaseTime = "+"\'"+condition3+"\'";
		    	}
		    }else if(condition3 != "" && condition3.length() > 0){
		    	System.out.println(4);
		    	condition += "Inproject_modifyTime = "+"\'"+condition3+"\'"+" or Inproject_releaseTime = "+"\'"+condition3+"\'";
		    }
		    interestingProject.setCondition(condition);
		    interestingProjectSD.inprojectFind(interestingProject);
		    //执行查询，返回结果
		    response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			ArrayList<InterestingProject> InterestingProjectList = interestingProjectSD.inprojectFind(interestingProject);
			JSONArray interestingProjectMsg = JSONArray.fromObject(InterestingProjectList);
			out.print(interestingProjectMsg);
	}

}
