package gui.quiz.registerAns.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.OjdbcConnectionPool;
import database.OjdbcSession;
import database.StaticResources;

public class MemberDao {
	
	static OjdbcConnectionPool pool = new OjdbcConnectionPool("hr", "1234");
	
	public boolean idExists(String id) {
		try(
			OjdbcSession session = pool.getSession();	
		) {
			Connection conn = session.getConnection();
			
			String query = "SELECT COUNT(*) FROM member WHERE mem_id=?";
			
			try(
				PreparedStatement pstmt = conn.prepareStatement(query);
			) {
				pstmt.setString(1, id);
				
				try(
					ResultSet rs = pstmt.executeQuery();
				) {
					rs.next();
					return rs.getInt(1) > 0;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public void insertNewMember(String text, char[] password) {
		
		
	}
	
}
