package ch4;

public class ContinueExample {
	public static void main(String[] args) {
		/*
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) 
				continue;
			total += num;
		}
			System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
		*/
		
		int num;
		
		for(num = 3; num <= 100; num++) {
			if(num % 3 != 0)
				continue;
		}
		System.out.println(num);
	}
}
