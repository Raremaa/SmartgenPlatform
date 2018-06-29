package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.CreativeProject;

public interface CreativeProjectDAO {
  public ArrayList<CreativeProject> CreprojectSelect(CreativeProject creproject) throws SQLException, ClassNotFoundException;//查询
  public boolean CreprojectInsert(CreativeProject creproject) throws SQLException;//添加
  public boolean CreprojectDelete(CreativeProject creproject) throws SQLException;//删除
  public boolean CreprojectUpdate(CreativeProject creproject) throws SQLException;//修改
}
