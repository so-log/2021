package chapter8;

public class C extends B {
	int numC = 30;
	
	C(){
		// 컴파일러가 자동으로 추가 > 부모 기본 생성자 호출
		// C() 생성자 호출이 종료 되기 전에 부모 생성자가 먼저 호
//		super();	
		System.out.println("C 생성자");
	}
	
	void methodC() {
		System.out.println("methodC");
	}
}
