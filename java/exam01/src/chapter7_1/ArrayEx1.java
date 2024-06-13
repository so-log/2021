package chapter7_1;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] nums = new int[4]; 	// int 자료형 공간 4개 - 빈 공간, 공간의 갯수 length 
		// int[] nums = new int[] {10, 20, 30, 40};		// int 자료형 4개 공간 생성후 값 대입, 초기화
		// int[] nums = {10,20,30,40};
		// int[] nums;
		// nums = {10,20,30,40};
		// nums = new int[] { 10, 20, 30, 40 };
		// nums[2] = 35;
		int size = 0;
		nums[0] = 10; size++;
		nums[1] = 20; size++;
		
		for (int i = 0; i < size; i++) {
			// System.out.println(nums[i]);
		}
		char ch = 'A';
		System.out.println((char)++ch);
	}
}
