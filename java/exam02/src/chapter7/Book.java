package chapter7;

public class Book {
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name=name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void showInfo() {
		System.out.println("책 이름 : " + name + " 판매가 : " + price + ", 주소 : " + hashCode());
	}
}
