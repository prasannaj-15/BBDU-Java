package Arrays;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter "+ (i+1) +" int type data :");
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println(arr[4]);
		
		
		// second way of creating an array
		
		int[] arr1 = {10,20,30,40,50};
		
	
		
	

	}

}
