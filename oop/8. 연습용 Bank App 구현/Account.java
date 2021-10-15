public class Account {
    // 계좌아이디
    private String id;
    // 소유자이름 
    private String owner;
    // 비밀번호
    private int password;
    // 현재 잔액
    private long balance;
    // 납입기간(개월수)
    private int depositPeriod;
    // 이자율
    private double interestRate;

    public Account(String id, String owner, int password, long balance, int depositPeriod, double interestRate) {
        this.id = id;
        this.owner = owner;
        this.password = password;
        this.balance = balance;
        this.depositPeriod = depositPeriod;
        this.interestRate = interestRate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public int getDepositPeriod() {
        return depositPeriod;
    }
    public void setDepositPeriod(int depositPeriod) {
        this.depositPeriod = depositPeriod;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
