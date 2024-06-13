package chapter7_1;

public class ArrayEx9 {
	public static void main(String[] args) {
		char[][] alpha = { {'a', 'b'}, {'c','d'}, {'e','f'}, {'g', 'h'}, {'i', 'j'}, {'k','l'}, {'m', 'n' }, {'o', 'p' }, {'q', 'r'}, {'s','t'}, {'u', 'v'}, {'w', 'x' }, {'y', 'z' } };
		for (int i = 0; i < alpha.length; i++) { // 
			for (int j = 0; j < alpha[i].length; j++) {  // i번째 행의 j열 
				System.out.println(alpha[i][j]);
			}
		}
	}
}
