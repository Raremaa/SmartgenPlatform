package sp.serviceDAO;

import java.util.ArrayList;

import sp.pojo.Product;

public interface ProductServiceDAO {
	 public ArrayList<Product> productFind(Product product);//查询业务
	  public boolean productAdd(Product product);//添加业务
	  public boolean productDel(Product product);//删除业务
	  public boolean productSave(Product product);//修改业务
}
