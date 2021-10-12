package example_09_10_static;

public class CircleApp {
	public static void main(String[] args) {
		
		System.out.println(Circle.PI); // 객체 생성 없이 바로 사용가능한 static변수
									   // static변수는 클래스명.변수명 or
									   // 클래스명.메소드명()의 형식으로 바로 사용할 수 있다.
		
		// 정적 변수 중에서 final 키워드를 붙여 상수로 만든 것은
		// 한 번 정해진 값을 변경할 수 없다.
		// Circle.PI = 3.14; -> 오류
		
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(10);
		Circle circle3 = new Circle(15);
		Circle circle4 = new Circle(20);
		Circle circle5 = new Circle(25);
		
		System.out.println("반지름 5인 원의 넓이: " + circle1.getArea());
		System.out.println("반지름 10인 원의 넓이: " + circle2.getArea());
		System.out.println("반지름 15인 원의 넓이: " + circle3.getArea());
		System.out.println("반지름 20인 원의 넓이: " + circle4.getArea());
		System.out.println("반지름 25인 원의 넓이: " + circle5.getArea());
	}
}
