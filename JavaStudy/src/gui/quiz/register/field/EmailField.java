package gui.quiz.register.field;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class EmailField extends JTextField implements ActionListener{
	
	String email;
	
	public EmailField() {
		setBounds(50, 395, 200, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		email = e.getActionCommand();
	}
}
