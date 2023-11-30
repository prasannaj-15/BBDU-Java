package Exception_Handling.Unchecked_Exception;

import java.util.Scanner;

public class Sample {

	static int divide(int n1,int n2){
		
		return n1/n2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); // 100
		int n2 = sc.nextInt(); // 2
		
		int ans=0;
		
		String str = null;
		
		try {
			 ans = divide(n1,n2);
			 
			// test.txt //open
			 
			 // db connection // open
			 
			 str.toUpperCase();
			 
			 String s1 = "10000";
			 
			 
			 
			 
			 
			 
			 // converts string to int
			 //int a = Integer.parseInt(s1);
			 //System.out.println(a);
			 
			 
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(NullPointerException ne) {
			System.out.println("string is null....");
		}
		catch(Exception ee) {
			System.out.println("Exception class....");
		}
		
		finally {
			//db.close();
			
			System.out.println("finally....");
		}
		
	System.out.println(ans);
	
	
	System.out.println("End program...");
		
}

}