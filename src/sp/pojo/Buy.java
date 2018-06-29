package sp.pojo;

import java.sql.Date;
//直接购买表
public class Buy {
	int User_id;
	int Product_id;
	String Buy_paymentTime;
	String Buy_pattern;
	int Buy_state;
	int Buy_count;
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
	public String getBuy_paymentTime() {
		return Buy_paymentTime;
	}
	public void setBuy_paymentTime(String buy_paymentTime) {
		Buy_paymentTime = buy_paymentTime;
	}
	public String getBuy_pattern() {
		return Buy_pattern;
	}
	public void setBuy_pattern(String buy_pattern) {
		Buy_pattern = buy_pattern;
	}
	public int getBuy_state() {
		return Buy_state;
	}
	public void setBuy_state(int buy_state) {
		Buy_state = buy_state;
	}
	public int getBuy_count() {
		return Buy_count;
	}
	public void setBuy_count(int buy_count) {
		Buy_count = buy_count;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}	
}
