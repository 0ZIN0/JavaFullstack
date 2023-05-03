package gui;

import gui.quiz.register.regFrame;
import gui.quiz.registerAns.RegisterFrame;

public class S07_Register {
	
	/*
	 	회원가입 창을 만들어 보세요
	 	
	 	(1) 아이디, 비밀번호, 비밀번호 확인, 이름, 주민등록번호(123456-1XXXXXX), 이메일
	 	
	 	(2) 아이디 중복 체크 기능을 구현해야 한다
	 		중복체크를 진행하지 않으면 회원가입 버튼을 누를 때 경고가 나와야 한다
	 	
	 	(3) 회원가입 버튼을 눌렀을 때 입력한 내용들이 올바르지 않다면 
	 		올바르지 않은 곳에 빨간 글씨로 이유를 표시해줘야 한다
	 		
	 	(4) 회원가입 버튼을 눌렀을 때 모든 값들이 올바르다면 DB에 회원 정보를 저장한다
	 	
	 	(5) 비밀번호는 대문자, 소문자, 특수문자가 최소 하나 이상씩 포함되어있어야 하며
	 		6글자 이상이어야 한다 (언어는 영어만 허용)
	 	
	 	(6) 비밀번호, 비밀번호 확인은 회원가입 버튼을 눌렀을 때 확인하는 것이 아니라
	 		키보드를 입력할때마다 메세지가 실시간으로 변해야 한다
	 	
	 	
	 */
	
	public static void main(String[] args) {
		new RegisterFrame();
	}
}
