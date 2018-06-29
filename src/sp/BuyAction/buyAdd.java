package sp.BuyAction;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import sp.pojo.Buy;
import sp.serviceDAO.BuyServiceDAOimpl;
import net.sf.json.JSONArray;

public class buyAdd extends HttpServlet {

	 private static final long serialVersionUID = 1L;
	private static final String Intrger = null;
	  BuyServiceDAOimpl buySD = new BuyServiceDAOimpl();
	  Buy buy = new Buy();
	
	  public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Product_id = null;
		String Buy_paymentTime =null;
		String Buy_pattern = null;
		String Buy_state =null;
		String Buy_count =null;
		    
		    request.setCharacterEncoding("utf-8");
		    Product_id = request.getParameter("Product_id");
		    Buy_paymentTime = request.getParameter("Buy_paymentTime");
		    Buy_pattern = request.getParameter("Buy_pattern");
		    Buy_state = request.getParameter("Buy_state");
		    Buy_count = request.getParameter("Buy_count");
		    
		    buy.setProduct_id(Integer.parseInt(Product_id));
		    buy.setBuy_paymentTime(Buy_paymentTime);
		    buy.setBuy_pattern( Buy_pattern);
		    buy.setBuy_state(Integer.parseInt(Buy_state));
		   
		    response.setContentType("text/html;charset=utf-8");
		    PrintWriter out = response.getWriter();
		    ArrayList<Buy> BuyList = buySD.buyFind(buy);
		    JSONArray buyMsg = JSONArray.fromObject(BuyList);
		    out.print(buyMsg);
		  }

}
