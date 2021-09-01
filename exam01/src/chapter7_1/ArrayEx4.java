package chapter7_1;

public class ArrayEx4 {
	public static void main(String[] args) {
		Book[] books1 = new Book[3];
		Book[] books2 = new Book[3];
		
		books1[0] = new Book("책1", "저자1");
		books1[1] = new Book("책2", "저자2");
		books1[2] = new Book("책3", "저자3");
		
		
		System.arraycopy(books1, 0, books2, 0, 3);
		
		System.out.println("----------- books1 ------------");
		books1[0].setBookName("책1-1");
		books1[0].setAuthor("저자1-1");
		for (int i = 0; i < books1.length; i++) {
			books1[i].showBookInfo();
		}
		
		System.out.println("----------- books2 ------------");
		for (int i = 0; i < books2.length; i++) {
			books2[i].showBookInfo();
		}
	}
}
