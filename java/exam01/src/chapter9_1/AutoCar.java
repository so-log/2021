package chapter9_1;

public class AutoCar extends Car {
	void run() {
		System.out.println("차가 달립니다.");
	}
	
	void refuel() {
		System.out.println("휘발유를 주유 합니다.");
	}
	
	void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	void load() {
		System.out.println("짐을 싣습니다.");
	}
}
