package chapter2;

public class Constants {
	public static void main(String[] args) {
//		final int NUM = 10; 	// 상수
		
//		NUM = 20;
//		System.out.println(NIM);
		
		final double NUM;
		
		NUM = 10.123;	// 초기 1번만 대입 가능 
		System.out.println(NUM);
		
		String text1 = "ABCD";	// 상수 풀
		String text2 = "ABCD";	// 상수 풀
		System.out.println(text1 == text2);
		
		String text3 = new String("ABCD");
		String text4 = new String("ABCD");
		System.out.println(text3 == text4);
		
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2);
	}
}
