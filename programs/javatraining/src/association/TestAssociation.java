package association;

public class TestAssociation {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		//cust1.id=1; private you cannot set
		
		cust1.setId(1);
		System.out.println(cust1.getId());
		
		System.out.println(cust1);
		
		Customer cust2 = new Customer(2,"ravi",9845547471l,"ravi@gmail.com");
		System.out.println("second customer " +cust2);

		Address address1=new Address(1094,"Indushankara","Home","Bengaluru",560077);
		cust2.setAddress(address1);
	}

}
