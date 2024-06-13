package ch4;

public class P106 {
	
	public static void main(String[] args) {
		int level = 5;
		String place;
		
		switch(level) {
			case 1 : place = "약국";
					break;
			case 2 : place = "정형외과";
					break;
			case 3 : place = "피부과";
					break;
			case 4 : place = "치과";
					break;
			case 5 : place = "헬스 클럽";
					break;
			default: place = "존재하지 않는 층";
			
		}
		System.out.println(level + "층 " + place + "입니다.");
	}
}
