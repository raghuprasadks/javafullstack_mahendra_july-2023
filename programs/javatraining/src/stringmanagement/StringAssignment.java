package stringmanagement;

public class StringAssignment {

	public static void main(String[] args) {
		String course = "Java Full Stack Training.I am Learning Java";
		course = course.replace(".", " ");
		String words[] = course.split(" ");
		int counter = 0;
		int javacounter=0;
		for (String word:words) {
			System.out.println(word);
			counter = counter+1;
			if(word.equals("Java"))
				javacounter+=1;			
		}		
		System.out.println("1. Total number of words "+counter);
		System.out.println("2. Index of F "+course.indexOf("F"));
		course = course.replace("Training", "Coaching");
		System.out.println("3. Replace training with coaching"+course);
		System.out.println("4. Occurance of word Java "+javacounter);
	}

}
