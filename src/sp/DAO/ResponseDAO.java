package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Response;

public interface ResponseDAO {
	public ArrayList<Response> ResponseSelect(Response response) throws SQLException, ClassNotFoundException;//查询
	  public boolean ResponseInsert(Response response) throws SQLException;//添加
	  public boolean ResponseDelete(Response response) throws SQLException;//删除
	  public boolean ResponseUpdate(Response response) throws SQLException;//修改
}
