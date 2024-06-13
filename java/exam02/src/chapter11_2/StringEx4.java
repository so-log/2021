package chapter11_2;

public class StringEx4 {
	public static void main(String[] args) {
		String fruit = new String("Apple");
		System.out.println("fruit : " + System.identityHashCode(fruit));
		StringBuilder buffer = new StringBuilder(fruit);
		System.out.println("before buffer : " + System.identityHashCode(buffer));
		buffer.append(", melon");
		buffer.append(", mango");
		buffer.append(", banana");
		System.out.println("after buffer : " + System.identityHashCode(buffer));
		
		fruit = buffer.toString();
		System.out.println(fruit);
		System.out.println("fruit : " + System.identityHashCode(fruit));
	}
}
