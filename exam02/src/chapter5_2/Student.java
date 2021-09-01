package chapter5_2;

public class Student {
	static int serialNum = 1000;
	int studentID;
	
	Student(){
		serialNum++;
		studentID = serialNum;
	}
	
	int getStudentID() {
		return studentID;
	}
	
	void method() {
//		인스턴스 메서드 내에 static 메서드와 static 변수 사용 가능 
//		순서 : 데이터 영역 먼저(static) > 힙 영역 (인스턴스)
		staticMethod();
		int serialNum;
		System.out.println("인스턴스 메서드");
	}
	
	static void staticMethod() {
//		static 메서드 내에서 인스턴스 메서드와 인스턴스 변수 사용 불가 
//		method();
//		int studentID;
		System.out.println("정적 메서드");
	}
}
