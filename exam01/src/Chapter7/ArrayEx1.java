package Chapter7;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] nums = new int[4];	// 빈 메모리 공간에 int 자료형 4개를 생성 > 초기값 0
		/*
		for(int i =0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		*/
		
		int[] nums2 = new int[] {10, 20, 30, 40};	// 4개 공간 생성, 4개 값 대입
		int[] nums3 = {10, 20, 30, 40};
		/*
		for (int i = 0; i < nums3.length; i++) {
			System.out.println(nums3[i]);
		}
		*/
		
		/*
		double[] nums4 = new double[4];	// double 공간 4, 초기값 0.0
		for(int i = 0; i < nums4.length; i++) {
			System.out.println(nums4[i]);
		}
		*/
		
		String[] text = new String[4];	// String공간 4, null으로 초기화
		for(int i = 0; i < text.length; i++) {
			System.out.println(text[i]);
		}
		
	}
}
