package basics;

public class AccountTest {

	public static void main(String[] args) {
		Account act1 =new Account();
		act1.actno=1;
		act1.name="Bharati";
		//act1.balance=10000;
		act1.setBalance(10000);
		act1.information();
		
		System.out.println("Balance is "+act1.getBalance());
		

	}

}
