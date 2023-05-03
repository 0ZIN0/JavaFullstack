package gui.quiz.register.field;

import javax.swing.JPasswordField;

public class PwCheckField extends JPasswordField{
	
	public PwCheckField() {
		setBounds(50, 185, 200, 30);
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
