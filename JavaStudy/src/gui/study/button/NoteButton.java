package gui.study.button;

import java.awt.Font;

import javax.swing.JButton;

public class NoteButton extends JButton{
	
	public NoteButton() {
		setSize(280, 200);
		setLocation(950, 445);
		setText("유의사항");
		setFont(new Font("돋움", Font.BOLD,50));
	}
}
