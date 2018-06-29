package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.InterestingProject;

public interface InterestingProjectServiceDAO {
	 public ArrayList<InterestingProject> inprojectFind(InterestingProject inproject);//查询业务
	  public boolean inprojectAdd(InterestingProject inproject);//添加业务
	  public boolean inprojectDel(InterestingProject inproject);//删除业务
	  public boolean inprojectSave(InterestingProject inproject);//修改业务
}
