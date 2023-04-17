package quiz.B;

import java.util.Scanner;

public class B07_Palindrome {
	
	/*
	 	사용자가 단어를 입력하면
	 	해당 단어가 좌우대칭인지 판별해주는 프로그램을 만들어보세요
	 	
	 	>> LEVEL
	 	-> 좌우대칭입니다
	 	
	 	>> Level
	 	-> 좌우대칭입니다
	 	
	 	>> APPLE
	 	-> 좌우대칭이 아닙니다
	 	
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toUpperCase();
		int len = str.length();
		int cnt = 0;
		
		for(int i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) == str.charAt(len - 1 - i)) {
				cnt++;
			}
		}
		if(cnt == len / 2) {
			System.out.println("좌우대칭입니다");
		} else {
			System.out.println("좌우대칭이 아닙니다");
		}
// ////////////////////////////////////////////////////////////////////////////////////	
		int mid = len / 2;
		
		String lowercase = "";
		for(int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			
			//str에서 꺼낸 문자가 대문자인 경우 소문자로 변경하여 누적시키기
			if(ch >= 'A' && ch <= 'Z') {
				ch += 32;
			}
			lowercase += ch;
		}
		boolean isPalindrome = true;
		
		for(int  i = 0; i < mid; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(len - 1 - i);
			
			isPalindrome &= ch1 == ch2;
			
			if(ch1 == ch2) {
				System.out.printf("%d번째 문자와 %d번째 문자가 일치합니다.\n", i, len - 1 - i);
			} else {
				System.out.printf("%d번째 문자와 %d번째 문자는 불일치합니다.\n", i, len - 1 - i);
			}
		}
		System.out.println("Palindrome 여부 : " + isPalindrome);
		
		
				
		
	}
}
