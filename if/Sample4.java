package example_09_01_if;

public class Sample4 {
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아서 총점과 평균을 계산해 출력
		// 평균이 60점 이상인 경우 "합격입니다"를 출력, 그 이하는 불합격
		/* 출력예시
		 * 국어점수: 100
		 * 영어점수: 80
		 * 수학점수: 90
		 * 총점: 290
		 * 평균: 90
		 * 합격여부: 합격입니다.
		 *  
		 */
		int korScore = 100, engScore = 80, mathScore = 90;
		int totalScore = korScore + engScore + mathScore;
		int average = totalScore / 3;
		
		System.out.println("국어점수: " +korScore);
		System.out.println("영어점수: " +engScore);
		System.out.println("수학점수: " +mathScore);
		System.out.println("총점: " +totalScore);
		System.out.println("평균: " +average);
		
		if (average >= 60) {
			System.out.println("합격여부 : 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
