package employeetest;

public class CommissionedSalary extends Employee{
	private double commission_rate;
	private double gross_sale;
	public CommissionedSalary(String empName, String empNID, String empPhone,
			double commission_rate, double gross_sale) {
		super(empName, empNID, empPhone);
		this.commission_rate = commission_rate;
		this.gross_sale = gross_sale;
	}
	public double getCommission_rate() {
		return commission_rate;
	}
	public void setCommission_rate(double commission_rate) {
		this.commission_rate = commission_rate;
	}
	public double getGross_sale() {
		return gross_sale;
	}
	public void setGross_sale(double gross_sale) {
		this.gross_sale = gross_sale;
	}

	@Override
	public double total_earnings() {
		// TODO Auto-generated method stub
		return (commission_rate * gross_sale) / 100;
	}
}
