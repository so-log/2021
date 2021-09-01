package chapter6;

public class Subway {
	String lineNum;
	int fare;
	int profit;
	int passengerCount;
	
	public Subway(String lineNum, int fare) {
		this.lineNum = lineNum;
		this.fare = fare;
	}
	
	public void collect(Student s) {
		profit += fare;
		passengerCount++;
		
		s.money -= fare;
	}
	
	public void showInfo() {
		System.out.println("Subway No." + lineNum + " : " + passengerCount + "명 탑승 : " + profit);
	}
}
