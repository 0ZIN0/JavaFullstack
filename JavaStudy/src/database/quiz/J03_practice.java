package database.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import database.OjdbcConnection;

public class J03_practice {
	
	/*
	 	(1) SqlDeveloper로 DB에 새 계정을 추가한다
	 	
	 	(2) 해당 계정에 새 테이블을 추가한다 
	 		(주제 자유, 컬럼 4개 이상 컬럼 타입 Date가 반드시 포함되어야 함)
	 	
	 	(3) 해당 테이블에서 사용할 시퀀스를 생성한다
	 	
	 	(4) 프로그램을 실행 해 해당 테이블에 INSERT를 진행한다
	 	
	 	(5) SqlDeveloper에서 INSERT가 잘 되었는지 확인한다 
	 */
	private static String[] firstNames = {
			"민수", "철수", "희수", "고수", "신수", "성훈", "영희", "민지"
	};
	private static String[] lastNames = {
			"김", "이", "박", "최", "고", "윤", "권", "강", "여"
	};
	
	public static void main(String[] args) {

		String query = "INSERT INTO students "
				+ " VALUES (student_id_seq.nextval, ?, ?, ?)";

		try(
			Connection conn = OjdbcConnection.getconnection();
			PreparedStatement pstmt = conn.prepareStatement(query);
		) {
			for(int i = 0; i < 10; i++) {
				pstmt.setString(1, 
						lastNames[(int)(Math.random() * lastNames.length)] + 
						firstNames[(int)(Math.random() * firstNames.length)]);
				pstmt.setInt(2, 17);
				pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.of(1998, 
								(int)(Math.random() * 12 + 1), 
								(int)(Math.random() * 30 + 1))));
				int row = pstmt.executeUpdate();
				System.out.println(row + "행이 추가되었습니다");	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
