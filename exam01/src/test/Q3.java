package test;

public class Q3 {
	public static void main(String[] args) {
		int level = 5;
		String ment;
		
		switch(level) {
		case 1 :
				ment = "1�� �౹";
				break;
		case 2 :
				ment = "2�� �����ܰ�";
				break;
		case 3 :
				ment = "3�� �Ǻΰ�";
				break;
		case 4 :
				ment = "4�� ġ��";
				break;
		case 5 :
				ment = "5�� �ｺŬ��";
				break;
		default :
				ment = "���� �� �Դϴ�.";
				return;
		}
		System.out.println(ment + "�Դϴ�.");
	}
}