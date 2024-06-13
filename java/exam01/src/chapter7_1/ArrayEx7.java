package chapter7_1;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[][] nums = new int[2][3];
		// 1번째 행 for
		// 2번째 행 열
		for (int i = 0; i < nums.length; i++) { // 행
			System.out.println((i + 1) + "행 --------------");
			
			for(int j = 0; j < nums[i].length; j++)	// 열 
				System.out.println(nums[i][j]);	// i번째 행의 j번째 
		}
	}
}
