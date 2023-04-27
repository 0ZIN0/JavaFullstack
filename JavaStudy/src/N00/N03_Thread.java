package N00;

public class N03_Thread {

	/*
	 	# 쓰레드
	 	
	 	  우리가 사용하던 것은 main 쓰레드였다
	 	  main 쓰레드 말고도 여러 쓰레드를 추가해서
	 	  동시에 여러 작업을 진행하는 것이 가능하다
	 */
	
	public static void main(String[] args) {
		
		Wallet w = new Wallet();
		
		
		// 쓰레드 하나를 생성
		MyThread t1 = new MyThread(w);
		MyThread t2 = new MyThread(w);
		
		// 메인과 따로 진행될 쓰레드 시작
		t1.start();
		t2.start();
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread t3 = new Thread() {
			
				public void run() {
					System.out.println("/)/)");
					System.out.println("( ..)");
					System.out.println("( >$");
				}
			};
			t3.run();
		}
	}
}

class MyThread extends Thread {
	
	static int num;
	
	int threadNum;
	
	Integer money;
	
	Wallet wallet;
	public MyThread(Wallet w) {
		wallet = w;
	}
	

	// 또 하나의 main 같은 것
	@Override
	public void run() {
		System.out.printf("Thread%d번을 실행합니다...", threadNum = num++);
		
		int i = 0;
		while(true) {
			System.out.printf("Thread%d 작업중...(%d)\n", threadNum, i++);
			wallet.add();
			wallet.print();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Wallet {
	int money;
	
	public void add() {
		money += 10;
	}
	
	public void print() {
		System.out.println("current cash : " + money);
	}
}
