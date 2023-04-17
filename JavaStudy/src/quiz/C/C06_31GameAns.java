package quiz.C;

import java.util.Scanner;

import myobj.BaskinGame;

public class C06_31GameAns {
	
	public static void main(String[] args) {
		
		BaskinGame game = new BaskinGame();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇인용 >> ");
		game.setAllPlayer(sc.nextInt());
		
		while(true) {
			
			game.screen();
			
			int select;
			while(true) {
				
				System.out.printf("[플레이어%d의 차례]\n", game.getPlayer());
				// 내가 입력할 수 있는 숫자의 범위를 벗어나면 다시 입력
				System.out.printf("숫자를 고르세요 (%d ~ %d) >> ", 
						game.getselectableMinNum(), 
						game.getselectableMaxNum());
				
				select = sc.nextInt();
				
				if(game.checkSelectAbleNum(select)) {
					
					break;
				}
				System.out.println("다시 골라주세요!");
			}
			
			
			// 100% 올바른 숫자가 도착함
			boolean end = game.next(select);
			
			if(end) {
				System.out.printf("플레이어%d의 패배!!\n", game.getPlayer());
				break;
			}
			
		}
	}
	
	
}
