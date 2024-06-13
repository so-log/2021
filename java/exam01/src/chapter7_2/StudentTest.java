package chapter7_2;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		lee.addSubject("국어", 100);
		lee.addSubject("수학", 50);
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("국어", 70);
		kim.addSubject("수학", 80);
		kim.addSubject("영어", 100);
		
		System.out.println("-------------------LEE----------------");
		lee.showInfo();
		
		System.out.println("-------------------KIM----------------");
		kim.showInfo();
	}
}
