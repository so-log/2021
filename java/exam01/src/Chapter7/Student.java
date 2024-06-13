package chapter7;

public class Student {
	String name;
	int classRoom;
	
	public Student(String name, int classRoom) {
		this.name = name;
		this.classRoom = classRoom;
	}
	public void showInfo() {
		System.out.println(name + "�� " + classRoom + "�� �Դϴ�.");
	}
}
