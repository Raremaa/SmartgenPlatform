package sp.pojo;

import java.sql.Date;

//创意评论表
public class CreativeRemark {
	int User_id;
	int Creproject_id;
	String Creremark_content;
	int Creremark_praise;
	String Creremark_commentTime;
	String condition;
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getCreproject_id() {
		return Creproject_id;
	}
	public void setCreproject_id(int creproject_id) {
		Creproject_id = creproject_id;
	}
	public String getCreremark_content() {
		return Creremark_content;
	}
	public void setCreremark_content(String creremark_content) {
		Creremark_content = creremark_content;
	}
	public int getCreremark_praise() {
		return Creremark_praise;
	}
	public void setCreremark_praise(int creremark_praise) {
		Creremark_praise = creremark_praise;
	}
	public String getCreremark_commentTime() {
		return Creremark_commentTime;
	}
	public void setCreremark_commentTime(String creremark_commentTime) {
		Creremark_commentTime = creremark_commentTime;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
		
}
