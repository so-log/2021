package chapter7;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] nums = new int[4];		// 요소의 갯수 x > 공간의 갯수
		
		
		int size = 0;
		nums[0] = 10; size++;
		nums[1] = 20; size++;
		nums[2] = 30; size++;
		
		for (int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
	}
}
