package exceptionhandling;

import java.util.Scanner;

public class HandlingMultipleException {

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n1 = scrn.nextInt();
		System.out.println("Enter another number");
				
		String n2 = scrn.next();
		int n3=0;
		int res=0;
		try {
			n3 = new Integer(n2);
			res = n1/n3;
			System.out.println("Result "+res);
		}catch(ArithmeticException arException) {
			System.out.println("Arithmetic Exception");
		}catch(NullPointerException nullExceptin) {
			System.out.println("NullPointerException Exception");
		}catch(Exception oException) {
			System.out.println("Exception::"+oException);
		}finally {
			System.out.println("Finally");
		}
		
		
		
	}

}
