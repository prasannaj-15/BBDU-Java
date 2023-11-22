package Inheritance.methodOverloading;

import javax.sound.midi.Soundbank;

public class Main {

	// method overloading
	
	int add(int a,int b) {
		return a+b;
	}
	
	
	double add(double a, double b,int c) {
		return a+b+c;
	}
	
	
	String add(int a, String s) {
		
		return a+s;
	}
	
	
	public static void main(String[] args) {
		
		Main a = new Main();
		
		System.out.println(a.add(1, 2));
		
		System.out.println(a.add(5.1,6,8));
		
		System.out.println(a.add(5, " is a number"));
		
		
		System.out.println(a instanceof Main);
		
		
	}

}
