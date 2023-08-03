package sandbox;

public class StaticDemo {
	
	static final float  pi=3.143f;
	static String course;
	
	static {
		System.out.println("static block is exected first");
		course = "java";
		System.out.println("course "+course);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("pi "+pi);		
		System.out.println(String.format("pi value is %s", pi));
	}

}
