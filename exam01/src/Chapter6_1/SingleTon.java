package Chapter6_1;

public class SingleTon {
	private static SingleTon instance =new SingleTon();
	private SingleTon() {}
	
	public static SingleTon getInstance() {
		if(instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}
