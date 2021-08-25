package Chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		char[] alpha = new char[26];	// 2byte씩 총 52개의 연속 공간 > 인덱스 번호로 접근
		char ch = 'A';	// 정수65
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = ch++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
				
	}
}
