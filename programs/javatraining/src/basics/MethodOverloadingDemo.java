package basics;
public class MethodOverloadingDemo {
	public static void main(String[] args) {
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		mod.add(100, 100);
		mod.add(100.0f, 200.0f);
		mod.add(100, 200,300);	
	}
	public void add(int num1,int num2) {
		System.out.println("addition with int arguments "+(num1+num2));
	}
	// method overloading - static polymorphism
	public void add(float num1,float num2) {
		System.out.println("addition with float arguments "+(num1+num2));
	}
	// method overloading
	public void add(int num1,int num2,int num3) {
		System.out.println("addition with int 3 arguments "+(num1+num2+num3));
	}	

}
