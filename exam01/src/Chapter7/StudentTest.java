package Chapter7;

public class StudentTest {
	public static void main(String[] args) {
		// 자료형[] 변수명 = new 자료형[갯수];
		// 참조 자료형 - Student
		Student[] list = new Student[100];	// instance가 생성될 공간만 생성, 초기값 null
		for(int i = 0; i < list.length; i++) {
			int num = i + 1;
			int ban = i % 4;
			list[i] = new Student("이름" + num, ban + 1);
		}
		
		for(int i = 0; i < list.length; i++) {
			list[i].showInfo();
		}
	}
}
