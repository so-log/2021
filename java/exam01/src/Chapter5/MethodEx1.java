package chapter5;

public class MethodEx1 {
	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
		
		printMessage("메세지 출력!");
	}
	
	static int sum(int x) {
		int result = x * 2 + 2;
		
		return result;
		// System.out.println("하단 출력 테스트");
	}
	
	static void printMessage(String msg) {
		System.out.println(msg);
	}
}
