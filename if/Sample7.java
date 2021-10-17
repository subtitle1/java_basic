package example_09_01_if;

public class Sample7 {
	public static void main(String[] args) {
		// 내포된 if문 (중첩 if문)
		// 국어, 영어, 수학점수의 평균이 60점 이상이면 합격이다.
		// 평균이 90점 이상이면 장학금을 지급한다.
		// 단 한과목이라도 40점 미만이면 과락으로 인한 불합격이다.
				
		int korScore = 39, engScore = 100, mathScore = 90;
				
		/*
		 * 코딩을 할 때는 실패하는 경우를 우선 찾는 게 중요하다
		 * 1. 한 과목이라도 과락이 있는지 먼저 확인한다.
		 * 2. 과락이 있으면 불합격 처리한다.
		 * 3. 과목 과락이 아닌 경우, 총점과 평균을 계산한다.
		 * 4. 평균이 60점 이상이면 합격 판정, 합격자 중 평균 90점 이상은 장학금
		 */
		
		if (korScore < 40 || engScore < 40 || mathScore < 40) {
			System.out.println("과락으로 인한 불합격입니다.");
		} else {
			int totalScore = korScore + engScore + mathScore;
			int average = totalScore / 3;
			if (average >= 60) 
				System.out.println("합격입니다.");
				if (average >= 90) {
				System.out.println("장학금 지급 대상으로 선정되었습니다.");
			} else {
				System.out.println("평균점수 미달로 불합격입니다.");
			}
		}
	}
}

