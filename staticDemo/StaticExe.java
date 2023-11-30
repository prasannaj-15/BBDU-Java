package staticDemo;

public class StaticExe {

	String name;
	int roll;
	String city;
	static String clgName;
	
	public StaticExe(String name, int roll, String city) {
		this.name = name;
		this.roll = roll;
		this.city = city;

	}
	
	
//	static void valueAssign() {
//		
//		clgName = "BBD";
//		
//		System.out.println("Inside Static block");
//		
//	}
	
	
	
	
	void showData() {
		System.out.println(name + " "+ roll +" "+ city +" "+ clgName);
	}

	
	
	
	
	
	public static void main(String[] args) {
		
		
		StaticExe st = new StaticExe("raj",12,"Lucknow");
		
	//	valueAssign();	
	
		st.showData();
		
	
		
		System.out.println("Inside main");

	}

	
	static {
		clgName = "BBdu";
		
		System.out.println("Inside static block");
	}
	
	
}
