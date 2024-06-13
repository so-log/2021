package chapter9_2;

public abstract class Car {
	void startCar() {
		System.out.println("차에 시동을 겁니다.");
	}
	
	abstract void drive();
	abstract void stop();
	
	void turnOff() {
		System.out.println("차의 시동을 끕니다.");
	}
	
	final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
