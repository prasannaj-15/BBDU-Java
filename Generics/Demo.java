package Generics;

public class Demo {

	public static void main(String[] args) {
		
		Box<String> b1 = new Box<String>("hello");
		
		Student s1 = new Student(10, "raj");
		
		Box<Student> b2 = new Box<>(s1);
		
		System.out.println(b2);
		
		
	}
	
}
