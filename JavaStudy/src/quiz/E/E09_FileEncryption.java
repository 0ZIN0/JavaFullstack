package quiz.E;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import quiz.D.D09_CaesarCipherAns;

public class E09_FileEncryption {
	
	/*
	 	frankenstein.txt를 시저 암호방식으로 암호화 한 파일
	 	frankenstein_encryoted.enc를 생성해보세요
	 	
	 	(1) byte 방식으로 한 글자씩 암호화하는 속도를 측정해보기
	 	
	 	(2) char 방식으로 한 글자씩 암호화하는 속도를 측정해보기
	 	
	 	(3) char[] 방식으로 암호화하는 속도를 측정해보기
	 	
	 	(4) 버퍼 방식을 사용해 암호화하는 속도 측정해보기
	 */
	public static File scr = new File("files/frankenstein.txt");
	public static File dst = new File("files/frankenstein_encryoted.enc");

	
	static String charset = "ABCDEFGHIJKMNOPQRSTUVWYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\" ";
		
	private static char encryption(char ch, int key) {
		
		int index = charset.indexOf(ch);
		if(index == -1) {
			return ch;
		}
		return ch = charset.charAt((index + key) % charset.length());
	}
	
	private static String encryption(String line, int key) {
		StringBuilder sb = new StringBuilder(line);
		
		int len = sb.length();
		
		for(int i = 0; i < len; ++i) {
			
			char ch = sb.charAt(i);
			int index = charset.indexOf(ch);
			
			if(index != -1) {
				sb.setCharAt(i, 
						charset.charAt((index + key) % charset.length()));
			}
		}
		return sb.toString();
	}
	
	private static char[] encryption(char[] buff, int key) {
		
		for(int i = 0; i < buff.length; i++) {
			int index = charset.indexOf(buff[i]);
			buff[i] = charset.charAt((index + key) % charset.length());
		}
		return buff;
	}
	
	private static void encrypt1(int key) {
		
		try(
			FileInputStream in = new FileInputStream(scr);
			FileOutputStream out = new FileOutputStream(dst);
		) {
			int b;
			while ((b = in.read()) != - 1) {
					char ch = encryption((char)b, key);
					out.write(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	private static void encrypt2(int key) {
		
		try(
			FileReader in = new FileReader(scr);
			FileWriter out = new FileWriter(dst);
		) {
			int ch;
			while ((ch = in.read()) != - 1) {
					ch = encryption((char)ch, key);
					out.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	private static void encrypt3(int key) {
		
		try(
			FileReader in = new FileReader(scr);
			FileWriter out = new FileWriter(dst);
		) {
			char[] buff = new char[1024];
			int len;
			while ((len = in.read(buff)) != -1) {
				for(int i = 0; i < len; i++) {
					out.write(encryption(buff[i], key));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static void encrypt4(int key) {
		
		try (
			FileReader fin = new FileReader(scr);	
			BufferedReader in = new BufferedReader(fin);
			FileWriter fout = new FileWriter(dst);
			BufferedWriter out = new BufferedWriter(fout);
		) {
			// Buffered 한 글자 씩
//			int ch;
//			while((ch = in.read()) != -1) {
//				out.append(
//						encryption((char)ch, 1)
//				);		
//			}
			
			// Buffered 한줄 씩
			String line;
			while ((line = in.readLine()) != null) {
				out.append(
					encryption(line + "\n", key)
				);					
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
		long start = System.currentTimeMillis();
//		encrypt1(1);
		System.out.println("time1(byte): " + (System.currentTimeMillis() - start) + "ms");
		start = System.currentTimeMillis();
		encrypt2(2);
//		System.out.println("time2(char): " + (System.currentTimeMillis() - start) + "ms");
//		start = System.currentTimeMillis();
//		encrypt3(1);
//		System.out.println("time3(char[]): " + (System.currentTimeMillis() - start) + "ms");
//		start = System.currentTimeMillis();
//		encrypt4(1);
//		System.out.println("time4(buffered): " + (System.currentTimeMillis() - start) + "ms");
	}
}
