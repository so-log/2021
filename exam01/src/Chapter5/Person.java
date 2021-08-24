package Chapter5;

public class Person {
		int age;
		String name;
		boolean isMarried;
		int children;
	
	 	//public Person() {} // 기본 생성자가 없으면 인스턴스 생성 불가 X
		// 없으면 컴파일할때 자동으로 추가 
		
		public Person(int age, String name) { // 생성자 매개변수에 2개 만 입력한 경우 
			this.age = age;
			this.name = name;
		}
		
		public Person(int age, String name, boolean isMarried, int children) {
			this.age = age;
			this.name = name;
			this.isMarried = isMarried;
			this.children = children;
		}
		
		public void showInfo() {
			String isMarriedStr = isMarried?"결혼":"미혼";
			System.out.println("나이 = " + age);
			System.out.println("이름 = " + name);
			System.out.println("결혼 여부 = " + isMarriedStr);
			System.out.println("자녀 수 = " + children);
			}
}
