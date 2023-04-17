package quiz.C;

import java.util.Arrays;
import java.util.Random;

import myobj.FishBread;

public class CountFishbread {
	
	/*
	 	(1) 붕어빵을 100개 만들고 어떤 붕어빵이 몇 개 있는지 세어보세요
	 	    (단, 붕어빵의 맛은 만들 때 랜덤으로 결정되어야 함)
	 	
	 	(2) 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는
	 	    함수를 만들어보세요
	 	    
	 	 ※ 붕어빵의 맛 종류 - 슈크림, 팥, 초코 
	 	 ※ 붕어빵의 가격 - 팥 : 800원, 슈크림 : 1000원, 초코 1200원
    
	*/
	
	public static int totalPrice(FishBread[] fishes) {
		
		int sum = 0;
		
		for(int i = 0; i < fishes.length; i++) {
			
			sum += fishes[i].getPrice();
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		FishBread[] fishes = new FishBread[100];
		
		for(int i = 0; i < 100; i++) {
			
			fishes[i] = new FishBread();
			fishes[i].info();
		}
		
		System.out.printf("총 각격 : %d원", totalPrice(fishes));
	}
}
