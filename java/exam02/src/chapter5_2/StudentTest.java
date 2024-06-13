package chapter5_2;

public class StudentTest {
	public static void main(String[] args) {
//		System.out.println(Student.serialNum);
		
		Student s1 = new Student();
		Student s2 =new Student();
		
		// 인스턴스 생성 이후 호출 가능
		s1.method();
		// 인스턴스 생성 안했다면 호출 불가 
		
		// static > 인스턴스 생성 관련없이 호출가능 
		Student.staticMethod();
		
		
		/*
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.serialNum = 1000;
		s1.studentID = 1000;
		System.out.println("s1.serialNum : " + s1.serialNum);
		System.out.println("s2.serialNum : " + s2.serialNum);
		
		System.out.println("studentID---------------------------");
		System.out.println("s1.studentID : " + s1.studentID);
		System.out.println("s2.studentID : " + s2.studentID);
		*/
		
		/*
		s2.serialNum = 2000;
		
		System.out.println("s1.serialNum : " + s1.serialNum);
		System.out.println("s2.serialNum : " + s2.serialNum);
		*/
	}
}
