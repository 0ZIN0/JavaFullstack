package quiz.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AnotherScanner {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		
		// 스캐너보다 성능이 더 좋은 대신에 한 줄씩 밖에 입력 받지 못 한다
		System.out.print("입력해보셈 > ");
		String line = in.readLine();
		
		System.out.println("input : " + line);
		
		// 입력받은 내용을 숫자로 변환시키는 방법(*숫자가 아닌 경우 에러 발생)
		int value = Integer.parseInt(line);
		
		System.out.println(value);
	}
}
