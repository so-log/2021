package ch5;

public class MyDate {
	private int day;
	private int month;
	private int year;
	boolean isValid;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public MyDate(int mday, int mmonth, int myear) {
		day = mday;
		month = mmonth;
		year = myear;
	}
	
	public boolean isValid() {
		if(month >= 1 && month <= 12 ) {
			switch(month){
				case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
					if(day >= 1 && day <= 31) { return true;};
					break;
				case 2 : 
					if(day >= 1 && day <= 28) { return true;};
					break;
				default :
					if(day >= 1  && day <= 30) { return true;};
					break;
			}
		} 
		return false;
	}
	
}
