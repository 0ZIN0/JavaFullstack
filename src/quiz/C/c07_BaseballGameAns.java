package quiz.C;

import java.util.Scanner;

import myobj.BaseballAns;

public class c07_BaseballGameAns {
	
	public static void main(String[] args) {
		
		BaseballAns game = new BaseballAns();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 야구 시작!!");
		
		while(!game.isEnd()) {
			
			System.out.printf("숫자 4개 (기회: %d) >>", game.chance);
			String number = sc.nextLine();
			
			if(BaseballAns.isBaseballGameString(number)) {
				// strike와 ball체크
				int[] count = game.check(number);
				
				System.out.printf("%dStrike %d ball\n", count[0], count[1]);
			} else {
				System.out.println("올바른 숫자를 입력해주세요...");
			}
		}
		
		System.out.printf("게임이 끝났습니다. 플레이어의 %s입니다.", game.result);
	}
}
