package basics;

public class RegularCalculator implements ICalculator {

	public static void main(String[] args) {
		// you cannot create an object of interface
		//ICalculator ic = new ICalculator();
		
		//RegularCalculator rCalulator = new RegularCalculator();
		
		ICalculator rCalulator = new RegularCalculator();
		int result =rCalulator.add(100, 200);
		System.out.println("Result of addition "+result);

		result =rCalulator.subtract(100, 20);
		System.out.println("Result of subtraction "+result);

	
	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
