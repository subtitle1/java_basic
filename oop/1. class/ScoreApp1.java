package example_09_06_class;

public class ScoreApp1 {
	public static void main(String[] args) {
		// Score 클래스를 이용해서 성적정보를 관리하기
		
		// 여러 명(3명)의 성적정보를 관리하는 애플리케이션 구현
		Score score1 = new Score();
		score1.name = "김유신";
		score1.kor = 100;
		score1.eng = 80;
		score1.math = 80;
		score1.total = score1.kor + score1.eng + score1.math;
		score1.average = score1.total/3;
		
		Score score2 = new Score();
		score2.name = "강감찬";
		score2.kor = 80;
		score2.eng = 80;
		score2.math = 80;
		score2.total = score2.kor + score2.eng + score2.math;
		score2.average = score2.total/3;
		
		Score score3 = new Score();
		score3.name = "유관순";
		score3.kor = 70;
		score3.eng = 100;
		score3.math = 100;
		score3.total = score3.kor + score3.eng + score3.math;
		score3.average = score3.total/3;
		
		System.out.println("학생들의 이름");
		System.out.println(score1.name);
		System.out.println(score2.name);
		System.out.println(score3.name);
		System.out.println();
		
		System.out.println("평균 점수");
		System.out.println(score1.average);
		System.out.println(score2.average);
		System.out.println(score3.average);
		
	}
}
