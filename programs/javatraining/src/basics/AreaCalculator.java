package basics;

public class AreaCalculator {
	public static void main(String[] args) {
		//AreaCalculator ac = new AreaCalculator();
		//ac.area(20,10);
		//ac.area(7);
		area(20,10);
		area(7);
	}
	public static void area(int length,int width) {
	//should calculate area of a rectangle and print
		System.out.println("Area of rectangle is "+(length*width));
	}
	public static void area(float radius) {
	//should calculate area of a circle and print
		System.out.println("Area of circle is "+(3.143f*radius*radius));
	}
}
