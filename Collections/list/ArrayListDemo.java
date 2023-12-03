package Collections.list;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {

		// List interface
		
		List<Integer> list = new ArrayList<>();
		
		list.add(5);
		list.add(6);
		list.add(7);
		
		//System.out.println(list);
		
		list.add(100);
		list.add(100);
		list.add(100);
		
		System.out.println(list);
		//System.out.println(list.get(2));
		
		//System.out.println(list.contains(6));
		
		System.out.println(list.indexOf(100)); // return first occurence
		
		System.out.println(list.lastIndexOf(100)); // return last occurence
	
		System.out.println(list.remove(1));
		
		System.out.println(list);
	}
}
