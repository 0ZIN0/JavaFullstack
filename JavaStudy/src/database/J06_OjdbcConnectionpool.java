package database;

import java.sql.Connection;

public class J06_OjdbcConnectionpool {
	public static void main(String[] args) {
		OjdbcConnectionPool cp = new OjdbcConnectionPool("hr", "1234");
		
		cp.status();
		try (
			OjdbcSession session1 = cp.getSession();
			OjdbcSession session2 = cp.getSession();
			OjdbcSession session3 = cp.getSession();
		) {	
			Connection conn1 = session1.getConnection();
			Connection conn2 = session2.getConnection();
			Connection conn3 = session3.getConnection();
			
			System.out.println("--- try 내부---");
			cp.status();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---try 이후---");
		cp.status();			
	}
}
