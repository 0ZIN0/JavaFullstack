package quiz.A;

public class quiz14 {
	
	/*
	 	1. 1000 ~ 2000 사이의 8의 배수를 모두 출력해보세요
	 	
	 	2. 100 ~ 300까지의 총합을 구해보세요
	 	
	 	3. 1000부터 1500까지 10의 배수를 한 줄에 7개씩 출력해보세요
	 	
	 */
	
	public static void main(String[] args) {
		
		// 1번
		// for문 안에 if문도 사용할 수 있다
		for(int i = 1000; i <= 2000; i++) {
			if(i % 8 == 0) {
				System.out.println(i);
			}
		}
		
		// 2번
		int sum = 0;
		for(int i = 100; i <= 300; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 3번
		for(int i = 1000; i <= 1500; i++) {
			if(i % 10 == 0) {
				System.out.print(i + " ");
			} else if(i % 70 == 19) {
				System.out.println();
			}
		}
		

		for(int i = 1000, count = 0; i <= 1500; ++i) {
			if (i % 10 == 0) {
				System.out.print(i + " ");
				if(count++ == 6) {
					System.out.println();
					count = 0;
				}
			}

		}
	}
}


