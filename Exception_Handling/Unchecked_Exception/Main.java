package Exception_Handling.Unchecked_Exception;

import java.util.Scanner;

public class Main {

	
	static int dividedByZero(int n) throws ArithmeticException, NullPointerException, Exception{
		
		if(n == 0) {
			throw new ArithmeticException("found divided by zero exception..");
		}
		
		
		int ans = 50 / n;
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		int ans;
		try {
			ans = dividedByZero(n1);
			System.out.println(ans);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("End program...");
		
	}
	
}



