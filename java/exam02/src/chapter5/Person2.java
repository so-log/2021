package chapter5;

public class Person2 {
	private String name;
	
	public Person2() {
		
		/*
		 *  멤버 변수 > 이름 지정 : 인스턴스를 힙에 생성해야 변수 지정가능 
		 *  순서 바뀌면 오류 
		 */
		
		this("이름없음");	// 기본값 = 이름없음: 1. 인스턴스 생성 
		this.name = "이름2";	// 2. 대입 
		
		
	}
		
	public Person2(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(name);
	}
	
	public Person2 returnThis() {
		return this;
	}
	
	public static void main(String[] args) {
		Person2 person2 = new Person2(); 		// 기본값 
		Person2 person = new Person2("이름1");
		Person2 person3 = person.returnThis();
		
		person2.showInfo();
		person3.showInfo();
	}
}
