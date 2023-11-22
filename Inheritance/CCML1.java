package Inheritance;

public class CCML1 extends College{

	String course;
	int stdCnt;
	char section;

	
	CCML1(String course, int stdCnt, char section){
		super();
		this.course = course;
		this.stdCnt = stdCnt;
		this.section = section;
		
	}
	
	
	void info(){
		
		System.out.println("course = " + this.course +" "+ this.stdCnt + "= stdCnt"+" section = "+ this.section );
	}
	
	
}
