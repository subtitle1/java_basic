package example_09_02_array;
import java.util.*;

public class Sample6 {
	public static void main(String[] args) {
		// 학생 이름, 국어점수, 영어점수, 수학점수를 입력받아서 배열에 저장하고
		// 학생별 총점, 평균을 계산해서 출력하시오
		
		Scanner scan = new Scanner(System.in);
		
		// 학생 이름, 국어점수, 영어점수, 수학점수를 저장하는 배열을 정의하기
		String[] names = new String[5];
		int[] korScores = new int[5];
		int[] engScores = new int[5];
		int[] mathScores = new int[5];
		
		// 점수를 각각 입력받아 해당 배열에 순서대로 저장한다
		for (int i = 0; i < names.length; i++) {
			System.out.print("학생 이름을 입력하세요: ");
			names[i] = scan.next();
			
			System.out.print("국어점수를 입력하세요: ");
			korScores[i] = scan.nextInt();
			
			System.out.print("영어점수를 입력하세요: ");
			engScores[i] = scan.nextInt();
			
			System.out.print("수학점수를 입력하세요: ");
			mathScores[i] = scan.nextInt();
		}
		
		// 학생 이름, 국어, 영어, 수학 점수 출력. 각 점수에 대한 총점과 평균을 계산해서 출력한다.
				
		for (int i = 0; i < names.length; i++) {
			int totalScore = korScores[i] + engScores[i] + mathScores[i];
			int average = totalScore / 3;
			System.out.println(names[i]+"\t"+korScores[i]+"\t"+engScores[i]+"\t"+mathScores[i]+"\t"+totalScore+"\t"+average);
		}
	}
}
