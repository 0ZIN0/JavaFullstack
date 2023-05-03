package gui.quiz.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.OjdbcConnectionPool;
import database.OjdbcSession;
import database.StaticResources;
import gui.quiz.register.User;

public class RegDAO {
	
	OjdbcConnectionPool cp = StaticResources.cp;
	
	public int regiUser(User user) {
		try (
		OjdbcSession session = cp.getSession();
		) {
			Connection conn = session.getConnection();
			String query = "INSERT INTO registration VALUES(?,?,?,?,?)";
			try(
				PreparedStatement pstmt = conn.prepareStatement(query);
			) {
				pstmt.setString(1, user.getId());
				pstmt.setString(2, user.getPw());
				pstmt.setString(3, user.getName());
				pstmt.setString(4, user.getRegNum());
				pstmt.setString(5, user.getEmail());
				pstmt.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return 0;
	}
	
	public boolean checkIdDup(String id) {
		try (
		OjdbcSession session = cp.getSession();
		) {
			Connection conn = session.getConnection();
			String query = "SELECT user_id FROM registration";
			Boolean dup = false;
			try(
				PreparedStatement pstmt = conn.prepareStatement(query);
				ResultSet rs = pstmt.executeQuery();	
			) {
				while(rs.next()) {
					if(id.equals(rs.getString("user_id"))) {
						dup = true;
					}
				}
				return dup;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return false;
	}
}
