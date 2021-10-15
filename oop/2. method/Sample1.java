import java.util.Date;
import java.util.Random;

public class Sample1 {
	// 반환타입 X, 매개변수 X 메소드 구현하기
	// 시스템의 현재 날짜/시간을 화면에 표시하는 메소드
	
	Date displayCurrentDate() {
		Date now = new Date();
		System.out.println(now);
		return now;
	}
	
	// 반환타입 O, 매개변수 X 메소드 구현하기
	// 정수값을 반환하는 메소드
	int getNumber() {
		return 100;
	}
	
	// 반환타입 O, 매개변수 X 메소드 구현하기
	// 1~6까지의 숫자 중 임의의 숫자를 반환하는 메소드
	int getRandomNumber() {
		Random random = new Random();
		int number = random.nextInt(6) + 1;
		return number;
	}
	
	// 반환타입 O, 매개변수 O 메소드 구현
	// 국, 영, 수 점수 전달 받아 총점 반환
	int getTotalScore(int kor, int eng, int mat) {
		int total = kor + eng + mat;
		return total;
	}
	
	// 반환타입 O, 매개변수 O 메소드 구현하기
	// 국영수 점수 전달받아 평균 반환하는 메소드
	double getAverage (int kor, int eng, int mat) {
		int total = kor + eng + mat;
		return total/3.0;
	}
	
}
