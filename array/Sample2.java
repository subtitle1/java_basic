package example_09_02_array;

public class Sample2 {
	public static void main(String[] args) {
		// 새 배열을 생성하기
		int[] scores; // 정수값을 여러 개 저장하는 배열 객체의 주소값을 저장할 수 있는 scores를 생성하기
		scores = new int[5]; // 정수를 5개 저장하는 배열 객체를 생성하고, 그 객체의 주소값을 scores에 대입
		
		// 배열의 각 요소에 인덱스를 사용해서 값을 저장하기
		scores[0] = 70; // scores 변수가 참조하는 배열객체의 0번째 요소에 70 대입
		scores[1] = 65;	
		scores[2] = 90;		
		scores[3] = 60;		
		scores[4] = 80;		
		
		// 배열의 각 요소에 저장된 값을 인덱스를 사용해서 조회하기
		System.out.println("0번째 요소의 값: " +scores[0]);
		System.out.println("1번째 요소의 값: " +scores[1]);
		System.out.println("2번째 요소의 값: " +scores[2]);
		System.out.println("3번째 요소의 값: " +scores[3]);
		System.out.println("4번째 요소의 값: " +scores[4]);
		
		// 배열의 크기를 조회하기
		int size = scores.length;
		System.out.println("배열 크기: " +size);
		
		// 배열의 각 요소에 저장된 값을 반복문을 사용해서 조회하기
		for (int i = 0; i < size; i++) {
			System.out.println(scores[i]);
		}
		
		/* 배열의 각 요소에 저장된 값을 향상된 for문을 사용해서 조회하기
		 * int[] 배열 = new int[5];
		 * 
		 * 데이터타입[] 배열 = new 데이터타입[3];
		 * 배열[0] = 값1;
		 * 배열[1] = 값2;
		 * 배열[2] = 값3;
		 * 
		 * 향상된 for문
		 * for (데이터타입 변수명 : 배열) {
		 * 		System.out.println(변수명)
		 * }
		 * 
		 */
		
		for (int tmp : scores) {
			System.out.println(tmp);
		}
	}
}
