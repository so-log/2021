package chapter9;

/*
  구현되지 않은 메서드 정의 
  			1) 상속받은 클래스에 구현되지 않은 메서드를 구현 
 			2) 상속받은 클래스도 추상 클래스로 변경
 */

public abstract class Notebook extends Computer {
	void monitor() {
		System.out.println("Notebook 모니터");
	}
		
	void cpu() {
		System.out.println("Notebook CPU");
	}
	
	void webcam() {
		System.out.println("Notebook Webcam");
	}
}