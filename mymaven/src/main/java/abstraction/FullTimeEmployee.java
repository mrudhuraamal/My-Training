package abstraction;

public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, double paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * 8; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee contractor = new Contractor("John Doe", 50, 20); 
	        Employee fullTimeEmployee = new FullTimeEmployee("Jane Smith", 60);

	        System.out.println("Contractor Salary: $" + contractor.calculateSalary());
	        System.out.println("Full-Time Employee Salary: $" + fullTimeEmployee.calculateSalary());
	}

}
