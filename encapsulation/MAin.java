package encapsulation;

public class MAin {

	public static void main(String[] args) {
		
		

	}

}



interface inter1{
	
	void show();
	
}

interface inter2{
	
	void info();
}


class A implements inter1,inter2 {

	@Override
	public void info() {
		
		System.out.println("hello");
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hi..");
	}

	
	
}
