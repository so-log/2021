package chapter11_2;

public class StringEx3 {
	public static void main(String[] args) {
		String fruit = new String("apple");
		System.out.println(fruit + " : " + System.identityHashCode(fruit));
		
		fruit += ", melon";
		System.out.println(fruit);
		System.out.println(fruit + " : " + System.identityHashCode(fruit));

	}
}
