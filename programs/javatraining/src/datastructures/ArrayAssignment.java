package datastructures;

public class ArrayAssignment {

	public static void main(String[] args) {
		int runs[]= {21,22,42,33,46};
		int total=0;
		int totaleven=0;
		int countodd=0;
		int maxvalue=runs[0];
		int minvalue=runs[0];
		for(int run:runs) {			
			total+=run;
			if(run%2==0) {
				totaleven+=run;
			}else {
				countodd++;
			}			
			if(run>maxvalue)
				maxvalue=run;			
			if(run<minvalue)
				minvalue=run;			
		}		
		System.out.println("Total :"+total);
		System.out.println("Total Even:"+totaleven);
		System.out.println("Count Odd:"+countodd);
		System.out.println("max runs:"+maxvalue);
		System.out.println("min runs:"+minvalue);	
	}

}
