package functionalprogramming;
/**
public class LabmdbaExpressionDemo implements Greet{

	public static void main(String[] args) {

		Greet greet = new LabmdbaExpressionDemo();
		greet.greeting();
	}

	@Override
	public String greeting() {
		return "Greetings";
		
	}

}
**/

public class LabmdbaExpressionDemo{

	public static void main(String[] args) {

		Greet greet =()->{
			return "Greetings";
		};
		
		System.out.println(greet.greeting());
			
	}

}

interface Greet{
	public String greeting();
}

