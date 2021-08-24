package Chapter2;


public class Valialbe1 {
	public static void main(String[] args) {
	int num;
	// 선언(자료형 변수명 -> 자료형 만큼 공간이 생성)
	// 용량 만큼 숫자를 입력(2진 32비트)
	num = 10; // num 공간에 10을 대입한다(공간에 복사한다)
	
	System.out.println(num);
	
	double num2 = 20000000.0; //
	System.out.println(num2);
	
	long num3 = 200000000000L; // 64비트(8바이트)정수
	// int num3 = 200000000000; -> num3 = (long)200000000000;
	System.out.println(num3);
	
	
	// 나이 - 정수 
	int age = 26;
	System.out.println("나이는 " + age);
	}
}
