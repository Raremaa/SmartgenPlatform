package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.InterestingRemark;

public interface InterestingRemarkServiceDAO {
	 public ArrayList<InterestingRemark> inremarkFind(InterestingRemark inremark);//查询业务
	  public boolean inremarkAdd(InterestingRemark inremark);//添加业务
	  public boolean inremarkDel(InterestingRemark inremark);//删除业务
	  public boolean inremarkSave(InterestingRemark inremark);//修改业务
}
