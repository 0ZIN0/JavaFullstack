package orderingSystem;

public class Main {
//	문제: 음식 주문 프로그램 구현하기
//
//	음식 주문 프로그램(OrderingSystem)을 구현하세요. 
//	해당 프로그램은 메뉴(Menu)와 주문(Order) 클래스를 가집니다. 
//	아래와 같은 요구 사항을 충족해야 합니다.
//
//	Menu 클래스는 다음의 멤버 변수를 가집니다.
//	name: 메뉴의 이름
//	price: 메뉴의 가격
//	description: 메뉴의 설명
//	Order 클래스는 다음의 멤버 변수를 가집니다.
//	items: 주문한 음식 목록
//	totalPrice: 총 주문 가격
//	Menu 클래스는 다음의 생성자를 가집니다.
//	Menu(String name, double price, String description)
//	Order 클래스는 다음의 메서드를 가집니다.
//	addItem(Menu item): 주문한 음식을 추가합니다.
//	getTotalPrice(): 현재까지 주문한 음식의 가격 총합을 반환합니다.
//	getItems(): 현재까지 주문한 음식 목록을 반환합니다.
	
//	Menu burger = new Menu("버거", 5000.0, 
//	"100% 순쇠고기 패티와 신선한 야채로 만든 버거");
//	Menu fries = new Menu("감자튀김", 2500.0, "크리스피한 감자튀김");
//	Menu coke = new Menu("콜라", 1500.0, "탄산음료");
//
//	Order myOrder = new Order();
//	myOrder.addItem(burger);
//	myOrder.addItem(fries);
//	myOrder.addItem(coke);
//
//	System.out.println("주문 목록: " + myOrder.getItems());
//	System.out.println("총 가격: " + myOrder.getTotalPrice());
	
	public static void main(String[] args) {
		Menu burger = new Menu("버거", 5000.0, "100% 순쇠고기 패티와 신선한 야채로 만든 버거");
		Menu fries = new Menu("감자튀김", 2500.0, "크리스피한 감자튀김");
		Menu coke = new Menu("콜라", 1500.0, "탄산음료");
		
		Order myOrder = new Order();
		myOrder.addItem(burger);
		myOrder.addItem(fries);
		myOrder.addItem(coke);

		System.out.println("주문 목록: " + myOrder.getItems());
		System.out.println("총 가격: " + myOrder.getTotalPrice());
	}
}
