package quiz.B;

import java.util.Arrays;
import java.util.Random;

public class B13_sort2 {
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[] arr = new int[30];
		
		for(int i = 0; i < 30; i++) {
			
			arr[i] = ran.nextInt(100) + 1;
		}
		
		System.out.print(Arrays.toString(arr));
		System.out.println();
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}

}
