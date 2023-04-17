package quiz.B;

import java.util.Scanner;

public class B08_Numeric {
	
	/*
	 	사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
	 	판별하는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int i = 0;
		for(i = 0; i < str.length(); i++) {
			if(str.charAt(i) <= '0' || str.charAt(i) >= '9') {
				System.out.println("x");
				break;
			}
		}
		if(i == str.length()) {
			System.out.println("모두 숫자입니다");
		}
	}
}
