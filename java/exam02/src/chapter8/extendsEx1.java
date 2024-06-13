package chapter8;

public class extendsEx1 {
	public static void main(String[] args) {
//		B b = new B();
		C c = new C();
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
		
//		하위 클래스 > 상위 클래스로 형 변화 : 묵시적 형변환 - 업캐스팅
		B d = new C();
		A e = new C();
		
//		상위 클래스 > 하위 클래스 형변화 : 명시적 형변환 - 다운캐스팅
		C f = (C)e;
	}
}
