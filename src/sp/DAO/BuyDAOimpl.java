package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;

public class BuyDAOimpl implements BuyDAO{
	 private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public BuyDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<Buy> BuySelect(Buy buy) throws SQLException {
	    String sql = "select * from Buy where 1=1 ";
	    String condition = buy.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<Buy> BuyList = new ArrayList<Buy>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  Buy buyTmp = new Buy();
	    	  buyTmp.setUser_id(rs.getInt("User_id"));
	    	  buyTmp.setProduct_id(rs.getInt("Product_id"));
	    	  buyTmp.setBuy_paymentTime(rs.getString("Buy_paymentTime"));
	    	  buyTmp.setBuy_pattern(rs.getString("Buy_pattern"));
	    	  buyTmp.setBuy_state(rs.getInt("Buy_state"));
	    	  buyTmp.setBuy_count(rs.getInt("Buy_count"));        
	    	  BuyList.add(buyTmp);
	          rs.next();
	      }
	    }
	    return BuyList;
	  }

	  //插入记录
	  public boolean BuyInsert(Buy buy) throws SQLException {
	    try{
	      String sql = "insert into Buy( User_id,Product_id,Buy_paymentTime,Buy_pattern,Buy_state,Buy_count) values(?,?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, buy.getUser_id());
	      pst.setInt(2, buy.getProduct_id());
	      pst.setString(3, buy.getBuy_paymentTime());
	      pst.setString(4, buy.getBuy_pattern());
	      pst.setInt(5, buy.getBuy_state());
	      pst.setInt(6, buy.getBuy_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean BuyUpdate(Buy buy) throws SQLException {
	    try{
	      String sql = "update Buy set User_id=?,Product_id=?,Buy_paymentTime=?,Buy_pattern=?,Buy_state=?,Buy_count=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, buy.getUser_id());
	      pst.setInt(2, buy.getProduct_id());
	      pst.setString(3, buy.getBuy_paymentTime());
	      pst.setString(4, buy.getBuy_pattern());
	      pst.setInt(5, buy.getBuy_state());
	      pst.setInt(6, buy.getBuy_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean BuyDelete(Buy buy) throws SQLException {
	    try{
	      String sql = "delete from Buy where User_id=? and Product_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, buy.getUser_id());
	      pst.setInt(2, buy.getProduct_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
