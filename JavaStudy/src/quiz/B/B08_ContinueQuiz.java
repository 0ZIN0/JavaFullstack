package quiz.B;

public class B08_ContinueQuiz {
	
	/*
	 	1. 1부터 100 사이에 있는 3의 배수를 모두 출력
	 	
	 	2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌
	 	   숫자들을 모두 출력
	 	   
	 	3. 2번의 숫자들의 총합
	 */
	
	public static void main(String[] args) {
		
		// 1번
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2번
		for(int i = 0; i <= 200; i++) {
			if(i % 2 == 0 || i % 3 == 0) { 
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3번
		int sum = 0;
		for(int i = 0; i <= 200; i++) {
			if(i % 2 == 0 || i % 3 == 0) { 
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);
	}
}
