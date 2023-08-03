package basics;
public class Calculator {
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
			// calc is the object
			Calculator calc = new Calculator();			
			int result = calc.add(10, 20);
			System.out.println("Result of addition is "+result);
			result = calc.subtract(30, 20);
			System.out.println("Result of subtraction is "+result);
			calc.remainder(10, 2);			
	}	
	/**
	 * adds two numbers
	 * @param num1
	 * @param num2
	 * @return the sum of num1 and num2
	 */
	public int add(int num1,int num2) {
		return num1+num2;
	}
	
	public int subtract(int num1,int num2) {
		return num1-num2;
	}
	
	public int muliply(int num1,int num2) {
		return num1*num2;
	}
	
	public int divide(int num1,int num2) {
		return num1/num2;
	}
	
	public void remainder(int num1,int num2) {
		int rem= num1%num2;
		System.out.println("remainder is "+rem);
	}
	
	

}
