package chapter7;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] nums = new int[4];	// �� �޸� ������ int �ڷ��� 4���� ���� > �ʱⰪ 0
		/*
		for(int i =0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		*/
		
		int[] nums2 = new int[] {10, 20, 30, 40};	// 4�� ���� ����, 4�� �� ����
		int[] nums3 = {10, 20, 30, 40};
		/*
		for (int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		*/
		
		/*
		double[] nums4 = new double[4];	// double ���� 4, �ʱⰪ 0.0
		for(int i = 0; i < nums4.length; i++) {
			System.out.println(nums4[i]);
		}
		*/
		
		String[] text = new String[4];	// String���� 4, null���� �ʱ�ȭ
		for(int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}
		
	}
}
