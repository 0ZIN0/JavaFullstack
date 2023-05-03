package gui.study;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class PwTextField extends JTextField {
	
	public PwTextField() {
		setBounds(100, 380, 450, 120);
		setText(" 비밀번호 6자리");
		setFont(new Font("돋움", Font.BOLD,50));
		setForeground(new Color(211, 211, 211));
	}
}
