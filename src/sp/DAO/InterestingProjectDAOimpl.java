package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.InterestingProject;

public class InterestingProjectDAOimpl implements InterestingProjectDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public InterestingProjectDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<InterestingProject> InprojectSelect(InterestingProject inproject) throws SQLException {
	    String sql = "select * from InterestingProject where 1=1 ";
	    String condition = inproject.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<InterestingProject> InterestingProjectList = new ArrayList<InterestingProject>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  InterestingProject inprojectTmp = new InterestingProject();
	    	  inprojectTmp.setInproject_id(rs.getInt("Inproject_id"));
	    	  inprojectTmp.setInproject_abstract(rs.getString("Inproject_abstract"));
	    	  inprojectTmp.setInproject_title(rs.getString("Inproject_title"));
	    	  inprojectTmp.setInproject_classify(rs.getInt("Inproject_classify"));
	    	  inprojectTmp.setInproject_label(rs.getString("Inproject_label"));
	    	  inprojectTmp.setInproject_picture(rs.getString("Inproject_picture"));
	    	  inprojectTmp.setInproject_video(rs.getString(" Inproject_video"));
	    	  inprojectTmp.setInproject_state(rs.getInt("Inproject_state"));
	    	  inprojectTmp.setInproject_praise(rs.getInt("Inproject_praise"));
	    	  inprojectTmp.setInproject_needPerson(rs.getInt("Inproject_needPerson"));
	    	  inprojectTmp.setInproject_modifyTime(rs.getString("Inproject_modifyTime"));
	    	  inprojectTmp.setInproject_releaseTime(rs.getString("Inproject_releaseTime"));
	          InterestingProjectList.add(inprojectTmp);
	          rs.next();
	      }
	    }
	    return  InterestingProjectList;
	  }

	  //插入记录
	  public boolean InprojectInsert(InterestingProject inproject) throws SQLException{
	    try{
	      String sql = "insert into InterestingProject(User_id, Inproject_abstract,Inproject_title," +
	      		"Inproject_classify, Inproject_label,Inproject_picture,Inproject_video, Inproject_state," +
	      		"Inproject_praise,Inproject_needPerson,Inproject_modifyTime,Inproject_releaseTime) values(?,?,?,?,?,?,?,?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inproject.getUser_id());
	      pst.setString(2, inproject.getInproject_abstract());
	      pst.setString(3, inproject.getInproject_title());
	      pst.setInt(4,inproject.getInproject_classify());
	      pst.setString(5, inproject.getInproject_label());
	      pst.setString(6, inproject.getInproject_picture());
	      pst.setString(7, inproject.getInproject_video());
	      pst.setInt(8, inproject.getInproject_state());
	      pst.setInt(9, inproject.getInproject_praise());
	      pst.setInt(10, inproject.getInproject_needPerson());
	      pst.setString(11, inproject.getInproject_modifyTime());
	      pst.setString(12, inproject.getInproject_releaseTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean InprojectUpdate(InterestingProject inproject) throws SQLException{
	    try{
	      String sql = "update InterestingProject set Inproject_id=?, Inproject_abstract=?,Inproject_title=?," +
	      		"Inproject_classify=?, Inproject_label=?,Inproject_picture=?,Inproject_video=?, Inproject_state=?," +
	      		"Inproject_praise=?,Inproject_needPerson=?,Inproject_modifyTime=?,Inproject_releaseTime=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inproject.getInproject_id());
	      pst.setString(2, inproject.getInproject_abstract());
	      pst.setString(3, inproject.getInproject_title());
	      pst.setInt(4,inproject.getInproject_classify());
	      pst.setString(5, inproject.getInproject_label());
	      pst.setString(6, inproject.getInproject_picture());
	      pst.setString(7, inproject.getInproject_video());
	      pst.setInt(8, inproject.getInproject_state());
	      pst.setInt(9, inproject.getInproject_praise());
	      pst.setInt(10, inproject.getInproject_needPerson());
	      pst.setString(11, inproject.getInproject_modifyTime());
	      pst.setString(12, inproject.getInproject_releaseTime());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean InprojectDelete(InterestingProject inproject) throws SQLException{
	    try{
	      String sql = "delete from InterestingProject where Inproject_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, inproject.getInproject_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
