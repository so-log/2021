package chapter9_4;

public class DefineTest extends String {
	public static void main(String[] args) {
		Define d = new Define();
		System.out.println("일반 상수 - " + d.num);
		
		System.out.println(Define.MIN + "," + Define.MAX);
	}
}