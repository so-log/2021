package chapter5_1;

public class Person {
	String name;
	int oneSpoon;
	int stomach;
	
	public Person(String name, int oneSpoon) {
		this.name = name;
		this.oneSpoon = oneSpoon;
	}
	
	public void eat(Rice rice) {
		int amount = rice.getAmout();
		
		// 현재 밥을 먹은 양이 200g 이상이면 배불러서 그만 먹기 
		if(stomach >= 200) {
			System.out.println("배불러");
			return;
		}

		// 현재 남은 밥이 없으면 ? 배고프다
		if(amount <= 0) {
			System.out.println("배고파");
		} else {
			rice.eaten(oneSpoon);
			stomach += oneSpoon;
		}
		
		// 먹은 양과 남은 밥의 양 
				System.out.println("먹은 양 : " + stomach + "g, 남은 양: " + rice.getAmout()+ "g");
	}
}
