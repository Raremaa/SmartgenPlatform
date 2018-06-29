package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Production;

public interface ProductionDAO {
	public ArrayList<Production> ProductionSelect(Production production) throws SQLException, ClassNotFoundException;//查询
	  public boolean ProductionInsert(Production production) throws SQLException;//添加
	  public boolean ProductionDelete(Production production) throws SQLException;//删除
	  public boolean ProductionUpdate(Production production) throws SQLException;//修改
}
