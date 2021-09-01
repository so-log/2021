package chapter8;

public class CustomerTest {
	public static void main(String[] args) {
		System.out.println("-------------- SILVER 일반 고객 --------------");
		Customer customerLee = new Customer(); // 적립률 1%, SILVER
		customerLee.setCustomerID(1000);
		customerLee.setCustomerName("일반고객이름1");
		customerLee.calcPrice(10000);
		customerLee.calcPrice(20000);
		customerLee.showInfo();
		
		System.out.println("-------------- VIP 고객 --------------");
		VIPCustomer2 customerKim = new VIPCustomer2(); // 적립률 5%, VIP, 상품 할인율 10%
		customerKim.setCustomerID(1001);
		customerKim.setCustomerName("VIP 고객이름2");
		customerKim.setAgentID(1000);
		
		System.out.println("할인 적용 판매가 : " + customerKim.calcPrice(50000));
		System.out.println("할인 적용 판매가 : " + customerKim.calcPrice(100000));
		customerKim.showInfo();
	}
}

