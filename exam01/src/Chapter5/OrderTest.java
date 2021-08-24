package Chapter5;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrder(201803120001L, "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		order.showInfo();
	}
}
