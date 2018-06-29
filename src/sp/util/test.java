package sp.util;

import java.sql.Connection;

public class test {
	public static void main(String[] args) {
		Connection conn = DButil.getConnection();
		System.out.println(conn);
	}
}
