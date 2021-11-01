package example_09_29_object;

public class ObjectApp3 {

	public static void main(String[] args) {
		
		Student student1 = new Student(100, "홍길동", "컴퓨터공학과", 3);
		Student student2 = new Student(200, "김유신", "전자공학과", 2);
		Student student3 = new Student(300, "강감찬", "소프트웨어공학과", 1);
		
		// Object의 String toString()
		// 객체의 정보("패키지를 포함한 클래스의 전체 이름@해시코드")를 문자열로 반환한다.
		System.out.println("### 객체의 정보를 조회해보자");
		String result1 = student1.toString();
		String result2 = student2.toString();
		String result3 = student3.toString();
		
		System.out.println("### 객체의 정보: " + result1);
		System.out.println("### 객체의 정보: " + result2);
		System.out.println("### 객체의 정보: " + result3);
		
		// System.out.println(참조변수)는 참조변수에 저장된 참조값(주소값)을 출력하지 않는다.
		// System.out.println(참조변수)는 System.out.println(참조변수.toString())과 동일한 코드다.
		
		// 참조변수 student1의 주소값이 아니라, 
		// student1이 참조하는 객체의 toString()의 반환값이 출력된다.
		System.out.println("### 참조변수를 콘솔에 출력한 경우");
		System.out.println(student1); 
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("### 참조변수로 참조되는 객체의 toString()이 반환하는 값을 출력한 경우");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		System.out.println(students.toString());
		System.out.println(java.util.Arrays.toString(students));
	}
}
