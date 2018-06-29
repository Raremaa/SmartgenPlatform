package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.ProductionDAOimpl;
import sp.pojo.Production;
import sp.util.DButil;

public class ProductionServiceDAOimpl implements ProductionServiceDAO{
	/*查询业务*/
	 public ArrayList<Production> productionFind(Production production){
	    Connection conn = DButil.getConnection();
	    ProductionDAOimpl productionD = new ProductionDAOimpl(conn);
	    try{
	      ArrayList<Production> ProductionList = new ArrayList<Production>();
	      ProductionList = productionD.ProductionSelect(production);
	      conn.commit();//提交业务
	      return ProductionList;
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
	 public boolean productionAdd(Production production){
		Connection conn = DButil.getConnection();
	    ProductionDAOimpl productionD = new ProductionDAOimpl(conn);
	    try{
	    	productionD.ProductionInsert(production);
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
	 public boolean productionSave(Production production){
		Connection conn = DButil.getConnection();
		 ProductionDAOimpl productionD = new ProductionDAOimpl(conn);
	    try{
	    	productionD.ProductionDelete(production);
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
	 public boolean productionDel(Production production){
		Connection conn = DButil.getConnection();
		 ProductionDAOimpl productionD = new ProductionDAOimpl(conn);
	    try{
	    	productionD.ProductionDelete(production);
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
