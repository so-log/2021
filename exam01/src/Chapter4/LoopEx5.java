package Chapter4;

public class LoopEx5 {
	public static void main(String[] args) {
		/*
		do {
			System.out.println("실행 되나요?");
		} while(false);
		*/
		
		int num = 1;
		int sum = 0;
		do {
			sum += num;
			num++;
		} while(num <= 100);
		System.out.println("1부터 100까지의 합? " +sum);
	}
}
