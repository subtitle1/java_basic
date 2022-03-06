package demo1;

import java.util.List;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class App5 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(4, 2, 7, 6, 8, 1, 5);
		
		// findFirst() : 스트림의 첫 번째 값을 반환한다.
		OptionalInt optionalInt = intStream.sorted().findFirst();
		System.out.println(optionalInt.getAsInt());
		
		// .forEach(Consumer c) : 스트림의 각 요소를 출력한다.
		intStream = IntStream.of(4, 2, 7, 6, 8, 1, 5);
		intStream.forEach(System.out::println);
		
		// .count() : 스트림의 요소개수를 반환한다. .min() / .max() : 스트림 요소의 최소값/최대값을 반환한다.
		intStream = IntStream.of(4, 2, 7, 6, 8, 1, 5);
		System.out.println("개수: " + IntStream.of(4, 2, 7, 6, 8, 1, 5).count());
		System.out.println("최소: " + IntStream.of(4, 2, 7, 6, 8, 1, 5).min().getAsInt());
		System.out.println("최대: " + IntStream.of(4, 2, 7, 6, 8, 1, 5).max().getAsInt());
		
		// .sum() : 스트림 요소의 합계를 반환한다. .average() : 스트림 요소의 평균을 반환한다.
		System.out.println("합계: " + IntStream.of(4, 2, 7, 6, 8, 1, 5).sum());
		System.out.println("평균: " + IntStream.of(4, 2, 7, 6, 8, 1, 5).average().getAsDouble());
		
		// .collect() : 스트림의 각 요소를 수집한다. List, Set 등의 형태로 반환된다.
		intStream = IntStream.of(4, 2, 7, 6, 8, 1, 5);
		List<Integer> numberList = Stream.of(4, 2, 7, 6, 8, 1, 5).collect(Collectors.toList());
		Set<Integer> numberSet = Stream.of(4, 2, 7, 6, 8, 1, 5).collect(Collectors.toSet());
		System.out.println(numberList);
		System.out.println(numberSet);
	}
}
