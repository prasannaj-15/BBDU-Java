package Abstraction;

public class Main {

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.info();
		c1.show();
	}
	
}


abstract class A{
	
	abstract void info(); //abstract method
	
	// non- abstract method
	void show() {
		System.out.println("Hiiii....");
	}
	
}

class Child extends A{

	@Override
	void info() {
		
		System.out.println("Hello....");
		
	}
	
	
	
}