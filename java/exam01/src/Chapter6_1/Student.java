package chapter6_1;

public class Student {
	static int serialNum;	// �й� �ڵ� ����
	int studentID;	// �ν��Ͻ� ���� ������ �й� ����
	
	public Student() {	// �ν��Ͻ��� ������ �� ���� �й� serialNum����
		studentID = ++serialNum;
	}
	
	public int getSerialNum() {
		return serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
}
