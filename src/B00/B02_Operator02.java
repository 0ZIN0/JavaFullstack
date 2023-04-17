package B00;

public class B02_Operator02 {
	
	/*
	 	# 비교 연산자
	 		
	 	  두 값을 비교하는 연산
	 	  비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다
	 	   (비교 연산의 결과는 boolean 타입이다)
	 	  산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 한다
	 	  
	 	# 논리 연산자
	 	
	 	  두 boolean 타입 값으로 연산하는 연산자
	 	  && : 두 값이 모두  true일 때 true (AND)
	 	  || : 둘 값 중 하나만 true 여도 true (OR)
	 	  ! : true면 false, false면 true (NOT)
	 */
	
	public static void main(String[] args) {
		
		int a = 10, b = 10;
		
		System.out.println(a > b); // > : 왼쪽이 크면 true
		System.out.println(a < b); // < : 오른쪽이 크면 true
		System.out.println(a >= b); // >= : 왼쪽이 크거나 같으면 true
		System.out.println(a <= b); // <= : 오른쪽이 크거나 같으면 true
		System.out.println(a == b); // == : 두 값이 같으면 true
		System.out.println(a != b); // != : 두 값이 다르면 true
		
		// 비교 연산을 하기 전에 산술 연산을 먼저 한다
		System.out.println(5 * 5 < 10 + 7);
		
		// a를 2로 나누었을때 나머지가 0이면 true (a에 짝수가 들어있으면 true)
		System.out.println(a % 2 == 0);
		
		// a가 5의 배수가 아닐때 true
		System.out.println(a % 5 != 0);
		
		System.out.println("##### AND #####");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		// AND 연산은 앞의 조건이 false가 나오면 뒤의 연산은 굳이 수행하지 않는다
		
		
		System.out.println("##### OR #####");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// OR 연산은 앞의 조건이 true가 나오면 뒤의 연산은 굳이 수행하지 않는다
		
		System.out.println("##### NOT #####");
		System.out.println(!true);
		System.out.println(!false);
		
		// true, false 자리에 비교연산을 넣어 사용할 수 있다
		int c = -99;
		
		System.out.println("c가 양수이면서 3의 배수인가요? ");
		System.out.println(c > 0 && c % 3 == 0);
	}
}
