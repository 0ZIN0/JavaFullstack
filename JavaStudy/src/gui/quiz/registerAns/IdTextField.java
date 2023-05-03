package gui.quiz.registerAns;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.quiz.keyevent.ValidIdCheckKeyEvent;

public class IdTextField extends JTextField {
	
	private boolean valid;
	
	public IdTextField(JLabel stateLabel) {
		
		// KeyAdapter :
		// KeyListener의 모든 메서드를 구현하고 싶지 않을 때 사용하는 추상 클래스
		addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				// Ctrl, Shift등 KeyChar가 아닌 경우에는 이벤트를 무시
				if(e.getKeyChar() == KeyEvent.CHAR_UNDEFINED) {
					return;
				}
				
				// 입력된 값이 영어와 숫자로만 이루어져있지 않으면 state 메세지를 변경
//				System.out.println("방금 입력: " + e.getKeyChar());
//				System.out.println("전체 메세지 : " + 
//				((JTextField)e.getComponent()).getText());
				String text = ((JTextField)e.getComponent()).getText();
//				
//				System.out.println("올바른 형식의 아이디인가?" + 
//						Pattern.matches("[a-zA-Z0-9]{6,}", text));
				
				if(Pattern.matches("[a-zA-Z0-9]{6,}", text)) {
					stateLabel.setForeground(new Color(0x1d6309));
					stateLabel.setText("사용 가능");
					valid = true;
				} else {
					stateLabel.setForeground(Color.red);
					stateLabel.setText("사용 불가능");
					valid = false;
				}
			}
		});	
	}
	public boolean isValid() {
		return valid;
	}
	
}
