package encapsulation;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setEmpId(201);
		
		int res = e1.getEmpId();

		System.out.println(res);
		
		e1.setEmpName("Harry");
		
		System.out.println(e1.getEmpName());
		
		
		 
	}

}



class Employee {
	
	private int empId;
	private String empName;
	
	private String panNo = "AZ10PW5012";
	
	private int salary = 50000;
	
	public int getEmpId(){
		return empId;
	}
	
	public void setEmpId(int empId){
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public String getPanNo() {
		return panNo;
	}
	
	
	public int getSalary() {
		return salary;
	}
	
	
}