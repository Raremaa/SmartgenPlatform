package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Presell;

public interface PresellDAO {
	public ArrayList<Presell> PresellSelect(Presell presell) throws SQLException, ClassNotFoundException;//查询
	  public boolean PresellInsert(Presell presell) throws SQLException;//添加
	  public boolean PresellDelete(Presell presell) throws SQLException;//删除
	  public boolean PresellUpdate(Presell presell) throws SQLException;//修改
}
