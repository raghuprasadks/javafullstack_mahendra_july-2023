package exceptionhandling;

public class UnhandledException {

	public static void main(String[] args) {
		System.out.println("Unhandled exception ");
		System.out.println("Divison by zero ");
		
		int n1=100;
		int n2=0;
		
		//int res=n1/n2;
		//System.out.println("res "+res);
		System.out.println("Array Index Out Of Bounds ");
		
		int marks[]= {10,20,17,12,13};
		//System.out.println("marks "+marks[8]);
		System.out.println("NullPointer ");
		
		String course="java";
		course=null;
		System.out.println("course length "+course.length());
	}
}
