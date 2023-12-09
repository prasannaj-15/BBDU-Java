package Multithreading;

public class Test implements Runnable{

	@Override
	public void run() {
	
		System.out.println("Test class run method...");
		
		for(int i=0;i<10;i++) {
			System.out.println("Test " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}

	
	public static void main(String[] args) {
		
		Test t1 = new Test();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t1);
		
		th1.setName("CCML1 - Thread");
		
		System.out.println(th1.getName());
		
		
		th1.start();
//		th2.start();
		
		
		System.out.println("end of main...");
	}
	
}
