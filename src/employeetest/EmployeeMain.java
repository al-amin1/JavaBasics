package employeetest;

public class EmployeeMain {

	public static void main(String[] args) {
		FixedSalary fs = new FixedSalary("Abid", "3423832823", "+8801552445566", 25000.0);
		HourlySalary hs = new HourlySalary("Monir", "8888989", "+8801589565566", 100.0, 48.0);
		CommissionedSalary cs = 
				new CommissionedSalary("Limon", "8999989", "+8801589562233", 2.5, 25000.0);
		Employee[] employees = new Employee[3];
		employees[0] = fs;
		employees[1] = hs;
		employees[2] = cs;
		
		for(Employee e : employees){
			System.out.println(e.total_earnings());
		}
		
	}

}
