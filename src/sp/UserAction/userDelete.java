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
import sp.serviceDAO.UserServiceDAO;
import sp.serviceDAO.UserServiceDAOimpl;


public class userDelete extends HttpServlet {

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
		    String User_id= request.getParameter("user_id");
		    user.setUser_id(Integer.parseInt(User_id));
		    userSD.userDel(user);

		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<User> UserList = userSD.userFind(user);
		    JSONArray userMsg = JSONArray.fromObject(UserList);
		    out.print(userMsg);
	}

}
