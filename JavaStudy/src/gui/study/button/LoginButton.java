package gui.study.button;

import java.awt.Font;

import javax.swing.JButton;

public class LoginButton extends JButton{
	
	public LoginButton() {
		setSize(280, 200);
		setLocation(650, 230);
		setText("로그인");
		setFont(new Font("돋움", Font.BOLD,50));
	}
}
