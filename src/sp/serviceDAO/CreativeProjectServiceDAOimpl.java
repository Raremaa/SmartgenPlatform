package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.BuyDAOimpl;
import sp.DAO.CreativeProjectDAOimpl;
import sp.pojo.Buy;
import sp.pojo.CreativeProject;
import sp.util.DButil;

public class CreativeProjectServiceDAOimpl implements CreativeProjectServiceDAO{
	/*查询业务*/
	public ArrayList<CreativeProject> creprojectFind(CreativeProject creproject){
	    Connection conn = DButil.getConnection();
	    CreativeProjectDAOimpl creprojectD = new CreativeProjectDAOimpl(conn);
	    try{
	      ArrayList<CreativeProject> CreativeProjectList = new ArrayList<CreativeProject>();
	      CreativeProjectList = creprojectD.CreprojectSelect(creproject);
	      conn.commit();//提交业务
	      return CreativeProjectList;
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
	 public boolean creprojectAdd(CreativeProject creproject){
		Connection conn = DButil.getConnection();
		CreativeProjectDAOimpl creprojectD = new CreativeProjectDAOimpl(conn);
	    try{
	    	creprojectD.CreprojectInsert(creproject);
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
	 public boolean creprojectSave(CreativeProject creproject){
		Connection conn = DButil.getConnection();
		CreativeProjectDAOimpl creprojectD = new CreativeProjectDAOimpl(conn);
	    try{
	    	creprojectD.CreprojectUpdate(creproject);
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
	 public boolean creprojectDel(CreativeProject creproject){
		Connection conn = DButil.getConnection();
		CreativeProjectDAOimpl creprojectD = new CreativeProjectDAOimpl(conn);
	    try{
	    creprojectD.CreprojectDelete(creproject);
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
