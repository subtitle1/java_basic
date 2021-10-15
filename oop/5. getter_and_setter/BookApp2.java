import java.util.Date;

public class BookApp2 {
	public static void main(String[] args) {
		
		// Book 객체의 주소값을 3개 저장할 수 있는 배열을 생성한다.
		Book[] books = new Book[3];
		
		// Book 객체를 생성하고, setter 메소드를 사용해서 멤버변수에 책 정보를 저장한다.
		Book book1 = new Book();
		book1.setNo(100);
		book1.setTitle("자바의 정석");
		book1.setWriter("남궁성");
		book1.setPublisher("도우출판");
		book1.setPrice(30000);
		book1.setDiscountPrice(27000);
		book1.setStock(10);
		book1.setPubDate(new Date());
		
		// 생성된 Book 객체의 주소값을 n번째에 저장한다.
		books[0] = book1;
		
		Book book2 = new Book();
		book2.setNo(200);
		book2.setTitle("aaa");
		book2.setWriter("written by a");
		book2.setPublisher("a pubs");
		book2.setPrice(4000);
		book2.setDiscountPrice(2000);
		book2.setStock(5);
		book2.setPubDate(new Date());
		
		books[1] = book2;
		
		Book book3 = new Book();
		book3.setNo(300);
		book3.setTitle("bbb");
		book3.setWriter("written by b");
		book3.setPublisher("b pubs");
		book3.setPrice(17000);
		book3.setDiscountPrice(14000);
		book3.setStock(2);
		book3.setPubDate(new Date());
		
		books[2] = book3;
		
		for (Book book : books) {
			System.out.println("제목: " +book.getNo());
			System.out.println("저자: " +book.getWriter());
			System.out.println("출판사: " +book.getPublisher());
			System.out.println("가격: " +book.getPrice());
			System.out.println("할인가격: " +book.getDiscountPrice());
			System.out.println();
		}
		
		// 배열의 0번째 칸이 참조하고 있는 Book 객체의 책 제목 변경하기
		book1.setTitle("자바의 정석 2판"); // 1번 방식
		books[0].setTitle("자바의 정석 2판"); // 2번 방식
		
		Book book = books[0]; // 3번 방식
		book.setTitle("자바의 정석 2판");
		
		// 배열의 0번째 칸이 참조하는 Book 객체의 변경된 값 출력하기
		System.out.println(book1.getTitle());
		System.out.println(books[0].getTitle());
		System.out.println(book.getTitle());
		
		// 결론: book1, books[0], book은 같은 주소값을 가지고 있다.
		// 같은 객체를 참조하고 있다. 
		
		System.out.println(book1); // 해시코드가 모두 같은 것을 확인할 수 있다
		System.out.println(books[0]);
		System.out.println(book);
	}
}
