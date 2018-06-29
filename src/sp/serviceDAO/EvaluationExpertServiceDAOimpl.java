package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.EvaluationExpertDAOimpl;
import sp.pojo.EvaluationExpert;
import sp.util.DButil;

public class EvaluationExpertServiceDAOimpl {
	/*查询业务*/
	 public ArrayList<EvaluationExpert> evaexpertFind(EvaluationExpert evaexpert){
	    Connection conn = DButil.getConnection();
	    EvaluationExpertDAOimpl evaexpertD = new EvaluationExpertDAOimpl(conn);
	    try{
	      ArrayList<EvaluationExpert> EvaluationExpertList = new ArrayList<EvaluationExpert>();
	      EvaluationExpertList = evaexpertD.EvaexpertSelect(evaexpert);
	      conn.commit();//提交业务
	      return EvaluationExpertList;
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
	 public boolean evaexpertAdd(EvaluationExpert evaexpert){
		Connection conn = DButil.getConnection();
		 EvaluationExpertDAOimpl evaexpertD = new EvaluationExpertDAOimpl(conn);
	    try{
	    	evaexpertD.EvaexpertInsert(evaexpert);
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
	 public boolean evaexpertSave(EvaluationExpert evaexpert){
		Connection conn = DButil.getConnection();
		 EvaluationExpertDAOimpl evaexpertD = new EvaluationExpertDAOimpl(conn);
	    try{
	    	evaexpertD.EvaexpertUpdate(evaexpert);
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
	 public boolean evaexpertDel(EvaluationExpert evaexpert){
		Connection conn = DButil.getConnection();
		 EvaluationExpertDAOimpl evaexpertD = new EvaluationExpertDAOimpl(conn);
	    try{
	    	evaexpertD.EvaexpertDelete(evaexpert);
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
