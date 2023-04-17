package quiz.B;

import java.util.Random;
import java.util.Scanner;

public class B11_Updown {
	
	/*
	 	# Updown 게임을 만들어 보세요
	 	
	 	1. 게임이 시작되면 1 ~ 200 사이의 랜덤 숫자를 정답으로 선택한다
	 	
	 	2. 사용자가 숫자를 입력하면 Up 인지 Down인지 알려준다
	 	
	 	3. 만약 사용자가 범위를 벗어나는 숫자를 입력했다면 
	 	   기회를 소진하지 않고 다시 입력할 수 있어야 한다
	 	
	 	4. 5번 안에 못맞추면 정답이 뭐였는지 출력해주고 프로그램을 종료한다
	 	
	 	5. 또는 사용자가 정답을 맞추면 몇 번만에 맞췄는지 출력해주고 프로그램을 종료한다
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Random ran = new Random();
//		
//		int ans = ran.nextInt(100) + 1;
//		System.out.println(ans);
//		
//		for(int i = 1; i <= 5; i++) {
//			
//			System.out.print("숫자 입력 : ");
//			int input = sc.nextInt();
//			
//			if (input > 100 || input < 0) {
//				
//				System.out.println("범위에 알맞은 값을 입력해주세요 (1 ~ 100)");
//				System.out.println(6 - i + "번 남았습니다");
//				i -= 1;
//				
//				continue;
//			}
//			
//			if (i == 5) {
//				
//				System.out.println("땡! 기회를 모두 소진하였습니다");
//				System.out.println("정답 : " + ans);
//				
//			} else if (input < ans) {
//				
//				System.out.println("UP");
//				System.out.println(5 - i + "번 남았습니다");
//				
//			} else if (input > ans) {
//				
//				System.out.println("DOWN");
//				System.out.println(5 - i + "번 남았습니다");
//				
//			} else if (input == ans){
//				
//				System.out.printf("정답! %d회만에 맞췄습니다", i);
//				break;
//				
//			} 		
//		}
		
		System.out.println("Game Start!");
		int answer = (int)(Math.random() * 100) + 1;
		
		int chance = 5;
		
		while (chance != 0) {
		System.out.print("Guess the number >> ");
		int num;
		
			while((num = sc.nextInt()) < 1 || num > 100) {
				System.out.printf("%d is a wrong number.\n", num);
				System.out.print("Input correct number >> ");
			}
			
			--chance;
			
			if (num == answer) {
				
				System.out.printf("%d는 정답이였습니다.(남은 횟수 : %d)\n", num, chance);
				break;
				
			} else if (num > answer) {
				
				System.out.printf("Down!! (남은횟수:%d)\n", chance);
				
			} else if (num < answer) {
				
				System.out.printf("Up!! (남은횟수:%d)\n", chance);
				
			}
		
		}
		
		System.out.printf("Game Over! 정답은 %d였습니다", answer);
	}
}
