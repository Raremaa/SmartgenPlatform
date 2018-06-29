package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.EvaluationExpert;

public interface EvaluationExpertDAO {
	 public ArrayList<EvaluationExpert> EvaexpertSelect(EvaluationExpert evaexpert) throws SQLException, ClassNotFoundException;//查询
	  public boolean EvaexpertInsert(EvaluationExpert evaexpert) throws SQLException;//添加
	  public boolean EvaexpertDelete(EvaluationExpert evaexpert) throws SQLException;//删除
	  public boolean EvaexpertUpdate(EvaluationExpert evaexpert) throws SQLException;//修改
}
