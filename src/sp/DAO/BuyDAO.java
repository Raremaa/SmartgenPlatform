package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Buy;

public interface BuyDAO {
	  public ArrayList<Buy> BuySelect(Buy buy) throws SQLException, ClassNotFoundException;//查询
	  public boolean BuyInsert(Buy buy) throws SQLException;//添加
	  public boolean BuyDelete(Buy buy) throws SQLException;//删除
	  public boolean BuyUpdate(Buy buy) throws SQLException;//修改
}
