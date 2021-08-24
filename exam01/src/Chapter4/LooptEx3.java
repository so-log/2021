package Chapter4;

public class LooptEx3 {
	public static void main(String[] args) {
		int num = 0;
		while(true) { // 항상 참 이므로 무한반복
			System.out.println(num);
			if(num >= 1000)
				break;
			
			num++;
		}
	}
}
