package chapter4;

public class SwitchEx3 {
	public static void main(String[] args) {
		int level = 5;
		switch(level) {
		case 1 :
			System.out.println(level + "층 약국입니다.");
			break;
		case 2 :
			System.out.println(level + "층 정형외과입니다.");
			break;
		case 3 :
			System.out.println(level + "층 피부과입니다.");
			break;
		case 4 :
			System.out.println(level + "층 치과입니다.");
			break;
		case 5 :
			System.out.println(level + "층 헬스 클입니다.");
			break;
		default:
			System.out.println("없는 층 입니다.");
		}
	}
}
