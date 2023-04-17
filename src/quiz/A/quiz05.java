package quiz.A;

import java.util.Scanner;

public class quiz05 {
	
	/*
	 	사용자가 태어난 해를 입력하면 한국 나이를 알려주는 
	 	프로그램을 만들어보세요
	 	(단, 생일 계산은 하지 않습니다)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난해를 입력하세요 : ");
		int birthYear = sc.nextInt();

		int thisYear = 2023;
		int age = thisYear - birthYear + 1;
		
		System.out.printf("%d년에 태어난 사람의 %d년의 나이는 %d세입니다 ", birthYear, thisYear, age);
		
	}
	
}
