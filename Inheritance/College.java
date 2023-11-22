package Inheritance;

public class College {

	String clgName;
	String clgGrade;
	int clgId;
	String address;
	
	College(String clgName, String clgGrade, int clgId, String address){
		this.clgName = clgName;
		this.clgGrade = clgGrade;
		this.clgId = clgId;
		this.address = address;
	}
	
	College(){}
	
	
	void hello(){
		
		System.out.println("hello");
	}
	
}
