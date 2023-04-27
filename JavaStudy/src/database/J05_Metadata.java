package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.JFrame;

public class J05_Metadata {
	
	public static void main(String[] args) {
		
		String query = "SELECT * FROM employees";
		
		try (
			Connection conn = OjdbcConnection.getconnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();	
		) {
			// 조회한 ResultSet에 대한 정보를 볼 수 있다
			// (내가 쿼리문으로 조회한 결과에 대한 정보)
			ResultSetMetaData meta = rs.getMetaData();
			
			// 컬럼이 몇개인가?
			System.out.println(meta.getColumnCount());
			
			for(int i = 1; i < meta.getColumnCount(); i++) {
				System.out.printf("%s(%d) / ",
						meta.getColumnName(i),
						meta.getColumnDisplaySize(i));
			}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
