package Chapter6;

public class Student {
static int studentNum; // 학번
	
	String name; // 학생이름
	int money; 
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public static int getStudentNum() {
		//name = "이름";
		//money = 10000;
		//showInfo();
		return studentNum;
	}
	
	public void rideBus(Bus bus) {
		bus.collect(this); // this -> Student s
	}
	
	public void rideSubway(Subway subway) {
		subway.collect(this);
	}
	
	public void showInfo() {
		System.out.println(this.name + " : " + this.money);
		
		System.out.println(studentNum);
		getStudentNum();
	}

}
