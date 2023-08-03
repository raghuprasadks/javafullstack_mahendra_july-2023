package exceptionhandling;

public class ExceptionAllKeywords {

	public static void main(String[] args) {
		boolean isEligigle=false;
		try {
			isEligigle=eligibleToVote(17);
			if(isEligigle) {
				System.out.println("You are eligible to vote");
			}
		}catch(Exception oException) {
			System.out.println("Exception "+oException);
			System.out.println("You are not eligible to vote");
		}finally {
			System.out.println("finally ");
		}		
	}
	
	
	public static boolean eligibleToVote(int age) throws ArithmeticException {
		boolean eligible = false;
		
		if (age>=18) {
			eligible=true;
		}else
		{
			throw new ArithmeticException("Invalid Age");
		}
		
		return eligible;
	}

}
