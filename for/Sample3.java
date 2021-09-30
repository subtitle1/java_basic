package example_09_02_for;

public class Sample3 {
	public static void main(String[] args) {
		// for문 안에서 조건문(if문) 사용하기
		
		// 정수 1~10 중에서 짝수 합계를 구하기
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
		}
		System.out.println(evenSum); // 짝수의 합
		System.out.println(oddSum); // 홀수의 합
	}
}
