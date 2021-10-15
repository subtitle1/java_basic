public class Bank {
    private Account[] database = new Account[100];
    private int position = 0;

    public Bank() {
        database[position++] = new Account("101-11-000001", "김수영", 1234, 1_000_000L, 23, 0.01);
        database[position++] = new Account("101-11-000002", "김민수", 1234, 1_500_000L, 10, 0.02);
        database[position++] = new Account("101-11-000003", "김윤주", 1234, 2_500_000L, 12, 0.01);
        database[position++] = new Account("101-11-000004", "김민수", 1234, 4_000_000L, 24, 0.015);
        database[position++] = new Account("101-11-000005", "이루리", 1234, 7_000_000L, 35, 0.011);
        database[position++] = new Account("101-11-000006", "윤지영", 1234, 8_000_000L, 36, 0.013);
        database[position++] = new Account("101-11-000007", "박문치", 1234, 6_500_000L, 5, 0.018);
        database[position++] = new Account("101-11-000008", "최정윤", 1234, 1_000_000L, 12, 0.02);
        database[position++] = new Account("101-11-000009", "소수빈", 1234, 1_200_000L, 16, 0.021);
        database[position++] = new Account("101-11-000010", "서자영", 1234, 1_001_000L, 20, 0.023);
        database[position++] = new Account("101-11-000011", "소수빈", 1234, 1_020_000L, 30, 0.03);
        database[position++] = new Account("101-11-000012", "최정윤", 1234, 3_200_000L, 8, 0.025);
        database[position++] = new Account("101-11-000013", "서자영", 1234, 5_000_000L, 9, 0.02);
        database[position++] = new Account("101-11-000014", "박세진", 1234, 2_100_000L, 21, 0.001);
        database[position++] = new Account("101-11-000015", "김윤주", 1234, 3_020_000L, 28, 0.008);
        database[position++] = new Account("101-11-000016", "김수영", 1234, 5_000_000L, 30, 0.01);
        database[position++] = new Account("101-11-000017", "최유리", 1234, 3_000_000L, 27, 0.02);
    }

    /**
     * 전계좌 조회하기
     * 소유자명을 전달받아서 해당 소유자의 모든 계좌정보를 화면에 출력한다.
     * @param ownerName 소유자명
     */
    public void displayMyAccounts(String ownerName) {
    	System.out.println("### ["+ownerName+"]님 전계좌 조회");
    	
    	// 배열에서 순서대로 Account 객체의 주소값을 순서대로 가져와서 account 참조변수에 대입한다.
    	for (Account account : database) {
    		// 참조변수 account에 대입된 주소값이 null이 아니면
    		if (account != null) {
    			// 조회된 Account 객체의 소유주 이름을 조회한다.
    			String accountOwnerName = account.getOwner();
    			// 조회된 계좌의 소유주 이름과 매개변수로 전달받은 소유주 이름이 일치하면
    			if (accountOwnerName.equals(ownerName)) {
    				// account 참조변수가 참조하는 Account 객체의 계좌아이디, 잔액, 납입기간을 화면에 출력한다.
    				System.out.println(account.getId() + "\t" + account.getBalance() + "\t" + account.getDepositPeriod());
    			}
    		}
    	}
    }

    /**
     * 계좌상세정보 조회하기
     * 계좌아이디와 비밀번호를 전달받아서 상세 계좌정보를 출력한다.<br />
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 비밀번호가 틀린 경우 오류 메세지를 표시한다.
     * @param id 계좌 아이디
     * @param password 비밀번호
     */
    public void displayAccountInfo(String id, int password) {
    	System.out.println("### ["+id+"]계좌의 상세정보 조회");
    	Account account = this.getAccount(id);
    	if (account == null) {
    		System.out.println("### 오류 : 일치하는 계좌정보가 존재하지 않습니다.");
    		return; // 빠른 종료, 메소드의 반환값이 void여서 return 0; 이런 식으로 쓰면 오류
    	}
    	
    	if (account.getPassword() != password) {
    		System.out.println("### 오류 : 비밀번호가 일치하지 않습니다.");
    		return; // 빠른 종료
    	}
    	
    	System.out.println("======== 계좌 상세정보========");
    	System.out.println("계좌 아이디: " + account.getId());
    	System.out.println("계좌 소유주: " + account.getOwner());
    	System.out.println("현재 잔액: " + account.getBalance());
    	System.out.println("총 납입기간: " + account.getDepositPeriod() + "개월");
    	System.out.println("이율: " + account.getInterestRate() * 100 + "%");
    	System.out.println();
    }
    
    /**
     * 비밀번호 변경하기
     * 계좌아이디, 이전 비밀번호, 새 비밀번호를 전달받아서 계좌의 비밀번호를 변경한다.<br />
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 비밀번호가 틀린 경우 오류 메세지를 표시한다. <br />
     * 이전 비밀번호와 새 비밀번호가 같은 경우 오류 메세지를 표시한다.
     * @param id 계좌아이디
     * @param oldPassword 이전 비밀번호
     * @param newPassword 새 비밀번호
     */
    public void changePassword(String id, int oldPassword, int newPassword) {
        // 코드의 깊이가 간단해지도록 오류가 실행되는 구문들을 이렇게 먼저 구현해 놓고,
    	// if문에 해당하지 않을 때 비밀번호를 변경한다.
    	if (oldPassword == newPassword) {
        	System.out.println("### 오류: 새 비밀번호와 이전 비밀번호가 동일합니다.");
        	return;
        }
        Account account = this.getAccount(id);
        if (account == null) {
        	System.out.println("### 오류: 계좌정보가 존재하지 않습니다.");
        	return;
        }
        
        if (account.getPassword() != oldPassword) {
        	System.out.println("### 오류: 비밀번호가 일치하지 않습니다.");
        	return;
        }
        
        account.setPassword(newPassword);
    }
    
    /**
     * 입금하기
     * 계좌아이디와 입금액을 전달받아서 계좌의 잔액을 증가시키고, 변경된 잔액을 표시한다. <br />
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.
     * @param id 계좌아이디
     * @param amount 입금액
     */
    public void deposit(String id, long amount) {
    	if (amount <= 0) {
    		System.out.println("### 오류: 입금액은 0보다 작거나 같을 수 없습니다.");
    		return;
    	}
    	
        Account account = this.getAccount(id);
        if (account == null) {
        	System.out.println("### 오류: 계좌정보가 존재하지 않습니다.");
        	return;
        }
        
        long prevBalance = account.getBalance();
        account.setBalance(account.getBalance() + amount);
        
        System.out.println("### ["+id+"] 계좌에 ["+amount+"]원이 입금되었습니다.");
        System.out.println("### 입금 전 잔액: " + prevBalance+"원");
        System.out.println("### 현재 잔액: " + account.getBalance()+"원");
    }
    
    /**
     * 출금하기
     * 계좌아이디, 비밀번호, 출금액을 전달받아서 출금액만큼 잔액을 감소시키고, 변경된 잔액을 표시한다.
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 비밀번호가 틀린 경우 오류 메세지를 표시한다. <br />
     * 출금액보다 잔액이 작은 경우 오류 메세를 표시한다.
     * @param id 계좌 아이디
     * @param password 비밀번호
     * @param amount 출금액
     */
    public void withdraw(String id, int password, long amount) {
        if (amount <= 0) {
    		System.out.println("### 오류: 출금액은 0보다 작거나 같을 수 없습니다.");
    		return;
    	}
        
        Account account = this.getAccount(id);
        if (account == null) {
        	System.out.println("### 오류: 계좌정보가 존재하지 않습니다.");
        	return;
        }
        
        if (account.getPassword() != password) {
        	System.out.println("### 오류: 비밀번호가 일치하지 않습니다.");
        	return;
        }
        
        if (account.getBalance() < amount) {
        	System.out.println("### 오류: 잔액이 부족합니다.");
        	return;
        }
        
        long prevBalance = account.getBalance();
        account.setBalance(account.getBalance() - amount);
        
        System.out.println("### ["+id+"] 계좌에서 ["+amount+"]원이 출금되었습니다.");
        System.out.println("### 출금 전 잔액: " + prevBalance+"원");
        System.out.println("### 현재 잔액: " + account.getBalance()+"원");
    }
    
    /**
     * 이체하기
     * 계좌아이디, 상대방 계좌아이디, 비밀번호, 이체금액을 전달받아서 이체금액만큼 잔액을 감소시키고, 상대방 계좌의 잔액을 이체금액만큼 증가시키고, 변경된 잔액을 표시한다.
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 지정된 상대방 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 비밀번호가 틀린 경우 오류 메세지를 표시한다. <br />
     * 이체금액보다 잔액이 작은 경우 오류 메세를 표시한다.
     * @param id 계좌아이디
     * @param otherId 상대방 계좌아이디
     * @param password 비밀번호
     * @param amount 이체금액
     */
    public void transfer(String id, String otherId, int password, long amount) {
    	if (amount <= 0) {
    		System.out.println("### 오류: 이체금액은 0보다 작거나 같을 수 없습니다.");
    		return;
    	}
    	
    	Account account = this.getAccount(id);
    	Account otherAccount = this.getAccount(otherId);
    	if (account == null || otherAccount == null) {
    		System.out.println("### 오류: 계좌정보가 존재하지 않습니다.");
    		return;
    	}
    	
    	if (account.getPassword() != password) {
    		System.out.println("### 오류: 비밀번호가 일치하지 않습니다.");
    		return;
    	}
    	
    	if (account.getBalance() < amount) {
    		System.out.println("### 오류: 잔액이 부족합니다.");
    		return;
    	}
    	
    	long prevBalance = account.getBalance();
    	
    	account.setBalance(account.getBalance() - amount);
    	otherAccount.setBalance(otherAccount.getBalance() + amount);
    	
    	System.out.println("### ["+id+"] 계좌에서 ["+otherId+"계좌로 ["+amount+"]원이 이체되었습니다.");
        System.out.println("### 출금 전 잔액: " + prevBalance+"원");
        System.out.println("### 현재 잔액: " + account.getBalance()+"원");
    }
    
    /**
     * 해지환급금 계산하기
     * 계좌아이디, 비밀번호를 전달받아서 해지환금급을 계산해서 표시한다. <br />
     * 지정된 계좌아이디가 없는 경우 오류 메세지를 표시한다.<br />
     * 비밀번호가 틀린 경우 오류 메세지를 표시한다. <br />
     * @param id 계좌아이디
     * @param password 비밀번호
     */
    public void calculateCancellationRefund(String id, int password) {
    	Account account = this.getAccount(id);
    	if (account == null) {
    		System.out.println("### 오류: 계좌정보가 존재하지 않습니다.");
    		return;
    	}
    	
    	if (account.getPassword() != password) {
    		System.out.println("### 오류: 비밀번호가 일치하지 않습니다.");
    		return;
    	}
    	
    	long balance = account.getBalance();				// 현재 잔액
    	int depositPeriod = account.getDepositPeriod();		// 납입 개월수
    	double interestRate = account.getInterestRate();	// 1년 이자
    													// 한달치 이자   *   개월수    *   잔액
    	long cancellationRefund = balance + (long)((interestRate / 12)*depositPeriod*balance);
    	System.out.println("### 예상 해지환급금: " + cancellationRefund +"원");
    }
    
    /**
     * 계좌아이디를 전달받아서 계좌정보를 반환하는 기능
     * @param accId 계좌아이디
     * @return 계좌정보, 계좌 아이디가 잘못되었을 경우 null이 반환될 수 있다
     */
    private Account getAccount(String accId) {
    	 // 발견된 Account 객체의 주소값을 저장할 foundAccount 참조변수 선언
    	Account foundAccount = null;
    	// database 배열에 저장된 Account 객체의 주소값을 account에 저장한다
    	for (Account account : database) {
    		// account 참조변수에 대입된 값이 null이 아니고, account가 참조하는 객체의 계좌와 비밀번호가 일치하면 
    		if (account != null && account.getId().equals(accId)) {
    			// 현재 조회된 account의 주소값을 foundAccount에 대입한다
    			foundAccount = account;
    			// 계좌 아이디와 일치하는 계좌정보를 찾았으면 반복문을 중단한다
    			break;
    		}
    	}
    	return foundAccount;
    }    
}
