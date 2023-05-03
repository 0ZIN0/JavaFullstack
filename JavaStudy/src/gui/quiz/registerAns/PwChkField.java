package gui.quiz.registerAns;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JLabel;
import javax.swing.JPasswordField;


public class PwChkField extends JPasswordField {
	
	public PwChkField(PwField pwField, JLabel stateLabel) {
		addKeyListener(new KeyAdapter() {
			
			public void keyReleased(KeyEvent e) {
				if(!pwField.getValid()) {
					stateLabel.setForeground(Color.red);
					stateLabel.setText("확인 전에 올바른 비밀번호를 입력하세요");
					return;
				}
				
				if(Arrays.equals(pwField.getPassword(), 
						getPassword())) {
					stateLabel.setForeground(new Color(0x1d6309));
					stateLabel.setText("확인");
				} else {
					stateLabel.setForeground(Color.red);
					stateLabel.setText("불일치");
				}

			}
		});	
	}
	
	
}
