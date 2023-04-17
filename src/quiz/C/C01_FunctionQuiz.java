package quiz.C;

import java.util.Arrays;
import java.util.Scanner;

public class C01_FunctionQuiz {
	
	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	  1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	  
	 	  2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	  
	 	  3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	 	  
	 	  4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	  
	 	  5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	  
	 	  6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	 */
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean alphabet(char c) {
		
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
		
	}
	// 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean multipleThree(int num) { 
		
		return num % 3 == 0;
	
	}
	// 3. 숫자를 하나 전달하면 문자열 "짝수입니다" 또는 "홀수입니다"를 반환하는 함수
	public static String evenOdd (int num) {
		
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
		
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] subMultiple (int num) {
		
		// null : 아직 가리키는게 없음
		// 배열 또는 대문자로 시작하는 타입을 초기화 할 때 사용한다
		
		int[] subMultiple = null;
		
		int count = 0;
		int size = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				// 새로운 약수가 발견될때마다 크기가 1 증가한 배열을 새로 생성
				int[] newArr = new int[++size];
				
				// 이전 배열의 내용을 모두 새로운 배열에 복사 (비어있지 않다면)
				if(subMultiple != null) {
					
					for (int j = 0; j < subMultiple.length; j++) {
						
						newArr[j] = subMultiple[j];
					}
				}
				
				// 새로운 배열의 맨 마지막에 새로 발견한 약수를 추가
				newArr[newArr.length - 1] = i;
				
				// 방금 새로 만든 배열을 약수 배열로 만든다
				subMultiple = newArr;
			}
		}
		
		return subMultiple;
		
	}
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean prime (int num) {
		
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) {
				
				cnt++;
				
			}
		}
		
		return cnt == 2;
	}
	
	// 6. 메세지와 횟수를 전달하면 해당 메세지를 전달한 횟수만큼 반복하는 함수
	public static void message(String str, int num) {
		
		for(int i = 0; i < num; i++) {
			
			System.out.print(str + " ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		if (alphabet(sc.next().charAt(0))) {
			
			System.out.println("알파벳입니다");
			
		} else {
			
			System.out.println("알파벳이 아닙니다");
		}
		
		
		System.out.print("2 : ");
		System.out.println(multipleThree(7));
		
		System.out.print("3 : ");
		evenOdd(5);
		
		System.out.print("4 : ");
		System.out.println(Arrays.toString(subMultiple(10)));
		
		System.out.print("5 : ");
		System.out.println(prime(4));
		
		System.out.print("6 : ");
		message("hello", 4);
	}
}
