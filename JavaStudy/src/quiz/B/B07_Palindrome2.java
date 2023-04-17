package quiz.B;

import java.util.Scanner;

public class B07_Palindrome2 {
	
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print(">> ");
		String word = sc.next();
		int len = word.length();
		// 1. 단어 내의 모든 대문자를 소문자로 바꾼다
		// 2. 거꾸로 뒤집는다
		// 3. 원본과 거꾸로 뒤집은 문자열이 일치하면 좌우대칭이다
	
		String lowerCase = "";

		for(int i = 0; i < len; i ++) {
			
			char ch = word.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') {
				
				ch += 32;
			}
			
			lowerCase += ch;
		}
		
		System.out.println(lowerCase);
		
		String wordReverse = "";
		
		for(int i = len - 1; i >= 0; i--) {
			
			wordReverse += lowerCase.charAt(i); 
		
		}
		
		System.out.println(wordReverse);
		
		if(lowerCase.equals(wordReverse)) {
			
			System.out.println("좌우대칭입니다");
			
		} else {
			
			System.out.println("좌우대칭이 아닙니다");
			
		}
	}
}
