package database.quiz.potterWheel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;

import database.OjdbcConnection;

public class J03_PotterWheel {
	
	/*
	 	# 경품 추첨 이벤트를 만들어보세요
	 	
	 	(1) DB에 경품들의 이름과 당첨 확률, 남은 수량 등을 저장할 수 있는
	 		테이블이 존재해야 한다
	 	
	 	(2) 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들어야 한다
	 	
	 	(3) 상품이 모두 소진되면 프로그램이 종료되어야 한다
	 	
	 	(4) 리셋 기능을 실행하면 DB의 상품이 다시 충전된다
	 */
	
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		try(
			Connection conn = OjdbcConnection.getconnection();
		) {
			PotterWheel1 potterWheel = new PotterWheel1(conn);
			System.out.println("1. 게임 시작 2. 리셋");
			int select = sc.nextInt();
			if(select == 1) {
				int count = 0;
				while(true) {
					Prize prize = potterWheel.wheel(conn);
					
					System.out.printf("%d번째 : %s\n", count++, prize);
					
					if(prize != null && prize.getQty() == 0) {
						break;
					}
				}
			}
			if(select == 2) {
				potterWheel.reset(conn);
			}
			
		} catch (SQLException e) { 
			e.printStackTrace();	
		}
	}
}
