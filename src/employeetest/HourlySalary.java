package employeetest;

public class HourlySalary extends Employee{
	private double hourly_rate;
	private double total_hour;
	public HourlySalary(String empName, String empNID, String empPhone,
			double hourly_rate, double total_hour) {
		super(empName, empNID, empPhone);
		this.hourly_rate = hourly_rate;
		this.total_hour = total_hour;
	}
	public double getHourly_rate() {
		return hourly_rate;
	}
	public void setHourly_rate(double hourly_rate) {
		this.hourly_rate = hourly_rate;
	}
	public double getTotal_hour() {
		return total_hour;
	}
	public void setTotal_hour(double total_hour) {
		this.total_hour = total_hour;
	}
	@Override
	public double total_earnings() {
		// TODO Auto-generated method stub
		return hourly_rate * total_hour;
	}
	
}
