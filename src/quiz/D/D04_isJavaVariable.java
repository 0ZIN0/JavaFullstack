package quiz.D;

import javax.lang.model.SourceVersion;

public class D04_isJavaVariable {
	
	/*
	 	문자열을 매개변수로 전달하면 해당 문자열이 자바 변수로 사용할 수 있는 문자열인지
	 	검사해주는 메서드를 만들어보세요
	 */
	
	public static Boolean isJavaVariable(String str) {
		if(SourceVersion.isKeyword(str)) {
			System.out.println("예약어라서 안됩니다.");
			return false;
		}
		if(!Character.isJavaIdentifierStart(str.charAt(0))) {
			System.out.println("첫 번째 글자가 문제입니다.");
			return false;
		}
		
		for(int i = 1; i < str.length(); i++) {
			if(!Character.isJavaIdentifierPart(str.charAt(i))) {
				System.out.println(i + "번째 글자가 문제입니다");
				return false;			
			}
		}
		return true;
	}
	public static void main(String[] args) {

		System.out.println(isJavaVariable("123"));
		// SourceVersion.isKeywor() : 전달한 문자열이 예약어인지 검사해준다
		System.out.println(SourceVersion.isKeyword("int"));
		System.out.println(SourceVersion.isKeyword("java"));
		System.out.println(SourceVersion.isKeyword("abstract"));
	}
	
	
}
