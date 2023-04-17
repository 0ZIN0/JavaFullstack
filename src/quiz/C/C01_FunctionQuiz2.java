package quiz.C;

import java.util.Arrays;
import java.util.Random;

public class C01_FunctionQuiz2 {
	
	/*
	 	1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 함수
	 	
	 	2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 	
	 	3. 문자열을 전달하면 해당 문자열을 거꾸로 한 문자열을 반환하는 함수
	 	
	 	4. 메서드를 호출하면 1 ~ 45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수
	 */
	
	public static int howManyBasket(int apple, int size) {
		
		return (int)Math.ceil(apple / (double)size);
	}
	
	public static String shake(String word) {
		
		char[] wordArr = word.toCharArray();
		String shake = "";
		
		for(int i = 0; i < 100; i++) {
			
			int randomIndex = (int)(Math.random() * wordArr.length);
			char temp = wordArr[0];
			wordArr[0] = wordArr[randomIndex];
			wordArr[randomIndex] = temp;
			
		}
		
		for(int i = 0; i < wordArr.length; i++) {
			shake += wordArr[i];
		}
		
		return shake;
		
	}
	
	public static String reverse(String word) {
		
		char[] wordArr = word.toCharArray();
		String reverse = "";
		
		for(int i = word.length() - 1; i >= 0; i--) {
			
			reverse += wordArr[i];
		}
		
		return reverse;
	}
	
	public static int[] nums() {
		
		Random ran = new Random();
		
		int[] nums = new int[7];
		
		for(int i = 0; i < 7; i++) {
			
			nums[i] = ran.nextInt(45) + 1; 
			
			for(int j = 0; j < i; j++) {
				
				if(nums[i] == nums[j]) {
					
					i--;
				}
			}
		}
		
		return nums;
	}

	public static void main(String[] args) {
		
		System.out.println(howManyBasket(12, 5));
		System.out.println(shake("applejam"));
		
		System.out.println(reverse("applejamtastegood"));
		System.out.println(Arrays.toString(nums()));
	}
}
