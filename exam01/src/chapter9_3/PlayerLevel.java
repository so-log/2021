package chapter9_3;

public abstract class PlayerLevel {
	abstract void run();
	abstract void jump();
	abstract void turn();
	abstract void showLevelMessage();
	
	final void go(int num) {
		showLevelMessage();
		run();
		for (int i = 0; i < num; i++) {
			jump();
		}
		turn();
	}
}