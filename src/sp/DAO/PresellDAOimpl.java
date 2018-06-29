package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;
import sp.pojo.Presell;

public class PresellDAOimpl implements PresellDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public PresellDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<Presell> PresellSelect(Presell presell) throws SQLException {
	    String sql = "select * from Presell where 1=1 ";
	    String condition = presell.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<Presell> PresellList = new ArrayList<Presell>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  Presell presellTmp = new Presell();
	    	  presellTmp.setUser_id(rs.getInt("User_id"));
	    	  presellTmp.setProduct_id(rs.getInt("Product_id"));
	    	  presellTmp.setPresell_paymentTime(rs.getString("Presell_paymentTime"));
	    	  presellTmp.setPresell_pattern(rs.getString("Presell_pattern"));
	    	  presellTmp.setPresell_state(rs.getInt("Presell_state"));
	    	  presellTmp.setPresell_count(rs.getInt("Presell_count"));        
	    	  PresellList.add(presellTmp);
	          rs.next();
	      }
	    }
	    return PresellList;
	  }

	  //插入记录
	  public boolean PresellInsert(Presell presell) throws SQLException {
	    try{
	      String sql = "insert into Presell( User_id,Product_id,Presell_paymentTime,Presell_pattern,Presell_state,Presell_count) values(?,?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, presell.getUser_id());
	      pst.setInt(2, presell.getProduct_id());
	      pst.setString(3, presell.getPresell_paymentTime());
	      pst.setString(4, presell.getPresell_pattern());
	      pst.setInt(5, presell.getPresell_state());
	      pst.setInt(6, presell.getPresell_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean PresellUpdate(Presell presell) throws SQLException {
	    try{
	      String sql = "update Presell set User_id=?,Product_id=?,Presell_paymentTime=?,Presell_pattern=?,Presell_state=?,Presell_count=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, presell.getUser_id());
	      pst.setInt(2, presell.getProduct_id());
	      pst.setString(3, presell.getPresell_paymentTime());
	      pst.setString(4, presell.getPresell_pattern());
	      pst.setInt(5, presell.getPresell_state());
	      pst.setInt(6, presell.getPresell_count());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean PresellDelete(Presell presell) throws SQLException {
	    try{
	      String sql = "delete from Presell where User_id=? and Product_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, presell.getUser_id());
	      pst.setInt(2, presell.getProduct_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
}
