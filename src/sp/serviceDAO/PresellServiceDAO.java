package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Presell;

public interface PresellServiceDAO {
	 public ArrayList<Presell> presellFind(Presell presell);//查询业务
	  public boolean presellAdd(Presell presell);//添加业务
	  public boolean presellDel(Presell presell);//删除业务
	  public boolean presellSave(Presell presell);//修改业务
}
