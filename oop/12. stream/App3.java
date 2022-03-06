package demo1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App3 {

	public static void main(String[] args) {
		// 스트림의 생성
		IntStream intStream = IntStream.rangeClosed(1, 10);
		
		// 스트림의 변환
		intStream.map(num -> num*2).forEach(System.out::println); // 람다식 반환값이 포함된 새 스트림을 반환한다.
		
		String[] arr = {"나는 학교에 갑니다", "올해는 2022년입니다", "학생들은 줌으로 수업을 듣습니다"};
		Arrays.stream(arr)
			// 스트림의 변환
			.flatMap(text -> Stream.of(text.split(" "))) // 람다식이 반환하는 스트림들이 전부 병합된 새 스트림을 반환한다.
			.forEach(System.out::println);
	}
}
