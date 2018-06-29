package sp.pojo;

import java.sql.Date;
//兴趣项目表
public class InterestingProject {
	int Inproject_id;
	int User_id;
	String Inproject_abstract;
	String Inproject_title;
	int Inproject_classify;
	String Inproject_label;
	String Inproject_picture;
	String Inproject_video;
	int Inproject_state;
	int Inproject_praise;
	int Inproject_needPerson;
	String Inproject_modifyTime;
	String Inproject_releaseTime;
	String condition;
	
	public int getInproject_id() {
		return Inproject_id;
	}
	public void setInproject_id(int inproject_id) {
		Inproject_id = inproject_id;
	}
	public int getUser_id() {
		return User_id;
	}
	public void setUser_id(int user_id) {
		User_id = user_id;
	}
	public String getInproject_abstract() {
		return Inproject_abstract;
	}
	public void setInproject_abstract(String inproject_abstract) {
		Inproject_abstract = inproject_abstract;
	}
	public String getInproject_title() {
		return Inproject_title;
	}
	public void setInproject_title(String inproject_title) {
		Inproject_title = inproject_title;
	}
	public int getInproject_classify() {
		return Inproject_classify;
	}
	public void setInproject_classify(int inproject_classify) {
		Inproject_classify = inproject_classify;
	}
	public String getInproject_label() {
		return Inproject_label;
	}
	public void setInproject_label(String inproject_label) {
		Inproject_label = inproject_label;
	}
	public String getInproject_picture() {
		return Inproject_picture;
	}
	public void setInproject_picture(String inproject_picture) {
		Inproject_picture = inproject_picture;
	}
	public String getInproject_video() {
		return Inproject_video;
	}
	public void setInproject_video(String inproject_video) {
		Inproject_video = inproject_video;
	}
	public int getInproject_state() {
		return Inproject_state;
	}
	public void setInproject_state(int inproject_state) {
		Inproject_state = inproject_state;
	}
	public int getInproject_praise() {
		return Inproject_praise;
	}
	public void setInproject_praise(int inproject_praise) {
		Inproject_praise = inproject_praise;
	}
	public int getInproject_needPerson() {
		return Inproject_needPerson;
	}
	public void setInproject_needPerson(int inproject_needPerson) {
		Inproject_needPerson = inproject_needPerson;
	}
	public String getInproject_modifyTime() {
		return Inproject_modifyTime;
	}
	public void setInproject_modifyTime(String inproject_modifyTime) {
		Inproject_modifyTime = inproject_modifyTime;
	}
	public String getInproject_releaseTime() {
		return Inproject_releaseTime;
	}
	public void setInproject_releaseTime(String inproject_releaseTime) {
		Inproject_releaseTime = inproject_releaseTime;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
