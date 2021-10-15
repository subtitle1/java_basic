public class Sample2App {
	public static void main(String[] args) {
		
		Sample2 s1 = new Sample2();
		Sample2 s2 = new Sample2();
		Sample2 s3 = new Sample2();
		
		// 각 객체의 멤버변수 초기화
		s1.balance = 10000;
		s1.password = 1111;
		
		s2.balance = 1_000_000;
		s2.password = 1234;
		
		s3.balance = 250_000;
		s3.password = 1212;
		
		// 각 객체의 잔액을 조회해서 화면에 출력하기
		long value1 = s1.getCurrentBalance(); // 반환값이 존재하므로 value1에는 1000이 대입된다
		long value2 = s2.getCurrentBalance(); 
		long value3 = s3.getCurrentBalance();
		
		System.out.println("첫번째 통장의 현재 잔액: " +value1);
		System.out.println("두번째 통장의 현재 잔액: " +value2);
		System.out.println("세번째 통장의 현재 잔액: " +value3);
		
		// 각 객체의 잔액을 전부 합친 총 자산을 계산해서 화면에 출력하기
		long totalBalance = value1 + value2 + value3;
		System.out.println("총 자산: "+totalBalance);
		
		// 각 객체의 잔액을 변경하기
		s1.updateBalance(300000);
		s2.updateBalance(500000);
		s3.updateBalance(700000);
		
		// 각 객체의 잔액이 변경된 후 잔액을 조회해서 화면에 출력하기
		value1 = s1.getCurrentBalance();
		value2 = s2.getCurrentBalance();
		value3 = s3.getCurrentBalance();
		System.out.println("잔액 변경 후 첫번째 통장의 현재 잔액: " +value1);
		System.out.println("잔액 변경 후 두번째 통장의 현재 잔액: " +value2);
		System.out.println("잔액 변경 후 세번째 통장의 현재 잔액: " +value3);
	}
}
