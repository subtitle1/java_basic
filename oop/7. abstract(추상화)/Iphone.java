/*
 * Iphone
 * 		구현클래스이다
 * 		추상클래스인 AbstractPhone 클래스를 상속받았다
 * 		Iphone이 Phone 인터페이스 대신 AbstractPhone 추상클래스를 상속받았기 때문에
 * 		추상클래스에서 구현하지 않은 on() 메소드만 구현하면 된다
 */
public class Iphone extends AbstractSmartPhone {

	private String userId;
	
	public Iphone() {}
	
	public Iphone(String tel, String ip, String userId) {
		// AbstractPhone의 매개변수 있는 생성자를 호출하는 수행문
		super(tel, ip);
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public void on() {
		System.out.println("얼굴 인식으로 화면을 켭니다.");
	}
	
	@Override
	public void game() {
		System.out.println("애플 아케이드 게임을 플레이한다.");
	}
}
