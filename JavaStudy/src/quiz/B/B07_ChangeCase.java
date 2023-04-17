package quiz.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B07_ChangeCase {
	
	/*
	 	사용자가 문장을 입력하면
	 	대문자는 소문자로 소문자는 대문자로 출력해보세요
	 	(영어가 아닌 문자는 그대로 출력)
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		String str = br.readLine();
		
//		System.out.println(str);
		
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				System.out.print((char)(str.charAt(i) - 32));
			} else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				System.out.print((char)(str.charAt(i) + 32));
			} else {	
				System.out.print(str.charAt(i));
			}
		}
	}
}
