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
import sp.serviceDAO.UserServiceDAOimpl;

public class companyUpdate extends HttpServlet {

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
		String Company_id = request.getParameter("company_id");
		String Company_name = request.getParameter("company_name");
		String Company_userName = request.getParameter("company_userName");
		String Company_phone = request.getParameter("company_phone");
		String Company_charterNumber = request.getParameter("company_charterNumber");
		String Company_password = request.getParameter("company_password");
		String Company_logo = request.getParameter("company_logo");
		String Company_location = request.getParameter("company_location");
		String Company_identity = request.getParameter("company_identity");
		System.out.println(Company_id);
		System.out.println(Company_name);
		System.out.println(Company_userName);
		System.out.println(Company_phone);
		System.out.println(Company_charterNumber);
		System.out.println(Company_password);
		System.out.println(Company_logo);
		System.out.println(Company_location);
		System.out.println(Company_identity);
			company.setCompany_id(Integer.parseInt(Company_id));
		    company.setCompany_name(Company_name);
			company.setCompany_userName(Company_userName);
			company.setCompany_phone(Company_phone);
			company.setCompany_charterNumber(Company_charterNumber);
			company.setCompany_password(Company_password);
			company.setCompany_logo(Company_logo);
			company.setCompany_location(Company_location);
			company.setCompany_identity(Integer.parseInt(Company_identity));
			companySD.companySave(company);

		   
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<Company> CompanyList = companySD.companyFind(company);
			JSONArray companyMsg = JSONArray.fromObject(CompanyList);
			out.print(companyMsg);
	}

}
