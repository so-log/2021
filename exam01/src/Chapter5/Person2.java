package Chapter5;

public class Person2 {
	String name;
	double height;
	double weight;
	
	public Person2(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("이름 = " + name);
		System.out.println("키 = " + height);
		System.out.println("몸무게 = " + weight);
	}
}
