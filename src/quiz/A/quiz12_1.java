package quiz.A;

import java.util.Scanner;

public class quiz12_1 {
	
	public static void main(String[] args) {
		

		System.out.print("월 입력 : ");
		// 스캐너를 만든 후 변수에 저장하지 않으면 다시 쓸 수 없다
		int month = new Scanner(System.in).nextInt();
		
		// 이렇게 만든 스캐너는 재사용 할 수 없다
		
		int value = new Scanner(System.in).nextInt();
		
		if(month == 12 || month == 1 || month == 2) {
			
			System.out.println("겨울");
		} else if(month == 3 || month == 4 || month == 5) {
			
			System.out.println("봄");
		} else if(month == 6 || month == 7 || month == 8) {
			
			System.out.println("여름");
		} else if(month == 9 || month == 10 || month == 11) {
			
			System.out.println("가을");
		} else {
			
			System.out.println("1 ~ 12월 중에 입력하세요");
		}
	}
}