package chapter7;

public class ArrayEx4 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50, 60, 70};
		int[] nums2 = new int[7];
		
		/*
		for(int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
		*/
		System.arraycopy(nums, 0, nums2, 0, 7);
		nums2[1] = 22;
		System.out.println("----------num2-------------");
		for(int i =0; i <nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		System.out.println("----------nums-------------");
		for(int i =0; i <nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
