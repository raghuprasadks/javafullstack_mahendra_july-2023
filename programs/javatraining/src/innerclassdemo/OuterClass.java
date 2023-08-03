package innerclassdemo;

public class OuterClass {
	public static String outerprop="Outer property ";
	
	public static void OuterClassMethod() {
		System.out.println("Outer Class method");
	}

	public static void main(String[] args) {
		OuterClassMethod();
		
		OuterClass.InnerClass innercls = new OuterClass().new InnerClass();

		innercls.InnerClassMethod();
		System.out.println("Outer class method");
		//innercls.InnerClassMethod();
	}
	
	class InnerClass{		
		public void InnerClassMethod() {
			System.out.println("Inner class method");
			System.out.println("Outer class property "+outerprop);			
		}
	}

}
