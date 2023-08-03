package basics;

public class Employee {	
	/***
	 * Properties/attributes
	 */
	int code;
	String name;
	String dept;
	String desg;
	int sal;
	// default constructor
	public Employee() {
		
	}
	// Parameterized  constructor/named constucture
	public Employee(int _code,String _name,String _dept,String _desg,int _sal) {
		code = _code;
		name = _name;
		dept = _dept;
		desg = _desg;
		sal = _sal;
	}
	public static void main(String[] args) {
	/** With out constructor..Default constructor
		Employee emp1 = new Employee();
		emp1.code =1;
		emp1.name = "Abi";
		emp1.dept="IT";
		emp1.desg="Programmer";
		emp1.sal= 30000;
		emp1.information();
		
		Employee emp2 = new Employee();
		emp2.code =2;
		emp2.name = "Ramya";
		emp2.dept="CS";
		emp2.desg="Programmer";
		emp2.sal= 32000;
		emp2.information();
	**/
		/**
		 * Named or parameterized constructure
		 */
		Employee emp3 = new Employee(3,"Rakesh","CS","Programmer",35000);
		emp3.information();
	}
	
	public void information() {		
		System.out.println("Code : "+code +" Name : "+name +" Department "+dept +" Designation "+desg +" Salary "+sal);
	}
}
