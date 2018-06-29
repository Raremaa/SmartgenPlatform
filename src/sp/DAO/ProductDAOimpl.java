package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Presell;
import sp.pojo.Product;

public class ProductDAOimpl implements ProductDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public ProductDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<Product> ProductSelect(Product product) throws SQLException{
	    String sql = "select * from Product where 1=1 ";
	    String condition = product.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<Product> ProductList = new ArrayList<Product>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  Product productTmp = new Product();
	    	  productTmp.setProduct_id(rs.getInt("Product_id"));
	    	  productTmp.setCreproject_id(rs.getInt("Creproject_id"));
	    	  productTmp.setCompany_id(rs.getInt("Company_id"));
	    	  productTmp.setProduct_name(rs.getString("Product_name"));
	    	  productTmp.setProduct_price(rs.getDouble("Product_price"));
	    	  productTmp.setProduct_classify(rs.getInt("Product_classify"));        
	    	  productTmp.setProduct_label(rs.getString("Product_label"));
	    	  productTmp.setProduct_picture(rs.getString("Product_picture"));
	    	  ProductList.add(productTmp);
	          rs.next();
	      }
	    }
	    return ProductList;
	  }

	  //插入记录
	  public boolean ProductInsert(Product product) throws SQLException {
	    try{
	      String sql = "insert into Product(Product_id,Creproject_id,Company_id,Product_name,Product_price,Product_classify,Product_label,Product_picture) values(?,?,?,?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, product.getProduct_id());
	      pst.setInt(2, product.getCreproject_id());
	      pst.setInt(3, product.getCompany_id());
	      pst.setString(4, product.getProduct_name());
	      pst.setDouble(5, product.getProduct_price());
	      pst.setInt(6, product.getProduct_classify());
	      pst.setString(7, product.getProduct_label());
	      pst.setString(8, product.getProduct_picture());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean ProductUpdate(Product product) throws SQLException{
	    try{
	      String sql = "update Product set User_id=?,Product_id=?,Presell_paymentTime=?,Presell_pattern=?,Presell_state=?,Presell_count=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, product.getProduct_id());
	      pst.setInt(2, product.getCreproject_id());
	      pst.setInt(3, product.getCompany_id());
	      pst.setString(4, product.getProduct_name());
	      pst.setDouble(5, product.getProduct_price());
	      pst.setInt(6, product.getProduct_classify());
	      pst.setString(7, product.getProduct_label());
	      pst.setString(8, product.getProduct_picture());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean ProductDelete(Product product) throws SQLException {
	    try{
	      String sql = "delete from Product where Product_id=? ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, product.getProduct_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
}
