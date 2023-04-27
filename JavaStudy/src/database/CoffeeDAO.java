package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CoffeeDAO {
	
	OjdbcConnectionPool cp = StaticResources.cp;
	
	public int updateCoffee(Coffee coffee) {
		try(
			OjdbcSession seesion = cp.getSession();
		) {
			Connection conn = seesion.getConnection();
			String query1 = "SELECT * FROM coffee WHERE coffee_id=?";
			String query2 = "UPDATE coffee SET "
					+ "coffee_name=?, coffee_price=? "
					+ "WHERE coffee_id=?";
						
			try(
				PreparedStatement pstmt1 = conn.prepareStatement(query1); 	
				PreparedStatement pstmt2 = conn.prepareStatement(query2);
			) {
				pstmt1.setInt(1, coffee.getCoffee_id());
				Coffee original = new Coffee();
				
				try(
					ResultSet rs = pstmt1.executeQuery();
				) {
					rs.next();
					original.setCoffee_id(rs.getInt("coffee_id"));
					original.setCoffee_name(rs.getString("coffee_name"));
					original.setCoffee_price(rs.getInt("coffee_price"));					
				}
								
				// 만약 수정할 값이 없을 때 원본을 그대로 넣고 싶다면
				// Select를 한번해서 원래 값을 그대로 전달할 수 있다
				pstmt2.setString(1,
						coffee.getCoffee_name() == null ?
								original.getCoffee_name() :
									coffee.getCoffee_name());
				pstmt2.setInt(2, 
						coffee.getCoffee_price() == null ? 
								original.getCoffee_price() :
									coffee.getCoffee_price());
				pstmt2.setInt(3, coffee.getCoffee_id());
				pstmt2.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
