package Inheritance.multilevel;

public class Main {

	public static void main(String[] args) {
		
		
		Child c1 = new Child();
		c1.surname = "Singh";
		
		c1.alive();
		
		c1.info();
		
		System.out.println(c1.surname);
		
		
		// father obj
		
		Father f1 = new Father();
		f1.alive();
		

	}

}
