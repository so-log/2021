package chapter7_1;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 30, 40 };
		int[] nums2 = new int[4];
		/*
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = nums1[i];
		}
		*/
		System.arraycopy(nums1, 0, nums2, 0, 4);
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
	}
}
