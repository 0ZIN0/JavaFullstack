package gui.quiz.registerAns;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import gui.quiz.register.field.IdField;
import gui.quiz.registerAns.dao.MemberDao;

public class JoinButton extends JButton{
	
	MemberDao dao = new MemberDao();
	
	public JoinButton(RegisterFrame parent) {
		setText("가입하기");
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 각 항목들이 전부 유효한지 체크
				if(!parent.idField.isValid()) {
					// 알림 창 띄위기 메서드
					JOptionPane.showMessageDialog(
							parent, // 부모 컨테이너 (어느 컨테이너에 알림창을 띄울것인지)
							"ID값이 유효하지 않음", // 원하는 메에지
							"Error", // 제목
							JOptionPane.ERROR_MESSAGE // 타입(그림이 바뀜)
					);
					parent.idField.requestFocus();
					return;
				} else if(!parent.duplIdBtn.isValid()) {
					JOptionPane.showMessageDialog(
							parent,
							"ID중복체크를 진행하지 않음",
							"Error",
							JOptionPane.ERROR_MESSAGE
					);
					parent.duplIdBtn.requestFocus();
					return;
				}
				
//				dao.insertNewMember(parent.idField.getText(),
//						parent.pwField.getPassword());
			}
		});
	}
}
