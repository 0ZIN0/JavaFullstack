package quiz.A;

public class quiz08 {
	
	/*
	   # 알맞은 비교 연산을 만들어보세요
	   
	   1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	   2. int형 변수 b가 짝수일 때 true
	   3. int형 변수 c가 7의 배수일 때 true
	   4. int형 변수 d와 e의 차이가 30일 때 true
	   5. int형 변수 year가 400으로 나누어 떨어지거나
	   	  또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true (윤년)
	   6. boolean형 변수 powerOn이 false일 때 true
	   7. 문자열 참조 변수 str이 "yes"일 때 true
	   
	 */
	public static void main(String[] args) {
		
		// 1번
		int a = 21;
		System.out.println(a > 10 && a < 20);
		
		// 2번
		int b = 111;
		System.out.println(b % 2 == 0);
		
		// 3번
		int c = 15;
		System.out.println(c % 7 == 0);
		
		// 4번
		int d = 37;
		int e = 70;
		System.out.println(Math.abs(d - e) == 30);
		
		// 5번
		// &&d와 ||가 나란히 있을 때는 &&를 먼저 한다
		int year = 2000;
		// System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		boolean isLeapYear = 
				(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.printf("%d는 윤년입니까 %s\n", year, isLeapYear);
		
		// 6번
		boolean powerOn = true;
		// System.out.println(powerOn == false);
		System.out.println(!powerOn);
		
		// 7번
		// 문자열(대문자로 시작하는 타입)은 ==으로 비교하면 안됨
		String str = "y";
		// System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		
		// 참조형 변수는 equals() 메서드로 비교해야 한다
		// (모든 참조형 변수는 equals() 메서드를 보유하고 있다)
	}
	
}
