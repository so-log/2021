package ch4;

public class P100 {
	public static void main(String[] args) {
		int score = 66;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
			System.out.println(grade);
		} else if(score >= 80) {
			grade = 'B';
			System.out.println(grade);
		} else if(score >= 70) {
			grade = 'c';
			System.out.println(grade);
		} else if(score >=60) {
			grade = 'D';
			System.out.println(grade);
		} else {
			grade = 'E';
			System.out.println(grade);
		}
	}
}
