package quiz.D;

import java.util.Arrays;
import java.util.Scanner;

public class D08_isPhoneNumber {
	
	/*
	 	사용자로부터 입력받은 문자열이
	 	유효한 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 	
	 */
	
	public static Boolean isPhoneNum(String phoneNum) {
		
		// - 안올때 : 01012341234 / 11자리
		// - 올때 : 010-1234-1234 / 13자리
		int len = phoneNum.length();
			
		if (len != 11 && len != 13) {
			System.out.println("문자열의 길이가 전화번호 길이가 아닙니다");
			return false;
		}
		Boolean hypen = phoneNum.charAt(3) == '-' && 
				phoneNum.charAt(8) == '-';
		
		if(len == 13) {
			if(!hypen) {
				System.out.println("-자리에 다른 문자가 있습니다");
				return false;
			}
			phoneNum = phoneNum.replace("-", "");
			len = phoneNum.length();
			if(len != 11) {
				return false;
			}
		}
		Boolean numStart = phoneNum.startsWith("010");
		
		if(!numStart) {
			System.out.println("010으로 시작하지 않는 번호입니다.");
			return false;
		}
		for(int i = 0; i < len; i++) {
			if(!Character.isDigit(phoneNum.charAt(i))) {
				System.out.println("번호 부분에 숫자가 "
						+ "아닌 문자가 있습니다");
				return false;
			} 
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String phoneNum = sc.nextLine();
		
		System.out.println(isPhoneNum(phoneNum));
	}
}
