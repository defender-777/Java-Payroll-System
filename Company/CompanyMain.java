package Company;

import PayrollManagement.*;

public class CompanyMain {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		
		employees[0]= new FullTimeEmployee("Alice",30,70000);
		employees[1]= new PartTimeEmployee("Bob",22,80,200);
		employees[2]= new Intern("Charlie",20,10000);
		
		System.out.println("PayRoll System: \n");
		
		for (Employee emp : employees) {
			if(emp instanceof payable) {
				((payable)emp).calculate();
			}
			emp.display();
		}
	}

}
