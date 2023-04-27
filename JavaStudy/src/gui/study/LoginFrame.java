package gui.study;

import javax.swing.JFrame;

public class LoginFrame extends JFrame{

	LoginButton lBtn = new LoginButton();
	RegButton rBtn = new RegButton();
	IdField idField = new IdField();
	
	public LoginFrame() {
		
		add(lBtn);
		add(rBtn);
		add(idField);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280,720);
		setLocation(100, 100);
		setVisible(true);
	}
	
}
