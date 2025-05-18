package PayrollManagement;

public class Intern extends Employee implements payable {
	
	public Intern(String name, int age, double stipend) {
		super(name,age,stipend,"Intern");
		
	}
	
	@Override
	public void calculate() {
		System.out.print(name+" Intern Salary Stipend is Rs. "+salary);
		
	}

}
