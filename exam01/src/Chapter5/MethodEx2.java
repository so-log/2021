package chapter5;

public class MethodEx2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		divide(n1,n2);
		
	}
	
	static void divide(int num1, int num2) {
		if (num2 == 0) {
			return; // 반환하고, 함수의 수행이 종료
		}
		
		int result = num1 / num2;
		System.out.println(result);
	}
}
