package demo1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App2 {

	public static void main(String[] args) {
		
		// 스트림 생성
		IntStream numberStream = IntStream.rangeClosed(1, 10);
	
		// 스트림 필터링
		numberStream
			.filter(num -> num <= 5)
			.forEach(num -> System.out.println(num));
		
		String[] names = {"서울", "경기", "인천", "서울", "부산", "인천", "울산"};
	
		Arrays.stream(names).
			distinct()  // 중복된 요소가 제거된 스트림을 반환한다
			.sorted() // 가나다 순 정렬
			.forEach(name -> System.out.println(name));
	}
}
