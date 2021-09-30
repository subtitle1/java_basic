package example_09_02_array;
import java.util.*;

public class Sample5 {
	public static void main(String[] args) {
		// 10명의 학생 성적을 저장하는 배열을 생성한다
		// Scanner를 사용해서 성적을 10번 입력받아서 배열에 순서대로 저장한다
		// 출력: 입력된 점수를 순서대로 출력한다
		// 		총점, 평균을 계산해서 출력한다
		
		int[] scores = new int[10];
		Scanner scan = new Scanner(System.in);
		int average = 0;
		int total = 0;
		
		// 반복문을 사용해서 학생의 성적을 10번 입력받아 배열에 저장한다.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수를 입력하세요: ");
			scores[i] = scan.nextInt();
		}
		
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("점수: ");
//			int score = scan.nextInt();
//			scores[i] = score;
//		}
// 		이렇게도 가능하다		
		
		// 향상된 for문을 사용해서 학생들의 성적을 출력한다.
		// 향상된 for문을 사용해서 총점, 평균을 계산하고 출력한다.
		
		for (int score : scores) {
			total += score;
			average = total / scores.length;
			System.out.println(score);
		}
		
		System.out.println("총점: " +total);
		System.out.println("평균: " +average);
	}
}
