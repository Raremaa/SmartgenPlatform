package sp.pojo;

import java.sql.Date;

//兴趣评论表
public class InterestingRemark {
	int User_id;
	int Inproject_id;
	String Inremark_content;
	int Inremark_praise;
	String Inremark_commentTime;
	String condition;
	
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public int getInproject_id() {
		return Inproject_id;
	}
	public void setInproject_id(int inproject_id) {
		Inproject_id = inproject_id;
	}
	public String getInremark_content() {
		return Inremark_content;
	}
	public void setInremark_content(String inremark_content) {
		Inremark_content = inremark_content;
	}
	public int getInremark_praise() {
		return Inremark_praise;
	}
	public void setInremark_praise(int inremark_praise) {
		Inremark_praise = inremark_praise;
	}
	public String getInremark_commentTime() {
		return Inremark_commentTime;
	}
	public void setInremark_commentTime(String inremark_commentTime) {
		Inremark_commentTime = inremark_commentTime;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
