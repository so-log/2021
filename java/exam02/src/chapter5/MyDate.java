package chapter5;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	private int hour;
	private int min;
	private int sec;
	
	public MyDate() {
		System.out.println("this : " + this);
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public void setYear(int year) {
		if(year < 1) year = 1;
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		if(month <1) month = 1;
		else if (month >12) month = 12;
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if(day < 1 ) day = 1;
		else if (day > 31) day = 31;
		
		if(this.month == 2 || day > 28) day = 28;
		
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	void showDate() {
		System.out.println(year + "년 " + month + "월 " + day +"일");
	}
}
