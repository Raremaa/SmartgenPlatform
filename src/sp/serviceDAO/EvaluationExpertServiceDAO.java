package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.EvaluationExpert;

public interface EvaluationExpertServiceDAO {
	 public ArrayList<EvaluationExpert> evaexpertFind(EvaluationExpert evaexpert);//查询业务
	  public boolean evaexpertAdd(EvaluationExpert evaexpert);//添加业务
	  public boolean evaexpertDel(EvaluationExpert evaexpert);//删除业务
	  public boolean evaexpertSave(EvaluationExpert evaexpert);//修改业务
}
