package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.CreativeRemarkDAOimpl;
import sp.pojo.CreativeRemark;
import sp.util.DButil;

public class CreativeRemarkServiceDAOimpl implements CreativeRemarkServiceDAO{
	/*查询业务*/
	 public ArrayList<CreativeRemark> creremarkFind(CreativeRemark creremark){
	    Connection conn = DButil.getConnection();
	    CreativeRemarkDAOimpl creremarkD = new CreativeRemarkDAOimpl(conn);
	    try{
	      ArrayList<CreativeRemark> CreativeRemarkList = new ArrayList<CreativeRemark>();
	      CreativeRemarkList = creremarkD.CreremarkSelect(creremark);
	      conn.commit();//提交业务
	      return CreativeRemarkList;
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
	 public boolean creremarkAdd(CreativeRemark creremark){
		Connection conn = DButil.getConnection();
		CreativeRemarkDAOimpl creremarkD = new CreativeRemarkDAOimpl(conn);
	    try{
	    	creremarkD.CreremarkInsert(creremark);
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
	 public boolean creremarkSave(CreativeRemark creremark){
		Connection conn = DButil.getConnection();
		CreativeRemarkDAOimpl creremarkD = new CreativeRemarkDAOimpl(conn);
	    try{
	    	creremarkD.CreremarkUpdate(creremark);
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
	 public boolean creremarkDel(CreativeRemark creremark){
		Connection conn = DButil.getConnection();
		CreativeRemarkDAOimpl creremarkD = new CreativeRemarkDAOimpl(conn);
	    try{
	    	creremarkD.CreremarkDelete(creremark);
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
