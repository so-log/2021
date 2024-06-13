package chapter5_2;

public class StudentTest2 {
	public static void main(String[] args) {
		Student s1 = new Student();		// 1001
		Student s2 = new Student();		// 1002
		
		// 정적 변수 > 같은 값 공
//		System.out.println("s1.serialNum = " + s1.serialNum);
//		System.out.println("s2.serialNum = " + s2.serialNum);
		// 정적변수 = 클래스 이름으로 직접 참조 
		System.out.println("s2.serialNum = " + Student.serialNum);
		
		System.out.println("s1.serialNum = " + s1.getStudentID());
		System.out.println("s2.serialNum = " + s2.getStudentID());
	}
}
