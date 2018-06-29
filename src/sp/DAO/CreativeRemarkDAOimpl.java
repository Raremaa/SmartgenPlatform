package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeRemark;
import sp.pojo.User;

public class CreativeRemarkDAOimpl implements CreativeRemarkDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public CreativeRemarkDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<CreativeRemark> CreremarkSelect(CreativeRemark creremark)  throws SQLException{
	    String sql = "select * from CreremarkSelect where 1=1 ";
	    String condition = creremark.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<CreativeRemark> CreativeRemarkList = new ArrayList<CreativeRemark>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  CreativeRemark creremarkTmp = new CreativeRemark();
	    	  creremarkTmp.setUser_id(rs.getInt("User_id"));
	    	  creremarkTmp.setCreproject_id(rs.getInt("Creproject_id"));
	    	  creremarkTmp.setCreremark_content(rs.getString("Creremark_content"));
	    	  creremarkTmp.setCreremark_praise(rs.getInt("Creremark_praise"));
	    	  creremarkTmp.setCreremark_commentTime(rs.getString("Creremark_commentTime"));
	    	  CreativeRemarkList.add(creremarkTmp);
	          rs.next();
	      }
	    }
	    return CreativeRemarkList;
	  }

	  //插入记录
	  public boolean CreremarkInsert(CreativeRemark creremark) throws SQLException {
	    try{
	      String sql = "insert into CreativeRemark(User_id,Creproject_id,Creremark_content,Creremark_praise," +
	      		"Creremark_commentTime) values(?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, creremark.getUser_id());
	      pst.setInt(2, creremark.getCreproject_id());
	      pst.setString(3, creremark.getCreremark_content());
	      pst.setInt(4, creremark.getCreremark_praise());
	      pst.setString(5, creremark.getCreremark_commentTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean CreremarkUpdate(CreativeRemark creremark) throws SQLException {
	    try{
	      String sql = "update CreativeRemark set User_id=?,Creproject_id=?,Creremark_content=?,Creremark_praise=?,Creremark_commentTime=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, creremark.getUser_id());
	      pst.setInt(2, creremark.getCreproject_id());
	      pst.setString(3, creremark.getCreremark_content());
	      pst.setInt(4, creremark.getCreremark_praise());
	      pst.setString(5, creremark.getCreremark_commentTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean CreremarkDelete(CreativeRemark creremark) throws SQLException {
	    try{
	      String sql = "delete from CreativeRemark where User_id=? and Creproject_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, creremark.getUser_id());
	      pst.setInt(2, creremark.getCreproject_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
