package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.InterestingProject;

public interface InterestingProjectDAO {
  public ArrayList<InterestingProject> InprojectSelect(InterestingProject inproject) throws SQLException, ClassNotFoundException;//查询
  public boolean InprojectInsert(InterestingProject inproject) throws SQLException;//添加
  public boolean InprojectDelete(InterestingProject inproject) throws SQLException;//删除
  public boolean InprojectUpdate(InterestingProject inproject) throws SQLException;//修改
}
