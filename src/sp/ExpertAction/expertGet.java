package sp.ExpertAction;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sp.pojo.EvaluationExpert;
import sp.serviceDAO.EvaluationExpertServiceDAOimpl;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class expertGet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  EvaluationExpertServiceDAOimpl evaluationExpertSD = new EvaluationExpertServiceDAOimpl();
  EvaluationExpert evaluationExpert = new EvaluationExpert();

  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request,response);
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {	  
	    
	    
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    System.out.println("jinlail");
    //查询条件
    String condition = request.getParameter("condition");
    //判断是否退出登录，便于清除session
    String isOut=request.getParameter("isOut");
    System.out.println(isOut);
    evaluationExpert.setCondition(condition);
    
    if(isOut!=null){
    	System.out.println("我的"+isOut);
    	 HttpSession session = request.getSession();
    	 session.removeAttribute("Expert_jobNumber");
    	 session.removeAttribute("Expert_name");
    	 session.removeAttribute("Expert_headPortrait");
    	 return;
    }
    
    ArrayList<EvaluationExpert> evaluationExpertList = evaluationExpertSD.evaexpertFind(evaluationExpert);
 //   if(userList.size()==0){
//    	 response.sendRedirect("login.html);
//    	request.getRequestDispatcher("login.html")
//    	.forward(request, response);
    	 //通过转发，可以回到主页，且可以将数据传过去，
    	 //但是地址栏的地址不会变，且在主页的所有涉及到地址的渲染都要变成绝对地址，主页中中的js代码用不了，
   // 	return;
  //  }
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    //若没记录即没登录成功，则将空结果返回前端
    if(evaluationExpertList.size()==0){
    	JSONArray userListMsg = JSONArray.fromObject(evaluationExpertList);
        out.print(userListMsg);
        return;
    }
    HttpSession session = request.getSession();
    session.setAttribute("Expert_jobNumber",evaluationExpertList.get(0).getExpert_jobNumber());
    session.setAttribute("Expert_name",evaluationExpertList.get(0).getExpert_name());
    session.setAttribute("Expert_headPortrait",evaluationExpertList.get(0).getExpert_headPortrait());
    String jobNumber = (String) request.getSession().getAttribute("Expert_name");

    System.out.println("zhuanjiagonghao"+jobNumber);
    JSONArray evaluationExpertListMsg = JSONArray.fromObject(evaluationExpertList);
    out.print(evaluationExpertListMsg);

    return;
    //通过重定向，回到主页，并将用户头像和用户名的数据传回主页
    //response.sendRedirect("homePage/homePage.jsp?headPortraitMsg="+headProtrait+"&userName="+userName);
   
   /* 通过转发器转发
    * request.setAttribute("headPortraitMsg",headProtrait);传数据过去
    request.setAttribute("userName",userName);
    System.out.println(headProtrait);
    request.getRequestDispatcher("homePage/homePage.jsp")
	.forward(request, response);*/

    
//    //执行查询，返回结果
//    JSONArray userMsg = JSONArray.fromObject(user);
//    out.print(userMsg);
  }
}


