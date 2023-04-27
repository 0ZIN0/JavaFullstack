package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.quiz.potterWheel.Prize;

public class CafeDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Connection conn = getConnection();
	
	private static Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"hr",
					"1234"
			);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
//	public List<Coffee> getAllMenus() {
//		String query = "SELECT * FROM coffee ORDER BY coffee_id";
//		
//		try(
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			ResultSet rs = pstmt.executeQuery();	
//		) {
//			List<Coffee> list = new ArrayList<>();
//			
//			while(rs.next()) {
//				list.add(new Coffee (
//						rs.getInt("coffee_id"),
//						rs.getString("coffee_name"),
//						rs.getInt("coffee_price")
//					));
//			}
//			return list;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
//	public List<Coffee> getUnder3000() {
//		String query = "SELECT * FROM coffee WHERE coffee_price <= 3000"
//				+ " ORDER BY coffee_id";
//		try(
//			PreparedStatement pstmt = conn.prepareStatement(query);
//			ResultSet rs = pstmt.executeQuery();	
//		) {
//			List<Coffee> list = new ArrayList<>();
//			
//			while(rs.next()) {
//				list.add(new Coffee (
//						rs.getInt("coffee_id"),
//						rs.getString("coffee_name"),
//						rs.getInt("coffee_price")
//					));
//			}
//			return list;
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
	
	public int addMenu(Coffee coffee) {
		String query1 = "SELECT coffee_name FROM coffee";
		String query2 = "INSERT INTO coffee VALUES(coffee_id_seq.nextval,?,?)";
		
		try (
			PreparedStatement pstmt1 = conn.prepareStatement(query1);
			ResultSet rs = pstmt1.executeQuery();
		) {
			int state;
			try(
				PreparedStatement pstmt2 = conn.prepareStatement(query2);
			) {
				pstmt2.setString(1, coffee.getCoffee_name());
				pstmt2.setDouble(2, coffee.getCoffee_price());
				state = pstmt2.executeUpdate();
				System.out.println("추가되었습니다");
			}
			return state;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public int addMenus(List<Coffee> menus) {
		boolean dup = false;
		String query = "SELECT coffee_name FROM coffee";
		try (
			PreparedStatement pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
		) {
			while(rs.next()) {	
				for(Coffee coffee : menus) {
					if(rs.getString(1).equals(coffee.getCoffee_name())) { 
						dup = true;
					}
				}
			}
			
			if(dup) {
				System.out.println("실행이 중단되었습니다.(중복된 이름이 있습니다)");
				return 0;
			}
			for(int i = 0; i < menus.size(); i++) {
				addMenu(menus.get(i)); 
			}
			
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
