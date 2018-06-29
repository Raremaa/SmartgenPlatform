package sp.serviceDAO;

import java.util.ArrayList;

import sp.DAO.InterestingProjectDAOimpl;
import sp.DAO.UserDAOimpl;
import sp.pojo.InterestingProject;
import sp.pojo.User;

public class test123 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestingProjectServiceDAOimpl tr = new InterestingProjectServiceDAOimpl();
//		ArrayList<User> UserList1 = new ArrayList<User>();
		InterestingProject tt=new InterestingProject();//测试add的时候，要定义一个pro
		boolean flag=tr.inprojectAdd(tt);
		System.out.println(flag);
		
	}

}
