package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.PresellDAOimpl;
import sp.pojo.Presell;
import sp.util.DButil;

public class PresellServiceDAOimpl implements PresellServiceDAO{
	/*查询业务*/
	 public ArrayList<Presell> presellFind(Presell presell){
	    Connection conn = DButil.getConnection();
	    PresellDAOimpl presellD = new PresellDAOimpl(conn);
	    try{
	      ArrayList<Presell> PresellList = new ArrayList<Presell>();
	      PresellList = presellD.PresellSelect(presell);
	      conn.commit();//提交业务
	      return PresellList;
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
	 public boolean presellAdd(Presell presell){
		Connection conn = DButil.getConnection();
		 PresellDAOimpl presellD = new PresellDAOimpl(conn);
	    try{
	    	presellD.PresellInsert(presell);
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
	 public boolean presellSave(Presell presell){
		Connection conn = DButil.getConnection();
		 PresellDAOimpl presellD = new PresellDAOimpl(conn);
	    try{
	    	presellD.PresellDelete(presell);
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
	 public boolean presellDel(Presell presell){
		Connection conn = DButil.getConnection();
		 PresellDAOimpl presellD = new PresellDAOimpl(conn);
	    try{
	    	presellD.PresellDelete(presell);
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
