package chapter6;

public class Company {
	private static Company instance = new Company();
	private Company() {};	// 외부 생성 불가
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
