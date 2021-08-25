package Chapter6_1;

public class SingleTonTest {
	public static void main(String[] args) {
//		SingleTon st1 = new SingleTon();
		SingleTon st1 = SingleTon.getInstance();
		SingleTon st2 = SingleTon.getInstance();
		
		// st1, st2는 동일한 인스턴스, 동일한 주소
		System.out.println("st1 : " + st1);
		System.out.println("st2 : " + st2);
		
		System.out.println(st1 == st2);
		
		
	}
}
