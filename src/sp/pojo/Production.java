package sp.pojo;
//生产表
public class Production {
	int Product_id;
	int Company_id;
	int Production_count;
	String condition;
	
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public int getCompany_id() {
		return Company_id;
	}
	public void setCompany_id(int company_id) {
		Company_id = company_id;
	}
	public int getProduction_count() {
		return Production_count;
	}
	public void setProduction_count(int production_count) {
		Production_count = production_count;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
