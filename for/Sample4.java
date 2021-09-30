package example_09_02_for;
import java.util.*;
// JRE가 제공하는 라이브러리 중 java.util 패키지에 포함되어 있는
// Scanner를 Sample5에 가져온다.

public class Sample4 {
	public static void main(String[] args) {
		// 숫자를 입력받아서 1부터 그 숫자까지의 합계를 구하기
		int sum = 0;
		
		// System.in(표준입력장치, 키보드)
		Scanner input = new Scanner(System.in);
		System.out.printf("정수를 입력하세요: ");
		
		// nextInt()는 키보드로 입력된 값을 정수(int 타입의 값)으로 읽어온다.
		int num = input.nextInt();
				
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 "+num+"까지의 합계: " +sum);
	}
}
