package memberInheritEx;

public class Main {

	public static void main(String[] args) 
	{
		// Employee object and value assigning
		Employee emp = new Employee();
		emp.name = "Hirva Patel";
		emp.age = 20;
		emp.phonenum = "+91 9888994574";
		emp.address = "45, sg society,Ahmedabad";
		emp.salary = 60000;
		emp.specialization = "Web Developer";
		
		// Manager object and value assigning
		Manager mg = new Manager();
		mg.name = "Dipal Patel";
		mg.age = 29;
		mg.phonenum = "+91 5624581250";
		mg.address = "78,radhika bunglows,gandhinagar";
		mg.salary = 82560;
		mg.depart = "IT Department";
		
		// Printing the details of employee
		System.out.println("Employee Details: ");
		System.out.println("Name: " + emp.name);
		System.out.println("Age: " + emp.age);
		System.out.println("Phone Number: " + emp.phonenum);
		System.out.println("Address: " + emp.address);
		System.out.println("Specialization: " + emp.specialization);
		emp.printSalary();
		
		// Printing the details of Manager
		System.out.println("\nManager Details: ");
		System.out.println("Name: " + mg.name);
		System.out.println("Age: " + mg.age);
		System.out.println("Phone Number: " + mg.phonenum);
		System.out.println("Address: " + mg.address);
		System.out.println("Department: " + mg.depart);
		mg.printSalary();

	}

}
