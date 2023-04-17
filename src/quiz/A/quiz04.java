package quiz.A;

public class quiz04 {
	
	public static void main(String[] args) {
		
		// 요즘은 메모리 용량이 넉넉하기 때문에 메모리 절약을 위한 선택은 거의 하지 않는다
		// 정수 앞에 0b를 붙이는 것은 2진수로 인식한다
		// 정수 앞에 0을 붙이는 것은 8진수로 인식한다
		// 정수 앞에 0x를 붙이는 것은 16진수로 인식한다
		String name = "홍길동";
		int age = 20;
		String tel = "010-1234-1234";
		double height = 178.5;
		double weight = 75;
		String blood = "O";
		
		System.out.println("==========출력결과==========");
		System.out.println("이름	: " + name);
		System.out.println("나이	: " + age);
		System.out.println("TEL	: " + tel);
		System.out.println("키	: " + height);
		System.out.println("몸무게	: " + weight);
		System.out.println("혈액형	: " + blood);
		
	}
}
