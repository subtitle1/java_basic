package example_09_29_object;

public class ObjectApp {

	public static void main(String[] args) {
		Student student1 = new Student(100, "홍길동", "컴퓨터공학과", 3);
		Student student2 = new Student(100, "홍길동", "컴퓨터공학과", 3);
		Student student3 = student1;
		Student student4 = student2;
			
		// Object의 boolean equals(Object otherObject)
		// 두 객체의 참조값을 비교해서 참조값이 같은 경우에 true를 반환한다.
		System.out.println("### 객체가 동일한 객체인지 여부를 확인하자");
		boolean result1 = student1.equals(student2);
		boolean result2 = student2.equals(student1);
		System.out.println("### 동일한 객체인가? " +result1);
		System.out.println("### 동일한 객체인가? " +result2);
		
		boolean result3 = student1.equals(student3);
		boolean result4 = student2.equals(student4);
		System.out.println("### 동일한 객체인가? " +result3);
		System.out.println("### 동일한 객체인가? " +result4);
		
		// 객체에 대해서 비교 연산자를 사용할 수 있다.
		// 객체에 대해서 비교 연산을 실행하면 주소값 비교를 한다.
		boolean result5 = student1 == student2;
		boolean result6 = student1 == student3;
		System.out.println("### 동일한 객체인가? " +result5);
		System.out.println("### 동일한 객체인가? " +result6);
	}
}
