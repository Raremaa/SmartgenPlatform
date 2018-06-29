package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Company;

public interface CompanyServiceDAO {
	public ArrayList<Company> companyFind(Company company);//查询业务
	  public boolean companyAdd(Company company);//添加业务
	  public boolean companyDel(Company company);//删除业务
	  public boolean companySave(Company company);//修改业务
}
