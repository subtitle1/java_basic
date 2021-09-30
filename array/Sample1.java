package example_09_02_array;

public class Sample1 {
	public static void main(String[] args) {
		// 자바에서 배열은 이렇게 표현한다
		// int[] a; String[] a;
		
		// 정수 10개 저장할 수 있는 배열을 생성해서 a에 대입한다.
		// a = new int[10];
		// a = new int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열 생성하기
		// new int[5]; // 정수 5개 담을 수 있는 배열, 인덱스 번호는 0~4
		
		// 정수가 여러 개 저장된 배열을 담는 변수 number를 생성함
		// int[] numbers
		
		// 정수 5개 담을 수 있는 배열을 생성해서, 
		// 정수를 여러 개 저장된 배열을 담은 변수 numbers에 그 배열을 저장함
		// int[] numbers = new int[5];
		
		int[] numbers = new int[5];
		double[] numbers2 = new double[5];
		String[] names = new String[5];
		
		System.out.println("정수 배열에 저장된 값");
		System.out.println("정수 배열의 0번째 값: " +numbers[0]);
		System.out.println("정수 배열의 1번째 값: " +numbers[1]);
		System.out.println("정수 배열의 2번째 값: " +numbers[2]);
		System.out.println("정수 배열의 3번째 값: " +numbers[3]);
		System.out.println("정수 배열의 4번째 값: " +numbers[4]);
		
		System.out.println("실수 배열에 저장된 값");
		System.out.println("실수 배열의 0번째 값: " +numbers2[0]);
		System.out.println("실수 배열의 1번째 값: " +numbers2[1]);
		System.out.println("실수 배열의 2번째 값: " +numbers2[2]);
		System.out.println("실수 배열의 3번째 값: " +numbers2[3]);
		System.out.println("실수 배열의 4번째 값: " +numbers2[4]);
		
		System.out.println("문자열 배열에 저장된 값");
		System.out.println("문자열 배열 0번째에 저장된 값: " +names[0]);
		
		// 자바에서 기본 변수(int, double, float, long, boolean)을 제외한
		// 모든 것들은 객체다. 객체들은 주소값을 가지고 있다.
	}
}
