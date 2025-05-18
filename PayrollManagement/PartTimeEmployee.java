package PayrollManagement;

public class PartTimeEmployee extends Employee implements payable{
	
	private int hoursworked;
	private double hourlyrate;
	
	public PartTimeEmployee(String name, int age, int hoursworked ,double hourlyrate) {
		super(name,age,0,"Part-Time");
		this.hoursworked=hoursworked;
		this.hourlyrate=hourlyrate;
		
	}
	
	@Override
	
	public void calculate() {
		salary = hoursworked*hourlyrate;
		System.out.println(name+" Part-time Employee Salary Calculated: "+salary);
		
	}
	

}
