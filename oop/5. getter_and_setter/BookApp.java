import java.util.Date;

public class BookApp {
	public static void main(String[] args) {
		Book book1 = new Book();
//		book1.no = 100; // 멤버변수 완전 비공개 -> 접근 불가, 즉 getter 메소드로 접근해서 값을 얻을 수 있다
		
		// set 메소드를 이용해서 값 변경이 가능하다
		book1.setNo(100);
		book1.setTitle("자바의 정석");
		book1.setWriter("남궁성");
		book1.setPublisher("도우출판사");
		book1.setPrice(30000);
		book1.setDiscountPrice(27000);
		book1.setStock(10);
		book1.setPubDate(new Date());
		
		// System.out.println(book1.no); 
		// get 메소드를 이용해서 값을 찾는 것이 가능하다
		System.out.println(book1.getNo());
		System.out.println(book1.getTitle());
		System.out.println(book1.getWriter());
		System.out.println(book1.getPubDate());
	}
}
