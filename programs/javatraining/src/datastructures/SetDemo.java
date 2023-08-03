package datastructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		System.out.println("Set and HashSet deemo");
		Set friendsSet = new HashSet();
		//List friendsList = new LinkedList();
		friendsSet.add("Mahesh");
		friendsSet.add("Rashmi");
		friendsSet.add("Suresh");
		friendsSet.add("Rashmi");		
		Iterator itr=friendsSet.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("SortedSet-TreeSet");
		
		Set friendsSetNew = new TreeSet();
		//List friendsList = new LinkedList();
		friendsSetNew.add("Mahesh");
		friendsSetNew.add("Rashmi");
		friendsSetNew.add("Suresh");
		friendsSetNew.add("Rashmi");	
		
		Iterator itrNew=friendsSetNew.iterator();
		
		while(itrNew.hasNext()) {
			System.out.println(itrNew.next());
		}				
	}
}
