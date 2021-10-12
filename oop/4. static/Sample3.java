package example_09_10_static;

import java.util.Arrays;

public class Sample3 {
	public static void main(String[] args) {
		
		// static 메소드 사용해보기
		double randomNumber = Math.random();
		System.out.println(randomNumber);
		
		long number1 = Math.round(2.1);
		long number2 = Math.round(2.4);
		long number3 = Math.round(2.7);
		System.out.println(number1 + ", " + number2 + ", " + number3);
		
		int[] numbers = {3, 8, 5, 9, 1, 0, 7, 2, 8};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}