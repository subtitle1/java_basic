package example_09_29_object;

public class ObjectApp5 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person original = new Person("홍길동", "010-1111", "hong@gmail.com");
		Person clonePerson = original.copy();
		System.out.println(clonePerson);
		
		// 원본객체와 복제된 객체의 정보를 확인해보면 해시코드값이 다르다.
		// 즉, 원본객체와 복제된 객체는 서로 다른 객체임을 알 수 있다.
		System.out.println("### 원본객체: " +original);		// ObjectApp5$Person@73a28541
		System.out.println("### 복제된 객체: " +clonePerson); // ObjectApp5$Person@5aaa6d82
		
		System.out.println("### 복제된 객체 확인하기");
		System.out.println(clonePerson.name);
		System.out.println(clonePerson.tel);
		System.out.println(clonePerson.email);
	}
	
	// 정적 내부 클래스
	static class Person implements Cloneable {
		String name;
		String tel;
		String email;
		
		public Person(String name, String tel, String email) {
			this.name = name;
			this.tel = tel;
			this.email = email;
		}
		
		// 객체의 복제본을 제공하는 메소드다.
		// clone의 반환값은 Object이고, protected 접근 제한자로 정의되어져 있다.
		// 모든 객체는 Object를 갖고 있기 때문에 clone을 구현할 때 protected Object clone()
		// 이렇게 정의되었으며 clone을 재정의하고자 할 때는 해당 객체로 형변환이 필수이다.
		public Person copy() throws CloneNotSupportedException {
			Person person = (Person)this.clone();
			return person;
		}
	}
}
