package chapter10_2;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(10, 20));
		
		Calc c2 = new Calculator();
		System.out.println(c2.subtract(30, 10));
		Calculator c3 = (Calculator)c2;
		c3.showInfo();
	}
}