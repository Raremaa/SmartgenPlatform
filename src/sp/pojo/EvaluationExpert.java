package sp.pojo;
//评估专家表
public class EvaluationExpert {
	int Expert_jobNumber;
	String Expert_name;
	String Expert_phone;
	String Expert_password;
	String Expert_headPortrait;
    String condition;
	
    public int getExpert_jobNumber() {
		return Expert_jobNumber;
	}
	public void setExpert_jobNumber(int expert_jobNumber) {
		Expert_jobNumber = expert_jobNumber;
	}
	public String getExpert_name() {
		return Expert_name;
	}
	public void setExpert_name(String expert_name) {
		Expert_name = expert_name;
	}
	public String getExpert_phone() {
		return Expert_phone;
	}
	public void setExpert_phone(String expert_phone) {
		Expert_phone = expert_phone;
	}
	public String getExpert_password() {
		return Expert_password;
	}
	public void setExpert_password(String expert_password) {
		Expert_password = expert_password;
	}
	public String getExpert_headPortrait() {
		return Expert_headPortrait;
	}
	public void setExpert_headPortrait(String expert_headPortrait) {
		Expert_headPortrait = expert_headPortrait;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}	

    
}
