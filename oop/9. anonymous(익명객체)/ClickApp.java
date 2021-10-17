public class ClickApp {

	public static void main(String[] args) {
		Click homeButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("홈페이지를 표시합니다.");
			}
		};
		
		Click prevButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("이전 페이지를 표시합니다.");
			}
		};
		
		Click nextButtonClick = new Click() {
			public void actionPerformed() {
				System.out.println("다음 페이지를 표시합니다.");
			}
		};
		
		// 람다표현식
		// Click nextButton = () -> {System.out.println("다음 페이지를 표시합니다.");};
	}
}
