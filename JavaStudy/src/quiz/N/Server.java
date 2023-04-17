package quiz.N;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;

public class Server {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = 
				new SimpleDateFormat("[hh:mm:ss]");
		
		try (ServerSocket ss = new ServerSocket(8888);
		) {
			System.out.println("Server IP : " + ss.getLocalSocketAddress());
			System.out.println("Server Port : " + ss.getLocalPort());
			
			System.out.println("연결을 기다리는 중입니다...");
			Socket user1 = ss.accept();
			Socket user2 = ss.accept();
			ChatThread chat1 = new ChatThread(user1);
			ChatThread chat2 = new ChatThread(user2);
			
			chat1.start();
			chat2.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class ChatThread extends Thread {
	Calendar now = Calendar.getInstance();
	SimpleDateFormat sdf = 
			new SimpleDateFormat("[hh:mm:ss]");
	
	Socket user;
	
	public ChatThread(Socket user) {
		this.user = user;
	}
	
	@Override
	public void run() {
		
		try(DataInputStream userIn = new DataInputStream(user.getInputStream());
			DataOutputStream uOut = new DataOutputStream(user.getOutputStream());
		) {
			System.out.println("연결이 수립되었습니다.");
			System.out.println("닉네임을 정해주세요");
			
			String userName = userIn.readUTF();
			System.out.println("닉네임 : " + userName);
			
			System.out.println("쓰레드가 실행중입니다...");
			
			for(int i = 0 ; i < 10; i++) {
				String uMessage = userIn.readUTF();
				System.out.printf("%s: %s %s\n", userName, uMessage, sdf.format(now.getTime()));
				uOut.writeUTF(uMessage);
				uOut.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
