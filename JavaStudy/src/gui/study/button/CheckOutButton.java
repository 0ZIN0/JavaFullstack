package gui.study.button;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class CheckOutButton extends JButton {
	
	public CheckOutButton() {
		setSize(280, 200);
		setLocation(950, 230);
		setText("퇴실하기");
		setFont(new Font("돋움", Font.BOLD,50));
		
	}
}
