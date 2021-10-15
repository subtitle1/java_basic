/**
 * 사람과 관련된 속성 및 기능이 정의된 클래스이다.
 * @author Mars
 *
 */

public class Person {
	
	private String name;
	private String tel;
	private String email;
	
	/**
	 * 기본 생성자 메소드이다.
	 */
	public Person() {}

	/**
	 * 이름을 반환한다.
	 * @return 이름
	 */
	public String getName() {
		return name;
	}

	/**
	 * 지정된 값으로 이름을 변경한다.
	 * @param name 변경할 이름
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 전화번호를 반환한다.
	 * @return 전화번호
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 지정된 값으로 전화번호를 변경한다.
	 * @param tel 변경할 전화번호
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 이메일을 반환한다.
	 * @return 이메일
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 지정된 값으로 이메일을 변경한다.
	 * @param email 변경할 이메일
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
