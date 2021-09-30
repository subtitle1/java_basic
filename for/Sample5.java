package example_09_02_for;
import java.util.Scanner;
public class Sample5 {
	public static void main(String[] args) {
		// 반복을 중단시키기
		// break, continue
		// 숫자를 입력받아서 그 숫자들의 합을 계산한다
		// 0을 입력하면 입력을 중단하고, 합계를 출력한다.
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("숫자를 입력하세요(0을 입력하면 종료): ");
			int num = scan.nextInt();
			
			if (num == 0) {
				break;
			}
			sum += num;
		}
		System.out.println("합계: " +sum);
	}
}
