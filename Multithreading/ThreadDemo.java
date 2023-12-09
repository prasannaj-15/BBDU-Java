package Multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		
		t1.start();
		t2.start();
		
		System.out.println("End main method");
		
	}
	
}
