package gui;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S14_Image {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Image...");
		
		JLabel img1 = new JLabel();
		JLabel img2 = new JLabel();
		JLabel img3 = new JLabel();
		
		img1.setIcon(new ImageIcon("images/flower.jpeg"));
		img2.setIcon(new ImageIcon("files/images/cat1.jpg"));
		img3.setIcon(new ImageIcon("files/images/cat2.jpg"));
		
		try {
			// 이미지 로딩
			BufferedImage bufferedImage = 
					ImageIO.read(new File("files/images/cat2.jpg"));
			
			// getScaledUbstance() : 크기 조절된 이미지 인스턴스를 반환
			Image scaledImage = 
					bufferedImage.getScaledInstance(
							250, 250, Image.SCALE_AREA_AVERAGING);
			
			// getSubimage() : 원본에서 원하는 일부 이미지를 잘라서 반환
			Image subImage = 
					bufferedImage.getSubimage(150, 150, 100, 100);
			
			img3.setIcon(new ImageIcon(subImage));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		f.add(img1);
		f.add(img2);
		f.add(img3);
		
		f.setLayout(new GridLayout(2, 2));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100, 500, 300);
		f.setVisible(true);
	}
}
