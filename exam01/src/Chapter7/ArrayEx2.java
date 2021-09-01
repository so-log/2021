package chapter7;

public class ArrayEx2 {
	public static void main(String[] args) {
		// �迭�� ���� > ����� ����x, ������ ����
		double[] nums = new double[5];	// double���� 5�� ����
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
