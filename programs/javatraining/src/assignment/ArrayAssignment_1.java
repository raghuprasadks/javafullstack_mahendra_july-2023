package assignment;

public class ArrayAssignment_1 {

	public static void main(String[] args) {
		System.out.println("1. Design a method to calculate the sum of n elements in an array");
		
		int array[]= {10,20,30,10,20,19,21};
		int total = sumArray(array);
		System.out.println("Total : "+total);
		
		System.out.println("2. Design a method to calculate the average of n elements in an array");
		float avg = avgArray(array);
		System.out.println("Average : "+avg);
		
		System.out.println("3. Desing a method to return how many even numbers in the passed array");
		int counteven = countEven(array);
		System.out.println("Count Even : "+counteven);
		
		System.out.println("4. Desing a method to return how many odd numbers in the passed array.");
		int countodd = countOdd(array);
		System.out.println("Count Odd : "+countodd);
		
	}
	
	public static int sumArray(int array[]) {
		int total=0;
		for (int arr:array)
			total = total +arr;
		return total;
		
	}
	
	public static float avgArray(int array[]) {
		float average=0;
		int total =0;
		for (int arr:array)
			total = total +arr;		
		average = total/array.length;
		return average;
	}
	
	public static int countEven(int array[]) {
		int counteven =0;
		for (int arr:array) {
			if(arr%2==0) {
				counteven=counteven+1;
			}
		}		
		return counteven;	
		
	}

	public static int countOdd(int array[]) {
		int countodd =0;
		for (int arr:array) {
			if(arr%2!=0) {
				countodd=countodd+1;
			}
		}		
		return countodd;		
	}
	
	
}
