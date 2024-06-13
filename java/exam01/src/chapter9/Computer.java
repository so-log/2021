package chapter9;

/*
 monitor, keyboard, cpu - 컴퓨터의 공통적인 구성요소(각 기기별로 다르게 구현되는)
 Desktop, Notebook
 */

public abstract class Computer {
	abstract void monitor();
	abstract void keyboard();
	abstract void cpu();
	
	void turnOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
	}
	
	void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
	}
}