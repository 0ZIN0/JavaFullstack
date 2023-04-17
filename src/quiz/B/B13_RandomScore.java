package quiz.B;

import java.util.Random;

public class B13_RandomScore {
	
	/*
	 	1. 100개의 점수 (0 ~ 100점)를 랜덤으로 생성하여 배열에 저장
	 	
	 	2. 배열에 저장된 값을 한 줄에 10개씩 출력
	 	   (60점 미만인 점수는 x로 표시)
	 	   
	 	3. 모든 점수의 평균을 출력 (소수 둘째 자리까지 출력)
	 	
	 	4. 가장 높은 점수와 가장 낮은 점수를 출력
	 */
	
	public static void main(String[] args) {
		
//		Random ran = new Random();
//		int[] score = new int[100];
//		
//		int totalScore = 0;
//		
//		int MAX_VALUE = 0;
//		int MIN_VALUE = 100;
//		
//		
//		for(int i = 0; i < score.length; i++) {
//			
//			score[i] = ran.nextInt(100) + 1;
//			
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			
//			if(score[i] < 60) {
//				System.out.print("x\t");
//				totalScore += score[i];
//			} else {
//				System.out.printf("%-3d\t", score[i]);
//				totalScore += score[i];
//			}
//			
//			
//			if((i + 1) % 10 == 0) {
//				System.out.println();
//			}
//			
//			if(MAX_VALUE < score[i]) {
//				MAX_VALUE = score[i];
//			}
//			
//			if(MIN_VALUE > score[i]) {
//				MIN_VALUE = score[i];
//			}
//			
//			
//			
//		}
//		
//		double avg = totalScore / 100.0;
//
//		System.out.println();
//		System.out.print("평균 : ");
//		System.out.printf("%.2f\n", avg);
//		
//		System.out.print("최고값 : ");
//		System.out.println(MAX_VALUE);
//		
//		System.out.print("최소값 : ");
//		System.out.println(MIN_VALUE);
		
		int[] scores = new int[100];
		
		for(int i = 0; i < scores.length; i++) {
			
			scores[i] = (int)(Math.random() * 101);
		}
		
		for(int i = 0; i < scores.length; i++) {
			
			if(scores[i] >= 60) {
				System.out.printf("%-4d", scores[i]);
			} else {
				System.out.printf("%-4c", 'X');
			}
			
			if(i % 10 == 9) {
				System.out.println();
			}
		}
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		double avg = 
				Math.round(sum / (double)scores.length * 100) / 100.0;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		int best = scores[0];
		int worst = scores[0];
		
		for(int i = 0; i < scores.length; i++) {
			
			if(best < scores[i]) {
				
				best = scores[i];
				
			}
			
			if(worst > scores[i]) {
				
				worst = scores[i];
				
			}
		}
	}
}
