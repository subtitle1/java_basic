package example_09_24_abstract;

public class NormalPhone extends AbstractPhone {

	public NormalPhone() {}
	public NormalPhone(String tel) {
		super(tel);
	}
	
	@Override
	public void on() {
		System.out.println("전원 버튼을 누르면 화면이 켜집니다.");
	}
}
