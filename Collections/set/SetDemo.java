package Collections.set;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		
		// Set interface
		
		//Set<Integer> set = new HashSet<>();
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(50);
		set.add(50);
		set.add(10);
		set.add(10);
		
		set.add(30);
		set.add(40);
		set.add(10);
		set.add(20);
		set.add(50);
		
		System.out.println(set);
		
		
		

	}

}
