package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Company;

public interface CompanyDAO {
	 public ArrayList<Company> CompanySelect(Company company) throws SQLException, ClassNotFoundException;//查询
	  public boolean CompanyInsert(Company company) throws SQLException;//添加
	  public boolean CompanyDelete(Company company) throws SQLException;//删除
	  public boolean CompanyUpdate(Company company) throws SQLException;//修改
}
