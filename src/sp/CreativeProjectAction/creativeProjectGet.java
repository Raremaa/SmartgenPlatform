package sp.CreativeProjectAction;

import java.io .IOException;
import java.io .PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import sp.pojo.CreativeProject;
import sp.pojo.Response_Format;
import sp.serviceDAO.CreativeProjectServiceDAOimpl;

public class creativeProjectGet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CreativeProjectServiceDAOimpl creativeProjectSD = new CreativeProjectServiceDAOimpl();
	CreativeProject creativeProject = new CreativeProject();  
	Response_Format responseFormat = new  Response_Format();
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
			String pageL = request.getParameter("pageL");
			String limit = request.getParameter("limit");
		 	String condition4 = request.getParameter("condition");
		    //调试语句
		    System.out.println(condition1);
		    System.out.println(condition2);
		    System.out.println(condition3);
		    System.out.println(condition4);
		    System.out.println(0);
		    
		    if(pageL != null & limit !=null){
		    	int p = Integer.parseInt(pageL);
		    	int l = Integer.parseInt(limit);
		    	CreativeProject tempProject = new CreativeProject();  
		    	condition = condition4+" limit "+((p-1)*l)+","+l;
		    	System.out.println("abd"+condition);
		    	tempProject.setCondition(condition);
		    	ArrayList<CreativeProject> limitList = creativeProjectSD.creprojectFind(tempProject);
		    	JSONArray creativeProjectMsg = JSONArray.fromObject(limitList);
		    	responseFormat.setdata(creativeProjectMsg);
		    	/*tempProject.setCondition("");
		    	limitList = creativeProjectSD.creprojectFind(tempProject);*/
		    	
		    	responseFormat.setcount(limitList.size());
		    	responseFormat.setcode(0);
		    	responseFormat.setmsg("");
		    	response.setContentType("text/html;charset=utf-8");
				PrintWriter out = response.getWriter();
				JSONObject limitMsg = JSONObject.fromObject(responseFormat);
				out.print(limitMsg); 
		    }else{
		    	  if(condition4 != null){
				    	System.out.println(1);
				    	condition += condition4;
				    }else if(condition2 != "" && condition2.length() > 0){
				    	System.out.println(3);
				    	condition += condition1+" like '%"+condition2+"%'";
				    	if(condition3 != "" && condition3.length() > 0){
				    		condition += "and Creproject_modifyTime = "+"\'"+condition3+"\'"+" or Creproject_releaseTime = "+"\'"+condition3+"\'"+" or Creproject_evaluateTime = "+"\'"+condition3+"\'";
				    	}
				    }else if(condition3 != "" && condition3.length() > 0){
				    	System.out.println(4);
				    	condition += "Creproject_modifyTime = "+"\'"+condition3+"\'"+" or Creproject_releaseTime = "+"\'"+condition3+"\'"+" or Creproject_evaluateTime = "+"\'"+condition3+"\'";
				    }
				    creativeProject.setCondition(condition);
				    
				    
				    //执行查询，返回结果
				    response.setContentType("text/html;charset=utf-8");
				    PrintWriter out = response.getWriter();
				    ArrayList<CreativeProject> CreativeProjectList = creativeProjectSD.creprojectFind(creativeProject);
				    System.out.println(5);
				    JSONArray creativeProjectMsg = JSONArray.fromObject(CreativeProjectList);
				    out.print(creativeProjectMsg); 
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  
	}

}









