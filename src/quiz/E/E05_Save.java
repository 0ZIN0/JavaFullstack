package quiz.E;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class E05_Save {

	/*
	 	컴퓨터와 진행하는 간단한 가위바위보 게임을 만든 후
	 	프로그램 종료시 전적을 파일에 저장하고
	 	프로그램 실행 시에는 파일에 저장된 전적 데이터를 읽어 예전 전적이
	 	그대로 유지되도록 만들어보세요
	 	
	 	
	 */
	public static void save(int[] winCount, String saveFile) {
		
		try {
			FileOutputStream out = new FileOutputStream(saveFile);
			for(int i = 0; i < winCount.length; i++) {
				out.write(winCount[i] + '0');
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public static int[] load(int[] winCount, String saveFile) {
		try {
			FileInputStream in = new FileInputStream(saveFile);
			byte[] data = in.readAllBytes();
			for(int i = 0; i < winCount.length; i++) {
				winCount[i] = data[i] - '0'; 
			}
			in.close();
		} catch (FileNotFoundException e) {
			save(winCount, saveFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return winCount;
	}
	
	public static int[] game(int[] winCount, int select) {

		int com = (int)(Math.random() * 3 + 1); 
		
		int result = (select - com + 3) % 3;
		
		if(com == 1) {
			System.out.println("컴퓨터: 가위");
		} else if(com == 2){
			System.out.println("컴퓨터: 바위");
		} else {
			System.out.println("컴퓨터: 보");
		}
		
		if (result == 0) {
            System.out.println("비겼습니다!");
            winCount[0]++;
         } else if (result == 1) {
            System.out.println("플레이어가 이겼습니다!");
            winCount[1]++;
         } else {
            System.out.println("플레이어가 패배했습니다!");
            winCount[2]++;
         }
		return winCount;
	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] winCount = new int[3];
		String saveFile = "files/se.txt";
		
		System.out.println("============[가위바위보게임]============");
		while(true) {
			load(winCount, saveFile);
			
			System.out.printf("====현재 전적[승 : %d/패 : %d/비김 : %d]====\n",
					winCount[1], winCount[2], winCount[0]);
			System.out.println("1. 시작하기    2. 그만두기    3.기록 초기화");
			int gameStart = sc.nextInt();
			
			if(gameStart == 1) {
				System.out.println("====================================");
				System.out.println("1. 가위\t\t2. 바위\t\t3.보");
				int select = sc.nextInt();
				
				while(select != 1 && select != 2 && select != 3) {
					System.out.println("==정상 범위의 값을 입력해주세요(1~3)==");
					System.out.println("1. 가위   2. 바위   3.보");
					select=sc.nextInt();
				}
				
				winCount = game(winCount, select);
				save(winCount, saveFile);
			} else if(gameStart == 2) {
				System.out.println("==========게임을 종료합니다==============");
				System.out.printf("======전적[승 : %d/패 : %d/비김 : %d]======\n",
						winCount[1], winCount[2], winCount[0]);
				break;
			} else if(gameStart == 3) {
				System.out.println("=======기록을 초기화 하시겠습니까?=========");
				System.out.println("1. 예\t2.아니요");
				int sure = sc.nextInt();
				
				if(sure == 1) {
					System.out.println("========기록을 초기화합니다===========");
					save(new int[3], saveFile);
				} else {
					System.out.println("=======처음화면으로 돌아갑니다=========");
				} 
			}
			else {
				System.out.println("======정상 범위를 입력해주세요(1~2)======");
			}
		}
	}	
}
