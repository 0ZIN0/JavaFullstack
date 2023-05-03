package gui.quiz.register.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.quiz.register.regFrame;
import gui.quiz.register.field.EmailField;
import gui.quiz.register.field.IdField;
import gui.quiz.register.field.PwTextField;

public class RegButton extends JButton implements ActionListener{
	
	IdField idField = new IdField();
	
	public RegButton() {
		setBounds(320, 333, 100, 100);
		setText("회원 가입");
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(idField.getText());
		
	}
}
