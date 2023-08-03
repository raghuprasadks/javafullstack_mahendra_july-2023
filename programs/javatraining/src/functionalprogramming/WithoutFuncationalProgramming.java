package functionalprogramming;

public class WithoutFuncationalProgramming implements Drawable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drawable drawable = new WithoutFuncationalProgramming();
		drawable.draw();
	}

	@Override
	public void draw() {
		System.out.println("Draw.. without lambda");
		
	}

}

interface Drawable{
	public void draw();
}
