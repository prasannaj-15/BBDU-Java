package com.demo;

import java.util.Scanner;

// Example 1 - create an object, using object assign values to instance variables and using object call methods

public class Student {
	
	// data fields
	
	String name; 
	int rollNo; 
	String city; 
	
	
	// methods	
	
	void introduceYourSelf() {
		System.out.println("My name is "+ this.name);
		System.out.println("My roll number is "+ this.rollNo);
		System.out.println("I am from "+ this.city);
		
		System.out.println("===============================================");
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name1 = sc.next(); // Ayush
			
		System.out.println("Enter your roll:");
		int no = sc.nextInt();
		
		System.out.println("Enter your city :");
		String city1 = sc.next();
		
		Student s1 = new Student();
		s1.name = name1;
		s1.rollNo = no;
		s1.city = city1;

		s1.introduceYourSelf();
		
	}
	
	
}
