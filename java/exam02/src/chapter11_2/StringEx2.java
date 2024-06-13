package chapter11_2;

public class StringEx2 {
	public static void main(String[] args) {
		String text1 = "ABC";
		String text2 = "ABC";
		System.out.println(text1 == text2);
		
		String text3 = new String();
		String text4 = new String();
		System.out.println(text3 == text4);
	}
}
