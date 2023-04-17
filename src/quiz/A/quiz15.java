package quiz.A;

import java.util.Scanner;

public class quiz15 {
	
	/*
	 	사용자로부터 숫자를 입력받으면
	 	0부터 해당 숫자 사이에 존재하는 모든 5의 배수를 한 줄에 10개씩 출력해보세요
	 	(단, 음수를 입력 받은 경우에도 올바르게 동작해야 합니다)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
//		if(num > 0) {
//			for(int i = 0, cnt = 0; i <= num; i++) {
//				if(i % 5 == 0 && i != 0) {
//					System.out.print(i + "\t");
//					if(cnt++ == 9) {
//						System.out.println();
//						cnt = 0;
//					}
//				}
//			}
//		} else {
//			for(int i = 0, cnt = 0; i >= num; i--) {
//				if(i % 5 == 0 && i != 0) {
//					System.out.print(i + "\t");
//					if(cnt++ == 9) {
//						System.out.println();
//						cnt = 0;
//					}
//				}
//			}
//		}
		
		boolean minus = num < 0;
		num = Math.abs(num);
		for(int i = 0, cnt = 1; i <= num; i++) {
			if(i % 5 ==0) {
				String format = "%" + 3 + "d";
				if(!minus) {
					System.out.printf(format, i);
				} else {
					System.out.printf(format, i);
				}
			if (cnt++ == 10) {
				System.out.println();
				cnt = 1;
			}
		}
		}
	}
}
