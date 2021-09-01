package chapter9_3;

public class SuperLevel extends PlayerLevel {

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
		System.out.println("뒤돌기!");
	}

	@Override
	void showLevelMessage() {
		System.out.println("고급자 레벨 입니다.");
	}
}