package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;
import sp.pojo.Production;

public class ProductionDAOimpl implements ProductionDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public ProductionDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<Production> ProductionSelect(Production production) throws SQLException {
	    String sql = "select * from Production where 1=1 ";
	    String condition = production.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<Production> ProductionList = new ArrayList<Production>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  Production productionTmp = new Production();
	    	  productionTmp.setProduct_id(rs.getInt("Product_id"));
	    	  productionTmp.setCompany_id(rs.getInt("Company_id"));
	    	  productionTmp.setProduction_count(rs.getInt("Production_count"));       
	    	  ProductionList.add(productionTmp);
	          rs.next();
	      }
	    }
	    return ProductionList;
	  }

	  //插入记录
	  public boolean ProductionInsert(Production production) throws SQLException {
	    try{
	      String sql = "insert into Production(Product_id,Company_id,Production_count) values(?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, production.getProduct_id());
	      pst.setInt(2, production.getCompany_id());
	      pst.setInt(3, production.getProduction_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean ProductionUpdate(Production production) throws SQLException {
	    try{
	      String sql = "update Production set Product_id=?,Company_id=?,Production_count=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, production.getProduct_id());
	      pst.setInt(2, production.getCompany_id());
	      pst.setInt(3, production.getProduction_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean ProductionDelete(Production production) throws SQLException{
	    try{
	      String sql = "delete from Production where Product_id=? and Company_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, production.getProduct_id());
	      pst.setInt(2, production.getCompany_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
}
