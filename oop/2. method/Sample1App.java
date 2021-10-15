public class Sample1App {
	public static void main(String[] args) {
		// Sample1 설계도로 객체 생성하기
		Sample1 sample1 = new Sample1();
		
		// 반환값, 매개변수 없는 메소드 실행
		// 생성된 객체의 기능 실행하기 
		sample1.displayCurrentDate();
		
		// 반환값 O, 매개변수 X 메소드 실행
		// 반환값, 즉 return이 있는 경우에는 반환값을 담을 변수(value)가 필요하다
		int value1 = sample1.getNumber();
		System.out.println(value1);
		
		// 반환값 O, 매개변수 X 메소드 실행
		for (int i = 1; i <= 10; i++) {
			int value = sample1.getRandomNumber();
			System.out.println(value);
		}
		
		// 반환값과 매개변수가 있는 메소드 실행
		int total = sample1.getTotalScore(100, 80, 70);
		System.out.println(total);
		
		double avg = sample1.getAverage(100, 80, 70);
		System.out.println(avg);
	}
}
