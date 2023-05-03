package gui;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S17_MouseEvent {
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Mouse");
		
		JLabel image = new JLabel();
		
		
		
		try {
			image.setIcon(new ImageIcon
					(ImageIO
							.read(new File("images/flower.jpeg"))
							.getScaledInstance(500, 500, Image.SCALE_SMOOTH)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		image.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("드래그 중");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 모니터 상의 위치를 알려준다
				System.out.println(e.getLocationOnScreen());
				
				// 컴포넌트 상의 위치를 알려준다
				System.out.println(e.getPoint());
				System.out.println("클릭");
				
				// 어떤 마우스 버튼이 클릭되었는지 알려준다
				// 왼클릭 - 1
				// 휠클릭 - 2
				// 우클릭 - 3
				System.out.println(e.getButton());
			}
			
		});
		
		f.add(image, BorderLayout.CENTER);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100, 500, 500);
		f.setVisible(true);
		
	}
}
