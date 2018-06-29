package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeRemark;
import sp.pojo.EvaluationExpert;

public class EvaluationExpertDAOimpl implements EvaluationExpertDAO{
	private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public EvaluationExpertDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<EvaluationExpert> EvaexpertSelect(EvaluationExpert evaexpert) throws SQLException{
	    String sql = "select * from EvaluationExpert where 1=1 ";
	    String condition = evaexpert.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<EvaluationExpert> EvaluationExpertList = new ArrayList<EvaluationExpert>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  EvaluationExpert evaexpertTmp = new EvaluationExpert();
	    	  evaexpertTmp.setExpert_jobNumber(rs.getInt("Expert_jobNumber"));
	    	  evaexpertTmp.setExpert_name(rs.getString("Expert_name"));
	    	  evaexpertTmp.setExpert_phone(rs.getString("Expert_phone"));
	    	  evaexpertTmp.setExpert_password(rs.getString("Expert_password"));
	    	  evaexpertTmp.setExpert_headPortrait(rs.getString("Expert_headPortrait"));
	    	  EvaluationExpertList.add(evaexpertTmp);
	          rs.next();
	      }
	    }
	    return EvaluationExpertList;
	  }

	  //插入记录
	  public boolean EvaexpertInsert(EvaluationExpert evaexpert) throws SQLException {
	    try{
	      String sql = "insert into EvaluationExpert(Expert_jobNumber,Expert_name,Expert_phone,Expert_password," +
	      		"Expert_headPortrait) values(?,?,?,?,?) ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, evaexpert.getExpert_jobNumber());
	      pst.setString(2, evaexpert.getExpert_name());
	      pst.setString(3, evaexpert.getExpert_phone());
	      pst.setString(4, evaexpert.getExpert_password());
	      pst.setString(5, evaexpert.getExpert_headPortrait());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean EvaexpertUpdate(EvaluationExpert evaexpert) throws SQLException {
	    try{
	      String sql = "update EvaluationExpert set Expert_jobNumber=?,Expert_name=?,Expert_phone=?,Expert_password=?,Expert_headPortrait=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, evaexpert.getExpert_jobNumber());
	      pst.setString(2, evaexpert.getExpert_name());
	      pst.setString(3, evaexpert.getExpert_phone());
	      pst.setString(4, evaexpert.getExpert_password());
	      pst.setString(5, evaexpert.getExpert_headPortrait());
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean EvaexpertDelete(EvaluationExpert evaexpert) throws SQLException {
	    try{
	      String sql = "delete from EvaluationExpert where Expert_jobNumber=? ";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, evaexpert.getExpert_jobNumber());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
