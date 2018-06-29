package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.ProductDAOimpl;
import sp.pojo.Product;
import sp.util.DButil;

public class ProductServiceDAOimpl implements ProductServiceDAO{
	/*查询业务*/
	 public ArrayList<Product> productFind(Product product){
	    Connection conn = DButil.getConnection();
	    ProductDAOimpl productD = new ProductDAOimpl(conn);
	    try{
	      ArrayList<Product> ProductList = new ArrayList<Product>();
	      ProductList = productD.ProductSelect(product);
	      conn.commit();//提交业务
	      return ProductList;
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
	 public boolean productAdd(Product product){
		Connection conn = DButil.getConnection();
		ProductDAOimpl productD = new ProductDAOimpl(conn);
	    try{
	    	productD.ProductInsert(product);
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
	 public boolean productSave(Product product){
		Connection conn = DButil.getConnection();
		ProductDAOimpl productD = new ProductDAOimpl(conn);
	    try{
	    	productD.ProductDelete(product);
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
	 public boolean productDel(Product product){
		Connection conn = DButil.getConnection();
		ProductDAOimpl productD = new ProductDAOimpl(conn);
	    try{
	    	productD.ProductDelete(product);
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
