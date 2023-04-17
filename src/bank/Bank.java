package bank;

public class Bank {
	//	문제: 은행 계좌 클래스 구현하기
	//
	//	은행 계좌 클래스(Account)를 구현하세요. 해당 클래스는 
	//  계좌의 소유자 이름, 계좌 번호, 현재 잔액을 저장하고 관리합니다. 
	//  아래와 같은 요구 사항을 충족해야 합니다.
	//
	//	클래스는 적절한 접근 제어자를 사용하여 멤버 변수를 캡슐화합니다.
	//	클래스는 다음의 생성자를 가집니다.
	//	Account(String owner, int accountNumber, double balance)
	//	클래스는 다음의 메서드를 가집니다.
	//	deposit(double amount): 주어진 금액만큼 계좌에 입금합니다.
	//	withdraw(double amount): 주어진 금액만큼 계좌에서 출금합니다.
	//	getBalance(): 현재 계좌의 잔액을 반환합니다.
	//	getOwner(): 현재 계좌의 소유자 이름을 반환합니다.
	//	getAccountNumber(): 현재 계좌의 계좌 번호를 반환합니다.
	
//	Account account = new Account("홍길동", 123456, 1000000.0);
//	account.deposit(50000.0);
//	account.withdraw(200000.0);
//	System.out.println("현재 잔액: " + account.getBalance());
//	System.out.println("소유자 이름: " + account.getOwner());
//	System.out.println("계좌 번호: " + account.getAccountNumber());
//	
//	현재 잔액: 850000.0
//	소유자 이름: 홍길동
//	계좌 번호: 123456
	
	public static void main(String[] args) {
		Account account = new Account("홍길동", 123456, 1000000.0);
		account.deposit(50000.0);
		account.withdraw(200000.0);
		System.out.println("현재 잔액: " + account.getBalance());
		System.out.println("소유자 이름: " + account.getOwner());
		System.out.println("계좌 번호: " + account.getAccountNumber());

	}
}
