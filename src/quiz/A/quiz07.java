package quiz.A;

import java.util.Scanner;

public class quiz07 {
	
	/*
	 	한국 돈을 입력하면 달러로 얼마인지 출력해주는 
	 	프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Ctrl + Shift + O : 자동 import 단축키
		
		System.out.print("한국 돈 입력 : ");
		
		int won = sc.nextInt();
		// double exchangeRate = 1299.5;
		// double dollar = won / exchangeRate;
		double dollar = won * 0.00077;
		
		//System.out.printf("%d원은 오늘 원/달러 환율로 %.2f달러입니다", won, dollar);
		System.out.printf("%d원은 %.2f$입니다.\n", won, dollar);
		
		
		
	}
}
