# if문
## if문의 유형
```java
if (조건식) {
  수행문;
	수행문;
	수행문;
} // 블록 내의 수행문은 조건식의 연산 결과가 true일 때만 실행된다.

if (조건식) {
  수행문; // 조건식이 true일 때 실행
} else {
  수행문; // 조건식이 false일 때 실행
}
```

## 예시1
```java
int score = 55;
		
if (score >= 60) {
  System.out.println("합격입니다.");
} 
```

## 예시2
```java
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
```
## 예시3
```java
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
```

## 예시4
```java
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
```
