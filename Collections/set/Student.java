package Collections.set;

import java.util.Objects;

public class Student implements Comparable<Student>{

	int roll;
	String name;
	
	Student(int roll, String name){
		
		this.name = name;
		this.roll = roll;
		
	}

	@Override
	public String toString() {
		return "Student  => roll : " + roll + ", name : " + name;
	}

	@Override
	public int compareTo(Student that) {
		
		if(this.roll == that.roll)
			return -1;
		else	
		 return 1;
	}

		
	
	
	
	
}
