package ch4;

public class WhileExample1 {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
		int num1 = 1;
		int sum1 = 0;
		
		while(num1 <= 50) {
			sum1 += num1;
			num1++;
		}
		System.out.println("1부터 50까지의 합은 " + sum1 + "입니다.");
	}
}
