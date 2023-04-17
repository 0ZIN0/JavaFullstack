package quiz.B;

import java.util.Scanner;

public class B06_CountE {
	
	/*
	 	사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇번이나 등장하는지
	 	알려주는 프로그램을 만들어보세요
	 	(대/소문자 모두 세어야 함)
	 */
	
	public static void main(String[] args) {
		
		// charAt() : 문자열의 한 글자를 꺼내오기
		// .length() : 문자열의 전체 길이를 알아내기
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'e' || str.charAt(i) == 'E') {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		
	}
}
