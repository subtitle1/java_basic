package example_09_13_modifier;
import java.util.Date;
//값을 저장하는 객체를 생성하는 데 사용되는 클래스의 일반적인 접근 제한

public class Book {
	// 멤버변수 - 완전 비공개
	private int no;
	private String title;
	private String writer;
	private String publisher;
	private int price;
	private int discountPrice;
	private int stock;
	private Date pubDate;
	
	// 생성자 - 완전 공개
	public Book() {}
	public Book(int no, String title, String writer, String publisher, int price, int discountPrice, int stock,
			Date pubDate) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
		this.discountPrice = discountPrice;
		this.stock = stock;
		this.pubDate = pubDate;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(int discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	
	// 멤버메소드 - 완전 공개
	// 멤버메소드의 구성 - 값을 조회하는 메소드(Getter), 값을 변경하는 메소드(Setter)
	/*
	 * 		Getter 메소드 작성 규칙
	 * 				* 접근제한자: public
	 * 				* 반환타입: 해당 필드의 타입
	 * 				* 메소드명: get + 필드명(첫글자 대문자)
	 * 				* 매개변수: 없음
	 */
	
	// ------------------------------------------------------
	// getter 메소드
	// 조회하는 기능은 반환타입이 데이터타입
	
	/*
	 * 		Setter 메소드 작성 규칙
	 * 				* 접근제한자: public
	 * 				* 반환타입: void
	 * 				* 메소드이름: set + 필드명(첫글자 대문자)
	 * 				* 매개변수: 해당 필드의 타입과 같은 타입의 매개변수
	 */
	
	// setter 메소드
	// 변경, 추가, 삭제하는 것은 반환타입 void
	
	// ------------------------------------------------------
	
	
	
}