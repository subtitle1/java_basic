package example_09_02_for;

public class Sample2 {
	public static void main(String[] args) {
		// 정수 1부터 5까지의 합을 구해서 화면에 출력하기
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i<=5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.printf("[%d, %d]", i, j);
				} else {
					System.out.printf("%6c", ' ');
				}
			}
			System.out.println();
		}
	}
}
