package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.CreativeProject;

public interface CreativeProjectServiceDAO {
	 public ArrayList<CreativeProject> creprojectFind(CreativeProject creproject);//查询业务
	  public boolean creprojectAdd(CreativeProject creproject);//添加业务
	  public boolean creprojectDel(CreativeProject creproject);//删除业务
	  public boolean creprojectSave(CreativeProject creproject);//修改业务
}
