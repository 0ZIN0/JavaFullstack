package database.quiz.potterWheel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import database.OjdbcConnection;

public class PotterWheel1 {
	
	public Prize[] prizes;
	Prize[] box;
	int[] qty;
	
	public PotterWheel1(Connection conn) {
		prizes = new Prize[5];
		qty = new int[5];
		String query = "SELECT * FROM prizes";
		try(
			PreparedStatement pstmt = conn.prepareStatement(query);
		) {
			try(ResultSet rs = pstmt.executeQuery();
			) {
				while(rs.next()) {
					prizes[rs.getInt("prize_id") - 1] = 
							new Prize (rs.getString("prize_name"),
									rs.getInt("price"),
									rs.getInt("qty"),
									rs.getDouble("rate")
					);
				}
			}		
		} catch (SQLException e) { 
			e.printStackTrace();	
		}
		updateBox();
	}
	
	public Prize wheel(Connection conn) {
		Prize prize = box[(int)(Math.random() * box.length)];
		
		String query = "UPDATE prizes SET qty = ? WHERE prize_name = ?";
		try(
			PreparedStatement pstmt = conn.prepareStatement(query);
		) {
			if(prize != null) {
				if(prize.qty == 0) {
					return null;
				} else {
					pstmt.setInt(1, --prize.qty);
					pstmt.setString(2, prize.name);
					pstmt.executeUpdate();
				}
			}
		} catch (SQLException e) { 
			e.printStackTrace();	
		}
		return prize;
	}	
	
	public void addPrize(Prize prize) {
		int len = prizes.length;
		
		Prize[] n_prizes = new Prize[len + 1];

		for(int i = 0; i < prizes.length; i++) {
			n_prizes[i] = prizes[i];
		}
		
		n_prizes[len] = prize;
		
		prizes = n_prizes;
		
		updateBox();
	}
	
	private void updateBox() {
		box = new Prize[1000];
		
		int index = 0;
		
		for(int i = 0; i < prizes.length; i++) {
			int num = (int)(prizes[i].rate * 1000);
			
			for(int j = 0; j < num; j++) {
				box[index++] = prizes[i];
			}
		}
	}
	
	public void reset(Connection conn) {
		System.out.println(prizes.length);
		String query = "UPDATE prizes SET qty = init_qty WHERE prize_id = ?";
		try(
			PreparedStatement pstmt = conn.prepareStatement(query);
		) {
			for(int i = 1; i <= 5; i++) {
				pstmt.setInt(1, i);
				int row = pstmt.executeUpdate();
				System.out.println(i+"번 리셋 완료");
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();	
		}
		
		System.out.println("reset complete");
	}
}

