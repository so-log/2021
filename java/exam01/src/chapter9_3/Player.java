package chapter9_3;

public class Player {
	PlayerLevel level;
	
	Player() {
		level = new BeginnerLevel(); 
	}
	
	PlayerLevel getLevel() { 
		return level;
	}
	
	void upgradeLevel(PlayerLevel level) {
		this.level = level;
	}
	
	void play(int num) {
		level.go(num);
	}
}