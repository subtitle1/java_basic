package example_09_14_extends;

public class PersonApp {
	
	public static void main(String[] args) {
		// Person 객체를 생성하면 최상위 객체인 Object 객체와 Person 객체가 생성된다.
		Person person = new Person();
		
		// Student 객체를 생성하면 최상위 객체인 Object 객체, 상위 객체인 Person 객체와 Student 객체가 생성된다.
		Student student = new Student();
		
		// Employee 객체를 생성하면 최상위 객체인 Object 객체, 상위 객체인 Person 객체와 Employee 객체가 생성된다.
		Employee employee = new Employee();
		
		// person으로 참조되는 Person 객체는 name, tel, email과 getter/setter 메소드를 가지고 있다.
		person.setName("홍길동");
		person.setTel("010-1111-1111");
		person.setEmail("hong@gamil.com");
		
		// student로 참조되는 Student 객체는 dept, grade와 getter/setter 메소드를 가지고 있다.
		// student로 참조된되는 Student 객체는 상위 클래스인 Person 객체의 공개된 변수 혹은 기능을 사용할 수 있다.
		student.setName("김유신");				// Person 객체의 공개된(상속받은) 기능
		student.setTel("010-2222-2222");		// Person 객체의 공개된(상속받은) 기능
		student.setEmail("kim@gmail.com");		// Person 객체의 공개된(상속받은) 기능
		student.setDept("전자공학과");				// Student 객체의 기능
		student.setGrade(3);					// Student 객체의 기능
	
		employee.setName("강감찬");				// Person 객체의 공개된(상속받은) 기능
		employee.setTel("010-3333-3333");		// Person 객체의 공개된(상속받은) 기능
		employee.setEmail("kang@gmail.com");	// Person 객체의 공개된(상속받은) 기능
		employee.setCompany("삼상전자");			// Employee 객체의 기능
		employee.setPosition("부장");			// Employee 객체의 기능
		employee.setSalary(10_000_000);			// Employee 객체의 기능
	}
}
