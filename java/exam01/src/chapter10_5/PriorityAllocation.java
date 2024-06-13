package chapter10_5;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급에 따라 등급이 높은 고객 전화 순으로 접수");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 능력이 좋은 상담원에게 배분");
	}

}