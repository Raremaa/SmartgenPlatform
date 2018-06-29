package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;
import sp.pojo.InterestingRemark;

public class InterestingRemarkDAOimpl implements InterestingRemarkDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public InterestingRemarkDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<InterestingRemark> InremarkSelect(InterestingRemark inremark) throws SQLException{
	    String sql = "select * from Buy where 1=1 ";
	    String condition = inremark.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<InterestingRemark> InterestingRemarkList = new ArrayList<InterestingRemark>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  InterestingRemark inremarkTmp = new InterestingRemark();
	    	  inremarkTmp.setUser_id(rs.getInt("User_id"));
	    	  inremarkTmp.setInproject_id(rs.getInt("Inproject_id"));
	    	  inremarkTmp.setInremark_content(rs.getString("Inremark_content"));
	    	  inremarkTmp.setInremark_praise(rs.getInt("Inremark_praise"));
	    	  inremarkTmp.setInremark_commentTime(rs.getString("Inremark_commentTime"));       
	    	  InterestingRemarkList.add( inremarkTmp);
	          rs.next();
	      }
	    }
	    return InterestingRemarkList;
	  }

	  //插入记录
	  public boolean InremarkInsert(InterestingRemark inremark) throws SQLException {
	    try{
	      String sql = "insert into InterestingRemark (User_id,Inproject_id,Inremark_content,Inremark_praise,Inremark_commentTime) values(?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inremark.getUser_id());
	      pst.setInt(2, inremark.getInproject_id());
	      pst.setString(3, inremark.getInremark_content());
	      pst.setInt(4, inremark.getInremark_praise());
	      pst.setString(5, inremark.getInremark_commentTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean InremarkUpdate(InterestingRemark inremark) throws SQLException {
	    try{
	      String sql = "update InterestingRemark set User_id=?,Inproject_id=?,Inremark_content=?,Inremark_praise=?,Inremark_commentTime=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inremark.getUser_id());
	      pst.setInt(2, inremark.getInproject_id());
	      pst.setString(3, inremark.getInremark_content());
	      pst.setInt(4, inremark.getInremark_praise());
	      pst.setString(5, inremark.getInremark_commentTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean InremarkDelete(InterestingRemark inremark) throws SQLException {
	    try{
	      String sql = "delete from InterestingRemark where User_id=? and Inproject_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inremark.getUser_id());
	      pst.setInt(2, inremark.getInproject_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
