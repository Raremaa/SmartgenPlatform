package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.User;
import sp.serviceDAO.UserServiceDAOimpl;
import sp.util.DButil;

public class UserDAOimpl implements UserDAO {
  private Connection conn = null;
  private PreparedStatement pst = null;
  /**
   * 定义构造方法，实例化的时候完成连接的注入
   */
  public UserDAOimpl(Connection conn) {
    super();
    this.conn = conn;
  }
  
  //查询记录,已测试
  public ArrayList<User> UserSelect(User user) throws SQLException {
    String sql = "select * from User where 1=1 ";
    String condition = user.getCondition();
    if(condition !=null && !condition.equals("")){
      sql += "and " + condition;
    }
    System.out.println(sql);
    pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    ArrayList<User> UserList = new ArrayList<User>();
    if(rs.next()){
      for(int i=0;i<=rs.getRow();i++){
    	  System.out.println(1);
          User userTmp = new User();
          userTmp.setUser_id(rs.getInt("User_id"));
          userTmp.setUser_name(rs.getString("User_name"));
          userTmp.setUser_phone(rs.getString("User_phone"));
          userTmp.setUser_password(rs.getString("User_password"));
          userTmp.setUser_sex(rs.getInt("User_sex"));
          userTmp.setUser_headPortrait(rs.getString("User_headPortrait"));
          userTmp.setUser_IDNumber(rs.getString("User_IDNumber"));
          userTmp.setUser_location(rs.getString("User_location"));
          userTmp.setUser_identity(rs.getInt("User_identity"));
          userTmp.setUser_realName(rs.getString("User_realName"));
          UserList.add(userTmp);
          System.out.println(userTmp.getUser_id());
          System.out.println(userTmp.getUser_name());
          System.out.println(2);
          rs.next();
      }
    }
    return UserList;
  }

  //插入记录,已测试
  public boolean UserInsert(User user) throws SQLException {
    try{
      String sql = "insert into User(User_name,User_phone,User_password,User_sex,User_headPortrait,User_IDNumber,User_location,User_identity,User_realName) values(?,?,?,?,?,?,?,?,?) ";
      pst = conn.prepareStatement(sql);
      System.out.println(user.getUser_name());
	  System.out.println(user.getUser_phone());
	  System.out.println(user.getUser_password());
      pst.setString(1,user.getUser_name());
      pst.setString(2,user.getUser_phone());
      pst.setString(3,user.getUser_password());
      pst.setInt(4,user.getUser_sex());
      pst.setString(5,"/SmartgenPlatform/img/userHeadPortrait.png");
      pst.setString(6,user.getUser_IDNumber());
      pst.setString(7,user.getUser_location());
      pst.setInt(8,0);
      pst.setString(9,user.getUser_realName());
      pst.executeUpdate();
      return true;
    }catch(Exception e){
      System.out.println("你已经注册过了");
    	return false;
    }
  }
  
  //更新记录
  public boolean UserUpdate(User user) throws SQLException {
    try{
      String sql = "update User set User_name=?,User_phone=?,User_password=?,User_sex=?," +
      		"User_headPortrait=?,User_IDNumber=?,User_location=?,User_identity=?,User_realName=? where  User_id=?";
      pst = conn.prepareStatement(sql);
     
      pst.setString(1, user.getUser_name());
      pst.setString(2, user.getUser_phone());
      pst.setString(3, user.getUser_password());
      pst.setInt(4, user.getUser_sex());
      pst.setString(5, "/SmartgenPlatform/img/userHeadPortrait.png");
      pst.setString(6, user.getUser_IDNumber());
      pst.setString(7, user.getUser_location());
      pst.setInt(8, user.getUser_identity());
      pst.setString(9, user.getUser_realName());
      pst.setInt(10, user.getUser_id());
      pst.executeUpdate();
      return true;
    }catch(Exception e){
      return false;
    }
  }
  
  //删除记录
  public boolean UserDelete(User user) throws SQLException {
    try{
      String sql = "delete from User where User_id=?";
      pst = conn.prepareStatement(sql);
      pst.setInt(1, user.getUser_id());
      pst.executeUpdate();//执行sql语句
      return true;
    }catch(Exception e){
      return false;
    }
  }

}



