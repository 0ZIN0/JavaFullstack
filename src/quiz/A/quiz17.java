package quiz.A;

import java.util.Scanner;

public class quiz17 {
	
	/*
	 	사용자가 어떤 숫자를 입력하면 (int 타입)
	 	해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 
	 	123456 -> 6
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int time = 1;
		while(num / 10 != 0) {
				num /= 10;
				time++;
		}
		System.out.println(time);	
		
		for(int i = num; i > 0; i /= 10) {
			System.out.println("num" + i);
			++time;
		}
		System.out.println(time);
	}
}

