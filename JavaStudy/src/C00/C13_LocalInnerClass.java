package C00;

import school.ProgrammingStudent;
import school.Student;

public class C13_LocalInnerClass {
	
	/*
	 	# 지역 내부 클래스
	 	  
	 	  클래스는 메서드 내부(local)에서도 선언할 수 있다
	 	  해당 메서드 밖에서는 사용할 수 없는 아주 일시적인 클래스
	 	  메서드가 끝나면 클래스의 수명도 끝난다
	 	  
	 	# 익명 지역 내부 클래스
	 	
	 	  메서드 내부에서 클래스를 바로 상속받아 사용하는 방식
	 	  클래스 이름을 지정할 수 없기 때문에 익명 클래스라고 불린다
	 */
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		// 바로 Student 클래스를 상속받아 마음대로 고쳐버리는 행위
		// 상속이지만 상속받자마자 바로 업캐스팅하므로 새 메서드 추가는 불가능하다
		Student s2 = new Student() {
			@Override
			public int getTotal() {
			
				return 123;
			}
			public void info() {
				System.out.println("내가 만든 인포");
			}	
		};
		// s는 그냥 Student의 인스턴스이므로 Student에 구현된 동작을 한다
		s.info();
//		s.getTotal();
		
		// s2는 Student를 마음대로 오버라이드한 자식 클래스의 업캐스팅 때문에
		// 오버라이드된 동작을 한다
		s2.info();
		s2.getTotal();
		
		// 매개변수로 클래스의 인스턴스를 요구하는 곳에 보낼 수 있는 것
		Student s3 = new Student();
		
		print(s3); // 0. 인스턴스가 담긴 변수
		print(new Student()); // 1. 그냥 인스턴스
		print(new ProgrammingStudent()); // 자식 인스턴스 (다형성)
		print(new Student() {
			@Override
			public void info() {
				System.out.println("산대특 바리스타 특별 훈련 과정");
			}
		}); // 4. 해당 클래스를 오버라이드 한 익명 지역 내부 클래스
	}
	
	public static void print(Student s) {
		s.info();
	}
	
	public static int add(int a, int b) {
		class Waffle {
			int price;
			int flavor;
		}
		System.out.println(new Waffle());
		return a + b;
	}
}
