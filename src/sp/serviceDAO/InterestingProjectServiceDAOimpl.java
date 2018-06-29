package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.InterestingProjectDAOimpl;
import sp.pojo.InterestingProject;
import sp.util.DButil;

public class InterestingProjectServiceDAOimpl implements InterestingProjectServiceDAO{
	/*查询业务*/
	 public ArrayList<InterestingProject> inprojectFind(InterestingProject inproject){
	    Connection conn = DButil.getConnection();
	    InterestingProjectDAOimpl inprojectD = new InterestingProjectDAOimpl(conn);
	    try{
	      ArrayList< InterestingProject>  InterestingProjectList = new ArrayList< InterestingProject>();
	      InterestingProjectList = inprojectD.InprojectSelect(inproject);
	      conn.commit();//提交业务
	      return InterestingProjectList;
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
	 public boolean inprojectAdd(InterestingProject inproject){
		Connection conn = DButil.getConnection();
		 InterestingProjectDAOimpl inprojectD = new InterestingProjectDAOimpl(conn);
	    try{
	    	inprojectD.InprojectInsert(inproject);
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
	 public boolean inprojectSave(InterestingProject inproject){
		Connection conn = DButil.getConnection();
		 InterestingProjectDAOimpl inprojectD = new InterestingProjectDAOimpl(conn);
	    try{
	    inprojectD.InprojectUpdate(inproject);
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
	 public boolean inprojectDel(InterestingProject inproject){
		Connection conn = DButil.getConnection();
		 InterestingProjectDAOimpl inprojectD = new InterestingProjectDAOimpl(conn);
	    try{
	    	inprojectD.InprojectDelete(inproject);
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
