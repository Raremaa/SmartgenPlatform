package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.InterestingRemark;

public interface InterestingRemarkDAO {
	public ArrayList<InterestingRemark> InremarkSelect(InterestingRemark inremark) throws SQLException, ClassNotFoundException;//查询
	  public boolean InremarkInsert(InterestingRemark inremark) throws SQLException;//添加
	  public boolean InremarkDelete(InterestingRemark inremark) throws SQLException;//删除
	  public boolean InremarkUpdate(InterestingRemark inremark) throws SQLException;//修改
}
