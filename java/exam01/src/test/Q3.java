package test;

public class Q3 {
	public static void main(String[] args) {
		int level = 5;
		String ment;
		
		switch(level) {
		case 1 :
				ment = "1Ãþ ¾à±¹";
				break;
		case 2 :
				ment = "2Ãþ Á¤Çü¿Ü°ú";
				break;
		case 3 :
				ment = "3Ãþ ÇÇºÎ°ú";
				break;
		case 4 :
				ment = "4Ãþ Ä¡°ú";
				break;
		case 5 :
				ment = "5Ãþ Çï½ºÅ¬·´";
				break;
		default :
				ment = "¾ø´Â Ãþ ÀÔ´Ï´Ù.";
				return;
		}
		System.out.println(ment + "ÀÔ´Ï´Ù.");
	}
}