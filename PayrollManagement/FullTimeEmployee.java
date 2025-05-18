package PayrollManagement;

public class FullTimeEmployee extends Employee implements payable {
	
	public FullTimeEmployee(String name, int age, double monthlySalary) {
		super(name,age,monthlySalary,"Full-Time");
		
	}
	@Override
	public void calculate() {
		System.out.println(name+" Full-time Employee salary calculated: Rs. "+salary);
		
	}
	

}
