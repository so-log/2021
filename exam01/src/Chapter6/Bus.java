package Chapter6;

public class Bus {
	int num; // 노선번호
	int passengerCount; // 승객의 수
	int fare; // 버스 요금
	int profit; // 버스가 벌어들인 수입 
	
	public Bus(int num, int fare) {
		this.num = num;
		this.fare = fare;
	}
	
	public void collect(Student s) {
		this.profit += this.fare; // 버스는 승객이 낸 돈을 수익에 추가 
		this.passengerCount++;
		
		s.money -= this.fare; // 버스에 탄 학생의 돈에서 버스 요금만큼 차감 
	}
	
	public void showInfo() {
		System.out.println("Bus No." + num + " : " + passengerCount + "명 탑승 : " + profit);
	}
}
