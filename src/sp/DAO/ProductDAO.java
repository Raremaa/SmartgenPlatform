package sp.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import sp.pojo.Product;

public interface ProductDAO {
	  public ArrayList<Product> ProductSelect(Product product) throws SQLException, ClassNotFoundException;//查询
	  public boolean ProductInsert(Product product) throws SQLException;//添加
	  public boolean ProductDelete(Product product) throws SQLException;//删除
	  public boolean ProductUpdate(Product product) throws SQLException;//修改
}
