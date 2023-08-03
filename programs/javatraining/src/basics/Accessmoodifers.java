package basics;

public class Accessmoodifers {
	// a final member variable value cannot be changed
	static final float pi=3.143f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pi=3.1434f;
		
		//ChildNew cnew = new ChildNew();
		//cnew.testPrivate();
		
		ChildNew cnew = new ChildNew();
		System.out.println("protectted" +cnew.marks);
		
	}

}

class ParentNew{
	protected int marks=10;
	private void testPrivate() {
		System.out.println("ParentNew:testPrivate");
}
	public final void methodFinal() {
		System.out.println("Method final");
	
}
}
class ChildNew extends ParentNew{
	public void testPrivate() {
		System.out.println("ChildNew:testPrivate");
	}
}
	/** cannot override a final method
	public final void methodFinal() {
		System.out.println("Method final");
	
}
**/
	

	

