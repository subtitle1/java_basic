public class Student extends Person {
	
	// Student의 고유한 변수와 기능 정의하기	
	private String dept;
	private int grade;
	
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
}
