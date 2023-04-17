package quiz.A;

import java.util.Scanner;

public class quiz06 {
	
	/*
	 	사용자가 섭씨(℃)온도를 입력하면 화씨(℉)로
	 	몇 도인지 알려주는 프로그램을 만들어보세요
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨온도(℃)를 입력하세요 : ");
		float cTem = sc.nextFloat();
		
		float fTem = cTem * 9 / 5 + 32;
		
		System.out.printf("섭씨온도 %.2f℃를 화씨 온도로 환산하면 %.2f℉ 입니다.", cTem, fTem);
		
	}
}
