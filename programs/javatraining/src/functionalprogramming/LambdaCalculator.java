package functionalprogramming;

public class LambdaCalculator {
	public static void main(String[] args) {		
		Calculator lambdacal=(n1,n2)->n1+n2;		
		int res=lambdacal.add(100, 200);
		System.out.println("Result of addition "+res);

		CalculatorMultiply lambdamul = (n1,n2)->n1*n2;
		res = lambdamul.multiply(10, 4);
		System.out.println("Result of multiplication "+res);
		
	}
}
@FunctionalInterface
interface Calculator{
	public int add(int n1,int n2);
}

interface CalculatorMultiply{
	public int multiply(int n1,int n2);
}

