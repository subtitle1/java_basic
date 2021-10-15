public class ScoreApp2 {
	public static void main(String[] args) {
		// 배열을 이용해서 여러명의 성적을 관리하기
		// Score 클래스의 주소값 3개를 저장할 수 있는 배열객체를 생성하고, 
		// 배열객체의 주소값을 참조변수 scores에 대입함
		Score[] scores = new Score[3];
		
		// Score 객체를 생성해서 참조변수 score1에 주소값을 대입한다
		Score score1 = new Score();
		
		// 참조변수 score1으로 생성된 Score 클래스의 멤버변수(필드)에 성적 정보를 저장한다 
		score1.name = "김유신";
		score1.kor = 100;
		score1.eng = 80;
		score1.math = 80;
		score1.total = score1.kor + score1.eng + score1.math;
		score1.average = score1.total/3;
		
		// 참조변수 score1에 저장된 주소값을 배열 객체를 참조하는 scores 참조변수를 이용해서 
		// 배열객체의 0번째에 저장한다
		// 배열객체의 0번째 칸도 참조변수 score1이 참조하는 객체를 같이 참조한다
		// 따라서, score1이 참조하는 객체가 배열객체의 0번째 칸과 연결(저장)됨
		scores[0] = score1;
		
		Score score2 = new Score();
		score2.name = "강감찬";
		score2.kor = 80;
		score2.eng = 80;
		score2.math = 80;
		score2.total = score2.kor + score2.eng + score2.math;
		score2.average = score2.total/3;
		
		scores[1] = score2;
		
		Score score3 = new Score();
		score3.name = "유관순";
		score3.kor = 70;
		score3.eng = 100;
		score3.math = 100;
		score3.total = score3.kor + score3.eng + score3.math;
		score3.average = score3.total/3;
		
		scores[2] = score3;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(scores[i].name);
		}
		
		System.out.println("향상된 for문을 사용해서 이번 시험에 참가한 학생들의 이름, 평균 출력하기");
		for (Score score : scores) {
			System.out.println(score.name+", "+score.average);
		}
	}
}
