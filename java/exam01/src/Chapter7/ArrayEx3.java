package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		char[] alpha = new char[26];	// 2byte�� �� 52���� ���� ���� > �ε��� ��ȣ�� ����
		char ch = 'A';	// ����65
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = ch++;
		}
		
		for(int i = 0; i < alpha.length; i++) {
			System.out.println(alpha[i]);
		}
				
	}
}
