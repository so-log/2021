package chapter2;

public class CastEx1 {
	public static void main(String[] args) {
		byte num1 = 10;
		int num2 = num1;	// num1 > byte > int
		System.out.println(num2);
		
		// short num3 = num2; 	// 작은 자료형으로 변경 > 자료 손실 발생
		// System.out.println(num3);
		
		float num3 = num2;	// num3 자료형이 num2보다 정밀 > int >
		System.out.println(num3);
		
		long num4 = 1234567890L;	// 8비트 
		float num5 = num4;	// 4비트 
		System.out.println(num5);
		
		System.out.println(10 / 2.0F);	// int /float 
//		float num6 = 10 / 2.0F;
		double num6 = 10 / 2.0F;	//int > float > double
		System.out.println(num6);
	}
}
