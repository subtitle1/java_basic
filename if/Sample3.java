package example_09_01_if;

public class Sample3 {
	public static void main(String[] args) {
		/* 구매 금액에 따른 적립포인트 계산하기
		 * 100만원 이상 구매시 구매금액의 5%를 포인트로 적립한다.
		 * 50만원 이상 구매시 구매금액의 2%를 포인트로 적립한다.
		 * 30만원 이상 구매시 구매금액의 1%를 포인트로 적립한다.
		 * 출력 예) 적립 포인트: 100
		 */
		
		int orderPrice = 800_000;
		int point = 0;
		
		if (orderPrice >= 1_000_000) {
			point = (int)(orderPrice*0.05);
		} else if (orderPrice >= 500_000) {
			point = (int)(orderPrice*0.02);
		} else if (orderPrice >= 300_000) {
			point = (int)(orderPrice*0.01);
		}
		System.out.println("적립포인트: " +point);
	}
}
