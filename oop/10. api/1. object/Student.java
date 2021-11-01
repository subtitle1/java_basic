package example_09_29_object;

import java.util.Objects;

public class Student {

	private int no;		// 학번
	private String name;	// 이름
	private String dept;	// 학과
	private int grade;		// 학년

	public Student() {}

	public Student(int no, String name, String dept, int grade) {
		super();
		this.no = no;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// alt+shift+s -> generate hashCode 누르면 자동으로 만들어짐
	//	@Override
	//	public int hashCode() {
	//		return Objects.hash(no);
	//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return no == other.no;
	}
	
	// Student 객체에 대한 동등성 비교가 가능하도록 hashCode()와 equals(Object o) 재정의하기
	// Student 객체에서는 학번이 같으면 같은 학생이기 때문에 학번이 같으면 같은 객체로 판단하게 할 것이다
	// 학번이 같으면 해시코드값도 같은 값을 반환하도록 재정의하기
	@Override
	public int hashCode() {
		return no;
	}

	// alt + shift + s -> generate toString
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", dept=" + dept + ", grade=" + grade + "]";
	}

//	// 학번이 같으면 true 값을 반환하도록 재정의하기
//	@Override
//	public boolean equals(Object obj) {
//		// 비교할 다른 객체가 null이면 false를 반환한다
//		if (obj == null) {
//			return false;
//		}
//		
//		// 비교할 다른 객체가 Student 설계도로 만들어진 객체가 아니면 false를 반환한다
//		if (!(obj instanceof Student)) {
//			return false; // obj가 Student 객체로 만들어진 객체가 아니라면 false
//		}
//		
//		// 비교할 다른 객체가 Student 설계도로 만들어진 객체로 판정났기 때문에
//		// Student 타입으로 형변환한다.
//		Student otherStudent = (Student)obj;
//		
//		// 이 객체의 학번과 다른 학생의 학번이 서로 다르면 false를 반환하고,
//		if (this.no != otherStudent.no) {
//			return false;
//		}
//		
//		// 위 모든 조건을 통과했다면 true를 반환한다.
//		return true;
//	}	
}
