package oops;

public class employee {
	
	public String empName;
	public int empId;
	private static int Salary = 50000 ;
	
	
	
public employee() {
		
		System.out.println("Inside default cons");
	}
	
	public employee(String var1, int var2) {
		
		System.out.println("Inside param cons");
		
		empName = var1;
		empId = var2;
	}
	


	
	
	public void DisplayName() {

		
		System.out.println("Print emp name "+empName);
		
		
	}
	
	public static void DisplaySalary(){
		System.out.println("employee salary is " + Salary);
	}
	

}
