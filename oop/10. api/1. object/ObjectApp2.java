public class ObjectApp2 {

	public static void main(String[] args) {
		Student student1 = new Student(100, "홍길동", "컴퓨터공학과", 3);
		Student student2 = new Student(100, "홍길동", "컴퓨터공학과", 3);
		Student student3 = student1;
		Student student4 = student2;
		
		// Object의 int hashCode()
		// 객체의 해시코드값을 정수로 반환한다.
		// 객체가 동일하면 해시코드값도 같다.
		// 해시코드값이 같으면 같은 객체다(true일 수도 있고 false일 수도 있다)
		// 같은 객체일 수도 있고 아닐 수도 있고~~
		System.out.println("### 객체의 해시코드 값을 출력해보자");
		int result1 = student1.hashCode();
		int result2 = student2.hashCode();
		int result3 = student3.hashCode();
		int result4 = student4.hashCode();
	
		System.out.println("### 해시코드 " + result1);
		System.out.println("### 해시코드 " + result2);
		System.out.println("### 해시코드 " + result3);
		System.out.println("### 해시코드 " + result4);
	}
}
