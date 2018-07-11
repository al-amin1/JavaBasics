package javabasic;

public class StudentCourse {
	private String courseName;
	private String couseCode;
	private double courseCredit;
	public StudentCourse(String courseName, String couseCode,
			double courseCredit) {
		super();
		this.courseName = courseName;
		this.couseCode = couseCode;
		this.courseCredit = courseCredit;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCouseCode() {
		return couseCode;
	}
	public void setCouseCode(String couseCode) {
		this.couseCode = couseCode;
	}
	public double getCourseCredit() {
		return courseCredit;
	}
	public void setCourseCredit(double courseCredit) {
		this.courseCredit = courseCredit;
	}
	@Override
	public String toString() {
		return "StudentCourse [courseName=" + courseName + ", couseCode="
				+ couseCode + ", courseCredit=" + courseCredit + "]";
	}
	
	
}
