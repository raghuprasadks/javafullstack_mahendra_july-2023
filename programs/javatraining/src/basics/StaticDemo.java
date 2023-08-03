package basics;

public class StaticDemo {
	
	// member variable
	static String president ="Draupadi Murmu";
	String presidentnonstatic = "Test";
	// static block
	static {
		System.out.println("Inside static block");
	}

	public static void main(String[] args) {
		System.out.println("president "+president);
		//System.out.println("president non static "+presidentnonstatic);
		add();
		//subtract(); cannot call non static from static method
		StaticDemo stdemo =new StaticDemo();
		System.out.println("president non static "+stdemo.presidentnonstatic);
		stdemo.subtract();
		
		StaticDemo stdemo2 = new StaticDemo();
		stdemo2.add();
		StaticDemo.add();
		
	}
	
	public static void add() {
		System.out.println("add static");
	}
	
	public void subtract()
	{
		System.out.println("subtract non static");
	}

}
