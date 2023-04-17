package quiz.C;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_LottoGame {
	
	/*
	  	# 로또 게임 만들기
	 	
	 	1. 당첨 번호는 7개 매 판 무작위로 선정
	 	
	 	2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야 한다
	 	
	 	3. 1등, 앞에 6개 숫자를 모두 맞춤 (+10억)
	 	   2등, 보너스 번호를 포함한 6개의 숫자를 모두 맞춤 (+ 1억)
	 	   3등, 5개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+ 1000만원)
	 	   4등, 4개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+ 100만원)
	 	   5등, 3개의 숫자를 모두 맞춤 (보너스 번호 미포함) (+ 5000원)
	 	
	 	6. 플레이어가 게임을 종료할 때까지 게임이 계속 반복되어야 한다
	 	
	 	ex> 
	 	
	 		1. 수동구매	 2. 자동구매 		3. 현재까지의 이력 확인 				4. 게임 종료 
	 									(현재 사용금액 현황, 당첨 횟수, 손익계산)
	 	
	*/
	public static int[] lotto() {
		
		Random ran = new Random();
		
		int[] lotto = new int[7];
		
		for(int i = 0; i < 7; i++) {
			
			lotto[i] = ran.nextInt(45) + 1; 
			
			for(int j = 0; j < i; j++) {
				
				if(lotto[i] == lotto[j]) {
					
					i--;
				}
			}
		}
		
		return lotto;
	}
	
	public static int[] auto() {
		
		Random ran = new Random();
		
		int[] auto = new int[6];
		
		for(int i = 0; i < 6; i++) {
				
			auto[i] = ran.nextInt(45) + 1; 
				
			for(int j = 0; j < i; j++) {
					
				if(auto[i] == auto[j]) {
						
					i--;
				}
			}
		}
		
		return auto;
	}
	
	public static boolean hasBonus(int[] lotto, int[] check) {
		
		boolean hasBonus = false;
		for(int i = 0; i < lotto.length; i++) {
			
			hasBonus |= lotto[i] == check[5];
			
		}
		
		return hasBonus;
	}
	
	public static int winCount(int[] lotto, int[] check) {
		
		int winCount = 0;
		for(int i = 0; i < lotto.length; i++) {
			
			for(int j = 0; j < check.length; j++) {
				if(lotto[i] == check[j]) {
					++winCount;
				}
			}
		}
		
		return winCount;

	}
	
	public static void record(int pay, int win, int money, int fst, int snd, int trd, int forth, int fifth) {
		
		System.out.println("현재 사용금액 현황 : " + pay);
		System.out.println("당첨횟수 : " + win);
		System.out.println("1등 : " + fst);
		System.out.println("2등 : " + snd);
		System.out.println("3등 : " + trd);
		System.out.println("4등 : " + forth);
		System.out.println("5등 : " + fifth);
		System.out.println("당첨 금액 : " + money);
		System.out.println("손익 : " + (money - pay));
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		int win = 0;
		int pay = 0;
		int fst = 0;
		int snd = 0;
		int trd = 0;
		int forth = 0;
		int fifth = 0;
		boolean game = true;
		
		while(game) {
			
			int[] lotto = lotto();
			
			System.out.println("1. 수동구매 2. 자동구매 3. 현재까지 이력 확인 4. 게임 종료");
			System.out.print(">> ");
			int select = sc.nextInt();
			
			switch(select) {
				
				case 1 :
					
					pay += 1000;
					
					int[] manual = new int[6];
					
					System.out.print("수동 번호 입력 : ");
					for(int i = 0; i < 6; i++) {
						
						manual[i] = sc.nextInt();
						
					}
					
					if (winCount(lotto, manual) == 6) {
						
						if(hasBonus(lotto, manual)) {
							
							System.out.println("2등 당첨!");
							money += 10000000;
							win++;
							snd++;
						} else {
							
							System.out.println("1등 당첨!!");
							money += 100000000;
							win++;
							fst++;
						}	
						
					} else if (winCount(lotto, manual) == 5) {
						
						if(!hasBonus(lotto, manual)) {
							
							System.out.println("3등 당첨");
							money += 1000000;
							win++;
							trd++;
						}
						
					} else if (winCount(lotto, manual) == 4) {
						
						if(!hasBonus(lotto, manual)) {
							
							System.out.println("4등 당첨");
							money += 1000000;
							win++;
							forth++;
						}
						
					} else if (winCount(lotto, manual) == 3) {
						
						if(!hasBonus(lotto, manual)) {
							
							System.out.println("5등 당첨");
							money += 5000;
							win++;
							fifth++;
						}
						
					} else {
						
						System.out.println("낙첨");
					}
					System.out.println("당첨번호 : " + Arrays.toString(lotto));
					break;
					
				case 2 :
					
					System.out.println("횟수 선택 >> ");
					int cnt = sc.nextInt();
					pay += 1000 * cnt;
					
					for(int k = 0; k < cnt; k++) {
						
						int[] auto = auto();
						
						if (winCount(lotto, auto) == 6) {
							
							if(hasBonus(lotto, auto)) {
								
								System.out.println("2등 당첨! " + Arrays.toString(auto));
								money += 10000000;
								win++;
								snd++;
							} else {
								
								System.out.println("1등 당첨!! " + Arrays.toString(auto));
								money += 100000000;
								win++;
								fst++;
							}	
							
						} else if (winCount(lotto, auto) == 5) {
							
							if(!hasBonus(lotto, auto)) {
								
								System.out.println("3등 당첨 " + Arrays.toString(auto));
								money += 1000000;
								win++;
								trd++;
							}
							
						} else if (winCount(lotto, auto) == 4) {
							
							if(!hasBonus(lotto, auto)) {
								
								System.out.println("4등 당첨 " + Arrays.toString(auto));
								money += 1000000;
								win++;
								forth++;
							}
							
						} else if (winCount(lotto, auto) == 3) {
							
							if(!hasBonus(lotto, auto)) {
								
								System.out.println("5등 당첨 " + Arrays.toString(auto));
								money += 5000;
								win++;
								fifth++;
							}
							
						} else {
							
							System.out.println("낙첨");
						}
					}
					System.out.println("당첨번호 : " + Arrays.toString(lotto));
					break;
					
				case 3 :
					
					record(pay, win, money, fst, snd, trd, forth, fifth);
					break;
					
				case 4 :
					
					game = false;
					System.out.println("Good Bye");
					break;
			}
			
			
		}
		
	}
}
