package sp.CompanyAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import sp.pojo.Company;
import sp.pojo.User;
import sp.serviceDAO.CompanyServiceDAOimpl;
import sp.serviceDAO.UserServiceDAO;
import sp.serviceDAO.UserServiceDAOimpl;


public class companyDelete extends HttpServlet {

	private static final long serialVersionUID = 1L;
	CompanyServiceDAOimpl companySD = new CompanyServiceDAOimpl();
	Company company = new Company();
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	     doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	      
		    request.setCharacterEncoding("utf-8");
		    String Company_id= request.getParameter("company_id");
		    company.setCompany_id(Integer.parseInt(Company_id));
		    companySD.companyDel(company);

		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<Company> CompanyList = companySD.companyFind(company);
		    JSONArray companyMsg = JSONArray.fromObject(CompanyList);
		 	out.print(companyMsg);
	}

}
