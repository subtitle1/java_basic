package example_09_02_array;

public class Sample4 {
	public static void main(String[] args) {
		// 학생들의 성적을 포함하고 있는 배열을 생성하고
		// 전체 학생들의 평균을 계산해서 출력하기
		
		int[] scores = {60, 70, 40, 70, 85, 90, 40, 100, 75, 50, 35, 90, 100, 60, 70};
		
		// 총점, 학생수, 평균을 저장할 변수 생성하고, 초기화하기
		int totalScore = 0;
		int studentCount = scores.length;
		int average = 0;
		
		for (int score : scores) {
			totalScore += score;
		}
		
		average = totalScore/studentCount;
		
		System.out.println("총점: " +totalScore);
		System.out.println("학생 수: " +studentCount);
		System.out.println("평균: " +average);
	}
}
