package Chapter7;

public class ArrayEx2 {
	public static void main(String[] args) {
		// 배열의 갯수 > 요소의 갯수x, 공간의 갯수
		double[] nums = new double[5];	// double공간 5개 생성
		int size = 0;
		nums[0] = 10;
		size++;
		nums[1] = 20;
		size++;
		nums[2] = 30;
		size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(nums[i]);
		}
	}
}
