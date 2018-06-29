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
import sp.serviceDAO.CompanyServiceDAOimpl;

public class companyGet extends HttpServlet {

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
		    //查询条件
		    String condition1 = request.getParameter("condition1");
		    String condition2 = request.getParameter("condition2");
		    String condition3 = request.getParameter("condition3");
		    System.out.println(condition1);
		    System.out.println(condition2);
		    System.out.println(condition3);
		    if (condition2 != "" && condition2.length() > 0 && condition3 != ""){
		    	 System.out.println(1);
		    	company.setCondition(condition1+" like '%"+condition2+"%' and Company_identity = "+condition3);
		    }else{
		    	if(condition2 != "" && condition2.length() > 0 && condition3 == ""){
		    		 System.out.println(2);
		    		company.setCondition(condition1+" like '%"+condition2+"%'");
		    	}else{
		    		if((condition2 == "" || condition2.length() == 0) && (condition3 != "")){
		    			 System.out.println(3);
		    			company.setCondition("Company_identity = "+condition3);
		    		}else{
		    			 System.out.println(4);
		    			company.setCondition("");
		    		}
		    	}
		    }
		    companySD.companyFind(company);
		    //执行查询，返回结果
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<Company> CompanyList = companySD.companyFind(company);
		    System.out.println(5);
		    JSONArray companyMsg = JSONArray.fromObject(CompanyList);
		    out.print(companyMsg);
	}

}
