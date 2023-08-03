package basics;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Parent parentobj = new Parent();
		parentobj.methodParent();
		//parentobj.methodChild() parent cannot access child method
		System.out.println("parent hashcode " +parentobj.hashCode());
		System.out.println("Parent Object"+parentobj);
		Child childObj = new Child();
		childObj.methodParent();
		childObj.methodChild();
		
		GrandChild grandChildObj = new GrandChild();
		grandChildObj.methodParent();
		grandChildObj.methodChild();
		grandChildObj.methodGrandChild();
		
		Parent grandChildObj2 = new GrandChild();
		//grandChildObj2.
		grandChildObj2.commonMethod();
	
	}

}

//class Parent extends Object{
class Parent{
	public void methodParent() {
		System.out.println("Method parent");
	}
	
	@Override // annotation
	public String toString() {
		return " Parent object";
	}
	
	public void commonMethod() {
		System.out.println("Parent:commonMethod");
	}
}

class Child extends Parent{
	
	public void methodChild() {
		System.out.println("Method child");
	}
	// method overriding
	public void commonMethod() {
		System.out.println("Child:commonMethod");
	}
}

class GrandChild extends Child{
	public void methodGrandChild() {
		System.out.println("Method grand child");
	}
	public void commonMethod() {
		System.out.println("GrandChild:commonMethod");
	}
}
