package C00;

public class C04_Constructor {
	
	/*
	 	# 클래스의 생성자 (Constructor)
		  
		  해당 클래스의 새 인스턴스를 생성할 때 new와 함께 사용하는 것
		  생성자를 정의하지 않는 클래스에는 기본 생성자가 자동으로 생성된다
		  (인스턴스를 생성할 때 아무 동작도 하지 않음)
		  
	*/
	
	public static void main(String[] args) {
		
		Apple a1  = new Apple();
		
		// import를 안하고 클래스를 사용하는 방법
		myobj.Orange o1 = new myobj.Orange();
		myobj.Orange o2 = new myobj.Orange("America");
		myobj.Orange o3 = new myobj.Orange("터키", 3000, 'A');
		
		o1.info();
		o2.info();
		o3.info();
		System.out.println();
		
		// 어제 연습으로 만든 클래스들을 myobj 패키지로 옮긴 후 생성자를 추가해보세요
		
		myobj.Tv t1 = new myobj.Tv();
		myobj.Tv t2 = new myobj.Tv(12, 70);
		myobj.Tv t3 = new myobj.Tv(30);
		
		t1.info();
		System.out.println();
		t2.info();
		t2.channelDown();
		t2.channelDown();
		t2.info();
		t3.info();
	}
}
