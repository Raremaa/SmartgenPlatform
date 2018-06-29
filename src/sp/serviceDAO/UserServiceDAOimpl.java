package sp.serviceDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.DAO.UserDAOimpl;
import sp.pojo.User;
import sp.util.DButil;

public class UserServiceDAOimpl implements UserServiceDAO{
	/*查询业务*/
	  public ArrayList<User> userFind(User user) {
	    Connection conn = DButil.getConnection();
	    UserDAOimpl userD = new UserDAOimpl(conn);
	    try{
	      ArrayList<User> UserList = new ArrayList<User>();
	      UserList = userD.UserSelect(user);
	      conn.commit();
	      return UserList;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return null;
	    }finally{
	      if(conn != null){
	        DButil.closeConnection(conn);
	      }
	    }
	  }
	  /*添加业务*/
	  public boolean userAdd(User user){
		Connection conn = DButil.getConnection();
		UserDAOimpl userD = new UserDAOimpl(conn);
	    try{
	      if(userD.UserInsert(user)){
	    	  conn.commit();
		      return true;
	      }else{
	    	  return false;
	      }
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
	  /*更新业务*/
	  public boolean userSave(User user){
		Connection conn = DButil.getConnection();
		UserDAOimpl userD = new UserDAOimpl(conn);
	    try{
	      userD.UserUpdate(user);
	      conn.commit();
	      return true;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
	  /*删除业务*/
	  public boolean userDel(User user){
		Connection conn = DButil.getConnection();
		UserDAOimpl userD = new UserDAOimpl(conn);
	    try{
	      userD.UserDelete(user);
	      conn.commit();
	      return true;
	    }catch(Exception e){
	      try {
	        conn.rollback();
	      } catch (SQLException e1) {
	        e1.printStackTrace();
	      }
	      return false;
	    }finally{
	      if(conn != null){
	    	DButil.closeConnection(conn);
	      }
	    }
	  }
}
