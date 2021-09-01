package chapter7_1;

import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1001, "학생1"));
		students.add(new Student(1002, "학생2"));
		students.add(new Student(1003, "학생3"));
		
		/*
		for(int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			s.showStudentInfo();
		}
		*/
		for(Student student :students) {
			student.showStudentInfo();
		}
	}
}
