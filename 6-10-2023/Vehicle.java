
public class Vehicle {
	
	// data field
	String name;
	String brand;
	int number;
	
	
	//methods
	
	// a method receive value in parameter
	void vehicleInfo(String name) {

		// print the value store in parameter name
		System.out.println(name);
	}
	
	
	void start() {
		// this keyword refer current object (using which object we call the start method)
		System.out.println(this.name +" started");
	}
	
	

	public static void main(String[] args) {

		// Creating object
		Vehicle v1 = new Vehicle();
		
		// passing argument to the method directly
		v1.vehicleInfo("car");
		v1.start();
	
		
	}

}
