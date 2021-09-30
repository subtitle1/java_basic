package example_09_02_for;

public class Sample1 {
	public static void main(String[] args) {
		// 동일한 수행문을 지정한 횟수만큼 출력하기
		//	for (int i = 1; i <= 5; i++) {
		//		System.out.println("안녕하세요");
		//	}
		
		// for문의 블록 내에서 현재 몇번째 반복 중인지 출력하기
		for (int i = 1; i <= 10; i++) {
			System.out.println("i의 값: "+i);
		}
	}
}
