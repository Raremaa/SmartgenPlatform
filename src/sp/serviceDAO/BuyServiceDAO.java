package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Buy;

public interface BuyServiceDAO {
	 public ArrayList<Buy> buyFind(Buy buy);//查询业务
	  public boolean buyAdd(Buy buy);//添加业务
	  public boolean buyDel(Buy buy);//删除业务
	  public boolean buySave(Buy buy);//修改业务
}
