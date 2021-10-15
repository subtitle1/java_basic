public class StudentScore {
	/*
	 * 학생 시험점수 객체용 클래스
	 * 		1. 멤버변수
	 * 			학번
	 * 			이름
	 * 			국어점수
	 * 			영어점수
	 * 			수학점수
	 * 			총점
	 * 			평균
	 * 		2. 생성자 메소드
	 * 			기본 생성자 메소드
	 * 			학번, 이름을 초기화하는 생성자 메소드
	 * 			학번, 이름, 국/영/수 점수를 전달받아서 총점과 평균까지 초기화하는 생성자 메소드
	 * 		3. 멤버 메소드
	 * 			학생의 시험점수 출력하는 메소드
	 * 				학번, 이름, 국/영/수/총점/평균 출력하는 메소드
	 * 		
	 */
	
	// 멤버변수
	int no;
	String name;
	int korScore;
	int engScore;
	int matScore;
	int total;
	double average;
	
	// 기본 생성자 메소드
	public StudentScore() {
		
		
	}
	
	public StudentScore(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public StudentScore(int no, String name, int korScore, int engScore, int matScore) {
		this.no = no;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.matScore = matScore;
		this.total = korScore + engScore + matScore;
		this.average = this.total/3.0;
	}

	// 성적정보를 출력하는 멤버 메소드
	void printStudentScore() {
		System.out.println("학  번: " +no);
		System.out.println("이  름: " +name);
		System.out.println("국  어: " +korScore);
		System.out.println("영  어: " +engScore);
		System.out.println("수  학: " +matScore);
		System.out.println("총  점: " +total);
		System.out.println("평  균: " +average);
		System.out.println();
	}
}
