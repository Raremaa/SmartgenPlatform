package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.CreativeRemark;

public interface CreativeRemarkServiceDAO {
	 public ArrayList<CreativeRemark> creremarkFind(CreativeRemark creremark);//查询业务
	  public boolean creremarkAdd(CreativeRemark creremark);//添加业务
	  public boolean creremarkDel(CreativeRemark creremark);//删除业务
	  public boolean creremarkSave(CreativeRemark creremark);//修改业务
}
