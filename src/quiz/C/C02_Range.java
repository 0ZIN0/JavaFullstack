package quiz.C;

import java.util.Arrays;

public class C02_Range {
	
	/*
	 	
	 	1. 최대값을 인자로 전달하면 0 버터 최대값 미만의 int[]를 생성하여 반환하는
	 	   range 함수를 만들어보세요
	 	   ex> range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	 	
	 	2. 최소값과 채대값을 인자로 전달하면
	 	   최소값부터 최대값 미만의 int[]을 생성하여 반환하는
	 	   range 함수를 만들어 보세요
	 	
	 	   ex> range(10, 15)의 결과 -> [10, 11, 12, 13, 14]
	 	   	   range(15, 10)의 결과 -> [15, 14, 13, 12, 11]
	 	
	 	3. 최소값 최대값 증가값을 인자로 전달하면
	 	   최소값부터 최대값 미만까지 증가값만큼 증가하는 int[]을 반환하는
	 	   range 메서드를 만들어 보세요
	 	
	 	   ex> range(30, 40, 2) -> [30, 32, 34, 36, 38]
	 		   range(50, 40, -3) -> [50, 47, 44, 41]
	 		   range(50, 40, 5) -> []
	 	
	*/
	
	public static int[] range(int max) {
		
		int[] arr = new int[max];
		
		for(int i = 0; i < max; i++) {
			
			arr[i] = i;
		}
		
		return arr;
	}
	
	public static int[] range(int start, int end) {
		

		int[] arr = new int[Math.abs(start - end)];
		
		boolean direction = start < end;
		
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = start + (direction ? i : -i);
			}
		
		return arr;
	}

	public static int[] range(int start, int end, int add) {
		
		// start - end의 결과가 -일 때 add가 양수여야 한다
		// start - end의 결과가 + 일 때 add가 음수여야 한다
		int diff = start - end;
		
		int size = diff / add;
		
		// size값이 양수가 나오는 경우는 방향이 잘못된 경우이므로 반환이 필요하다	
		if(size >= 0) {
			
			return new int[]{};
		}
		
		// 차이와 증가값이 나누어 떨어지지 않는다면 1개 더 필요하다
		size = diff % add == 0 ? size : size - 1;
		size = Math.abs(size);
		
		int[] arr = new int[size];
		
		for(int i = 0; i < size; ++i) {
			
			arr[i] = start + add * i;
		}
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(range(8)));
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		System.out.println(Arrays.toString(range(20, 40, 2)));
		System.out.println(Arrays.toString(range(50, 40, -3)));
		System.out.println(Arrays.toString(range(50, 40, 5)));
	}
	
	
}
