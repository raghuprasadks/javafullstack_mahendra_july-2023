package stringmanagement;

public class StringBuilderDemo {
	public static void main(String[] args) {
		System.out.println("Thread safe - Synchronized");
		StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer);  
        
        System.out.println("Not Thread safe - Not Synchronized");
		StringBuilder builder=new StringBuilder("hello");  
		builder.append("java");  
        System.out.println(builder);  
       }
}
