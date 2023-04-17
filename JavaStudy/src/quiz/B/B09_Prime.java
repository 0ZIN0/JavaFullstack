package quiz.B;

import java.util.Scanner;

public class B09_Prime {

	/*
	 	소수(prime) :  나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 	
	 	사용자가 숫자를 입력하면
	 	1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	 	(사용자가 1 이하의 정수를 입력하는 경우 다시 입력하게 만들것)
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		for(; (num = sc.nextInt()) < 2;);
			
		for(int target = 2; target <= num; ++target) {
			
//			System.out.println("이번에 소수인지 검사해야 하는 숫자 : " + target);
			
			int cnt = 0;
			
			for(int divider = 1; divider <= target; ++divider) {
				
//				System.out.printf("%d %% %d = %d\n", 
//						target, divider, target % divider);
				
				if(target % divider == 0) {
					
					cnt++;
					
				}

			}
			
			if(cnt == 2) {
				
				System.out.printf("%d ", target);
			}
			
		}
		
		
		// target의 제곱근까지만 대입, 약수가 하나라도 존재하면 소수가 아니다
		for(int target = 2; target <= num; ++target) {
			
			boolean sosu  = true;
			
			double targetRoot = Math.sqrt(target);
			
			for(int divider = 2; sosu && divider <= targetRoot; ++divider) {
				
				sosu &= target % divider != 0;
				
//				if(target % divider == 0) {
//					
//					sosu = false;
//					
//					break;
//				}
			}
			
			if(sosu) {
				
				System.out.println(target);
				
			} 
		}
	}
}
