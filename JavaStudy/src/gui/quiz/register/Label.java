package gui.quiz.register;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Label extends JLabel{
	
	public Label(int num) {
		setSize(100, 30);
		setLocation(50, 20 + 70 * (num));
	}
}
