package quiz.baekjoon;

import java.util.Scanner;

import javax.lang.model.SourceVersion;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i < n - 1; i += 6) {
			if(n - 1 - i <= 0) {
				break;
			} else {
				n -= i;
			}
			cnt++;
		}
		System.out.println(cnt + 1);	
	}
}
