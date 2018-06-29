package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import sp.DAO.selectCreProUserDAOimpl;
import sp.pojo.CreativeProject;
import sp.util.DButil;

public class selectCreProUserServiceDAOimpl {
	//查询业务
	public ArrayList<CreativeProject> CreProUserFind(CreativeProject creproject){
	    Connection conn = DButil.getConnection();
	    selectCreProUserDAOimpl creprojectD = new selectCreProUserDAOimpl(conn);
	    try{
	      ArrayList<CreativeProject> CreativeProjectList = new ArrayList<CreativeProject>();
	      CreativeProjectList = creprojectD.CreProUserSelect(creproject);
	      conn.commit();//提交业务
	      return CreativeProjectList;
	    }catch(Exception e){
	      try {
	        conn.rollback();//回滚业务
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return null;
	    }finally{
	      if(conn != null){
	        DButil.closeConnection(conn);//关闭连接
	      }
	    }
	  }

}
