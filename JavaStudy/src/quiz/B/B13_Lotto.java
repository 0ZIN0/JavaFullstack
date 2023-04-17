package quiz.B;

import java.util.Arrays;
import java.util.Random;

public class B13_Lotto {
	
	/*
 	1. 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 당첨 번호를 만들어보세요
 	
 	2. 당첨될때까지 랜덤 로또 번호를 계속 생성하여 몇 번만에 당첨되었는지 출력해보세요
 	(1) 번호는 6개씩 뽑아야 한다
 	(2) 6개의 번호가 모두 일치하더라도 마지막 번호가 포함되어있으면 2등
 	(3) 마지막 번호가 포함되지 않은채로 6개의 번호가 일치하면 1등
 */
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		
//		int[] winLotto = new int[7];
//		int[] auto = new int[6];
//		
//		 // generate winLotto
//		 for (int i = 0; i < 7; i++) {
//	         
//			 winLotto[i] = ran.nextInt(45) + 1;
//	         
//			 for (int j = 0; j < i; j++) {
//	        	 
//	        	 if (winLotto[i] == winLotto[j]) {
//	                    
//	        		 i--;
//	             }
//	         }
//	     }
//		 
//		 // print win number
//		 System.out.print("win number : ");
//		 for(int i = 0; i < 7; i++) {
//			
//			 System.out.print(winLotto[i] + " ");
//		 }
//		 System.out.println();
//		 
//		 // count try
//		 int cnt = 0;
//		 
//		 // generate auto
//		 while(true) {
//			 
//			 cnt++;
//			 
//			 for (int i = 0; i < 6; i++) {
//		           
//				 auto[i] = ran.nextInt(45) + 1;
//				 
//				 for (int j = 0; j < i; j++) {
//		        	 
//		        	 if (auto[i] == auto[j]) {
//		                    
//		        		 i--;
//		             }
//		         }
//		     }
//			 
//			 // count win number
//			 int winCnt = 0;
//			 
//			 // check
//			 boolean[] same = new boolean[7];
//			 
//			 for(int i = 0; i < 7; i++) {
//				
//				
//				 for(int j = 0; j < 6; j++) {
//					 
//					 if(winLotto[i] == auto[j]) {
//						 
//						 same[i] = true;
//						 winCnt++;
//					 }
//				 } 
//			 }
//			 
//			 // if 6 number same -> print prize, try
//			 if(winCnt >= 6) {
//				
//				 // 1st
//				 if(!same[6]) {
//					 
//					 System.out.print("1st prize! : ");
//					 for(int i = 0; i < 6; i++) {
//							
//						 System.out.print(auto[i] + " ");
//					 }
//					 System.out.println();
//					 System.out.println(cnt  +  " try");
//					 
//				 // 2nd	 
//				 } else {
//					
//					 System.out.print("2nd prize! : ");
//					 for(int i = 0; i < 6; i++) {
//							
//						 System.out.print(auto[i] + " ");
//					 }
//					 System.out.println();
//					 System.out.println(cnt +  " try");
//					 
//				 }
//				 
//				 break;
//			 }
//			 
//		 }
		
		int[] winNum = new int[7];
		
		// 새로 숫자를 추가한 후에 예전 숫자들 중에 그 숫자가 존재하는지 검사
		for(int i = 0; i < winNum.length; i++) {
			
			int newNum = (int)(Math.random() * 45 + 1);
			
			for(int chk = 0; chk < i; chk++) {
				// 새로 뽑은 숫자와 같은 숫자가 발견되면 새 번호를 뽑고
				// 처음부터 검사한다
				if(winNum[chk] == newNum) {
					
					newNum = (int)(Math.random() * 45 + 1);
					chk = -1;
					
				}
			}
			
			winNum[i] = newNum;
		
		}
		
		// Arrays.toString(arr) : 전달한 배열을 보기 좋은 형태의 문자열로 반환
		System.out.println(Arrays.toString(winNum));
		System.out.println("Bonus Number : " + winNum[6]);
		
		
		int[] userNum = new int[6];
		
		int buyCount = 0;
		
		while (true) {
			
			for(int i = 0; i < userNum.length; i++) {
				
				int newNum = (int)(Math.random() * 45 + 1);
				
				for(int chk = 0; chk < i; chk++) {
					// 새로 뽑은 숫자와 같은 숫자가 발견되면 새 번호를 뽑고
					// 처음부터 검사한다
					if(userNum[chk] == newNum) {
						
						newNum = (int)(Math.random() * 45 + 1);
						chk = -1;
						
					}
				}
				
				userNum[i] = newNum;
			
			}	
			
			// userNum과 winNum과 일치하는 번호가 6개면 1등 또는 2등 당첨
			++buyCount;
			
			int winCount = 0;
			boolean hasBonus = false;
			
			for(int i = 0; i < userNum.length; i++) {
				
				hasBonus |= userNum[i] == winNum[6];
				
				for(int j = 0; j < winNum.length; j++) {
					if(userNum[i] == winNum[j]) {
						++winCount;
					}
				}
			}
			
			if (winCount == 6) {
				
				if(hasBonus) {
					System.out.println("2등 당첨 ? " + Arrays.toString(userNum));
				} else {
					System.out.println("1등 당첨 ? " + Arrays.toString(userNum));
					System.out.println(buyCount + "만에 1등 당첨!");
					break;
				}
										
			}
		}
			
	 }
}	
		

