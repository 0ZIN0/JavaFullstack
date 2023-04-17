package bank;

public class Account {
	
	private String owner;
	private int accountNumber;
	private double balance;
	
	public Account(String owner, int accountNumber, double balance) {
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;			
		} else {
			System.out.println("잔액이 부족합니다");
		}
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
}
