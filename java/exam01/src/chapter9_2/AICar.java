package chapter9_2;

public class AICar extends Car {

	@Override
	void drive() {
		System.out.println("자율 주행을 합니다.");
		
	}

	@Override
	void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}