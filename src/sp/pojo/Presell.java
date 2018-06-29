package sp.pojo;

import java.sql.Date;
//预购表
public class Presell {
	int User_id;
	int Product_id;
	String Presell_paymentTime;
	String Presell_pattern;
	int Presell_state;
	int Presell_count;
	String condition;
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getPresell_paymentTime() {
		return Presell_paymentTime;
	}
	public void setPresell_paymentTime(String presell_paymentTime) {
		Presell_paymentTime = presell_paymentTime;
	}
	public String getPresell_pattern() {
		return Presell_pattern;
	}
	public void setPresell_pattern(String presell_pattern) {
		Presell_pattern = presell_pattern;
	}
	public int getPresell_state() {
		return Presell_state;
	}
	public void setPresell_state(int presell_state) {
		Presell_state = presell_state;
	}
	public int getPresell_count() {
		return Presell_count;
	}
	public void setPresell_count(int presell_count) {
		Presell_count = presell_count;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
		
}
