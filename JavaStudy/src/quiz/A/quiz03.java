package quiz.A;

import java.util.Random;

public class quiz03 {
	
	public static void main(String[] args) {
		
		// " 랜덤 번호 생성 기계"를 만든다
		Random ran = new Random();
		
		// "랜덤 번호 생성 기계"로 부터 번호를 하나씩 받아온다 (범위는 0 ~ 29)
		int a = ran.nextInt(30);
		int b = ran.nextInt(30);
		
		System.out.println("바꾸기 전 a : " + a);
		System.out.println("바꾸기 전 b : " + b);
		
		
		//코드를 추가해 두 변수의 값을 바꾸어 출력해보세요(다른 곳은 변경 불가능)
		int temp = a;
		a = b;
		b = temp;
		
		
		System.out.println("바꾼 후 a : " + a);
		System.out.println("바꾼 후 b : " + b);
		
	}
}
