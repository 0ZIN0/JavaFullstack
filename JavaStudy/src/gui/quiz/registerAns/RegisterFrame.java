package gui.quiz.registerAns;

import java.awt.Color;
import java.nio.charset.CoderMalfunctionError;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisterFrame extends JFrame{
	
	final public static Color RED = Color.RED;
	final public static Color GREEN = new Color(0x1d6309);
	
	JLabel idLabel = new JLabel("아이디");
	JLabel pwLabel = new JLabel("비밀번호");
	JLabel pwChkLabel = new JLabel("비밀번호 확인");
	JLabel nameLabel = new JLabel("이름");
	JLabel socialNumberLabel = new JLabel("주민등록번호");
	JLabel emailLabel = new JLabel("이메일");
	
	JLabel idStateLabel = new JLabel();
	JLabel pwStateLabel = new JLabel();
	JLabel pwChkStateLabel = new JLabel();
	JLabel nameStateLabel = new JLabel();
	JLabel socialNumberStateLabel = new JLabel();
	JLabel emailStateLabel = new JLabel();
	
	JTextField idField = new IdTextField(idStateLabel);
	PwField pwField = new PwField(pwStateLabel);
	JPasswordField pwChkField = new PwChkField(pwField, pwChkStateLabel);
	JTextField nameField = new JTextField();
	JTextField socialNumberField = new JTextField();	
	JTextField emailField = new JTextField();
	
	JButton duplIdBtn = new IdDuplChkButton(idField, idStateLabel);
	JButton joinBtn = new JoinButton(this);
	
	public RegisterFrame() {
		
		idLabel.setBounds(10, 10, 100, 30);
		pwLabel.setBounds(10, 70, 100, 30);
		pwChkLabel.setBounds(10, 130, 100, 30);
		nameLabel.setBounds(10, 190, 100, 30);
		socialNumberLabel.setBounds(10, 250, 100, 30);
		emailLabel.setBounds(10, 310, 100, 30);
		
		idStateLabel.setBounds(100, 30, 300, 30);
		pwStateLabel.setBounds(100, 90, 300, 30);
		pwChkStateLabel.setBounds(100, 150, 300, 30);
		nameStateLabel.setBounds(100, 210, 300, 30);
		socialNumberStateLabel.setBounds(100, 270, 300, 30);
		emailStateLabel.setBounds(100, 330, 300, 30);
		
		
		idField.setBounds(100, 10, 200, 26);
		pwField.setBounds(100, 70, 200, 26);
		pwChkField.setBounds(100, 130, 200, 26);
		nameField.setBounds(100, 190, 200, 26);
		socialNumberField.setBounds(100, 250, 200, 26);
		emailField.setBounds(100, 310, 200, 26);
		
		duplIdBtn.setBounds(350, 10, 90, 26);
		joinBtn.setBounds(50, 360, 90, 26);
		
		add(idLabel);
		add(pwLabel);
		add(pwChkLabel);
		add(nameLabel);
		add(socialNumberLabel);
		add(emailLabel);
		
		add(idField);
		add(pwField);
		add(pwChkField);
		add(nameField);
		add(socialNumberField);
		add(emailField);
		
		add(idStateLabel);
		add(pwStateLabel);
		add(pwChkStateLabel);
		add(nameStateLabel);
		add(socialNumberStateLabel);
		add(emailStateLabel);
		
		add(duplIdBtn);
		add(joinBtn);
		
		setTitle("회원가입");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(100, 100);
		setSize(500, 450);
		setVisible(true);
	}
}
