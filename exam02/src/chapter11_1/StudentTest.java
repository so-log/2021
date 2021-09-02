package chapter11_1;

import java.lang.reflect.*;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(20001425, "이름1");
		Student s2 = new Student(20001425, "이름2");
		/*
		Student s3 = (Student)s2.clone();
		
		System.out.println("s2 : " + s2);
		System.out.println("s2 주소 : " + System.identityHashCode(s2));
		System.out.println("s3 : " + s3);
		System.out.println("s3 주소 : " + System.identityHashCode(s3));
		
		System.out.println("s1과 s2 주소 일치? : " + (s1 == s2));
		System.out.println("s1과 s2 equals(논리적 일치)? : " + (s1.equals(s2)));
		*/
		
		Class cls = s2.getClass();
		Constructor[] cons = cls.getConstructors();
		Method[] methods = cls.getMethods();
		Field[] fields = cls.getFields();
		System.out.println(cls.getName());
		
		System.out.println("------생성자-------");
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("------메서드-------");
		for(Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("------변수-------");
		for(Field f : fields) {
			System.out.println(f);
		}
	}
}
