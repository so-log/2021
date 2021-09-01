package chapter5;

public class AccessEx1 {
	public int num1 = 10;
	int num2 = 20; // default
	
	private int num3 = 30;
	protected int num4 = 40;
	
	
	public AccessEx1() {
		System.out.println(num3);
	}
}
