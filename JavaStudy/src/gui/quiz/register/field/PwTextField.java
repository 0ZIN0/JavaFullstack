package gui.quiz.register.field;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JPasswordField;

import gui.quiz.register.regFrame;

public class PwTextField extends JPasswordField{

	String pw;
	
	public PwTextField() {
		
		setBounds(50, 115, 200, 30);
	
	}

	@Override
	public char[] getPassword() {
		
		return super.getPassword();
	}
	
	public String getPw() {
		String pw = "";
		
		for(int i = 0; i < getPassword().length; i++) {
			pw += getPassword()[i];
		}
		
		return pw;
	}
}
