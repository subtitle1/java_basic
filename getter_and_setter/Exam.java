package example_09_13_modifier;

public class Exam {
	private int no;
	private String title;
	private String studentName;
	private int score;
	private boolean isPassed;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	// boolean 타입의 멤버변수 이름이 is로 시작하는 경우
	// getter 메소드의 이름도 is로 시작한다
	public boolean isPassed() {
		return isPassed;
	}
	
	// boolean 타입의 멤버변수 이름이 is로 시작하는 경우
	// setter 메소드의 이름은 set이 is를 대체한다
	public void setPassed(boolean isPassed) {
		this.isPassed = isPassed;
	}	
}
