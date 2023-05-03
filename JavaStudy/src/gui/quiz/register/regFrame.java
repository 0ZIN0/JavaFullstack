package gui.quiz.register;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.quiz.register.button.IdCheckButton;
import gui.quiz.register.button.RegButton;
import gui.quiz.register.dao.RegDAO;
import gui.quiz.register.field.EmailField;
import gui.quiz.register.field.IdField;
import gui.quiz.register.field.NameField;
import gui.quiz.register.field.PwCheckField;
import gui.quiz.register.field.PwTextField;
import gui.quiz.register.field.RegNumField;

public class regFrame extends JFrame{
	
	IdField idField = new IdField();
	NameField nameField = new NameField();
	PwTextField pwField = new PwTextField();
	PwCheckField pwCkField = new PwCheckField();
	RegNumField regNumField1 = new RegNumField();
	RegNumField regNumField2 = new RegNumField();
	EmailField emailField = new EmailField();
	IdCheckButton idCkBtn = new IdCheckButton();
	RegButton regBtn = new RegButton();
	RegDAO reg = new RegDAO();
	Boolean checkId = false;
	Boolean checkPw = false;
	
	String[] labels = new String[] {"ID 입력", "비밀번호", "비밀번호 확인", "이름", "주민등록번호", "이메일"};
	
	public regFrame() {
		
		User user = new User();
		JLabel alert1 = new JLabel();
		alert1.setBounds(100, 20, 200, 30);
		alert1.setForeground(Color.RED);
		alert1.setText("중복체크 해주세요");
		add(alert1);
		
		JLabel alert2 = new JLabel();
		alert2.setBounds(110, 90, 200, 30);
		alert2.setForeground(Color.RED);
		alert2.setText("비밀번호를 입력해주세요");
		add(alert2);
		
		JLabel alert3 = new JLabel();
		alert3.setBounds(140, 160, 200, 30);
		alert3.setForeground(Color.RED);
		add(alert3);
		
		JLabel lb = new JLabel();
		lb.setBounds(135, 330, 30, 30);
		lb.setText("-");
		lb.setFont(new Font("돋움", Font.BOLD,20));
		add(lb);
		
		for(int i = 0; i < labels.length; i++) {
			Label label = new Label(i);
			label.setText(labels[i]);
			add(label);
		}
		
		add(pwField);
		pwField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			
			}	
			@Override
			public void keyReleased(KeyEvent e) {
				if(!Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
						pwField.getPw())) {
					alert2.setText("올바르지 않은 형식입니다");
					alert2.setForeground(Color.red);
				} else {
					alert2.setText("");
					checkPw = true;
				}
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		pwCkField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if(!pwField.getPw().equals(pwCkField.getPw())) {
					alert3.setText("비밀번호가 맞지 않습니다.");
					checkPw = false;
				} else {
					alert3.setText("");
					checkPw = true;
				}
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		regNumField1.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent ke) {
				JTextField src = (JTextField) ke.getSource();
				if(src.getText().length() >= 6) {
					ke.consume();
				}
			}
			
		});

		
		add(regNumField2);
		regNumField2.setBounds(145, 325, 30, 30);
		add(pwCkField);
		add(idField);
		add(nameField);
		add(regNumField1);
		add(emailField);
		
		add(idCkBtn);
		idCkBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 System.out.println(idField.getText());
				 if(Pattern.matches("[!-~]*", idField.getText())) {
					 if(reg.checkIdDup(idField.getText())) {
						System.out.println("check ID");
							
						alert1.setForeground(Color.red);
						alert1.setText("중복된 아이디 입니다.");
						checkId = false;
					} else {
						alert1.setForeground(Color.GREEN);
						alert1.setText("생성 가능한 아이디 입니다.");
						checkId = true;
					}
				 } else {
					 alert1.setForeground(Color.red);
					 alert1.setText("잘못된 아이디형식 입니다.");
					 checkId = false;
				 }
			}
		});
		
		add(regBtn);
		regBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(checkId && checkPw) {
					user.setId(idField.getText());
					user.setPw(pwField.getPw());
					user.setName(nameField.getText());
					user.setRegNum(regNumField1.getText());
					user.setEmail(emailField.getText());
					reg.regiUser(user);
					System.out.println(user.getId());
					System.out.println(user.getPw());
					System.out.println(user.getName());
					System.out.println(user.getRegNum());
					System.out.println(user.getEmail());
				} else {	
					
				}
			}
		});
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(100, 100);
		setVisible(true);
	}	
}
