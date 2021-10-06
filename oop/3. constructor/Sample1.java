package example_09_09_constructor;

public class Sample1 {
	
	// 기본 자료형값을 전달받아서 값을 변경하는 메소드
	void changeValue(int number) {
		System.out.println("전달받은 number의 값: " +number);
		number++;
		System.out.println("변경된 number의 값: " +number);
	}
	
	// 문자열값을 전달받아서 값을 변경하는 메소드
	void changeValue(String text) {
		System.out.println("전달받은 text의 값: " +text);
		text = "홍길동2";
		System.out.println("변경된 text의 값: " +text);
	}
	
	// 객체를 전달받아서 값을 변경하는 메소드
	void changeValue(Student student) {
		System.out.println("전달받은 student의 값: ");
		student.printStudentInfo();
		
		student.no = 300;
		student.dept = "기계공학과";
		student.grade = 3;
		student.name = "강감찬";
		student.email = "kang@jhta.co.kr";
		student.phone = "010-1111-1111";
		
		System.out.println("변경된 student의 값: ");
		student.printStudentInfo();
		}
}
