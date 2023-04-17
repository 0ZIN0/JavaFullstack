package quiz.A;

import java.util.Scanner;

public class quiz11 {
	
	/*
	 	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	 	각 과목의 점수와 등급, 평균 점수를 출력해주는 프로그램을 만들어보세요
	 	
	 	1. 90점 이상 A
           80점 이상 B
	 	   70점 이상 C
	 	   60점 이상 D
	 	   그 외 F
	 	
	 	2. 각 과목의 유효한 점수는 0~100점이다
	 	   유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고 평균 점수는 0점
	 	
	 	3. 평균 점수는 소수 둘째 자리에서 반올림하여 저장후 출력
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		char korGrade;
		char engGrade;
		char mathGrade;
		
		boolean cheating = kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100;
		
	// 국어 점수
		if (kor <= 100 && kor >= 90) {
			korGrade = 'A';
		} else if (kor < 90 && kor >= 80) {
			korGrade = 'B';
		} else if (kor < 80 && kor >= 70) {
			korGrade = 'C';
		} else if (kor < 70 && kor >= 60) {
			korGrade = 'D';
		} 
		else {
			korGrade = 'F';
		}
		
	// 영어 점수	
		if (eng <= 100 && eng >= 90) {
			engGrade = 'A';
		} else if (eng < 90 && eng >= 80) {
			engGrade = 'B';
		} else if (eng < 80 && eng >= 70) {
			engGrade = 'C';
		} else if (eng < 70 && eng >= 60) {
			engGrade = 'D';
		} 
		else {
			engGrade = 'F';
		}
	
	//수학 점수
		if (math <= 100 && math >= 90) {
			mathGrade = 'A';
		} else if (math < 90 && math >= 80) {
			mathGrade = 'B';
		} else if (math < 80 && math >= 70) {
			mathGrade = 'C';
		} else if (math < 70 && math >= 60) {
			mathGrade = 'D';
		} 
		else {
			mathGrade = 'F';
		}
	
	// 예외 점수 처리		
//		if (kor > 100 || kor < 0) {
//			avg = 0;
//			korGrade = 'F';
//			engGrade = 'F';
//			mathGrade = 'F';
//		} else if(eng > 100 || eng < 0) {
//			avg = 0;
//			korGrade = 'F';
//			engGrade = 'F';
//			mathGrade = 'F';
//		} else if(math > 100 || math < 0) {
//			avg = 0;
//			korGrade = 'F';
//			engGrade = 'F';
//			mathGrade = 'F';
//		}
	// 예외 점수 처리	
		if (cheating) {
			kor = 0;
			eng = 0;
			math = 0;
			korGrade = 'F';
			korGrade = 'F';
			mathGrade = 'F';
		}
		
		
			
	// 출력		
		System.out.println("========================");
		System.out.println("국어 점수 : " + kor);
		System.out.println("국어 등급 : " + korGrade);
		System.out.println("========================");
		System.out.println("영어 점수 : " + eng);
		System.out.println("영어 등급 : " + engGrade);
		System.out.println("========================");
		System.out.println("수학 점수 : " + math);
		System.out.println("수학 등급 : " + mathGrade);
		System.out.println("========================");
		System.out.printf("평균 점수 : %.2f",Math.round(avg * 100) / 100.0);
	}
}
