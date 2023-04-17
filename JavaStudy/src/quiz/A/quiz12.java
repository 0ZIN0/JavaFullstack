package quiz.A;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class quiz12 {
	
	/*
	 	사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요
	 	(switch-case, if)
	 	
	 */
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out));
		
		bw.write("월 입력 : ");
		bw.flush();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int month = Integer.parseInt(st.nextToken());
		
		switch(month) {
		case 12 : case 1 : case 2 :
			bw.write("겨울");
			break;
		case 3 : case 4 : case 5 :
			bw.write("봄");
			break;
		case 6 : case 7 : case 8 :
			bw.write("여름");
			break;
		case 9 : case 10 : case 11 :
			bw.write("겨울");
			break;
		default :
			bw.write("1 ~ 12월 중에 입력하세요");
			break;
		}
		br.close();
		
		bw.flush();
		
		bw.close();
	}
}
