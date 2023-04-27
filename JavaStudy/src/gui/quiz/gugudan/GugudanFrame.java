package gui.quiz.gugudan;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class GugudanFrame extends JFrame{
	
	List<Gugudanbutton> gugudans = new ArrayList<>();
	
	Plusbutton plus = new Plusbutton(this);
	MinusButton minus = new MinusButton(this);
	
	public GugudanFrame() {
		
		for(int gop = 1; gop <= 9; ++gop) {
			Gugudanbutton btn = new Gugudanbutton(gop);
			add(btn);
			gugudans.add(btn);
		}
		
		add(plus);
		add(minus);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Gugudan Frame!!");
		setLayout(null);
		setLocation(100, 100);
		setSize(600, 700);
		setVisible(true);
	}
}
