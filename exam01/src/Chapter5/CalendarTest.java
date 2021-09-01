package chapter5;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new Calendar();
		System.out.println(cal.getYear() + "-" + cal.getMonth() + "-" + cal.getDay());

		
		Calendar cal2 = cal.returnThis();
		System.out.println(cal2.getYear() + "-" + cal2.getMonth() + "-" + cal2.getDay());
		
		/*
		cal.setYear(2021);
		cal.setMonth(8);
		cal.setDay(24);
		//System.out.println(cal.getYear() + "-" + cal.getMonth() + "-" + cal.getDay());
		System.out.println("cal : " + cal);
		*/
		
		/*
		인스턴스를 출력 -> toString 메서드(Object)
		패키지명을 포함 클래스명@메모리의 주소
		*/
	}
}
