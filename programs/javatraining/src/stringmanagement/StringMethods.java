package stringmanagement;

public class StringMethods {
	public static void main(String[] args) {
		String course = "Java Fullstack Training";
		System.out.println("Length "+course.length());
		String program = course.substring(5);
		System.out.println("substring "+program);
		System.out.println("Extract fullstack "+course.substring(5, 14));
		System.out.println("Char at 6 "+course.charAt(6));
		System.out.println("indexof "+course.indexOf('k'));
		
		String s1="Hello";
		String s2="hello";
		System.out.println("Equals "+s1.equals(s2)); //false
		System.out.println("EqualsIgnoreCase "+s1.equalsIgnoreCase(s2));
		
		String s3= " Mahendra College ";
		System.out.println("trim "+s3.trim());
		
		System.out.println("Upper Case" +s3.toUpperCase());
		System.out.println("Lower Case" +s3.toLowerCase());
		
		String nation="My Country is India.I am an Indian";
		
		String[] aftersplit = nation.split(" ");
		for (String spl:aftersplit) {
			System.out.println(spl);
		}
		
		System.out.println("Replace "+nation.replace(".",""));
		System.out.println("Contains " +nation.contains("India"));		
	}
}
