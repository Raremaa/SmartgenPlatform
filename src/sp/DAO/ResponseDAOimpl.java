package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;
import sp.pojo.Response;

public class ResponseDAOimpl implements ResponseDAO{
      private Connection conn= null;
      private PreparedStatement pst = null;
      /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public ResponseDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	//查询记录
	  public ArrayList<Response> ResponseSelect(Response response) throws SQLException{
	    String sql = "select * from Response where 1=1 ";
	    String condition = response.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<Response> ResponseList = new ArrayList<Response>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  Response responseTmp = new Response();
	    	  responseTmp.setInproject_id(rs.getInt("Inproject_id"));
	    	  responseTmp.setUser_id(rs.getInt("User_id"));     
	    	  ResponseList.add(responseTmp);
	          rs.next();
	      }
	    }
	    return ResponseList;
	  }

	  //插入记录
	  public boolean ResponseInsert(Response response) throws SQLException {
	    try{
	      String sql = "insert into Response(Inproject_id,User_id) values(?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, response.getInproject_id());
	      pst.setInt(2, response.getUser_id());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean ResponseUpdate(Response response) throws SQLException {
	    try{
	      String sql = "update Response set Inproject_id=?,User_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, response.getInproject_id());
	      pst.setInt(2, response.getUser_id());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean ResponseDelete(Response response) throws SQLException {
	    try{
	      String sql = "delete from Response where Inproject_id=? and User_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, response.getInproject_id());
	      pst.setInt(2, response.getUser_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
