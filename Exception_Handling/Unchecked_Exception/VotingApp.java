package Exception_Handling.Unchecked_Exception;

import java.util.Scanner;

public class VotingApp {
	
	static void checkAge(int age) throws InvalidAgeException{
		
		if(age < 18) {
				throw new InvalidAgeException("Invalid age...");
		}
		else
			System.out.println("Valid age for voting..");
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (InvalidAgeException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
