package ch2;

public class TypeInference {
	public static void main(String[] args) {
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		System.out.println(str);
//		str = 3;	// 다른 자료형 사용 불

		
	}
}
