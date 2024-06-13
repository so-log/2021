package chapter10_2;

public interface Calc {
	int ERROR = -1; // 컴파일시 public static final 자동 추가 - static 상수 
	/*
	  인터페이스는 only 추상 메서드 -> 알아서 컴파일러가 추가(예전)
	 */
	int add(int num1, int num2); // public abstract 자동 컴파일러가 추가해 준다
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}