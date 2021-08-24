package Chapter4;

public class LoopeEx10 {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if(i % 3 != 0) {	// 3의 배수가 아닌 경우는 건너뛰기
				continue;
			}
			
			System.out.println(i);
		}
	}
}
