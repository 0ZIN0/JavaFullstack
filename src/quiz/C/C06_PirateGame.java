package quiz.C;

import java.util.Arrays;
import java.util.Scanner;

import myobj.Bucket;

public class C06_PirateGame {
	
	/*
		통아저씨 게임을 만들어보세요
		
		(1) 게임이 시작되면 꽝자리가 정해진다
		
		(2) 플레이어는 아저씨가 발사될때까지 계속 자리를 선택해야 한다
		
		(3) 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다
			(꽝의 위치는 매 판마다 랜덤으로 재설정되어야 한다)
	 	
	 	(4) 아저씨가 발사되면 몇 번 만에 발사되었는지 알려주는 메세지가 나온다
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1. 게임시작 2. 게임종료\n>>");
			int select = sc.nextInt();
			
			if(select == 1) {
				
				Bucket b1 = new Bucket();
				int cnt = 0;
				
				while(true) {

					System.out.print("자리를 입력하세요 >>");
					int num = sc.nextInt() - 1;
					
					cnt++;
					
					if(cnt == 16) {
						
						System.out.println("성공!");
						break;
						
					} else if(b1.check(num) == 0) {
						
						System.out.println("통과");
		
					} else if(b1.check(num) == 2) { 
						
						System.out.println("이미 선택한 번호 입니다. 다시 입력하세요");
						--cnt;
						
					} else if(b1.check(num) == 1) {
						
						System.out.println("꽝");
						System.out.println(cnt + 
								"번 만에 발사되었습니다");
						break;
					}
				}	
				
			} else if (select == 2) {
				System.out.println("bye");
				break;
			}
		}
	}
}
