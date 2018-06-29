package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Production;

public interface ProductionServiceDAO {
	 public ArrayList<Production> productionFind(Production production);//查询业务
	  public boolean productionAdd(Production production);//添加业务
	  public boolean productionDel(Production production);//删除业务
	  public boolean productionSave(Production production);//修改业务
}
