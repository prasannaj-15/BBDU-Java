package Multithreading;

public class ThreadA extends Thread{

	
	@Override
	public void run() {
		
		System.out.println("ThreadA class run method...");
		
		for(int i=0;i<=5; i++) {
			
			System.out.println("ThreadA = "+ i);
		}
		
		
	}
	
}

