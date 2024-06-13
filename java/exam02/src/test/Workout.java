package test;

public class Workout implements Player {

	@Override
	public void shoot() {
		// TODO Auto-generated method stub
		System.out.println("활을 쏩니다.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("공을 찹니다.");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("물에서 수영합니다.");
	}

	@Override
	public void doing() {
		System.out.println("열심히 운동합니다.");
		
	}

}
