public class Sample2 {
	
	static int x = 0;
	int y = 0;
	
	void increase() {
		Sample2.x++;
		y++;
	}
	
	void printValue() {
		System.out.println("정적 변수 x의 값: " + Sample2.x);
		System.out.println("인스턴스 변수 y의 값: " + y);
	}

}
