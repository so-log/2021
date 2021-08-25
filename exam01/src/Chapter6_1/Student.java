package Chapter6_1;

public class Student {
	static int serialNum;	// 학번 자동 증감
	int studentID;	// 인스턴스 생성 시점의 학번 저장
	
	public Student() {	// 인스턴스를 생성할 때 마다 학번 serialNum증감
		studentID = ++serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
}
