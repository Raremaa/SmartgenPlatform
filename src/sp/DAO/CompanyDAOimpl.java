package sp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Company;

public class CompanyDAOimpl implements CompanyDAO {
  private Connection conn = null;
  private PreparedStatement pst = null;
  /**
   * 定义构造方法，实例化的时候完成连接的注入
   */
  public CompanyDAOimpl(Connection conn) {
    super();
    this.conn = conn;
  }
  
  //查询记录
  public ArrayList<Company> CompanySelect(Company company) throws SQLException {
    String sql = "select * from Company where 1=1 ";
    String condition = company.getCondition();
    if(condition !=null && !condition.equals("")){
      sql += "and " + condition;
    }
    System.out.println(sql);
    pst = conn.prepareStatement(sql);
    ResultSet rs = pst.executeQuery();
    ArrayList<Company> CompanyList = new ArrayList<Company>();
    if(rs.next()){
      for(int i=0;i<=rs.getRow();i++){
          Company companyTmp = new Company();
          companyTmp.setCompany_id(rs.getInt("Company_id"));
          companyTmp.setCompany_name(rs.getString("Company_name"));
          companyTmp.setCompany_phone(rs.getString("Company_phone"));
          companyTmp.setCompany_charterNumber(rs.getString("Company_charterNumber"));
          companyTmp.setCompany_password(rs.getString("Company_password"));
          companyTmp.setCompany_logo(rs.getString("Company_logo"));
          companyTmp.setCompany_location(rs.getString("Company_location"));
          companyTmp.setCompany_identity(rs.getInt("Company_identity"));
          CompanyList.add(companyTmp);
          rs.next();
      }
    }
    System.out.println("长度为"+CompanyList.size());
    return  CompanyList;
  }

  //插入记录
  public boolean CompanyInsert(Company company) throws SQLException {
    try{
      String sql = "insert into Company(Company_id,Company_name,Company_userName,Company_phone,Company_charterNumber,Company_password,Company_logo,Company_location,Company_identity) values(?,?,?,?,?,?,?,?,?) ";
      pst = conn.prepareStatement(sql);
      pst.setInt(1, company.getCompany_id());
      pst.setString(2, company.getCompany_name());
      pst.setString(3, company.getCompany_userName());
      pst.setString(4, company.getCompany_phone());
      pst.setString(5, company.getCompany_charterNumber());
      pst.setString(6, company.getCompany_password());
      pst.setString(7, company.getCompany_logo());
      pst.setString(8, company.getCompany_location());
      pst.setInt(9, company.getCompany_identity());
      pst.executeUpdate();
      return true;
    }catch(Exception e){
      return false;
    }
  }
  
  //更新记录
  public boolean CompanyUpdate(Company company) throws SQLException {
    try{
      String sql = "update Company set Company_id=?,Company_name=?,Company_userName=?,Company_phone=?,Company_charterNumber=?,Company_password=?,Company_logo=?,Company_location=?,Company_identity=?";
      pst = conn.prepareStatement(sql);
      pst.setInt(1, company.getCompany_id());
      pst.setString(2, company.getCompany_name());
      pst.setString(3, company.getCompany_userName());
      pst.setString(4, company.getCompany_phone());
      pst.setString(5, company.getCompany_charterNumber());
      pst.setString(6, company.getCompany_password());
      pst.setString(7, company.getCompany_logo());
      pst.setString(8, company.getCompany_location());
      pst.setInt(9, company.getCompany_identity());
      pst.executeUpdate();
      return true;
    }catch(Exception e){
      return false;
    }
  }
  
  //删除记录
  public boolean CompanyDelete(Company company) throws SQLException {
    try{
      String sql = "delete from Company where Company_id=?";
      pst = conn.prepareStatement(sql);
      pst.setInt(1, company.getCompany_id());
      pst.executeUpdate();//执行sql语句
      return true;
    }catch(Exception e){
      return false;
    }
  }

}

