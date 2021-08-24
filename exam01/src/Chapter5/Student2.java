package Chapter5;

import java.util.ArrayList;

public class Student2 {
	int studentID;
	int age;
	String studentName;
	ArrayList<Subject2> subjectList;
	
	public Student2(int studentID, int age, String studentName) {
		this.studentID = studentID;
		this.age = age;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject2>();
	}
	
	public void addSubject(String name, double score) {
		Subject2 subject = new Subject2(name, score);
		subjectList.add(subject);
	}
	
	public void showInfo() {
		System.out.println("아이디 : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("나이 : " + age);
		System.out.println("-------- 수강 과목, 점수 ---------");
		
		for (Subject2 subject : subjectList) {
			System.out.println("과목 : " + subject.subjectName + ", 점수 : " + subject.score);
		}
	}
}
