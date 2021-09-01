package chapter8;

public class VIPCustomer {
	private int CustomerID; // 고객번호
	private String CustomerName; // 고객 이름 
	private String customerGrade; // 고객 등급  VIP 
	private int bonusPoint; // 적립금
	private double bonusRatio; // 5%
	private double discountRatio; // 상품 할인 10%
	private int agentID;  // 전문 상담원 ID 
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		int bonus = (int)(price * bonusRatio); //적립 비율에 따른 적립금
		bonusPoint += bonus;
		
		int discount = (int)(price * discountRatio);
		
		return price - discount;
	}
	
	public void showInfo() {
		System.out.println(CustomerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}

