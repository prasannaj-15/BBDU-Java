package Arrays;

import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size :- ");
		int row = sc.nextInt();
		
		System.out.println("Enter column size :- ");
		int col = sc.nextInt();
		
		
		int[][] matrix = new int[row][col];
		
		int sum = 0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter data of matrix["+i+"]["+j+"]");
				
				matrix[i][j] = sc.nextInt();
			
				sum += matrix[i][j];
			}
		}
		
		System.out.println(sum);
		
		/*
		 * for(int i=0;i<row;i++) { for(int j=0;j<col;j++) {
		 * 
		 * System.out.print(matrix[i][j]+" ");
		 * 
		 * } System.out.println(); }
		 */
		
		
	}

}
