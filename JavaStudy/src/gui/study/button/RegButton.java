package gui.study.button;

import java.awt.Font;

import javax.swing.JButton;

public class RegButton extends JButton{
	
	public RegButton() {
		
		setSize(450, 130);
		setLocation(100, 515);
		setText("회원가입");
		setFont(new Font("돋움", Font.BOLD,50));
	}
}
