package basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter a number to print its table");
		Scanner scnr = new Scanner(System.in);
		int table = scnr.nextInt();
		
		for (int i=1;i<=10;i++) {
			if(i==5)
				continue;
			System.out.println(table +" * "+i+" = "+table*i);
			/**
			if(i==5)
				break;
			**/
		}
		
		
	}

}
