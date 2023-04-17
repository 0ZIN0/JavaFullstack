package quiz.E;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E09_FileDecryption {
	
	/*
	 	암호화 된 파일의 맨 위부터 50줄을 모든 키값으로 복호화한 샘플을 보여준 후
	 	사용자가 해당 키값을 선택하면 해당 키값으로 복호화한 파일을 생성하도록 만들어보세요
	 	(복호화한 파일의 확장자는 .dec이고 파일명 뒤에 decrypted를 추가할 것)
	 */
	public static File src = new File("files/frankenstein_encryoted.enc");
	public static File dst = new File("files/frankenstein_decryoted.dec");
	
	static String charset = "ABCDEFGHIJKMNOPQRSTUVWYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\" ";
	
	private static String decryption(String line, int key) {
		StringBuilder sb = new StringBuilder(line);
		
		int len = sb.length();
		int len2 = charset.length();
		key = key % charset.length();
				
		for(int i = 0; i < len; ++i) {
			int index = charset.indexOf(sb.charAt(i));
			if(index != -1) {
				sb.setCharAt(i, charset.charAt((index - key + len2) % len2));
			} 
		}
		return sb.toString();
	}
	public static void decryptSample() {
		try (
			FileReader fin = new FileReader(src);	
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(dst);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			String line;
			in.mark(1);
			for(int i = 1; i < charset.length() - 1; i++) {
				System.out.printf("=================================[key : %d]=====================================\n", i);
				for(int j = 1; j < 11; j++) {
					line = in.readLine();
					if(!line.equals("")) {
						System.out.print("line " + j + " : ");
						System.out.println(decryption(line + "\n", i));
					} else {
						--j;
					}
				}
				in.reset();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void decrypt(int key) {
		try (
			FileReader fin = new FileReader(src);	
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(dst);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			String line;
			int cnt = 0;
			while ((line = in.readLine()) != null) {
				out.append(
					decryption(line + "\n", key)
				);					
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			decryptSample();
			
			System.out.print("select decrypt num (1 ~ 74): >> ");
			int num = sc.nextInt();
			
			if(num >= 1 && num <= 74) {
				System.out.println("=========decrypting file==========");
				long start = System.currentTimeMillis();
				
				decrypt(num);
		
				System.out.printf("===========DONE[%dms]=============",
					(System.currentTimeMillis() - start));
				break;
			} 
		}		
	}
}
