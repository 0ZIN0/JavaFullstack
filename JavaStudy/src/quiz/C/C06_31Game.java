package quiz.C;

import java.util.Scanner;

import myobj.Game31;

public class C06_31Game {
	
	/*
	 	# 31 Game
	 	
	 	1. 처음에 게임에 참여하는 인원을 설정한다
	 	   (게임에 참여하는 인원이 최소 2명 이상이어야 한다)
	 	
	 	2. 이전 사람이 골랐던 숫자로부터 +1 ~ +3의 숫자까지
	 	   입력할 수 있어야 한다
	 	   (숫자를 처음 부르는 사람도 1 ~ 3중에 골라야한다)
	 	
	 	3. 31을 말하게 되는 사람이 패배한다
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Game31 g1 = new Game31();
		
		System.out.print("참여할 인원을 입력해주세요 >>\n");
		g1.registPlayer(sc.nextInt());
		
		
		
		while(true) {
			
			System.out.printf("(플레이어%d의 차례)숫자를 입력하세요 >>\n", g1.playersNum);
			int num = sc.nextInt();
				
			if(g1.ifYouFirst(num)) {
				
				if(g1.inRange(num)) {
					
					g1.checkNum(num);
					
				}
				
				g1.screen();
				System.out.println();
			}
			
			if(g1.say31(num)) {
				
				System.out.printf("플레이어%d의 패배", g1.playersNum);
				break;
			}
		}
	}
}
