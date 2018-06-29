package sp.pojo;
//产品表
public class Product {
	int Product_id;
	int Creproject_id;
	int Company_id;
	String Product_name;
	double Product_price;
	int Product_classify;
	String Product_label;
	String Product_picture;
	String condition;
	
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public int getCreproject_id() {
		return Creproject_id;
	}
	public void setCreproject_id(int creproject_id) {
		Creproject_id = creproject_id;
	}
	public int getCompany_id() {
		return Company_id;
	}
	public void setCompany_id(int company_id) {
		Company_id = company_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public double getProduct_price() {
		return Product_price;
	}
	public void setProduct_price(double product_price) {
		Product_price = product_price;
	}
	public int getProduct_classify() {
		return Product_classify;
	}
	public void setProduct_classify(int product_classify) {
		Product_classify = product_classify;
	}
	public String getProduct_label() {
		return Product_label;
	}
	public void setProduct_label(String product_label) {
		Product_label = product_label;
	}
	public String getProduct_picture() {
		return Product_picture;
	}
	public void setProduct_picture(String product_picture) {
		Product_picture = product_picture;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
		
}
