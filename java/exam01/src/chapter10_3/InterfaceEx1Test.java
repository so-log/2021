package chapter10_3;

public class InterfaceEx1Test {
	public static void main(String[] args) {
		/*
		  ex 인스턴스는 A exA, B exB의 구성 요소를 모두 가지고 있으므로 
		  묵시적 형 변환가능  
		 */
		InterfaceEx1 ex = new InterfaceEx1();
		A exA = ex; // 묵시적으로 A로 형변환
		B exB = ex; // 묵시적으로 B로 형변환 
		
	}
}