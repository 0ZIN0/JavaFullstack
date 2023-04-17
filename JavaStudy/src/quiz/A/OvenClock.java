package quiz.A;

import java.util.Scanner;

public class OvenClock {
	
	/*
	 	오븐 시계에 시간을 추가하면 시간이 올바르게 계산되도록 만들어보세요
	 	시간(0 ~ 23), 분(0 ~ 59)
	 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookTime = sc.nextInt();
		
		hour = hour + cookTime / 60;
		minute = minute + cookTime % 60;
		
		if (minute > 59) {
			hour = hour + 1;
			minute = minute % 60;
		}	
		
		System.out.printf("%d %d", hour % 24, minute);
	}
}
