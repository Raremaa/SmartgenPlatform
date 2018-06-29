package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.User;

public interface UserDAO {
  public ArrayList<User> UserSelect(User user) throws SQLException, ClassNotFoundException;//查询
  public boolean UserInsert(User user) throws SQLException;//添加
  public boolean UserDelete(User user) throws SQLException;//删除
  public boolean UserUpdate(User user) throws SQLException;//修改
}
