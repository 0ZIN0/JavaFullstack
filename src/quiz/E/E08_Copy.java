package quiz.E;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E08_Copy {
	
	/*
	 	files 폴더 내부의 모든 내용을 (하위 내용 모두 포함)
	 	files2로 복사하는 프로그램을 만들어보세요
	 	만약 files2가 있다면 files3로 복사되도록 만들어보세요
	 */
	public static void main(String[] args) {
		
		File src = new File("files");
		copy(src);
		
	}
	
	public static void copy(File src) {
		
		String path = src.getPath();
		path = path.replace("files", "files2");
		System.out.println(path); 
		
		File copy = new File(path);
		copy.mkdir();
		
		FileOutputStream out = null;
		FileInputStream in = null;
		
		for(File f : src.listFiles()) {
			if(f.isFile()) {
				try {
					in = new FileInputStream(f);
					out = new FileOutputStream(path + "/" + f.getName());
					byte[] allData = in.readAllBytes();
					out.write(allData);
				} catch (IOException  e) {
					e.printStackTrace();	
				}
			} else {
				copy = new File(path + "/" + f.getName());
				copy.mkdir();
				copy(f);
			}
		}
	}
	
	public static void search(File src) {
		
		for (File f : src.listFiles()) {
			if(f.isDirectory()) {
				System.out.println(f + "는 폴더이므로 리스트 봐야함");
				search(f);
			} else {
				System.out.println(f + "는 파일 복사");
			}
		}
	}
}
