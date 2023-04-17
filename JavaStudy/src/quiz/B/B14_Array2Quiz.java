package quiz.B;

import java.util.Arrays;
import java.util.Random;

public class B14_Array2Quiz {
	// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
	
	// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기
			
	// 3. myArr의 각 행(row)의 합을 구해서 출력하기
			
	// 4. myArr의 각 열(column)의 합을 구해서 출력하기
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] myArr = {
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1},
				{1, 1, 1, 1, 1},
				{1, 1},
				{1, 1, 1, 1}
		};
		
		// change 100 ~ 200
		for(int i = 0; i < myArr.length; i++) {
			
			for(int j = 0; j < myArr[i].length; j++) {
				
				myArr[i][j] = ran.nextInt(100) + 100; 
			}
		}
		
		// print myArr
		for(int i = 0; i < myArr.length; i++) {
					
			System.out.printf("myArr[%d] : %s\n",
					i, Arrays.toString(myArr[i]));
			
		}
		System.out.println();
		
		// sum, length, longestRow
		int sum = 0;
		int length = 0;
		int longestRow = 0;
		
		for(int i = 0; i < myArr.length; i++) {
			
			int cnt = 0;
			
			for(int j = 0; j < myArr[i].length; j++) {
				
				sum += myArr[i][j];
				
				length++;
				cnt++;
				
				if(longestRow < cnt) {
					
					longestRow = cnt;
				}
			}
		}
		
		// avg
		double avg = sum / (double)length;
		
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.2f\n", avg);
		System.out.println();
		
		// sumRow
		for(int i = 0; i < myArr.length; i++) {
			
			int sumRow = 0;
			
			for(int j = 0; j < myArr[i].length; j++) {
				
				sumRow += myArr[i][j]; 
			}
			
			System.out.printf("sum myArrRow[%d] : %d\n",
					i, sumRow);

		}
		System.out.println();
		
		// sumColumn
		for(int i = 0; i < longestRow; i++) {
					
			int sumColumn = 0;
					
			for(int j = 0; j < myArr.length && 
					i < myArr[j].length; j++) {
				
					sumColumn += myArr[j][i];
			
			}
			
			System.out.printf("sum myArrColumn[%d] : %d\n",
					i, sumColumn);
		}
		
		// better than
		int[] colSum = new int[longestRow];
		
		for(int i = 0; i < myArr.length; i++) {
			
			for(int j = 0; j < myArr[i].length; j++) {
				
				colSum[j] += myArr[i][j];
			}
		}
	}
}
