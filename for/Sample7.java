package example_09_02_for;
import java.util.Scanner;

public class Sample7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 두 수를 입력받아서 더 큰 수를 출력하는 프로그램
		
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}
