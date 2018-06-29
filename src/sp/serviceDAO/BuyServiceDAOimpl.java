package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.BuyDAOimpl;
import sp.pojo.Buy;
import sp.util.DButil;

public class BuyServiceDAOimpl implements BuyServiceDAO{
	/*查询业务*/
	public ArrayList<Buy> buyFind(Buy buy){
	    Connection conn = DButil.getConnection();
	    BuyDAOimpl buyD = new BuyDAOimpl(conn);
	    try{
	      ArrayList<Buy> BuyList = new ArrayList<Buy>();
	      BuyList = buyD.BuySelect(buy);
	      conn.commit();//提交业务
	      return BuyList;
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
	 public boolean buyAdd(Buy buy){
		Connection conn = DButil.getConnection();
		BuyDAOimpl buyD = new BuyDAOimpl(conn);
	    try{
	      buyD.BuyInsert(buy);
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
	 public boolean buySave(Buy buy){
		Connection conn = DButil.getConnection();
		BuyDAOimpl buyD = new BuyDAOimpl(conn);
	    try{
	      buyD.BuyUpdate(buy);
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
	 public boolean buyDel(Buy buy){
		Connection conn = DButil.getConnection();
		BuyDAOimpl buyD = new BuyDAOimpl(conn);
	    try{
	      buyD.BuyDelete(buy);
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
