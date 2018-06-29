package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Response;

public interface ResponseServiceDAO {
	 public ArrayList<Response> responseFind(Response response);//查询业务
	  public boolean responseAdd(Response response);//添加业务
	  public boolean responseDel(Response response);//删除业务
	  public boolean responseSave(Response response);//修改业务
}
