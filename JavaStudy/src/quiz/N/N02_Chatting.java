package quiz.N;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import chatting.ListenChatThread;

public class N02_Chatting {
	
	/*
	 	간단한 채팅 프로그램을 만들어 보세요
	 	
	 	# 서버
	 	
	 	1. 최대 3명까지 접속이 가능하다
	 	
	 	2. 클라이언트가 메세지를 보내면 다른 클라이언트들에게 해당 메세지를 전달해줘야 한다
	 	
	 	3. 메세지는 닉네임 > 메세지 내용 - 보낸 시간 형식이어야 한다
	 	
	 	# 클라이언트
	 	
	 	1. 서버에 접속 메세지를 보낼 수 있다
	 	
	 	2. 클라이언트는 처음 프로그램 시작시 처음 닉네임을 설정할 수 있다
	 	
	 	3. 서버에 접속한 다른 사람들과 채팅을 할 수 있다
	 	
	 	4. 다른 사람들이 보낸 메세지를 확인할 수 있다.
	 */
	
	public static void main(String[] args) {
		
		List<Socket> users = new ArrayList<>();
		try (ServerSocket ss = new ServerSocket(8889)) {
			while(true) {
				System.out.println("연결 대기중 ...(현재 인원 "
						+ users.size() + ")");
				Socket s =ss.accept();
				
				if(users.size() < 3) {
					users.add(s);
					new ListenChatThread(users, s).start();
				} else {
					s.getOutputStream()
						.write("접속 인원이 가득 찼습니다...".getBytes());
					s.close(); // 소켓 연결 끊기
				}
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
