package quiz.D;

public class D09_CaesarCipher {
	
	/*
	 	# 시저 암호
	 	
	 	  알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘
	 	  키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고
	 	  암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화가 된다
	 */
	
	// 1. 평문과 키값이 전달되면 해당 평물을 암호문으로 만들어서 리턴해주는 메서드
	
	// 2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 만들어주는 메서드
	
	public static String chars = "ABCDEFGHIJKMNOPQRSTUVWYZ!@#$%^&*0123456789"
				+ "abcdefghijklmnopqrstuvwxyz[]/?;'";
	
	private static String encryption(String message, int key) {
		StringBuilder sb = new StringBuilder();
		
		int len = chars.length();
		char ch = 0;

		for(int i = 0; i < message.length(); i++) {
			if(chars.indexOf(message.charAt(i)) != -1) {
				if(chars.indexOf(message.charAt(i)) + key >= len) {
					ch = chars.charAt((chars.indexOf(message.charAt(i))+ key) % len);
				} else {
					ch = chars.charAt(chars.indexOf(message.charAt(i)) + key);
				}
			} else { 
				ch = message.charAt(i);
			}
			sb.append(ch);

		}
		return sb.toString();
	} 
	
	private static String decryption(String message, int key) {
		StringBuilder sb = new StringBuilder();
		
		int len = chars.length();
		char ch = 0;

		for(int i = 0; i < message.length(); i++) {
			if(chars.indexOf(message.charAt(i)) != -1) {
				System.out.print(message.charAt(i) + " => ");
				
				if(chars.indexOf(message.charAt(i)) - key < 0) {
					ch = chars.charAt(len + (chars.indexOf(message.charAt(i)) - key) % len);
					System.out.println(ch);
				} else {
					ch = chars.charAt(chars.indexOf(message.charAt(i)) - key);
					System.out.println(ch);
				}
			} else {
				ch = message.charAt(i);
			}
			
			sb.append(ch);
		}
		return sb.toString();
	} 
	
	public static void main(String[] args) {
		String result = encryption("My Message : Hello!!", 2002);
		
		System.out.println(result);
		System.out.println(decryption(result, 2002));
	}

	
	
}
