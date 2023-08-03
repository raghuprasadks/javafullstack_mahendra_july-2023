package exceptionhandling;

public class HandlingException {

	public static void main(String[] args) {
		
		System.out.println("Divison by zero ");
		
		int n1=100;
		int n2=0;
		int res=0;
		try {
			res=n1/n2;
			System.out.println("res "+res);
			
		}catch(Exception excepion) {
			System.out.println(excepion);
		}finally {
			System.out.println("Finally is executed all time");
		}		
		System.out.println("After Exception");
	}
}
