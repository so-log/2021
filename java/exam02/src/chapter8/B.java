package chapter8;

public class B extends A {
	int numB = 20;
		
	B() {
		super();
		System.out.println("B 생성자");
	}
	
	void methodB() {
		System.out.println("methodB");
	}
}
