package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		employee emp1 = new employee();
		emp1.empName = "sahi";
		emp1.empId = 100;
		
		
		emp1.DisplayName();
		
		
		

		employee emp2 = new employee();
		emp2.empName = "shammi";
		emp2.empId = 101;
		
		emp2.DisplayName();
		
		employee emp3 = new employee ("manju",102);
		emp3.DisplayName();
		
		employee.DisplaySalary();
		
		
		Citizen ct1 = new Citizen();
		ct1.age = 50;
		ct1.Name= "usha";
		ct1.ssn= 5001;
		ct1.Country= "India";
		
		Citizen ct2 = new Citizen ("mad","Germany",33,5002);
		ct2.Citizen();
		
		
		
		
		
	}

}
