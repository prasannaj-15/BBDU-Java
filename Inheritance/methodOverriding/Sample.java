package Inheritance.methodOverriding;

public class Sample {

	public static void main(String[] args) {
	
		
		Apple a = new Apple();
		a.batteryCapacity();
		
	}

}



class Phone{
	
	void batteryCapacity() {
		System.out.println("Baterry capacity is 20000mah");
	}
	
	
}


class Apple extends Phone{
	
	//Rules 
	// parent class method name and child class method name is exact same
	// return type is same
	// number of parameters and data type is also same
	
	
	@Override
	void batteryCapacity() {
		System.out.println("Apple Baterry capacity is 42000 mah");
		
	}
	
	
	
}