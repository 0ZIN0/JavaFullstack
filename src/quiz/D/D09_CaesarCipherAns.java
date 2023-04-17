package quiz.D;

public class D09_CaesarCipherAns {
	
	
	static String charset = "ABCDEFGHIJKMNOPQRSTUVWYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'";
	
	private static String encryption(String message, int key) {
		StringBuilder sb = new StringBuilder(message);
		
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
	
	private static String decryption(String message, int key) {
		StringBuilder sb = new StringBuilder(message);
		
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
	
	public static void main(String[] args) {
		String result = encryption("My Message : Hello!!", 13);
		System.out.println("암호화 결과 : " + result);
		
		System.out.println("복호화 결과 : " + decryption(result, 13));

	}

	

	
}
