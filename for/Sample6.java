package example_09_02_for;

public class Sample6 {
	public static void main(String[] args) {
		// continue
		
		for (int i = 1; i <= 10; i++) {
			// i의 값이 3, 6, 9인 경우 continue가 실행
			// continue는 남아있는 수행문을 실행하지 않고,
			// 반복문의 증감식으로 이동한다
			if (i % 3 == 0) {
				continue;
			}
			System.out.println("i의 값: "+i);
		}
	}
}
