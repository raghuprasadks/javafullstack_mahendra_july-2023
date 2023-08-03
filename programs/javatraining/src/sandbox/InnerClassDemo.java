package sandbox;

public class InnerClassDemo {
	int outerclsmem = 100;
	public static void main(String[] args) {
		InnerClassDemo ind = new InnerClassDemo();
		ind.OuterMethod();
		InnerClassDemo.Inner innercls = new InnerClassDemo().new Inner();
		innercls.InnerMethod();		
		Inner.StaticMethod();
		StaticInner.staticInnerMethod();
		
		
	}
	
	public void OuterMethod() {
		System.out.println("OuterMethod");
		System.out.println("OuterMethod:Outer class mem variable "+outerclsmem);
	}
	
	class Inner{
		
		public void InnerMethod() {
			System.out.println("Inner:InnerMethod");
			System.out.println("Inner:InnerMethod:Outer class mem variable "+outerclsmem);
		}
		
		public static void StaticMethod() {
			System.out.println("Inner:StaticMethod");
		}
	}
	
	static class StaticInner{
		public static void staticInnerMethod() {
			System.out.println("StaticInner:staticInnerMethod");
		}
	}

}
