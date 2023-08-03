package datastructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		System.out.println("List and ArrayList demo");
		System.out.println("Friends list");
		
		List friendsList = new ArrayList();
		//List friendsList = new LinkedList();
		friendsList.add("Mahesh");
		friendsList.add("Rashmi");
		friendsList.add("Suresh");
		friendsList.add("Rashmi");		
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
		friendsList.add(1,"Ramya");		
		System.out.println("After add with index");
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
		friendsList.set(0, "Mahesh Kumar");		
		System.out.println("After update-set");
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}		
		friendsList.remove(2);		
		friendsList.remove("Rashmi");		
		System.out.println("After remove");
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
		
		System.out.println("After adding integer");
		
		friendsList.add(new Integer(10));
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
		System.out.println("Adding null value");
		friendsList.add(2,null);
		for (int i=0;i<friendsList.size();i++) {
			System.out.println(friendsList.get(i));
		}
	}
}
