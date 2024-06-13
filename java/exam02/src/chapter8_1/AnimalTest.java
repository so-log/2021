package chapter8_1;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for (Animal animal : animals) {
			animal.move();
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			} else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			} else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
		}
	}
}
