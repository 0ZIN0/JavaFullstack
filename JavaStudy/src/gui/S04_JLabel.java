package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class S04_JLabel extends JFrame {
	
	// JLabel : 텍스트를 표시하기 위한 컴포넌트
	
	public S04_JLabel() {
		
		JLabel label1 = new JLabel("This is a JLabel Component");
		label1.setBounds(0, 0, 300, 50);
		label1.setForeground(Color.BLUE);
		label1.setFont(new Font("Consolas", Font.BOLD, 15));
		
		JLabel label2 = new JLabel("This is a JLabel Component");
		label2.setBounds(0, 50, 485, 50);
		label2.setForeground(Color.RED);
		label2.setFont(new Font("Consolas", Font.BOLD, 15));
		label2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		add(label1);
		add(label2);
		
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		setLocation(100, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S04_JLabel();
		
	}
}
