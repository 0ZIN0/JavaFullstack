package quiz.B;

public class B11_Count369 {
	
	/*
	 	10 ~ 30000 사이의 랜덤 양의 정수를 하나 생성하고
	 	해당 숫자까지 369 게임이 진행된다면
	 	박수를 총 몇 번 쳐야 하는지 출력해보세요
	 	
	 */
	
	public static void main(String[] args) {
		
		int ranNum = (int)(Math.random() * 30000 + 10);
		
//		System.out.println(num);
//		
//		for(int i = 0; i < num; i++) {
//			
//			String str = "";
//			
//			str += i;
//			
//			for(int j = 0; j < str.length(); j++) {
//				
//				if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
//				
//					System.out.println(i);
//					
//					cnt++;
//				}
//			}
//		}
//		
//		System.out.println(cnt);
		int cnt = 0;
	 
		System.out.println("이번의 목표 숫자는 " + ranNum + "입니다.");
		
		for(int num = 1; num <= ranNum; ++num) {
			
			System.out.println(num + ": ");
			
			int check = num;
			
			while(check > 0) {
				
				int digit = check % 10;
				
				if(digit == 3 || digit == 6 || digit == 9) {
					
					System.out.print("짝");
					cnt++;
				}
				
				check /= 10;
			}

			System.out.println();
		}
	}
}
