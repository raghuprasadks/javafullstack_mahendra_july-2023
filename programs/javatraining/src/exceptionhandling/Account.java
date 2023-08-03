package exceptionhandling;

import java.util.Random;

public class Account {
	String name;
	String email;
	String addressproof;
	int actnum;
	int balance=0;
	
	public Account(String _name,String _email,String _addressproof) {
		this.name = _name;
		this.email = _email;
		this.addressproof=_addressproof;
		
		Random rand = new Random();
		this.actnum =rand.nextInt(1, 1000);
	}
	
	
	public int deposit(int actnum,int amttodeposit) {
		if (actnum==this.actnum) {
			this.balance=this.balance +amttodeposit;
		}
		return this.balance;
	}
	
	
	public int withdraw(int actnum,int amttowithdraw) throws InsufficientBalance {
		if (actnum==this.actnum) {
			
			if (this.balance >=amttowithdraw)
				this.balance=this.balance -amttowithdraw;
			else
				throw new InsufficientBalance("Insufficient balance");
		}
		return this.balance;
	}
	
	public int checkBalance(int actnum) {
		int bal = 0;
		if (actnum==this.actnum) {
			bal= this.balance;
		}
		return bal;
		
		
	}
	
	public static void main(String[] args) {
		Account act1 = new Account("Raghu","raghu@gmail.com","Aadhar-2838383");
		
		int actnum = act1.actnum;
		System.out.println("Account number for account act1 "+actnum);
		int bal = act1.deposit(actnum, 10000);
		System.out.println("Balance after deposit of 10 K "+bal);
		
		bal = act1.deposit(actnum, 20000);
		System.out.println("Balance after deposit of 20 K "+bal);
		try {
		bal = act1.withdraw(actnum, 5000);
		System.out.println("Balance after withdraw of 5 K "+bal);
	
		bal = act1.withdraw(actnum, 30000);
		System.out.println("Balance after withdraw of 30 K "+bal);
		}catch(Exception oException) {
			System.out.println(oException);
		}finally {
			System.out.println("finally");
		}
	}
}
