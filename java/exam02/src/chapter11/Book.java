package chapter11;

public class Book {
	private String title;
	private int price;
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	public String toStirng() {
		return "책 제목 : " + title + ", 판매가 : " + price;
	}
}
