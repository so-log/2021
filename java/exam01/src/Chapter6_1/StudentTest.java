package chapter6_1;

public class StudentTest {
	public static void main(String[] args) {
		// �л� > ���� > �й��� �ڵ� ����(serialNum - static)
		// �й��� �ڵ� �����ϰ� �߱� > �߱� �� ������ �й��� ��� ����
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		System.out.println("st1 �й� = " + st1.getStudentID());
		System.out.println("st2 �й� = " + st2.getStudentID());
		System.out.println("st3 �й� = " + st3.getStudentID());
	}
}
