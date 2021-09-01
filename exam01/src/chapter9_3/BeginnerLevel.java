package chapter9_3;

public class BeginnerLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("천천히 달린다.");		
	}

	@Override
	void jump() {
		System.out.println("점프 X");
	}

	@Override
	void turn() {
		System.out.println("뒤돌기 X");
	}

	@Override
	void showLevelMessage() {
		System.out.println("초보자 레벨 입니다.");
	}

}
