package week3.day1.org.student;

import week3.day1.org.college.College;
import week3.day1.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Student Name = Nandhini");
	}
	public void studentDept() {
		System.out.println("Student Department = BCA");
	}
	public void studentId() {
		System.out.println("Student Id = C29716");
	}
	
	public static void main(String[] args) {
		Student studentDetails = new Student();
		studentDetails.collegeCode();
		studentDetails.collegeName();
		studentDetails.collegeRank();
		studentDetails.deptName();
		studentDetails.studentDept();
		studentDetails.studentId();
		studentDetails.studentName();
	}
}
