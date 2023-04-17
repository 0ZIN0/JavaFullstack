package quiz.A;

import java.util.Scanner;

public class quiz09 {
	
	/*
	  # 알맞은 조건식을 만들어보세요
	  
	  1. char형 변수 a가 'q' 또는 'Q'일 때 true
	  2. char형 변수 b가 공백이나 탭이 아닐 때 true
	  3. char형 변수 c가 '0' ~ '9'일 때 true
	  4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	  5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
	  6. 사용자가 입력한 문자열이 quit일 때 true
	 */
	public static void main(String[] args) {
		
		// 1번
		char a = 'a';
		boolean result1 = a == 'q' || a == 'Q';
		System.out.println(result1);
		
		// 2번
		char b = ' ';
		boolean result2 = b != ' ' || b != '\t';
		System.out.println(result2);
		
		// 3번
		char c = '2';
		boolean result3 = c >= '0' && c <= '9';
		System.out.println(result3);
		
		// 4번
		char d = 's';
		boolean result4 = (d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z');
		System.out.println(result4);
		
		// 5번
		char e = 'a';
		boolean result5 = e >= 44032 && e <= 55203;
		System.out.println(result5);
		
		// 6번
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = sc.nextLine();
		
		// 참조형 변수타입의 ==은 같은 주소를 가리키고 있는지를 비교하는 것
		// equals는 가지고 있는 실제 값이 같은지를 비교하는 것
		boolean result6 = str.equals("quit");
		
		System.out.println(result6);
	}
}
