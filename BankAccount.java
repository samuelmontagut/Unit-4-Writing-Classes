
public class BankAccount {
	
	private int routingNum;
	private double balance;
	private String owner;
	
	public BankAccount(int rout, double bal, String ow) {
		routingNum = rout;
		balance = bal;
		owner = ow;
	}
	public double getBalance() {
		return balance;
	}
	public int getRountingNumber() {
		return routingNum;
	}
	public String getName(){
		return owner;
	}
	public void setName(String o) {
		owner = o;
	}
	public void deposit(double d) {
		balance = balance + d;
	}
	public void withdrawl(double w) {
		if (balance >= w) {
			balance = balance - w;
		}
		else {
			System.out.println("insufficient funds.");
		}
	}
	public void addInterest(double i) {
		balance = balance  * (1 + (i * .01));
	}
	public int getRoutingNum() {
		return routingNum;
	}
	public String toString(){
		return "Name: " + owner + "\nBalance: " + balance + "\nRounting Number: " + routingNum;
	}

}
