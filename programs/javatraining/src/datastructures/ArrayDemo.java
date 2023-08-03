package datastructures;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println("1. Create an array");
		int marks[] = new int[6];
		marks[0]=18;
		marks[1]=15;
		marks[2]=20;
		marks[3]=14;
		marks[4]=25;
		marks[5]=25;
		System.out.println("2. Display elements of the array");
		for (int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		marks[2]=21;
		System.out.println("3. After updation");
		// for each loop
		for(int mark:marks) {
			System.out.println(mark);			
		}
		System.out.println("4. marks greater than 15");
		
		for(int i=0;i<marks.length;i++)
		{			
			if(marks[i]>15)
				System.out.println(marks[i]);
		}
		
		System.out.println("5. count of marks equal to 25");
		int counter=0;
		for(int mark:marks) {
			if (mark==25)
				counter = counter+1;			
		}
		System.out.println(counter);
		
		System.out.println("char array");
		System.out.println("Display total no of vowels and consonants");
		String text ="hello";
		char[] charary =text.toCharArray();
		int countvowels=0;
		int countconsonants=0;
		for (char c:charary) {
			//System.out.println(c);
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				countvowels=countvowels+1;
			}else {
				countconsonants=countconsonants+1;
			}			
		}		
		System.out.println("vowel count "+countvowels);
		System.out.println("consonant count "+countconsonants);
		
	}
}
