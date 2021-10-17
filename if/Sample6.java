package example_09_01_if;

public class Sample6 {
	public static void main(String[] args) {
		// 내포된 if문 (중첩 if문)
		// 국어, 영어, 수학점수의 평균이 60점 이상이면 합격이다.
		// 단, 평균이 90점 이상이면 장학금을 지급한다.
		
		int korScore = 100, engScore = 100, mathScore = 80;
		int totalScore = korScore + engScore + mathScore;
		int average = totalScore / 3;
		
		// 내포된 if문을 사용하지 않는 경우 (실행결과는 같지만 불필요한 로직)
		if (average >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		if (average >= 90) {
			System.out.println("장학금 지급 대상으로 선정되었습니다.");
		}
		
		// 내포된 if문을 사용한 경우
		if (average >= 60) {
			System.out.println("합격입니다.");
			if (average >= 90) {
				System.out.println("장학금 지급 대상으로 선정되었습니다.");
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
}
