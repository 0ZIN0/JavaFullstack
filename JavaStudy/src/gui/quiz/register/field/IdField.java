package gui.quiz.register.field;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JTextField;

import gui.study.button.RegButton;

public class IdField extends JTextField implements ActionListener{
	
	String id;
	RegButton btn = new RegButton();
	public IdField() {
		
		setBounds(50, 45, 200, 30);
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		System.out.println(id);
	}
}
