package ch5;

public class Person3Test {
	public static void main(String[] args) {
		Person3 personKim = new Person3();	// 디폴트 생성자 
		
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person3 personLee = new Person3("이순신", 175, 75);
	}
}
