package Inheritance.superKeyword;

public class Main {

	public static void main(String[] args) {
		
//		String name;
		
		D b1 = new D();				
		
		System.out.println(b1 instanceof D);
	}

}


class A{
	
	
	A(){
		System.out.println("Class A's constructor..");
	}
	
	
}


class B extends A{

	B(){
		System.out.println("Class B's constructor..");
	
	}
	
}


class C extends B{
	
	C(){
		System.out.println("Class C's constructor..");
		
	}
}

class D extends A{
	D(){
		System.out.println("Class D's constructor..");
		
	}
}

