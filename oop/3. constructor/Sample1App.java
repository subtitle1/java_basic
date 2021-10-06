package example_09_09_constructor;

public class Sample1App {
	public static void main(String[] args) {
		// 값 변경이 구현된 Sample1 객체 생성
		Sample1 sample = new Sample1();
		
		// 변경할 값 생성
		int number = 100;
		String text = "홍길동";
		Student student = new Student("컴퓨터공학과", "김유신", "010-1111-2222");
		
		System.out.println();
		System.out.println("changeValue 메소드 실행 전 number: " +number);
		System.out.println("changeValue 메소드 실행 전 text: " +text);
		System.out.println("changeValue 메소드 실행 전 student: ");
		student.printStudentInfo();
		
		// changeValue() 메소드를 실행시켜 값 변경하기
		System.out.println();
		sample.changeValue(number);
		sample.changeValue(text);
		sample.changeValue(student);
		
		System.out.println();
		System.out.println("changeValue 메소드 실행 후 number: " +number);
		System.out.println("changeValue 메소드 실행 후 text: " +text);
		System.out.println("changeValue 메소드 실행 후 student: ");
		student.printStudentInfo();
		
	}
}
