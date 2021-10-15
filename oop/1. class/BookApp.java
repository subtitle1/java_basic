import java.util.Date;

public class BookApp {
	public static void main(String[] args) {
		// Book 클래스(설계도)로 객체 생성하기
		// 1. Book 클래스로 생성된 객체의 주소값을 담는 참조변수를 정의한다.
		// 2. Book 클래스로 객체를 생성해서 참조변수에 주소값을 대입한다.
		// 3. 주소값을 가지고 있는 참조변수를 이용해서 생성된 객체의 필드에 접근한다.
		
		// Book 클래스로 생성된 객체의 주소값을 저장하는 변수 정의
		Book book1;
		Book book2;
		Book book3;
		
		// new 키워드를 사용해서 Book 객체를 생성하고, 각각의 참조변수에 객체의 주소값을 저장하기
		book1 = new Book();
		book2 = new Book();
		book3 = new Book();
		
		// 각각의 참조변수에 저장되어 있는 주소값 확인하기
		System.out.println("첫번째 책: "+book1); // example_09_06_class.Book@5aaa6d82
		System.out.println("두번째 책: "+book2); // example_09_06_class.Book@73a28541
		System.out.println("세번째 책: "+book3); // example_09_06_class.Book@6f75e721
	
		// 각각의 참조변수로 객체 사용하기
		book1.bookNo = 100;
		book1.genre = "컴퓨터";
		book1.title = "자바의 정석";
		book1.writer = "남궁성";
		book1.publisher = "도우출판사";
		book1.price = 35000;
		book1.stock = 5;
		book1.pubDate = new Date();
		
		book2.bookNo = 200;
		book2.genre = "산문집";
		book2.title = "이러지도 저러지도 못하는 당신에게";
		book2.writer = "강주원";
		book2.publisher = "비로소";
		book2.price = 13000;
		book2.stock = 4;
		book2.pubDate = new Date();
		
		book3.bookNo = 300;
		book3.genre = "에세이";
		book3.title = "인생 숙제";
		book3.writer = "백원달";
		book3.publisher = "FIKA";
		book3.price = 17500;
		book3.stock = 3;
		book3.pubDate = new Date();
		
		// 참조변수로 객체의 필드에 저장된 값을 조회해서 출력해보기
		System.out.println(book1.title);
		System.out.println(book2.title);
		System.out.println(book3.title);
		
	
	}
}
