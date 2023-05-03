package gui.study;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample extends JFrame {
    public ButtonExample() {
        JButton button = new JButton("Button Text");
        Insets insets = new Insets(10, 20, 10, 20);
        button.setMargin(insets); // 여백 값을 변경합니다.
        setBackground(Color.black);
        add(button);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}
