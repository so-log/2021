package chapter7;

public class StudentTest {
	public static void main(String[] args) {
		// �ڷ���[] ������ = new �ڷ���[����];
		// ���� �ڷ��� - Student
		Student[] list = new Student[100];	// instance�� ������ ������ ����, �ʱⰪ null
		for(int i = 0; i < list.length; i++) {
			int num = i + 1;
			int ban = i % 4;
			list[i] = new Student("�̸�" + num, ban + 1);
		}
		
		for(int i = 0; i < list.length; i++) {
			list[i].showInfo();
		}
	}
}
