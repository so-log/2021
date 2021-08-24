package Chapter5;

public class Subject2Test {
	public static void main(String[] args) {
		Student2 student = new Student2(1001, 40, "김예림");
		student.addSubject("영어", 90);
		student.addSubject("수학", 80);
		
		student.showInfo();
	}
}
