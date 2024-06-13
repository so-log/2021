package chapter10_2;

/*
	 오류 해결 방법
	  1) 추상클래스로 선언(abstract)
	  2) 미구현된 추상메서드를 구현 
 */
public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// int - 0 -> 나누기는 0으로 나눌수 없으로 오류 발생 
		if (num1 == 0 || num2 == 0) {
			return Calc.ERROR;
		} else {
			return num1 / num2;
		}
	}
	
	public void showInfo() {
		System.out.println("일반 계산기");
	}
}
