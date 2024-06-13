package chapter5;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	
	FaimilyMember family;
	java.util.ArrayList<String> list;
	
	public Person() {}			// 기본 생성자
	
	public Person(String name) {
		this.name = name;		// 초기화 : 값을 처음 대
	}
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
//		System.out.println("Person 클래스");
		System.out.println(name + "님 키 : " + height + " 몸무게 : " + weight);
	}
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
	
	}


}
