package chapter4;

public class LoopEx8 {
	public static void main(String[] args) {
		int i = 0;
		for (;; i++) {
			System.out.println(i);
			if(i >= 5) 
				break;
		}
	}
}
