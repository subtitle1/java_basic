package example_09_24_abstract;

public interface Phone {

	void on();
	void off();
	void call(String tel);
	void sms(String tel, String message);
}
