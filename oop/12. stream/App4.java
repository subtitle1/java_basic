package demo1;

import java.util.List;

public class App4 {

	public static void main(String[] args) {
		
		List<Student> studetns = List.of(new Student("이순신", 100, 90, 80),
										 new Student("김유신", 90, 80, 80),
										 new Student("강감찬", 100, 100, 95),
										 new Student("유관순", 90, 80, 80),
										 new Student("안중근", 100, 100, 100));
		// 1, 2, 3등 학생들의 이름을 출력하기
		studetns.stream()
			// 양수가 나오면 앞에 있는 s2가 큰 것이고, 
			// 음수가 나오면 s1이 큰 것이다
			// 내림차순 정렬이 되게 s2를 앞에 뒀다
			// 스트림의 정렬 : 총점순으로 정렬된 것 반환
			.sorted((s1, s2) -> s2.getTotal() - s1.getTotal()) // sorted(Comparator comparator)
			// 스트림의 제한 : Stream<Student> 3개만 반환한다
			.limit(3)
			// 스트림의 변환
			.map(s -> s.name)
			// 스트림의 사용
			.forEach(System.out::println);
	}
	
	static class Student {
		String name;
		int kor;
		int eng;
		int math;
		
		public Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		
		public int getTotal() {
			return kor + eng + math;
		}
	}
}
