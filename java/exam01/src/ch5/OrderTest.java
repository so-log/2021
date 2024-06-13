package ch5;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderNum = 201803120001L;
		order.orderId = "abc123";
		order.orderDate = "2018년 3월 12일";
		order.customerName = "홍길순";
		order.productId = "PD0345-12";
		order.adress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호 : " + order.orderNum);
		System.out.println("주문자 아이디 : " + order.orderId);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.customerName);
		System.out.println("주문 상품 번호 : " + order.productId);
		System.out.println("배송 주소 : " + order.adress);
	}
}
