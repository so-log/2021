package chapter6;

public class CompanyTest {
	public static void main(String[] args) {
//		Company c1 = new Company();
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		System.out.println(c1 == c2);
	}
}
