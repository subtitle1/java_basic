public class StudentScoreApp {
	public static void main(String[] args) {
		
		StudentScore score1 = new StudentScore(1, "홍길동", 100, 90, 80);
		StudentScore score2 = new StudentScore(2, "김유신", 90, 80, 80);
		StudentScore score3 = new StudentScore(3, "강감찬", 70, 80, 90);
		StudentScore score4 = new StudentScore(4, "이순신", 100, 90, 50);
		StudentScore score5 = new StudentScore(5, "유관순", 70, 60, 100);
		
		score1.printStudentScore();
		score2.printStudentScore();
		score3.printStudentScore();
		score4.printStudentScore();
		score5.printStudentScore();
	}
}
