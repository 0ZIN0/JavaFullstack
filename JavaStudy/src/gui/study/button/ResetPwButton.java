package gui.study.button;

import java.awt.Font;

import javax.swing.JButton;

public class ResetPwButton extends JButton{
	
	public ResetPwButton() {
		setSize(280, 200);
		setLocation(650, 445);
		setText("<html><center>비밀번호<br>"
				+ "재설정</center></html>");
		setFont(new Font("돋움", Font.BOLD,50));
	}
}
