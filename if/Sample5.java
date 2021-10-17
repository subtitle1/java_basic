package example_09_01_if;

public class Sample5 {
	public static void main(String[] args) {
		/*
		 * 구매금액에 따른 포인트 적립 및 고객등급 변경하기
		 * 
		 * 구매금액이 100만원 이상이면 구매금액의 5%를 포인트로,
		 * 50만원 이상이면 2%를 포인트로,
		 * 30만원 이상이면 1%를 포인트로 적립한다.
		 * 
		 * 구매금액이 30만원 미만이면 구매금액의 0.3%를 포인트로 적립한다.
		 * 
		 * 총 적립된 포인트가 100만점 이상이면 고객의 등급을 "다이아몬드"로 변경한다.
		 * 총 적립된 포인트가 50만점 이상이면 고객의 등급을 "골드"로 변경한다.
		 * 총 적립된 포인트가 20만점 이상이면 고객의 등급을 "실버"로 변경한다.
		 * 총 적립된 포인트가 10만점 이상이면 고객의 등급을 "브론즈"로 변경한다.
		 * 총 적립된 포인트가 10만점 미만이면 고객의 등급을 "일반"으로 변경한다.
		 * 등급에 대한 조정은 상품을 구매할 때마다 현재 포인트를 기준으로 조정한다.
		 * 
		 * 출력 예시)
		 * 	고객명: aaa
		 * 	현재 고객등급: 실버
		 * 	보유 포인트: 250010
		 * 
		 * 	구매 금액: 400000
		 * 	적립예상포인트: 4000
		 * 	구매 후 보유 포인트: 254010
		 *  구매 후 고객 등급: 실버
		 */
		
		String name = "홍길동", grade = "실버";
		int currentPoint = 250010;
		int orderPrice = 40_000_000;
		
		int point = 0;
		if (orderPrice >= 1_000_000) {
			point = (int)(orderPrice*0.05);
		} else if (orderPrice >= 500_000) {
			point = (int)(orderPrice*0.02);
		} else if (orderPrice >= 300_000) {
			point = (int)(orderPrice*0.01);
		} else {
			point = (int)(orderPrice*0.003);
		} 
		
		int pointAfterPurchase = currentPoint+point;
		String newGrade = "";
		if (pointAfterPurchase >= 1_000_000) {
			newGrade = "다이아몬드";
		} else if (pointAfterPurchase >= 500_000) {
			newGrade = "골드";
		} else if (pointAfterPurchase >= 200_000) {
			newGrade = "실버";
		} else if (pointAfterPurchase >= 100_000) {
			newGrade = "브론즈";
		} else {
			newGrade = "일반";
		}
		
		System.out.println("고객명: " +name);
		System.out.println("현재 고객등급: " +grade);
		System.out.println("보유 포인트: " +currentPoint);
		System.out.println();
		System.out.println("구매금액: " + orderPrice);
		System.out.println("적립예상포인트: " +point);
		System.out.println("구매 후 보유 포인트: " +pointAfterPurchase);
		System.out.println("구매 후 고객 등급: " +newGrade);
	}
}
