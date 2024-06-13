package chapter10_3;

public class InterfaceEx1 implements A, B {

	@Override
	public void methodB() {
		System.out.println("MethodB");
		
	}

	@Override
	public void methodA() {
		System.out.println("MethodA");
	}
	
	@Override
	public void method() {
		System.out.println("°øÅë ¸Þ¼­µå");
	}
}