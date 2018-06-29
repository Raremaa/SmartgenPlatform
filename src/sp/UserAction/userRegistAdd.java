package sp.UserAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONArray;

import sp.pojo.User;
import sp.serviceDAO.UserServiceDAOimpl;

public class userRegistAdd extends HttpServlet {

	private static final long serialVersionUID = 1L;
	UserServiceDAOimpl userSD = new UserServiceDAOimpl();
	User user = new User();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("我进来了");

		String User_name = null;
		String User_phone = null;
		String User_password = null;
		int User_sex;
		String User_headPortrait = null;
		String User_IDNumber = null;
		String User_locationProvince = null;
		String User_locationCity = null;
		String User_location = null;
		int User_identity=0;
		String User_realName = null;
		request.setCharacterEncoding("utf-8");
		User_name = request.getParameter("User_name");
		User_phone = request.getParameter("User_phone");
		User_password = request.getParameter("User_password");
		User_sex = Integer.parseInt(request.getParameter("User_sex"));
		User_locationProvince = request.getParameter("User_locationProvince");
		User_locationCity = request.getParameter("User_locationCity");
		User_location = User_locationProvince + "-" + User_locationCity;
		System.out.println(User_name);
		System.out.println(User_phone);
		System.out.println(User_password);
		System.out.println(User_sex);
		System.out.println(User_locationProvince);
		System.out.println(User_locationCity);
		System.out.println(User_location);
		user.setUser_name(User_name);
		user.setUser_phone(User_phone);
		user.setUser_password(User_password);
		user.setUser_sex(User_sex);
		user.setUser_location(User_location);
		user.setUser_headPortrait(User_headPortrait);
		user.setUser_IDNumber(User_IDNumber);
		user.setUser_identity(User_identity);
		user.setUser_realName(User_realName);
		
		/*if (!userSD.userAdd(user)) {
			response.sendRedirect("regist.html");//进行重定向
		}else{
			response.sendRedirect("login.html");
		}*/
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		boolean flag= userSD.userAdd(user);
		String datas = "{\"flag\":\""+flag+"\"}";
	    out.print(datas);

	}

}
