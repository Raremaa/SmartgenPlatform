package sp.UserAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import sp.pojo.User;
import sp.serviceDAO.UserServiceDAOimpl;

public class userGet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	  UserServiceDAOimpl userSD = new UserServiceDAOimpl();
	  User user = new User();
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 request.setCharacterEncoding("utf-8");
		    //查询条件
		    String condition1 = request.getParameter("condition1");
		    String condition2 = request.getParameter("condition2");
		    String condition3 = request.getParameter("condition3");
		    if (condition2 != "" && condition2.length() > 0 && condition3 != ""){
		    	user.setCondition(condition1+" like '%"+condition2+"%' and user_identity = "+condition3);
		    }else{
		    	if(condition2 != "" && condition2.length() > 0 && condition3 == ""){
			    	user.setCondition(condition1+" like '%"+condition2+"%'");
		    	}else{
		    		if((condition2 == "" || condition2.length() == 0) && (condition3 != "")){
				    	user.setCondition("user_identity = "+condition3);
		    		}else{
				    	user.setCondition("");
		    		}
		    	}
		    }
		    //执行查询，返回结果
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<User> UserList = userSD.userFind(user);
		    JSONArray userMsg = JSONArray.fromObject(UserList);
		    out.print(userMsg); 
	}

}
