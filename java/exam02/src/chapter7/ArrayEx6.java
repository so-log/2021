package chapter7;

import java.util.ArrayList;

public class ArrayEx6 {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book("자바프로그래밍 입문", 20000));
		books.add(new Book("데이터베이스 개론과 실습", 25000));
		books.add(new Book("서버프로그램 구현", 0));
		
		/*
		for(int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			book.showInfo();
		}
		*/
		
		for(Book book : books) {
			book.showInfo();
		}
	}
}
