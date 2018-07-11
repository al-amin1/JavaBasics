package javabasic;

import java.util.ArrayList;

//POJO -> Plain Old Java Object
public class Student{
	private String studentName;
	private String studentDepartment;
	private int studentAge;
	private String phoneNumber;
	private StudentAddress address;//'has a or one-to-one' relationship
	private ArrayList<StudentCourse>courses;//one to many

	public Student(String studentName, String studentDepartment,
			int studentAge, String phoneNumber, StudentAddress address,
			ArrayList<StudentCourse> courses) {
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentAge = studentAge;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.courses = courses;
	}

	


	public Student(String studentName, String studentDepartment,
			int studentAge, String phoneNumber) {
		super();
		this.studentName = studentName;
		this.studentDepartment = studentDepartment;
		this.studentAge = studentAge;
		this.phoneNumber = phoneNumber;
	}




	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		//if
		this.studentName = studentName;
	}



	public String getStudentDepartment() {
		return studentDepartment;
	}



	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

	public StudentAddress getAddress() {
		return address;
	}




	public void setAddress(StudentAddress address) {
		this.address = address;
	}




	public ArrayList<StudentCourse> getCourses() {
		return courses;
	}




	public void setCourses(ArrayList<StudentCourse> courses) {
		this.courses = courses;
	}




	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", studentAge=" + studentAge
				+ ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", courses=" + courses + "]";
	}

	public String studentInfo(){
		return "Student [studentName=" + studentName + ", studentDepartment="
				+ studentDepartment + ", studentAge=" + studentAge
				+ ", phoneNumber=" + phoneNumber + ", address=" + address
				+ ", courses=" + courses + "]";
	}


	
	
}
