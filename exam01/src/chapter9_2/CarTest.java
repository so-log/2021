package chapter9_2;

public class CarTest {
	public static void main(String[] args) {
		AICar aicar = new AICar();
		ManualCar car = new ManualCar();
		System.out.println("--------- 자율 주행 --------");
		aicar.run();
		
		System.out.println("-------- 사람이 운전 -----");
		car.run();
	}
}