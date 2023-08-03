package basics;
public class Account {
	// default access modifier
	//int actno;
	public int actno;
	String name;
	private int balance;	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void information() {
		System.out.println("Actno "+this.actno +" Name :"+this.name+ " Balance "+this.balance);
	}
}
