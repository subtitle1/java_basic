public abstract class AbstractSmartPhone extends AbstractPhone implements SmartPhone {

	private String ip;
	public AbstractSmartPhone() {}
	
	public AbstractSmartPhone(String tel, String ip) {
		super(tel);
		this.ip = ip;
	}
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public void sendEmail(String from, String to, String title, String content) {
		System.out.println("["+from+"]이 ["+to+"]에게 ["+title+"]["+content+"]를 메일로 보냅니다." );
		
	}
	
	@Override
	public void internet(String url) {
		System.out.println("["+url+"]에 해당하는 웹 페이지를 표시합니다.");
	}
}
