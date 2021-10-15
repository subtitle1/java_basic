public class Sample {
	
	static int x;		// 정적 변수
	int y;				// 멤버 변수, 인스턴스 변수
	
	// 정적 메소드는 정적 변수만 사용 가능하다.
	static void staticMethod() { 	// 정적 메소드, 클래스 메소드
		System.out.println(Sample.x);	// 정적변수 사용 가능
		// System.out.println(y);			// 멤버변수 사용 불가
	}
	
	void instanceMethod() {			// 멤버 메소드, 인스턴스 메소드
		System.out.println(Sample.x);	// 정적변수 사용 가능
		System.out.println(y);			// 멤버변수 사용 가능
	}
	
	// 정적 메소드 안에서는 정적 변수 혹은 정적 메소드만 사용이 가능하다!
	static void staticMethod2() {	// 정적 메소드, 클래스 메소드
		Sample.staticMethod();		// 다른 정적 메소드 사용 가능
		// instanceMethod();			// 오류, 멤버 메소드 사용 불가
	}
	
	void instanceMethod2() {		// 멤버 메소드, 인스턴스 메소드
		Sample.staticMethod();		// 정적 메소드, 멤버 메소드 둘 다 사용 가능
		instanceMethod();
	}	
}
