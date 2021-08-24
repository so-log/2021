package Chapter4;

public class LoopEx9 {
	public static void main(String[] args) {
	// 1-9단, 각 단은 1-9까지 곱한다
		/*
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
			System.out.println();
		}
		*/
		/*
		int i = 1;
		while(i <= 9) {
			int j = 1;
			while(j <= 9) {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			}
			System.out.println();
			i++;
		}
		*/
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.println(i + " X " + j + " = " + (i*j));
				j++;
			} while (j <= 9);
			System.out.println();
			i++;		
		} while ( i<= 9);
		}
	}
