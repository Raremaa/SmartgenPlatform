package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.CompanyDAOimpl;
import sp.pojo.Company;
import sp.util.DButil;

public class CompanyServiceDAOimpl implements CompanyServiceDAO{
	/*查询业务*/
	public ArrayList<Company> companyFind(Company company){
	    Connection conn = DButil.getConnection();
	    CompanyDAOimpl companyD = new CompanyDAOimpl(conn);
	    try{
	      ArrayList<Company> CompanyList = new ArrayList<Company>();
	      System.out.println("12");
	      CompanyList = companyD.CompanySelect(company);
	      System.out.println("长度为123"+CompanyList.size());
	      conn.commit();//提交业务
	      return CompanyList;
	    }catch(Exception e){
	      try {
	        conn.rollback();//回滚业务
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return null;
	    }finally{
	      if(conn != null){
	        DButil.closeConnection(conn);//关闭连接
	      }
	    }
	  }
	  /*添加业务*/
	public boolean companyAdd(Company company){
		Connection conn = DButil.getConnection();
        CompanyDAOimpl companyD = new CompanyDAOimpl(conn);
	    try{
	      companyD.CompanyInsert(company);
	      conn.commit();
	      return true;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
	  /*更新业务*/
	 public boolean companySave(Company company){
		Connection conn = DButil.getConnection();
		CompanyDAOimpl companyD = new CompanyDAOimpl(conn);
	    try{
	      companyD.CompanyUpdate(company);
	      conn.commit();
	      return true;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
	  /*删除业务*/
	 public boolean companyDel(Company company){
		Connection conn = DButil.getConnection();
		CompanyDAOimpl companyD = new CompanyDAOimpl(conn);
	    try{
	      companyD.CompanyDelete(company);
	      conn.commit();
	      return true;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
}
