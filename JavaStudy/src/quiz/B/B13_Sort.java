package quiz.B;

import java.util.Arrays;
import java.util.Random;

public class B13_Sort {
	
	/*
	 	1 ~ 100 사이의 랜덤 정수 값이 30개 들어있는 배열을 생성한 후
	 	
	 	(1) 해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 만들어 출력
	 		(오름차순, Ascending)
	 		
	 	(2) 해당 배열의 내용을 큰 값 부터 차례대로 저장한 새로운 배열을 만들어 출력
	 		(내림차순, Descending)
	 */
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[30];
		int[] ascending = new int[30];
		int[] descending = new int[30];
		
		for(int i = 0; i < 30; i++) {
			
			arr[i] = ran.nextInt(100) + 1;
			
		}
		
		System.out.println(Arrays.toString(arr));
//		for(int i = 0; i < 30; i++) {
//				
//			int temp = arr[0];
//			
//			for(int j = i + 1; j < 30; j++) {
//				
//				if(arr[i] < arr[j]) {
//					
//					temp = arr[i];
//					
//					arr[i] = arr[j];
//					
//					arr[j] = temp;
//				}
//			}
//			
//			ascending[i] = arr[i];
//		}
//		
//		for(int i = 0; i < 30; i++) {
//			
//			int temp = arr[0];
//			
//			for(int j = i + 1; j < 30; j++) {
//				
//				if(arr[i] > arr[j]) {
//					
//					temp = arr[i];
//					
//					arr[i] = arr[j];
//					
//					arr[j] = temp;
//				}
//			}
//			
//			descending[i] = arr[i];
//		}
		
		
			
		// 29번만 반복하면 모두 정렬했다고 확신할 수 있다
//		for(int i = 0; i < 29; i++) {
//				
//			int min = arr[i];
//			int min_index = i;
//				
//			for(int j = i + 1; j < arr.length; j++) {
//				if(min > arr[j]) {
//					min = arr[j];
//					min_index = j;
//				}	
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[min_index];
//			arr[min_index] = temp;
//			
//		}
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.printf("[정렬 %d단계]: %s\n", i + 1, Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));		
//		System.out.println("ascending : " + Arrays.toString(ascending));
//		System.out.println("descending : " + Arrays.toString(descending));
	}
}
