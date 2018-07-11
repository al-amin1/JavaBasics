package employeetest;

public abstract class Employee {
	private String empName;
	private String empNID;
	private String empPhone;
	public Employee(String empName, String empNID, String empPhone) {
		super();
		this.empName = empName;
		this.empNID = empNID;
		this.empPhone = empPhone;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNID() {
		return empNID;
	}
	public void setEmpNID(String empNID) {
		this.empNID = empNID;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	
	public abstract double total_earnings();
}
