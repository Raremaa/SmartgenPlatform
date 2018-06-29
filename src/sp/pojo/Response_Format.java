package sp.pojo;

import net.sf.json.JSONArray;
//自定义返回数据
public class Response_Format {
	int code;
	String msg;
	int count;
	JSONArray data ;
	
	public int getcode(){
		return code;
	}
	public void setcode(int temp){
		code = temp;
	}
	public String getmsg(){
		return msg;
	}
	public void setmsg(String temp){
		msg = temp;
	}
	public int getcount(){
		return count;
	}
	public void setcount(int temp){
		count = temp;
	}
	public JSONArray getdata(){
		return data;
	}
	public void setdata(JSONArray temp){
		data = temp;
	}
}
