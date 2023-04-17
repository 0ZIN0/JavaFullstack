package quiz.B;

import java.util.Scanner;

public class B10_DownloadTime {
	
	/*
	 	다운로드에 필요한 시간이 초 단위로 입력된다면
	 	몇일 몇시간 몇분 몇초 남았는지 환산하여 출력하세요
	 	(단, 필요없는 단위는 출력하지 않아야 한다)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int day = n / 86400;
		int hour = n % 86400 / 3600;
		int minute = n % 86400 % 3600 / 60; 
		int second = n % 86400 % 3600 % 60;
		
		if(n >= 86400) {
			System.out.printf("%d일 %d시간 %d분 %d초", day, hour, minute, second);
		} else if(n >= 3600) {
			System.out.printf("%d시간 %d분 %d초", hour, minute, second);
		} else if(n >= 60) {
			System.out.printf("%d분 %d초", minute, second);
		} else {
			System.out.printf("%d초", second);
		}
		
	}
}
