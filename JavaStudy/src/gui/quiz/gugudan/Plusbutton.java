package gui.quiz.gugudan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

public class Plusbutton extends JButton implements ActionListener{
	
	GugudanFrame parent;
	
	public Plusbutton(GugudanFrame parent) {
		this.parent = parent;
		setText("+");
		setSize(80, 80);
		setLocation(430, 300);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(Gugudanbutton btn : parent.gugudans) {
			btn.setDan(btn.getDan() + 1);
		}
	}
}
