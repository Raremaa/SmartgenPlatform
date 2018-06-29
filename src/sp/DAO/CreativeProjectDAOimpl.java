 package sp.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeProject;

public class CreativeProjectDAOimpl implements CreativeProjectDAO{
	  private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public CreativeProjectDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	  //查询记录
	  public ArrayList<CreativeProject> CreprojectSelect(CreativeProject creproject) throws SQLException {
	    String sql = "select * from CreativeProject where 1=1 ";
	    String condition = creproject.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    System.out.println(sql);
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<CreativeProject> CreativeProjectList = new ArrayList<CreativeProject>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  CreativeProject creprojectTmp = new CreativeProject();
	    	  creprojectTmp.setCreproject_id(rs.getInt("Creproject_id"));
	    	  creprojectTmp.setExpert_jobNumber(rs.getInt("Expert_jobNumber"));
	    	  creprojectTmp.setUser_id(rs.getInt("User_id"));
	    	  creprojectTmp.setCompany_id(rs.getInt("Company_id"));
	    	  creprojectTmp.setCreproject_title(rs.getString("Creproject_title"));
	    	  creprojectTmp.setCreproject_content(rs.getString("Creproject_content"));
	    	  creprojectTmp.setCreproject_label(rs.getString("Creproject_label"));
	    	  creprojectTmp.setCreproject_picture(rs.getString("Creproject_picture"));
	    	  creprojectTmp.setCreproject_video(rs.getString("Creproject_video"));
	    	  creprojectTmp.setCreproject_plan(rs.getString("Creproject_plan"));
	    	  creprojectTmp.setCreproject_classify(rs.getInt("Creproject_classify"));
	    	  creprojectTmp.setCreproject_state(rs.getInt("Creproject_state"));
	    	  creprojectTmp.setCreproject_praise(rs.getInt("Creproject_praise"));
	    	  creprojectTmp.setCreproject_modifyTime(rs.getString("Creproject_modifyTime"));
	    	  creprojectTmp.setCreproject_releaseTime(rs.getString("Creproject_releaseTime"));
	    	  creprojectTmp.setCreproject_evaluateTime(rs.getString("Creproject_evaluateTime"));
	    	  creprojectTmp.setCreproject_evaluateResult(rs.getInt("Creproject_evaluateResult"));
	    	  creprojectTmp.setCreproject_evaluateOpinion(rs.getString("Creproject_evaluateOpinion"));
	    	  CreativeProjectList.add(creprojectTmp);
	          rs.next();
	      }
	    }
	    return CreativeProjectList;
	  }

	  //插入记录,已测试
	  public boolean CreprojectInsert(CreativeProject creproject) throws SQLException {
	    try{
	      String sql = "insert into CreativeProject(Expert_jobNumber,User_id,Company_id," +
	      		"Creproject_title,Creproject_content,Creproject_label, Creproject_picture,Creproject_video," +
	      		"Creproject_plan,Creproject_classify,Creproject_state,Creproject_praise,Creproject_modifyTime," +
	      		"Creproject_releaseTime,Creproject_evaluateTime,Creproject_evaluateResult,Creproject_evaluateOpinion) " +
	      		"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
	      /*
	       * creProId是自增，不用给。 
	       *  外键的存在，因约束完整性的原因，在插入的时候会出现问题，插入外键字段，必须是存在的
	       *  状态（0为未孵化）和评估结果（0为未通过）是给出默认值
	       *  修改时间的初始值为发布时间
	       *  评估时间默认为"0000-00-00"
	       *  传时间数据的时候注意形式"yyyy-mm-dd"
	       * */
	     /* System.out.println(creproject.getExpert_jobNumber());
	      System.out.println(creproject.getUser_id());
	      System.out.println(creproject.getCompany_id());
	      
	      System.out.println(creproject.getCreproject_title());
	      System.out.println(creproject.getCreproject_content());
	      System.out.println( creproject.getCreproject_label());
	      System.out.println(creproject.getCreproject_picture());
	      System.out.println(creproject.getCreproject_video());
	      System.out.println(creproject.getCreproject_plan());
	      System.out.println(creproject.getCreproject_classify());
	      System.out.println(creproject.getCreproject_state());
	      System.out.println(creproject.getCreproject_praise());
	      System.out.println(creproject.getCreproject_modifyTime());
	      System.out.println( creproject.getCreproject_releaseTime());
	      
	      System.out.println(creproject.getCreproject_evaluateTime());
	      System.out.println(creproject.getCreproject_evaluateResult());
	  
	      System.out.println(creproject.getCreproject_evaluateOpinion());
	    */
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1,0);
	      pst.setInt(2, creproject.getUser_id());
	      pst.setInt(3,0);
	      pst.setString(4, creproject.getCreproject_title());
	      pst.setString(5, creproject.getCreproject_content());
	      pst.setString(6, creproject.getCreproject_label());
	      pst.setString(7, "/SmartgenPlatform/img/pro.jpg");
	      pst.setString(8, "df");
	      pst.setString(9, "/plan/file");
	      pst.setInt(10, creproject.getCreproject_classify());
	      pst.setInt(11, creproject.getCreproject_state());
	      pst.setInt(12, creproject.getCreproject_praise());
	      pst.setString(13, creproject.getCreproject_releaseTime());
	      pst.setString(14, creproject.getCreproject_releaseTime());
	      pst.setString(15,"2017-2-6");
	      pst.setInt(16, creproject.getCreproject_evaluateResult());
	      pst.setString(17, "");
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //更新记录
	  public boolean CreprojectUpdate(CreativeProject creproject) throws SQLException {
	    try{
	      String sql = "update CreativeProject set Expert_jobNumber=?,User_id=?,Company_id=?," +
	      		"Creproject_title=?,Creproject_content=?,Creproject_label=?, Creproject_picture=?,Creproject_video=?," +
	      		"Creproject_plan=?,Creproject_classify=?,Creproject_state=?,Creproject_praise=?,Creproject_modifyTime=?," +
	      		"Creproject_releaseTime=?,Creproject_evaluateTime=?,Creproject_evaluateResult=?,Creproject_evaluateOpinion=? where Creproject_id=?";
	      pst = conn.prepareStatement(sql);
	  	System.out.println("维护");
	      /*pst.setInt(1, creproject.getCreproject_id());*/
	      pst.setInt(1, creproject.getExpert_jobNumber());
	      System.out.println("1");
	      pst.setInt(2, creproject.getUser_id());
	      System.out.println("2");
	      pst.setInt(3, creproject.getCompany_id());
	      System.out.println("3");
	      pst.setString(4, creproject.getCreproject_title());
	      System.out.println("4");
	      pst.setString(5, creproject.getCreproject_content());
	      System.out.println("5");
	      pst.setString(6, creproject.getCreproject_label());
	      System.out.println("6");
	      pst.setString(7,creproject.getCreproject_picture());
	      System.out.println("7");
	      pst.setString(8, creproject.getCreproject_video());
	      System.out.println("8");
	      pst.setString(9, creproject.getCreproject_plan());
	      System.out.println("9");
	      pst.setInt(10, creproject.getCreproject_classify());
	      System.out.println("10");
	      pst.setInt(11, creproject.getCreproject_state());
	      System.out.println("11");
	      pst.setInt(12, creproject.getCreproject_praise());
	      System.out.println("12");
	      pst.setString(13, creproject.getCreproject_modifyTime());
	      System.out.println("13");
	      pst.setString(14, creproject.getCreproject_releaseTime());
	      System.out.println("14");
	      pst.setString(15, creproject.getCreproject_evaluateTime());
	      System.out.println("15");
	      pst.setInt(16, creproject.getCreproject_evaluateResult());
	      System.out.println("16");
	      pst.setString(17, creproject.getCreproject_evaluateOpinion());
	      System.out.println("17");
	      pst.setInt(18, creproject.getCreproject_id());
	      System.out.println("18");
	      pst.executeUpdate();
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }
	  
	  //删除记录
	  public boolean CreprojectDelete(CreativeProject creproject) throws SQLException {
	    try{
	      String sql = "delete from CreativeProject where Creproject_id=?";
	      pst = conn.prepareStatement(sql);
	      pst.setInt(1, creproject.getCreproject_id());
	      pst.executeUpdate();//执行sql语句
	      return true;
	    }catch(Exception e){
	      return false;
	    }
	  }

}
