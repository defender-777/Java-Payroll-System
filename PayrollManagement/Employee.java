package PayrollManagement;

public class Employee {
	protected String name;
	protected int age;
	protected double salary;
	protected String designation;
	
	public Employee(String name, int age, double salary, String designation) {
		this.name = name;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}
	
	public void display() {
		System.out.println("Name 		: "+name);
		System.out.println("Age 		: "+age);
		System.out.println("Salary 		: "+salary);
		System.out.println("Designation : "+designation);
	}

}
