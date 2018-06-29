package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.ResponseDAOimpl;
import sp.pojo.Response;
import sp.util.DButil;

public class ResponseServiceDAOimpl implements ResponseServiceDAO{
	/*查询业务*/
	public ArrayList<Response> responseFind(Response response){
	    Connection conn = DButil.getConnection();
	    ResponseDAOimpl responseD = new ResponseDAOimpl(conn);
	    try{
	      ArrayList<Response> ResponseList = new ArrayList<Response>();
	      ResponseList = responseD.ResponseSelect(response);
	      conn.commit();//提交业务
	      return ResponseList;
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
	 public boolean responseAdd(Response response){
		Connection conn = DButil.getConnection();
		ResponseDAOimpl responseD = new ResponseDAOimpl(conn);
	    try{
	    	responseD.ResponseInsert(response);
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
	 public boolean responseSave(Response response){
		Connection conn = DButil.getConnection();
		ResponseDAOimpl responseD = new ResponseDAOimpl(conn);
	    try{
	    	responseD.ResponseDelete(response);
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
	 public boolean responseDel(Response response){
		Connection conn = DButil.getConnection();
		ResponseDAOimpl responseD = new ResponseDAOimpl(conn);
	    try{
	      responseD.ResponseDelete(response);
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
