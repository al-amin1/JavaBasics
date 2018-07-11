package javabasic;

import java.util.ArrayList;
import java.util.List;

public class StartPoint {

	public static void main(String[] args) {
		Student s1 = new Student("Hassan", "CSE", 20, "132456789");
		StudentAddress address1 = new StudentAddress("111", "5", "Dhaka", "1215");
		s1.setAddress(address1);
		
		StudentCourse course1 = 
				new StudentCourse("Computer Fundamental", "CS-101", 3.0);
		StudentCourse course2 = 
				new StudentCourse("Digital Signal", "CS-102", 1.5);
		ArrayList<StudentCourse>courses = new ArrayList<StudentCourse>();
		courses.add(course1);
		courses.add(course2);
		s1.setCourses(courses);
		
		//System.out.println(s1);
		
		//System.out.println(s1.getAddress().getCity());
		
		//System.out.println(s1.getCourses().get(1).getCourseCredit());
		//System.out.println(course2.getCourseCredit());
		for(StudentCourse c : s1.getCourses()){
			System.out.println(c);
		}
	}
	
	
}
