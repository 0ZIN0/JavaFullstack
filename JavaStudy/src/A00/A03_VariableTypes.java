package A00;

public class A03_VariableTypes {
	
	/*
	 	# 정수 타입
	 	
	 	- byte 		(1byte)
	 		
	 		256가지의 값을 표현할 수 있다.
	 		byte타입 변수에 넣을 수 있는 정수의 범위 -128 ~ + 127
	 		
	 	- short 	(2byte)
	 		
	 		2^16가지의 값을 표현할 수 있음
	 		Short타입 변수에 넣을 수 있는 정수의 범위는 -32,768 ~ + 32,767
	 		
	 	- char 		(2byte, 양수만)
	 		
	 		2^16가지의 값을 표현할 수 있음
	 		char타입 변수에 넣을 수 있는 정수의 범위는 0 ~ 65,535
	 		
	 	- int 		(4byte)
			
			2^32가지의 값을 표현할 수 있음
			 
	 	- long 		(8byte)
	 		
	 		2^64가지의 값을 표현할 수 있음
	 		
	 	# 실수 타입
	 	
	 	- 부동 소수점 방식을 사용한다
	 	- float		(4byte)
	 	
	 	- double	(8byte)
	 	
	 	# 참/거짓 타입
	 	
	 	- boolean
	 	
	 	# 문자열
	 	
	 	- String
	 	
	 	# 그 외 모든 클래스들 ...
	 	
	 */
	public static void main(String[] args) {
	
		// 정수를 저장할 수 있는 변수 타입들
		byte b1 = 5;
		short short1 = 123;
		char char1 = 65535;
		
		//char타입에 저장하는 정수는 몇 번째 문자인지를 의미한다
		char1 = 70; //char타입에 저장한 정수는 출력할 때 숫자 대신 문자가 나온다
		char char2 = 50;
		
		// 문자 타입 값은 실제로 정수값이다
		char ch1 = 'a';
		char ch2 = 65;
		char ch3 = '家';
		char ch4 = 'A' + 25; // 문자는 정수이기 때문에 전수와의 계산이 가능하다
		
		// 문자 타입은 실제로 정수값이기 때문에 다른 정수 타입에 저장해도 된다.
		int i1 = 'B';
		int i2 = '가';
		int i3 = '家';
		
		System.out.println(ch1);
		System.out.println(b1);
		System.out.println(short1);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		//char타입은 각 번호에 해당하는 문자를 출력하게끔 되어있다
		System.out.println(char1);
		System.out.println(char2);
		
		// int의 범위는 대략 42억 ( +-21억)
		int int1 = 210000000;
		
		
		// int의 범위를 넘어가는 정수 뒤에는 L을 붙여야 한다(Long타입 리터럴이라는 표시)
		// 그냥 적는 정수는 기본적으로 컴파일러가 int로 인식하기 때문에 L이라고 표시를 해줘야 long이라고 인식할 수 있다
		
		long l1 = 111111111111111L;
		
		//그냥 소수를 적는 것은 컴파일러가 double이라고 받아들이기 때문에
		// 뒤에 F라고 표시를 해줘야 float으로 인식할 수 있다
		
		float f1 = 123.123F;
		double d1 = 123.123;
		
		//boolean 타입은 변수 이름이 아주 중요하다
		boolean boolean1 = true;
		boolean male = true;
		boolean female = false;
	
		
		// String 타입만 대문자로 시작한다
		// 대문자로 시작하는 모든 타입들을 참조형 변수 타입이라고 한다
		// 소문자로 시작하는 모든 타입들을 기본형 변수 타입이라고 한다
		String message = "문 앞에 놓고 가주세요";
	}
}
