package chapter5_sub;

import chapter5.Person;

public class Ex1 {
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		Person person3 = new Person("이름1", 178, 70);
		Person person4 = new Person("이름2");
		
		person3.showInfo();
		person4.showInfo();
		
		/*
		 *  먼저 호출된 함수: 스택메모리 	main()
		 *  												showInfo()
		 */
		
		person.showInfo();
		System.out.println(person);
		System.out.println(person2);
	}
}
