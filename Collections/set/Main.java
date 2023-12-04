package Collections.set;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		Student s1 = new Student(10, "Harry");
		Student s2 = new Student(10, "Harry");
		Student s3 = new Student(30, "Tony");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(set);
		
	}
	
}
