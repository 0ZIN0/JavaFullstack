package gui.quiz.register.field;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class NameField extends JTextField implements ActionListener{
	
	String name;
	
	public NameField() {
		setBounds(50, 255, 200, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		name = e.getActionCommand();
		System.out.println(name);
	}
}
