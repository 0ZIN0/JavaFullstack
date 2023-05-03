package gui.study;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class IdField extends JTextField{
	
	public IdField() {
		setBounds(100, 250, 450, 120);
		setText(" 휴대폰 번호");
		setFont(new Font("돋움", Font.BOLD,50));
		setForeground(new Color(211, 211, 211));
	}
}
