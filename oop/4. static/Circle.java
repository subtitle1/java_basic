public class Circle {
	static final double PI = 3.141592; // 원주율, 고정 값
	// final(변하지 않는 값, 상수) 변수는 반드시 변수명을 대문자로 적는다.
	
	double r;	// 반지름의 길이
	// 멤버변수, 인스턴스변수, 객체의 프로퍼티(property)
	
	// 생성자 정의
	Circle() {}
	Circle (double r) {
		this.r =r;
	}
	
	// 멤버메소드
	double getArea() {
		return Circle.PI*r*r;
	}
	
	double getRoundLength() {
		return 2*Circle.PI*r;
	}
}
