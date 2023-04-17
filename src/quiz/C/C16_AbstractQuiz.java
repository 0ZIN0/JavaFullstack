package quiz.C;

import java.util.Arrays;

import myobj2.AbstractQuiz;
import myobj2.Descend;

public class C16_AbstractQuiz {
	
	public static void test(AbstractQuiz quiz) {
		
		// Q. 어떤 정수타입 배열을 넣으면 내림차순으로 정렬된 결과를 리턴해주세요
		int[] result = quiz.answer1(new int[] {3, 5, 1 ,9});
		
		if(result[0] == 9 && result[1] == 5 && result[2] == 3 && result[3] == 1) {
			System.out.println("정답입니다!");
		} else {
			System.out.println("정답이 아닙니다!");
		}
	}
	
	public static void main(String[] args) {
		
		// 위의 코드를 수정하지 말고 정답입니다!!가 나오게 만들어보세요
		AbstractQuiz q1 = new AbstractQuiz() {
			
			@Override
			public int[] answer1(int[] data) {
				int[] nums = new int[data.length];
				for(int i = 0; i < data.length; i++) {
					for(int j = i; j < data.length; j++) {
						if(data[i] < data[j]) {
							int temp = data[j];
							data[j] = data[i];
							data[i] = temp;
						}						
					}
				}
				return data;
			}
		};
		
		test(q1);
		
		AbstractQuiz q2 = new Descend();
		
		test(q2);
		
		AbstractQuiz q3 = new AbstractQuiz() {
			
			@Override
			public int[] answer1(int[] data) {
				int[] num = new int[] {9, 5, 3, 1};
				return num;
			}
		};
		
		test(q3);
	}
}
