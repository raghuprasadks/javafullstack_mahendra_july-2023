package stringmanagement;

public class StringDemo {

	public static void main(String[] args) {
		System.out.println("String literal");
		String s1="Hello";
		String s2="Hello";
		System.out.println("S1 "+s1);
		System.out.println("S2 "+s2);		
		String strobj = new String("Hello");
		System.out.println("strobj "+strobj);		
		char[] chrary= {'H','E','L','L','O'};		
		String charobj = new String(chrary);
		System.out.println("charobj "+charobj);
		System.out.println("Concat " +s1.concat("Welcome to java"));
		System.out.println("s1 value "+s1);
		s1="Welcome";
		System.out.println("s1 after assignment "+s1);	
	}

}
