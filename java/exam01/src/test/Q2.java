package test;

public class Q2 {
	public static void main(String[] args) {
		// 학생 40명
		for (int i = 1; i <= 40; i++) {
			// 방번호 배정
			int roomNo = i % 10;
			System.out.println("학생" + i + ", 방번호 " + roomNo + "번");
		}
	}
}
