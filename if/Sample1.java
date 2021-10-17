package example_09_01_if;

public class Sample1 {
	public static void main(String[] args) {
		/* if문
		 * 
		 * if (조건식) {
		 * 		수행문;
		 * 		수행문;
		 * 		수행문;
		 * }
		 * 
		 * 블록 내의 수행문은 조건식의 연산결과가 true일 때만 실행된다.
		 */
		
		// 점수가 60점 이상이면 "합격입니다"가 출력되는 프로그램
		
		int score = 55;
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} 
		
		/* if ~ else문
		 * 
		 * if (조건식) {
		 * 		수행문; // 조건식이 true일 때 실행
		 * 		수행문;
		 * 		수행문;
		 * } else {
		 * 		수행문; // 조건식이 false일 때 실행
		 * 		수행문;
		 * }
		 * 
		 */
		
		int score2 = 75;
		
		if (score2 >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		// 운행거리가 5만km 이상이거나 운행기간이 3년 이상인 경우는
		// "수리비를 청구합니다"를 출력, 아니면 "무상수리합니다"를 출력하기
		
		int distance = 47_000;
		int year = 4;
		
		if (distance >= 50000 || year >= 3) {
			System.out.println("수리비를 청구합니다.");
		} else {
			System.out.println("무상 수리합니다.");
		}
		
		// 예금액이 1억원 이상이고, 거래 기간이 5년 이상이고,
		// 급여통장이 우리은행이면 "우수 고객입니다."를 출력하고,
		// 아니면 "일반 고객입니다."를 출력하기
						
		long balance = 100_000_000;
		int tradeYear = 5;
		boolean hasSalaryAccount = false;
						
		if (hasSalaryAccount && balance >= 100_000_000 && tradeYear >= 5) {
			System.out.println("고객님은 우수 고객입니다.");
		} else {
			System.out.println("고객님은 일반 고객입니다.");
		}
	}
}
