package chapter9_3;

public class AdvancedLevel extends PlayerLevel {
	@Override
	void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("점프!");
	}

	@Override
	void turn() {
		System.out.println("뒤돌기 X");
	}

	@Override
	void showLevelMessage() {
		System.out.println("중급자 레벨 입니다.");
	}
}