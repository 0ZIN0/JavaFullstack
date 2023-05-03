package gui.quiz.registerAns;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import gui.quiz.registerAns.dao.MemberDao;

public class IdDuplChkButton extends JButton {
	
	MemberDao dao = new MemberDao();
	
	private boolean valid;
	
	public IdDuplChkButton(JTextField idField, JLabel stateLabel) {
		setText("중복체크");
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// idField의 값을 가져온다
				String id = idField.getText();
				// DB에 조회해본다
				if(dao.idExists(id)) {
					stateLabel.setForeground(RegisterFrame.RED);
					stateLabel.setText("중복된 아이디입니다.");
					valid = false;
				} else {
					stateLabel.setForeground(RegisterFrame.GREEN);
					stateLabel.setText("사용 가능한 아이디입니다.");
					valid = true;
				}
				// 결과를 반영한다
			}
		});
	}
	
	public boolean isValid() {
		return valid;
	}
}
