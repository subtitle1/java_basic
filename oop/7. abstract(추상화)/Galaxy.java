package example_09_24_abstract;

public class Galaxy extends AbstractSmartPhone {
	
	private String gmail;
	
	public Galaxy() {}
	
	public Galaxy(String tel, String ip, String gmail) {
		super(tel, ip);
		this.gmail = gmail;
	}
	
	public String getGmail() {
		return gmail;
	}
	
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	
	@Override
	public void on() {
		System.out.println("지문 인식으로 화면을 켭니다.");
	}
	
	@Override
	public void game() {
		System.out.println("갤럭시 앱 마켓의 게임을 플레이한다.");
	}
}
