package E00;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E11_DataStream {
	
	public static void main(String[] args) {
		try(
			FileOutputStream fout = new FileOutputStream("files/data.abc");
			DataOutputStream dout = new DataOutputStream(fout);
		) {
			dout.writeBoolean(true);
			dout.writeDouble(123.123);
			dout.writeUTF("sss");
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		try(
			FileInputStream fin = new FileInputStream("files/data.abc");
			DataInputStream din = new DataInputStream(fin);	
		) {
			System.out.println("아까 쓴거1 : " + din.readBoolean());
			System.out.println("아까 쓴거2 : " + din.readDouble());
			System.out.println("아까 쓴거3 : " + din.readDouble());
		} catch (IOException e) {	
			e.printStackTrace();
		}	
	}
}
