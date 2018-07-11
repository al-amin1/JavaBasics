package javabasic;

public class StudentAddress {
	private String houseNo;
	private String roadNo;
	private String city;
	private String zipCode;
	public StudentAddress(String houseNo, String roadNo, String city,
			String zipCode) {
		super();
		this.houseNo = houseNo;
		this.roadNo = roadNo;
		this.city = city;
		this.zipCode = zipCode;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "StudentAddress [houseNo=" + houseNo + ", roadNo=" + roadNo
				+ ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
	
}
