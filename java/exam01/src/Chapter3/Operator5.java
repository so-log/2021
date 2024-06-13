package chapter3;

public class Operator5 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		String result = (num1 > num2)? "크다":"작다";
		System.out.println(result);
		
		String result2;
		if (num1 > num2) {
			result2 = "크다";
		} else {
			result2 = "작다";
		}
		System.out.println(result2);
	}
}
