package chapter9_4;

public class Define {
	/*
	   final 예약어가 추가된 상수 -> 데이터 영역에서 접근 
	  
	 */
	public static final int MIN = 1; // static  - 인스턴스 생성 없이 접근 가능 
	public static final int MAX = 10000; // static
	public final int num = 10; // static이 아닌 상수  - 인스턴스 생성 후 접근 가능 
}