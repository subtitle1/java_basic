package example_09_08_method;

public class Sample2 {
	// 통장의 현재 잔액
	// 멤버 변수
	long balance = 100_000_000L;
	int password = 1234;
	
	// 멤버 메소드
	// 현재 잔액을 반환하는 기능
	long getCurrentBalance () {
		return balance;
	}
	
	// 금액을 전달받아서 잔액을 변경하는 기능
	// void updateBalance (long depositMoney)
	void updateBalance (long depositMoney) {
		balance += depositMoney;
	}
	
	// 이전 비밀번호와 새 비밀번호를 전달받아서 비밀번호를 변경하는 기능
	void changePassword (int prevPassword, int newPassword) {
		if (password != prevPassword) {
			System.out.println("비밀번호가 일치하지 않습니다.");
		} else {
			password = newPassword;
		}
	}
}
