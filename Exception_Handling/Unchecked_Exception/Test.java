package Exception_Handling.Unchecked_Exception;

public class Test {

	public static void main(String[] args) {
		
		// Unchecked Exception
		
		System.out.println("Hello");
		String str = null;
	
		try {
			
			System.out.println(str.length());		
			System.out.println(5/1);
				
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmatic exception...");
		}
		
		catch(NullPointerException ne) {
			System.out.println("Null pointer exception..");
		}
		catch(Exception e) {
			System.out.println("number is divided by zero...");
		}
		
		
		System.out.println("hi...");
		
	}
	
}
