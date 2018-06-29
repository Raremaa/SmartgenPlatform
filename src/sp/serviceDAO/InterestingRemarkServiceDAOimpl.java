package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import sp.DAO.InterestingRemarkDAOimpl;
import sp.pojo.InterestingRemark;
import sp.util.DButil;

public class InterestingRemarkServiceDAOimpl implements InterestingRemarkServiceDAO{
	/*查询业务*/
	 public ArrayList<InterestingRemark> inremarkFind(InterestingRemark inremark){
	    Connection conn = DButil.getConnection();
	    InterestingRemarkDAOimpl inremarkD = new InterestingRemarkDAOimpl(conn);
	    try{
	      ArrayList<InterestingRemark> InterestingRemarkList = new ArrayList<InterestingRemark>();
	      InterestingRemarkList = inremarkD.InremarkSelect(inremark);
	      conn.commit();//提交业务
	      return InterestingRemarkList;
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
	 public boolean inremarkAdd(InterestingRemark inremark){
		Connection conn = DButil.getConnection();
		 InterestingRemarkDAOimpl inremarkD = new InterestingRemarkDAOimpl(conn);
	    try{
	    	inremarkD.InremarkInsert(inremark);
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
	 public boolean inremarkSave(InterestingRemark inremark){
		Connection conn = DButil.getConnection();
		 InterestingRemarkDAOimpl inremarkD = new InterestingRemarkDAOimpl(conn);
	    try{
	    	inremarkD.InremarkDelete(inremark);
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
	 public boolean inremarkDel(InterestingRemark inremark){
		Connection conn = DButil.getConnection();
		 InterestingRemarkDAOimpl inremarkD = new InterestingRemarkDAOimpl(conn);
	    try{
	    	inremarkD.InremarkDelete(inremark);
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
