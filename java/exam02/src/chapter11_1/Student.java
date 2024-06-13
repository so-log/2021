package chapter11_1;

// 빈 인터페이스 > Cloneable > 의사 표현 : 마커 인터페이스
public class Student implements Cloneable {
	public int studentID;	// 학번
	public String name;
	
	public Student(int studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 비교하는 Student 인스턴스의 학번이 같으면 논리적으로 동일
		Student s = (Student)obj;
		if(s.studentID == studentID)
			return true;
		
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}

	@Override
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	} 
}
