package gui.study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import gui.study.button.CheckOutButton;
import gui.study.button.LoginButton;
import gui.study.button.NoteButton;
import gui.study.button.RegButton;
import gui.study.button.ResetPwButton;

public class LoginFrame extends JFrame{

	LoginButton lBtn = new LoginButton();
	RegButton rBtn = new RegButton();
	CheckOutButton cBtn = new CheckOutButton();
	ResetPwButton rsBtn = new ResetPwButton();
	NoteButton nBtn = new NoteButton();
	IdField idField = new IdField();
	PwTextField pwField = new PwTextField();
	File file = new File("images/flower.jpeg");
	
	public LoginFrame() throws IOException {
//		setLayout(new BorderLayout());
		
		BufferedImage img = ImageIO.read(file);
//		Image changeImg = img.getScaledInstance(1280, 200, img.SCALE_SMOOTH);
		JLabel lb = new JLabel(new ImageIcon(img));
		lb.setBounds(220, 0, 1280, 200);
		
		add(lBtn);
		add(rBtn);
		add(cBtn);
		add(rsBtn);
		add(nBtn);
		
		add(idField);
		add(pwField);
		
		add(lb);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1280,720);
		setLocation(100, 100);
		setVisible(true);
	}
	
}
