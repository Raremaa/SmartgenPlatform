//对创意表和用户表进行多表查询
package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeProject;

public class selectCreProUserDAOimpl {
	
	 private Connection conn = null;
	  private PreparedStatement pst = null;
	  /**
	   * 定义构造方法，实例化的时候完成连接的注入
	   */
	  public selectCreProUserDAOimpl(Connection conn) {
	    super();
	    this.conn = conn;
	  }
	  
	//查询创意所有记录和用户的头像和用户名记录
	public ArrayList<CreativeProject> CreProUserSelect(CreativeProject creproject) throws SQLException {
	    String sql = "select Creproject_id,Expert_jobNumber,CreativeProject.User_id,Company_id,Creproject_title,Creproject_content,Creproject_label,Creproject_picture,Creproject_video,Creproject_plan,Creproject_classify,Creproject_state,Creproject_praise,Creproject_modifyTime,Creproject_releaseTime,Creproject_evaluateTime,Creproject_evaluateResult,Creproject_evaluateOpinion,User_name,User_headPortrait from CreativeProject,User where 1=1 ";
	    String condition = creproject.getCondition();
	    if(condition !=null && !condition.equals("")){
	      sql += "and " + condition;
	    }
	    
	    pst = conn.prepareStatement(sql);
	    ResultSet rs = pst.executeQuery();
	    ArrayList<CreativeProject> CreativeProjectList = new ArrayList<CreativeProject>();
	    if(rs.next()){
	      for(int i=0;i<=rs.getRow();i++){
	    	  CreativeProject creprojectTmp = new CreativeProject();
	    	  
	    	  creprojectTmp.setCreproject_id(rs.getInt("Creproject_id"));
	    	  creprojectTmp.setExpert_jobNumber(rs.getInt("Expert_jobNumber"));
	    	  creprojectTmp.setUser_id(rs.getInt("CreativeProject.User_id"));
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
	    	 //获取的用户名和用户头像信息
	    	  creprojectTmp.setUser_name(rs.getString("User_name"));
	    	  creprojectTmp.setUser_headPortrait(rs.getString("User_headPortrait"));
	    	  
	    	  CreativeProjectList.add(creprojectTmp);
	          rs.next();
	      }
	    }
	    return CreativeProjectList;
	  }
}
