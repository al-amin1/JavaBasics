package employeetest;

public class FixedSalary extends Employee {
	private double salary;

	public FixedSalary(String empName, String empNID, String empPhone,
			double salary) {
		super(empName, empNID, empPhone);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double total_earnings() {
		// TODO Auto-generated method stub
		return salary;
	}
	
	
}
