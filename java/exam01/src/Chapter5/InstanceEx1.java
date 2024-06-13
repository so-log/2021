package chapter5;

public class InstanceEx1 {
	public static void main(String[] args) {
		String text1 = new String("ABC");
		String text2 = new String("ABC");
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
	}
}
