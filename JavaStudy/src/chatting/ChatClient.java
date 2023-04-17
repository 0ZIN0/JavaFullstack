package chatting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	
	public static void main(String[] args) {
		try(
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(isr);
			Socket s = new Socket("127.0.0.1", 8889);
		) {
			System.out.println("연결 성공!");
			
			// 듣기 대기하는 곳
			Thread t = new Thread() {
				
				public void run() {
					try(
						InputStreamReader isr2 =
							new InputStreamReader(s.getInputStream());
						BufferedReader in2 = 
								new BufferedReader(isr2);
					) {
						// 소켓으로부터의 입력을 대기하는 곳
						while(true) {
							String message = in2.readLine();
							
							if (message == null) {
								System.out.println("종료");
								System.exit(0);
							}
							System.out.println(message);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			};
			
			t.start();
			
			try(OutputStreamWriter osw = 
					new OutputStreamWriter(s.getOutputStream());
				BufferedWriter out = 
					new BufferedWriter(osw);
			) {		
				while(true) {
					System.out.print(">> ");
					out.write(in.readLine() + "\n");
					out.flush();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (UnknownHostException e) {
			 e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
