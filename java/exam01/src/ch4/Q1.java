package ch4;

public class Q1 {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		char operator = '+';
		
		int result = 0;
		
		if(operator == '+') {
			result = num1 + num2;
		} else if(operator == '-') {
			result = num1 - num2;
		} else if(operator == '*') {
			result = num1 * num2;
		} else if(operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("연산자 오류입니다.");
			return;
		}
		System.out.println("결과값은 " + result + "입니다.");
	}
}
