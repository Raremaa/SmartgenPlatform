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

public class userUpdate extends HttpServlet {

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
		String User_id = request.getParameter("user_id");
		String User_name = request.getParameter("user_name");
		String User_phone = request.getParameter("user_phone");
		String User_password = request.getParameter("user_password");
		String User_sex = request.getParameter("user_sex");
		String User_headPortrait = request.getParameter("user_headPortrait");
		String User_IDNumber = request.getParameter("user_IDNumber");
		String User_location = request.getParameter("user_location");
		String User_identity = request.getParameter("user_identity");
		String User_realName = request.getParameter("user_realName");
		
		    user.setUser_id(Integer.parseInt(User_id));
		    user.setUser_name(User_name);
		    user.setUser_phone(User_phone);
		    user.setUser_password (User_password );
		    user.setUser_sex(Integer.parseInt(User_sex));
		    user.setUser_headPortrait(User_headPortrait);
		    user.setUser_IDNumber( User_IDNumber);
		    user.setUser_location(User_location);
		    user.setUser_identity(Integer.parseInt(User_identity));
		    user.setUser_realName(User_realName);
		    userSD.userSave(user);
		   
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<User> UserList = userSD.userFind(user);
		    JSONArray userMsg = JSONArray.fromObject(UserList);
		    out.print(userMsg);
	}

}
