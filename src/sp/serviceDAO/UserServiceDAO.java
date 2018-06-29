package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.User;

public interface UserServiceDAO {
	 public ArrayList<User> userFind(User user);//查询业务
	  public boolean userAdd(User user);//添加业务
	  public boolean userDel(User user);//删除业务
	  public boolean userSave(User user);//修改业务
}
