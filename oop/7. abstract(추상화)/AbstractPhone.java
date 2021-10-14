package example_09_24_abstract;

/*
 * 추상클래스는 구현부가 없는 메소드를 가질 수 있는 클래스다
 * 멤버변수, 멤버메소드, 정적변수, 정적메소드 전부 가질 수 있다
 * 구현부가 없는 메소드를 가질 수 있기 때문에 new 키워드로 객체 생성이 불가능하다
 */
public abstract class AbstractPhone implements Phone {

	private String tel;
	
	/*
	 * - 추상클래스는 new 키워드를 이용해서 직접 객체 생성은 할 수 없지만,
	 *   멤버변수를 가지고 있고, 그 멤버변수를 초기화하기 위한 생성자 메소드를 포함할 수 있다.
	 * - 추상클래스의 생성자 메소드는 이 클래스를 상속받은 구현클래스가 객체 생성될 때
	 *   구현클래스의 생성자 메소드에서 super() 메소드로 실행된다.
	 */
	public AbstractPhone() {}
	
	public AbstractPhone(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	// Phone 인터페이스에 정의된 추상메소드 재정의
	@Override
	public void call(String tel) {
		System.out.println("[" +tel+ "]로 전화를 겁니다.");
	}
	
	@Override
	public void sms(String tel, String message) {
		System.out.println("[" +tel+ "]로 ["+message+"]를 보냅니다.");
	}
	
	@Override
	public void off() {
		System.out.println("화면을 끕니다.");
	}
}
