package quiz.B;

import java.util.Scanner;

public class B07_PrintReverse {
	
	/*
	 	사용자가 어떤 문장을 입력했을 때 해당 문장을 거꾸로 출력해보세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i = str.length() - 1; i >= 0 ; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	
}
